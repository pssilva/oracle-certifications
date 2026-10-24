# Diário de Estudos — 45 dias (13/09 → 27/10/2026) · 1Z0-831 Java SE 25

Ordem de estudo = ordem dos capítulos do livro OCP 21 (ver "Mapa: Módulos × Tópicos" no [README da certificação](../README.md)).
Checklist de objetivos: [objectives-checklist.md](objectives-checklist.md) · Erros: [error-log.md](../docs/ocp-study/error-log.md).
Commit ao fim de cada dia, no branch `estudos/dia-NN-<slug>`: `feat(estudos/dia-NN-<slug>) [módulo NN-...]: <tópico>`.

**Início retroativo:** os dias 1–35 (13/09 → 17/10) foram reconstruídos a partir do histórico git (um commit por dia em
`estudos/dia-NN-*`). A numeração dos branches não bate com o número do dia do plano (ex.: o dia 4 do plano
corresponde ao branch `dia-04-math`, mas o dia 35 corresponde a `dia-36-virtual-treads`). Preencha a coluna **h real** dos dias já feitos.

**Execução em paralelo:** de 13/10 a 02/11 corre também o plano do 1Z0-900 (Java EE 7). Os dias 36–45 deste plano
caem nos dias 6–15 do EE 7. Por isso foram previstas 5 h/dia para o SE 25. Total previsto para os dias 36–45: 50 h.

| Dia | Data | Tópico | Módulo | h plan. | h real | Status                                                          |
| --- | --- | --- | --- | --- | --- |-----------------------------------------------------------------|
| 1 | 13/09 | Primitivos e wrappers; operações e casting | `01-building-blocks` | — | | Feito · `dia-01-primitivo-wrappers`, `dia-01-operacoes-casting` |
| 2 | 14/09 | Operações e casting (cont.); questões iniciais | `01-building-blocks` | — | | Feito · `dia-01-operacoes-casting`, `dia-01-questoes`           |
| 3 | 15/09 | `String` | `15-core-apis` | — | | Feito · `dia-03-string`                                         |
| 4 | 16/09 | `String` (cont.); API `Math` | `15-core-apis` | — | | Feito · `dia-03-string`, `dia-04-math`                          |
| 5 | 17/09 | Datas e horas (API Date-Time) | `15-core-apis` | — | | Feito · `dia-05-datatime`                                       |
| 6 | 18/09 | Classes e objetos: criação de objetos, construtores, igualdade | `15-core-apis` | — | | Feito · `dia-06-classes-objetos`                                |
| 7 | 19/09 | Métodos: projeto de métodos | `03-methods` | — | | Feito · `dia-07-metodos`                                        |
| 8 | 20/09 | Construtores | `01-class-design` | — | | Feito · `dia-08-construtores`                                   |
| 9 | 21/09 | Encapsulamento e registros (records) | `01-beyond-classes` | — | | Feito · `dia-09-encapsulamento`                                 |
| 10 | 22/09 | Herança e polimorfismo | `01-class-design`, `01-beyond-classes` | — | | Feito · `dia-10-heranca`                                        |
| 11 | 23/09 | Classes abstratas e sealed | `01-class-design`, `01-beyond-classes` | — | | Feito · `dia-11-abstract-sealed`                                |
| 12 | 24/09 | Interfaces | `01-beyond-classes` | — | | Feito · `dia-12-intrfaces`                                      |
| 13 | 25/09 | Interfaces e interfaces funcionais; enums e classes aninhadas | `01-beyond-classes` | — | | Feito · `dia-12-interfaces`, `dia-13-enums`                     |
| 14 | 26/09 | Revisão de orientação a objetos | `01-class-design`, `01-beyond-classes` | — | | Feito · `dia-14-revisao-oop`                                    |
| 15 | 27/09 | Arrays | `15-core-apis` | — | | Feito · `dia-15-array`                                          |
| 16 | 28/09 | `List` | `05-collections-generics` | — | | Feito · `dia-16-list`                                           |
| 17 | 29/09 | `Set` | `05-collections-generics` | — | | Feito · `dia-17-set`                                            |
| 18 | 30/09 | `Map` | `05-collections-generics` | — | | Feito · `dia-18-map`                                            |
| 19 | 01/10 | `Deque` e sequenced collections | `05-collections-generics` | — | | Feito · `dia-19-deque-sequenced-collections`                    |
| 20 | 02/10 | Generics | `05-collections-generics` | — | | Feito · `dia-20-generics`                                       |
| 21 | 03/10 | Lambdas e interfaces funcionais built-in | `06-lambdas-functional-interfaces` | — | | Feito · `dia-21-lambda-funcional-interface`                     |
| 22 | 04/10 | Streams | `07-streams` | — | | Feito · `dia-22-streams`                                        |
| 23 | 05/10 | I/O e NIO.2 | `09-io-api` | — | | Feito · `dia-23-io-nio2`                                        |
| 24 | 06/10 | Streams avançado (sequenciais e paralelos) | `07-streams` | — | | Feito · `dia-24-streams-avancado`                               |
| 25 | 07/10 | Stream Gatherers (JEP 485) | `07-streams` | — | | Feito · `dia-25-streams-gatherers`                              |
| 26 | 08/10 | Tratamento de exceções | `04-exceptions-localization` | — | | Feito · `dia-26-exceptions-localization`                        |
| 27 | 09/10 | try-with-resources | `04-exceptions-localization` | — | | Feito · `dia-27-resource-handling`                              |
| 28 | 10/10 | Introdução aos módulos; empacotamento | `11-modules` | — | | Feito · `dia-28-modules-packaging`                              |
| 29 | 11/10 | Serialização | `09-io-api` | — | | Feito · `dia-29-serialization`                                  |
| 30 | 12/10 | Módulos (continuação e revisões) | `11-modules` | — | | Feito · `dia-30-modules`                                        |
| 31 | 13/10 | Serviços e diretivas; migração bottom-up/top-down | `11-modules` | — | | Feito · `dia-31-modules-services`, `dia-32-modulos-migracao`    |
| 32 | 14/10 | Passagem de dados entre variáveis e métodos | `03-methods` | — | | Feito · `dia-33-parametros-parametros`                          |
| 33 | 15/10 | Threads de plataforma e virtuais; ciclo de vida | `13-concurrency` | — | | Feito · `dia-34-threads-plataforma-virtuais`                    |
| 34 | 16/10 | Executors: `ExecutorService`, encerramento | `13-concurrency` | — | | Feito · `dia-35-executors`                                      |
| 35 | 17/10 | Código thread-safe e problemas de threading | `13-concurrency` | — | | Feito · `dia-36-virtual-treads`                                 |
| 36 | 18/10 | Thread-safety: `synchronized`, `Lock`, atômicos | `13-concurrency` | 5 | | Feito · `dia-37-thread-safety`                                  |
| 37 | 19/10 | Coleções concorrentes, parallel streams, scoped values (JEP 506) | `13-concurrency` | 5 | | Feito · `dia-38-scoped-value`                                   |
| 38 | 20/10 | Controle de fluxo: `if/else` com pattern matching, `switch` (patterns, guards, record patterns), loops, `break`/`continue`/labels | `02-making-decisions` | 5 | | Feito · `dia-38-scoped-value`                                   |
| 39 | 21/10 | Operadores e precedência; `StringBuilder` e text blocks; `var`, variáveis sem nome (JEP 456), escopo, GC | `14-operators`, `15-core-apis`, `01-building-blocks` | 5 | | Parcial · `dia-39-operadores-precedencia`                       |
| 40 | 22/10 | Sobrecarga e varargs; inicializadores e ordem de inicialização; construtores flexíveis (JEP 513); imutáveis; sobrescrita de `Object`; `Duration`/`Period`/`Instant`, fusos e horário de verão | `03-methods`, `01-class-design`, `15-core-apis` | 5 | | Parcial · `dia-40-sobrecarga-varargs`                           |
| 41 | 23/10 | Method references; `Optional`; streams primitivos; `reduce`/`flatMap`/concatenação; `Collectors` (grouping/partitioning); `Comparator` | `06-lambdas-functional-interfaces`, `07-streams`, `05-collections-generics` | 5 | | Parical · `dia-41-method-references`                            |
| 42 | 24/10 | Multi-catch, `finally`, exceções personalizadas; localização: `Locale`, resource bundles, formatação de números/moeda/percentual, mensagens e datas | `04-exceptions-localization` | 5 | | Parical · `dia-43-multi-catch`                                  |
| 43 | 25/10 | `import module` (JEP 511), arquivos-fonte compactos + `main` de instância (JEP 512), multi-arquivo (JEP 458), JARs, `jlink`; console, I/O streams, `Path`/`Files` | `11-modules`, `12-packaging-deployment`, `09-io-api` | 5 | | Em andamento · `dia-43-io-streams`                             |
| 44 | 26/10 | Simulado completo (cronometrado) + revisão de cada erro + reforço dos 3 tópicos mais fracos | `mock-exams` | 6 | | A fazer                                                         |
| 45 | 27/10 | Revisão leve (versões de 10 linhas, pegadinhas, [cheat-sheet](../docs/ocp-study/cheat-sheet.md)) + prova | `study-plan` | 4 | | A fazer                                                         |

Regra: se o simulado do Dia 44 ficar abaixo de 75%, adie a prova 2–3 dias e repita o passo 3 de Feynman nos tópicos abaixo de 60%.
Formato do exame (fonte secundária, confirmar no MyLearn): 50 questões, 120 min, aprovação 68%.

> Atenção: 7 conteúdos do Java 22–25 **não** estão no livro OCP 21 — estude pelas JEPs: 485 (dia 25, feito), 506 (dia 37), 456 (dia 39), 513 (dia 40), 511, 512 e 458 (dia 43).

> Risco: os dias 38–43 juntam pendências de vários capítulos (controle de fluxo inteiro, localização inteira, empacotamento Java 25) em 5 h/dia, em paralelo com o EE 7. Se um dia não fechar, empurre o simulado e a prova em vez de pular conteúdo.

---

## Modelo de registro diário

```markdown
### Dia NN — DD/MM — <tópico>

- Branch: estudos/dia-NN-<slug>
- Horas: estudo __ · Feynman __ · código __ · questões __
- Objetivos atendidos: (links para objectives-checklist.md, ex.: 3.2, 3.5)
- Conceitos trabalhados: (links para NN-.../docs/feynman/<conceito>/README.md)
- Evidências geradas: (imagens em docs/feynman/<conceito>/evidencias/imgs, testes)
- Questões: __ / __ (__%)
- Lacunas abertas: ...
- Erros registrados: MISTAKE-___ ... (docs/ocp-study/error-log.md)
- Saída do dia (versão de 10 linhas OK? exemplo rodando com JDK 25?): sim / não
```
