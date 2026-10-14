Módulo: 07-streams — Streams
--------

> Ordem de estudo: **10 de 15** · anterior: [05-collections-generics](../05-collections-generics/README.md) · próximo: [04-exceptions-localization](../04-exceptions-localization/README.md)

Base de referência: livro [OCP Oracle Certified Professional Java SE 21 Developer: Study Guide Exam 1Z0-830](https://a.co/d/0alQOByp) — **Chapter 10: Streams**.

Exame alvo: [1Z0-831: Java SE 25 Developer Professional](https://mylearn.oracle.com/ou/exam/java-se-25-developer-professional-1z0-831/40805/161532/270890).

## Objetivo

`Optional`, pipelines de streams de objetos e primitivos, decomposição (`flatMap`), concatenação, redução, `Collectors` (agrupamento e particionamento) e Gatherers, em fluxos sequenciais e paralelos.

### Tópicos do exame cobertos

- 6. Streams e expressões lambda

Conceitos OCP
-------------

Cada conceito segue a [Técnica Feynman](https://youtu.be/CN_SCpGuJ_w?si=7eqvv5fpdCkjXVdz) em `docs/feynman/<conceito>/` (`README.md`, `evidencias/`, `mistakes/`, `questions-exam/`).

| Conceito | Seção do livro | Objetivo 1Z0-831 | Evidências |
|----------|----------------|------------------|------------|
| [Optional](docs/feynman/optional/README.md) | Returning an Optional | 6.1 Processar dados (Optional como resultado de operações terminais) | ⏳ pendente |
| [Streams](docs/feynman/streams/README.md) | Using Streams | 6.1 Criar, filtrar, transformar, processar e ordenar | ✅ 2 img |
| [Streams Primitivos](docs/feynman/streams-primitivos/README.md) | Working with Primitive Streams | 6.1 Streams primitivos | ⏳ pendente |
| [Redução, FlatMap e Concatenação](docs/feynman/reducao-flatmap-e-concatenacao/README.md) | Using Streams (reduce, flatMap, concat) | 6.2 Decomposição, concatenação e redução | ⏳ pendente |
| [Collectors Agrupamento e Particionamento](docs/feynman/collectors-agrupamento-e-particionamento/README.md) | Working with Advanced Stream Pipeline Concepts | 6.2 Agrupamento, particionamento e coleta | ⏳ pendente |
| [Streams Avançado](docs/feynman/streams-avancado/README.md) | Working with Advanced Stream Pipeline Concepts | 6.2 Operações de coleta em fluxos sequenciais e paralelos | ✅ 2 img |
| [Streams Gatherers](docs/feynman/streams-gatherers/README.md) | JEP 485 Stream Gatherers (fora do livro) | 6.2 Gathering (Gatherers) | ✅ 1 img |

Para criar um novo conceito use `OracleCertificationsScriptsUteis.CriarStructureByConceito "07-streams" "<Conceito>"` (veja o [README da certificação](../README.md)).
