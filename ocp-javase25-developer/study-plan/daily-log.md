# Diário de Estudos — 29 dias (03/11 → 01/12/2026) · 1Z0-831 Java SE 25

Ordem de estudo = ordem dos capítulos do livro OCP 21 (ver "Mapa: Módulos × Tópicos" no [README da certificação](../README.md)).
Início no dia seguinte à prova 1Z0-900 (02/11/2026). Total previsto: 207 h.
Commit ao fim de cada dia, no branch `estudos/dia-NN-<slug>`: `feat(estudos/dia-NN-<slug>): <tópico>`.
Checklist de objetivos: [objectives-checklist.md](objectives-checklist.md) · Erros: [error-log.md](../docs/ocp-study/error-log.md).

| Dia | Data | Tópico | Módulo | h plan. | h real | Status |
| --- | --- | --- | --- | --- | --- | --- |
| 1 | 03/11 | Setup JDK 25 + Building Blocks: primitivos, wrappers, casting, escopo de variáveis | `01-building-blocks` | 6 | | A fazer |
| 2 | 04/11 | Building Blocks: `var`, variáveis sem nome (JEP 456), ciclo de vida de objetos e GC | `01-building-blocks` | 6 | | A fazer |
| 3 | 05/11 | Operadores: aritméticos, precedência, atribuição composta, comparação, curto-circuito, ternário | `14-operators` | 6 | | A fazer |
| 4 | 06/11 | Decisões: `if/else` com pattern matching, `switch` statements/expressions, record patterns, guards | `02-making-decisions` | 8 | | A fazer |
| 5 | 07/11 | Decisões: `while`, `for`, for-each, `break`/`continue` e labels | `02-making-decisions` | 6 | | A fazer |
| 6 | 08/11 | Core APIs: `String`, `StringBuilder`, text blocks, igualdade | `15-core-apis` | 7 | | A fazer |
| 7 | 09/11 | Core APIs: arrays (ordenar, buscar, comparar), API `Math`. Revisão da semana | `15-core-apis` | 6 | | A fazer |
| 8 | 10/11 | Date-Time: `LocalDate/Time`, `Duration`, `Period`, `Instant`, `ZonedDateTime` e horário de verão | `15-core-apis` | 8 | | A fazer |
| 9 | 11/11 | Métodos: modificadores de acesso, `static`, passagem de parâmetros, sobrecarga e varargs | `03-methods` | 8 | | A fazer |
| 10 | 12/11 | Class Design: herança, construtores, corpos de construtores flexíveis (JEP 513), inicializadores e ordem de inicialização | `01-class-design` | 8 | | A fazer |
| 11 | 13/11 | Class Design: classes abstratas, objetos imutáveis, sobrescrita e métodos de `Object` | `01-class-design` | 7 | | A fazer |
| 12 | 14/11 | Beyond Classes: interfaces (`default`/`static`/`private`), enums com campos e construtores | `01-beyond-classes` | 7 | | A fazer |
| 13 | 15/11 | Beyond Classes: sealed, records, classes aninhadas, polimorfismo. Revisão da semana | `01-beyond-classes` | 7 | | A fazer |
| 14 | 16/11 | Lambdas: sintaxe, interfaces funcionais built-in, method references, effectively final | `06-lambdas-functional-interfaces` | 8 | | A fazer |
| 15 | 17/11 | Coleções: `List`, `Set`, `Map`, `Deque`, sequenced collections, generics | `05-collections-generics` | 8 | | A fazer |
| 16 | 18/11 | Coleções: `Comparable` × `Comparator`, ordenação e busca; wildcards de generics | `05-collections-generics` | 6 | | A fazer |
| 17 | 19/11 | Streams: pipeline, operações intermediárias/terminais, `Optional`, streams primitivos | `07-streams` | 8 | | A fazer |
| 18 | 20/11 | Streams: `reduce`, `flatMap`, concatenação, `Collectors` (grouping/partitioning), Gatherers (JEP 485), paralelos | `07-streams` | 8 | | A fazer |
| 19 | 21/11 | Exceções: hierarquia, `try/catch/finally`, multi-catch, try-with-resources, exceções personalizadas | `04-exceptions-localization` | 7 | | A fazer |
| 20 | 22/11 | Localização: `Locale`, resource bundles, formatação de números/moeda/percentual, mensagens, datas. Revisão da semana | `04-exceptions-localization` | 7 | | A fazer |
| 21 | 23/11 | Módulos: `module-info`, diretivas, reflexão (`opens`), serviços (provider/consumer/`ServiceLoader`) | `11-modules` | 8 | | A fazer |
| 22 | 24/11 | Módulos: módulos nomeados/automáticos/sem nome, migração, `jdeps`, `import module` (JEP 511) | `11-modules` | 7 | | A fazer |
| 23 | 25/11 | Empacotamento: `javac`/`java`, arquivos-fonte compactos + `main` de instância (JEP 512), multi-arquivo (JEP 458), JARs, `jlink` | `12-packaging-deployment` | 7 | | A fazer |
| 24 | 26/11 | Concorrência: threads de plataforma e virtuais, ciclo de vida, `ExecutorService`, `Runnable`/`Callable`, scoped values (JEP 506) | `13-concurrency` | 8 | | A fazer |
| 25 | 27/11 | Concorrência: thread-safety, `synchronized`, `Lock`, atômicos, coleções concorrentes, parallel streams | `13-concurrency` | 7 | | A fazer |
| 26 | 28/11 | E/S: console, I/O streams, serialização, NIO.2 (`Path`, `Files`, atributos, percorrer diretórios) | `09-io-api` | 8 | | A fazer |
| 27 | 29/11 | Simulado completo 1 (cronometrado) + revisão de cada erro | `mock-exams` | 8 | | A fazer |
| 28 | 30/11 | Simulado completo 2 + reforço dos 3 tópicos mais fracos e dos 7 conteúdos Java 22–25 | `mock-exams` | 8 | | A fazer |
| 29 | 01/12 | Revisão leve (versões de 10 linhas, pegadinhas, [cheat-sheet](../docs/ocp-study/cheat-sheet.md)) + prova | `study-plan` | 4 | | A fazer |

Regra: se o Dia 28 ficar abaixo de 75%, adie a prova 2–3 dias e repita o passo 3 de Feynman nos tópicos abaixo de 60%.
Formato do exame (fonte secundária, confirmar no MyLearn antes do Dia 1): 50 questões, 120 min, aprovação 68%.

> Atenção: 7 conteúdos do Java 22–25 **não** estão no livro OCP 21 — estude pelas JEPs: 456 (dia 2), 513 (dia 10), 485 (dia 18), 511 (dia 22), 512 e 458 (dia 23), 506 (dia 24).

---

## Modelo de registro diário

```markdown
### Dia NN — DD/MM — <tópico>

- Horas: estudo __ · Feynman __ · código __ · questões __
- Objetivos atendidos: (links para objectives-checklist.md, ex.: 3.2, 3.5)
- Conceitos trabalhados: (links para NN-.../docs/feynman/<conceito>/README.md)
- Evidências geradas: (imagens em docs/feynman/<conceito>/evidencias/imgs, testes)
- Questões: __ / __ (__%)
- Lacunas abertas: ...
- Erros registrados: MISTAKE-___ ... (docs/ocp-study/error-log.md)
- Saída do dia (versão de 10 linhas OK? exemplo rodando com JDK 25?): sim / não
```
