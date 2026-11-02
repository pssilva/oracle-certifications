# Simulados 1Z0-831 — Java SE 25 Developer Professional

21 simulados de 50 questões, montados com as questões de revisão de `{{MODULO}}/docs/questions-exam` e distribuídos pelo peso de cada tópico do exame.

## Formato do exame

| Item | Valor |
|---|---|
| Código | 1Z0-831 |
| Questões | 50 (múltipla escolha) |
| Duração | 120 minutos (~2 min 24 s por questão) |
| Aprovação | 68% (34 acertos) |

> A página MyLearn exige login e a Oracle não publica percentual por tópico. Formato conferido em fontes secundárias; **os pesos abaixo são estimativa** (nº de objetivos do tópico × incidência histórica no 1Z0-829/830). Confirme no MyLearn.

## Peso por tópico e pool de questões

| Tópico | Peso | Questões/simulado | Pool | Usos por questão (21 simulados) |
|---|--:|--:|--:|--:|
| T1 Data, hora, texto, números e booleanos | 12% | 6 | 44 | 2–3 |
| T2 Controle de fluxo | 8% | 4 | 30 | 2–3 |
| T3 Princípios de orientação a objetos | 22% | 11 | 89 | 2–3 |
| T4 Tratamento de exceções | 8% | 4 | 15 | 5–6 |
| T5 Arrays e coleções | 10% | 5 | 27 | 3–4 |
| T6 Streams e expressões lambda | 14% | 7 | 42 | 3–4 |
| T7 Empacotamento e implantação | 8% | 4 | 29 | 2–3 |
| T8 Concorrência (multithreading) | 8% | 4 | 25 | 3–4 |
| T9 E/S (java.io e java.nio.file) | 6% | 3 | 25 | 2–3 |
| T10 Localização | 4% | 2 | 11 | 3–4 |
| **Total** | **100%** | **50** | **337** | |

## Origem das questões por módulo

| Módulo | Tópico padrão | Reclassificadas |
|---|---|---|
| 14-operators | T1 | — |
| 15-core-apis | T1 | QCAP04_02, 09, 15, 18 → T5 (arrays) |
| 02-making-decisions | T2 | — |
| 01-building-blocks | T3 | QCAP01_01, 02, 11, 13 → T7 (main, package, import); QCAP01_07, 09, 10, 14, 16, 19 → T1; QCAP01_03 fora (duplicata de 02) |
| 03-methods, 01-class-design, 01-beyond-classes | T3 | — |
| 04-exceptions-localization | T4 | QCAP11_03, 05, 06, 08, 09, 15, 16, 17, 19, 22, 25 → T10 |
| 05-collections-generics | T5 | — |
| 06-lambdas-functional-interfaces, 07-streams | T6 | — |
| 11-modules | T7 | — |
| 13-concurrency | T8 | — |
| 09-io-api | T9 | — |

## Como foram montados

- Cada tópico tem a sua cota fixa por simulado; as questões do pool entram em rodízio embaralhado, então todas são usadas por igual e nenhuma se repete dentro do mesmo simulado.
- A ordem das 50 questões é embaralhada (tópicos mesclados, como na prova).
- Pools pequenos (T4 e T10) fazem as mesmas questões reaparecerem com mais frequência: a partir do simulado 08, decorar a resposta não vale — explique *por que* cada alternativa está certa ou errada.
- Lacunas do pool: não há questões sobre Gatherers, scoped values, `import module`, arquivos-fonte compactos, construtores flexíveis nem programas multi-arquivo (conteúdo Java 22–25 fora do livro OCP 21), nem sobre o módulo `12-packaging-deployment`.
- Regenerar: `python3 docs/questions-exam/gerar_simulados.py` (semente fixa = mesmo resultado).

## Sugestão de uso

| Simulados | Fase | Meta |
|---|---|---|
| 01–07 | Diagnóstico: 1 por dia, revisar erros pelo Feynman do conceito | ≥ 60% |
| 08–14 | Consolidação: foco nos tópicos abaixo de 68% | ≥ 68% |
| 15–21 | Reta final: prova completa cronometrada, sem pausa | ≥ 80% |

## Simulados

| Simulado | T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8 | T9 | T10 | Resultado |
|---|--:|--:|--:|--:|--:|--:|--:|--:|--:|--:|---|
| [Simulado 01](simulado-01.md) | 6 | 4 | 11 | 4 | 5 | 7 | 4 | 4 | 3 | 2 | ___ / 50 |
| [Simulado 02](simulado-02.md) | 6 | 4 | 11 | 4 | 5 | 7 | 4 | 4 | 3 | 2 | ___ / 50 |
| [Simulado 03](simulado-03.md) | 6 | 4 | 11 | 4 | 5 | 7 | 4 | 4 | 3 | 2 | ___ / 50 |
| [Simulado 04](simulado-04.md) | 6 | 4 | 11 | 4 | 5 | 7 | 4 | 4 | 3 | 2 | ___ / 50 |
| [Simulado 05](simulado-05.md) | 6 | 4 | 11 | 4 | 5 | 7 | 4 | 4 | 3 | 2 | ___ / 50 |
| [Simulado 06](simulado-06.md) | 6 | 4 | 11 | 4 | 5 | 7 | 4 | 4 | 3 | 2 | ___ / 50 |
| [Simulado 07](simulado-07.md) | 6 | 4 | 11 | 4 | 5 | 7 | 4 | 4 | 3 | 2 | ___ / 50 |
| [Simulado 08](simulado-08.md) | 6 | 4 | 11 | 4 | 5 | 7 | 4 | 4 | 3 | 2 | ___ / 50 |
| [Simulado 09](simulado-09.md) | 6 | 4 | 11 | 4 | 5 | 7 | 4 | 4 | 3 | 2 | ___ / 50 |
| [Simulado 10](simulado-10.md) | 6 | 4 | 11 | 4 | 5 | 7 | 4 | 4 | 3 | 2 | ___ / 50 |
| [Simulado 11](simulado-11.md) | 6 | 4 | 11 | 4 | 5 | 7 | 4 | 4 | 3 | 2 | ___ / 50 |
| [Simulado 12](simulado-12.md) | 6 | 4 | 11 | 4 | 5 | 7 | 4 | 4 | 3 | 2 | ___ / 50 |
| [Simulado 13](simulado-13.md) | 6 | 4 | 11 | 4 | 5 | 7 | 4 | 4 | 3 | 2 | ___ / 50 |
| [Simulado 14](simulado-14.md) | 6 | 4 | 11 | 4 | 5 | 7 | 4 | 4 | 3 | 2 | ___ / 50 |
| [Simulado 15](simulado-15.md) | 6 | 4 | 11 | 4 | 5 | 7 | 4 | 4 | 3 | 2 | ___ / 50 |
| [Simulado 16](simulado-16.md) | 6 | 4 | 11 | 4 | 5 | 7 | 4 | 4 | 3 | 2 | ___ / 50 |
| [Simulado 17](simulado-17.md) | 6 | 4 | 11 | 4 | 5 | 7 | 4 | 4 | 3 | 2 | ___ / 50 |
| [Simulado 18](simulado-18.md) | 6 | 4 | 11 | 4 | 5 | 7 | 4 | 4 | 3 | 2 | ___ / 50 |
| [Simulado 19](simulado-19.md) | 6 | 4 | 11 | 4 | 5 | 7 | 4 | 4 | 3 | 2 | ___ / 50 |
| [Simulado 20](simulado-20.md) | 6 | 4 | 11 | 4 | 5 | 7 | 4 | 4 | 3 | 2 | ___ / 50 |
| [Simulado 21](simulado-21.md) | 6 | 4 | 11 | 4 | 5 | 7 | 4 | 4 | 3 | 2 | ___ / 50 |
