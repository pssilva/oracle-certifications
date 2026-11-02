#!/usr/bin/env python3
"""Gera os 21 simulados do exame 1Z0-831 a partir de {{MODULO}}/docs/questions-exam.

Uso (na raiz de ocp-javase25-developer):
    python3 docs/questions-exam/gerar_simulados.py

Regras:
- 50 questões por simulado (formato do exame: 50 questões, 120 min, 68%).
- Cota por tópico = peso estimado (TOPICOS abaixo).
- Cada questão é sorteada em rodízio dentro do pool do seu tópico: o uso
  fica equilibrado (diferença máxima de 1 uso entre questões do mesmo tópico)
  e nenhuma questão se repete dentro do mesmo simulado.
- A ordem das questões em cada simulado é embaralhada (tópicos mesclados).
- Semente fixa: rodar de novo gera exatamente os mesmos simulados.
"""
import random
import re
from collections import Counter
from pathlib import Path

SEMENTE = 1831
TOTAL_SIMULADOS = 21
RAIZ = Path(__file__).resolve().parents[2]
SAIDA = Path(__file__).resolve().parent

# (número, nome, questões por simulado). Soma = 50.
TOPICOS = [
    (1, "Data, hora, texto, números e booleanos", 6),
    (2, "Controle de fluxo", 4),
    (3, "Princípios de orientação a objetos", 11),
    (4, "Tratamento de exceções", 4),
    (5, "Arrays e coleções", 5),
    (6, "Streams e expressões lambda", 7),
    (7, "Empacotamento e implantação", 4),
    (8, "Concorrência (multithreading)", 4),
    (9, "E/S (java.io e java.nio.file)", 3),
    (10, "Localização", 2),
]

# Tópico padrão de cada módulo.
MODULO_TOPICO = {
    "14-operators": 1,
    "15-core-apis": 1,
    "02-making-decisions": 2,
    "01-building-blocks": 3,
    "03-methods": 3,
    "01-class-design": 3,
    "01-beyond-classes": 3,
    "04-exceptions-localization": 4,
    "05-collections-generics": 5,
    "06-lambdas-functional-interfaces": 6,
    "07-streams": 6,
    "11-modules": 7,
    "13-concurrency": 8,
    "09-io-api": 9,
}

# Exceções ao tópico padrão (classificação questão a questão).
QUESTAO_TOPICO = {
    # 01-building-blocks: main/package/import -> T7; primitivos, literais, text blocks, wrappers -> T1
    **{f"QCAP01_{n:02d}": 7 for n in (1, 2, 11, 13)},
    **{f"QCAP01_{n:02d}": 1 for n in (7, 9, 10, 14, 16, 19)},
    # 15-core-apis: arrays -> T5
    **{f"QCAP04_{n:02d}": 5 for n in (2, 9, 15, 18)},
    # 04-exceptions-localization: localização/formatação -> T10
    **{f"QCAP11_{n:02d}": 10 for n in (3, 5, 6, 8, 9, 15, 16, 17, 19, 22, 25)},
}

# Fora do pool: QCAP01_03 é cópia de QCAP01_02 sem a alternativa G.
EXCLUIDAS = {"QCAP01_03"}

NUMERO_INICIAL = re.compile(r"^\s*\d+\.\s*")


def carregar_pools():
    pools = {t[0]: [] for t in TOPICOS}
    for modulo, topico_padrao in MODULO_TOPICO.items():
        for arq in sorted((RAIZ / modulo / "docs" / "questions-exam").glob("QCAP*.md")):
            qid = arq.stem
            if qid in EXCLUIDAS:
                continue
            texto = arq.read_text(encoding="utf-8").strip()
            texto = NUMERO_INICIAL.sub("", texto, count=1)
            pools[QUESTAO_TOPICO.get(qid, topico_padrao)].append(
                {"id": qid, "modulo": modulo, "texto": texto}
            )
    return pools


def montar_simulados(pools, rng):
    simulados = [[] for _ in range(TOTAL_SIMULADOS)]
    for numero, _, cota in TOPICOS:
        pool = pools[numero]
        if len(pool) < cota:
            raise SystemExit(f"Tópico {numero}: pool ({len(pool)}) menor que a cota ({cota})")
        fila = []
        for simulado in simulados:
            escolhidas = []
            while len(escolhidas) < cota:
                if not fila:
                    fila = rng.sample(pool, len(pool))
                # pula questão já presente neste simulado (só ocorre na virada do rodízio)
                idx = next(i for i, q in enumerate(fila) if q not in escolhidas)
                escolhidas.append(fila.pop(idx))
            simulado.extend((numero, q) for q in escolhidas)
    for simulado in simulados:
        rng.shuffle(simulado)
    return simulados


def escrever_simulado(indice, questoes):
    linhas = [
        f"# Simulado {indice:02d} — 1Z0-831 Java SE 25 Developer Professional",
        "",
        "> 50 questões · 120 minutos · aprovação 68% (34 acertos) · cronometre e não consulte material.",
        "> Questões do tipo *Choose all that apply* só contam se todas as alternativas corretas forem marcadas.",
        "",
        "| Tópico | Questões |",
        "|---|--:|",
    ]
    contagem = Counter(t for t, _ in questoes)
    for numero, nome, _ in TOPICOS:
        linhas.append(f"| T{numero} {nome} | {contagem[numero]} |")
    linhas += ["", "---", ""]
    for n, (topico, q) in enumerate(questoes, 1):
        linhas += [
            f"## Questão {n:02d}",
            "",
            "```text",
            q["texto"],
            "```",
            "",
        ]
    linhas += [
        "---",
        "",
        "## Folha de respostas",
        "",
        "Preencha **Resposta**; depois confira no livro (Apêndice *Answers to Review Questions*) "
        "e registre os erros em `docs/ocp-study/error-log.md`.",
        "",
        "| # | Tópico | Fonte | Resposta | Gabarito | ✔/✘ |",
        "|--:|---|---|---|---|:-:|",
    ]
    for n, (topico, q) in enumerate(questoes, 1):
        linhas.append(f"| {n:02d} | T{topico} | `{q['modulo']}/{q['id']}` | | | |")
    linhas += [
        "",
        "**Resultado:** ___ / 50 (___%) · Tempo: ___ min · Data: ___/___/______",
        "",
        "| Tópico | Acertos |",
        "|---|--:|",
    ]
    for numero, nome, _ in TOPICOS:
        linhas.append(f"| T{numero} {nome} | ___ / {contagem[numero]} |")
    linhas.append("")
    (SAIDA / f"simulado-{indice:02d}.md").write_text("\n".join(linhas), encoding="utf-8")


def escrever_indice(pools, simulados):
    uso = Counter(q["id"] for s in simulados for _, q in s)
    linhas = [
        "# Simulados 1Z0-831 — Java SE 25 Developer Professional",
        "",
        "21 simulados de 50 questões, montados com as questões de revisão de "
        "`{{MODULO}}/docs/questions-exam` e distribuídos pelo peso de cada tópico do exame.",
        "",
        "## Formato do exame",
        "",
        "| Item | Valor |",
        "|---|---|",
        "| Código | 1Z0-831 |",
        "| Questões | 50 (múltipla escolha) |",
        "| Duração | 120 minutos (~2 min 24 s por questão) |",
        "| Aprovação | 68% (34 acertos) |",
        "",
        "> A página MyLearn exige login e a Oracle não publica percentual por tópico. "
        "Formato conferido em fontes secundárias; **os pesos abaixo são estimativa** "
        "(nº de objetivos do tópico × incidência histórica no 1Z0-829/830). Confirme no MyLearn.",
        "",
        "## Peso por tópico e pool de questões",
        "",
        "| Tópico | Peso | Questões/simulado | Pool | Usos por questão (21 simulados) |",
        "|---|--:|--:|--:|--:|",
    ]
    for numero, nome, cota in TOPICOS:
        pool = pools[numero]
        usos = [uso[q["id"]] for q in pool]
        linhas.append(
            f"| T{numero} {nome} | {cota * 2}% | {cota} | {len(pool)} | {min(usos)}–{max(usos)} |"
        )
    total_pool = sum(len(p) for p in pools.values())
    linhas += [
        f"| **Total** | **100%** | **50** | **{total_pool}** | |",
        "",
        "## Origem das questões por módulo",
        "",
        "| Módulo | Tópico padrão | Reclassificadas |",
        "|---|---|---|",
        "| 14-operators | T1 | — |",
        "| 15-core-apis | T1 | QCAP04_02, 09, 15, 18 → T5 (arrays) |",
        "| 02-making-decisions | T2 | — |",
        "| 01-building-blocks | T3 | QCAP01_01, 02, 11, 13 → T7 (main, package, import); "
        "QCAP01_07, 09, 10, 14, 16, 19 → T1; QCAP01_03 fora (duplicata de 02) |",
        "| 03-methods, 01-class-design, 01-beyond-classes | T3 | — |",
        "| 04-exceptions-localization | T4 | QCAP11_03, 05, 06, 08, 09, 15, 16, 17, 19, 22, 25 → T10 |",
        "| 05-collections-generics | T5 | — |",
        "| 06-lambdas-functional-interfaces, 07-streams | T6 | — |",
        "| 11-modules | T7 | — |",
        "| 13-concurrency | T8 | — |",
        "| 09-io-api | T9 | — |",
        "",
        "## Como foram montados",
        "",
        "- Cada tópico tem a sua cota fixa por simulado; as questões do pool entram em rodízio "
        "embaralhado, então todas são usadas por igual e nenhuma se repete dentro do mesmo simulado.",
        "- A ordem das 50 questões é embaralhada (tópicos mesclados, como na prova).",
        "- Pools pequenos (T4 e T10) fazem as mesmas questões reaparecerem com mais frequência: "
        "a partir do simulado 08, decorar a resposta não vale — explique *por que* cada alternativa está certa ou errada.",
        "- Lacunas do pool: não há questões sobre Gatherers, scoped values, `import module`, "
        "arquivos-fonte compactos, construtores flexíveis nem programas multi-arquivo "
        "(conteúdo Java 22–25 fora do livro OCP 21), nem sobre o módulo `12-packaging-deployment`.",
        "- Regenerar: `python3 docs/questions-exam/gerar_simulados.py` (semente fixa = mesmo resultado).",
        "",
        "## Sugestão de uso",
        "",
        "| Simulados | Fase | Meta |",
        "|---|---|---|",
        "| 01–07 | Diagnóstico: 1 por dia, revisar erros pelo Feynman do conceito | ≥ 60% |",
        "| 08–14 | Consolidação: foco nos tópicos abaixo de 68% | ≥ 68% |",
        "| 15–21 | Reta final: prova completa cronometrada, sem pausa | ≥ 80% |",
        "",
        "## Simulados",
        "",
        "| Simulado | " + " | ".join(f"T{t}" for t, _, _ in TOPICOS) + " | Resultado |",
        "|---|" + "--:|" * len(TOPICOS) + "---|",
    ]
    for i, s in enumerate(simulados, 1):
        c = Counter(t for t, _ in s)
        linhas.append(
            f"| [Simulado {i:02d}](simulado-{i:02d}.md) | "
            + " | ".join(str(c[t]) for t, _, _ in TOPICOS)
            + " | ___ / 50 |"
        )
    linhas.append("")
    (SAIDA / "README.md").write_text("\n".join(linhas), encoding="utf-8")


def main():
    rng = random.Random(SEMENTE)
    pools = carregar_pools()
    simulados = montar_simulados(pools, rng)
    for i, s in enumerate(simulados, 1):
        assert len(s) == 50 and len({q["id"] for _, q in s}) == 50
        escrever_simulado(i, s)
    escrever_indice(pools, simulados)
    print(f"{len(simulados)} simulados gerados em {SAIDA}")


if __name__ == "__main__":
    main()
