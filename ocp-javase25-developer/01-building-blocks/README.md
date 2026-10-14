Módulo: 01-building-blocks — Blocos de Construção
--------

> Ordem de estudo: **1 de 15** · próximo: [14-operators](../14-operators/README.md)

Base de referência: livro [OCP Oracle Certified Professional Java SE 21 Developer: Study Guide Exam 1Z0-830](https://a.co/d/0alQOByp) — **Chapter 1: Building Blocks**.

Exame alvo: [1Z0-831: Java SE 25 Developer Professional](https://mylearn.oracle.com/ou/exam/java-se-25-developer-professional-1z0-831/40805/161532/270890).

## Objetivo

Tipos primitivos e wrappers, declaração e inicialização de variáveis, escopo, `var`, variáveis sem nome (`_`) e ciclo de vida dos objetos (criação, reatribuição de referências e coleta de lixo).

### Tópicos do exame cobertos

- 1. Tratamento de data, hora, texto, valores numéricos e booleanos
- 3. Princípios de Orientação a Objetos

Conceitos OCP
-------------

Cada conceito segue a [Técnica Feynman](https://youtu.be/CN_SCpGuJ_w?si=7eqvv5fpdCkjXVdz) em `docs/feynman/<conceito>/` (`README.md`, `evidencias/`, `mistakes/`, `questions-exam/`).

| Conceito | Seção do livro | Objetivo 1Z0-831 | Evidências |
|----------|----------------|------------------|------------|
| [Primitivos e Wrappers](docs/feynman/primitivos-wrappers/README.md) | Understanding Data Types | 1.1 Use classes primitivas e wrapper | ✅ 2 img |
| [Operações e Casting](docs/feynman/operacoes-casting/README.md) | Understanding Data Types | 1.4 Conversões de tipo e casting | ✅ 2 img |
| [Escopo de Variáveis](docs/feynman/escopo-de-variaveis/README.md) | Managing Variable Scope | 3.4 Escopos de variáveis | ⏳ pendente |
| [Inferência var e Variáveis sem Nome](docs/feynman/inferencia-var-e-variaveis-sem-nome/README.md) | Declaring Variables (var) + JEP 456 Unnamed Variables (fora do livro) | 3.4 Inferência de tipo de variável local e variáveis sem nome | ⏳ pendente |
| [Ciclo de Vida de Objetos e Garbage Collection](docs/feynman/ciclo-de-vida-de-objetos-e-garbage-collection/README.md) | Creating Objects / Destroying Objects | 3.1 Ciclo de vida do objeto: criação, reatribuição de referências e GC | ⏳ pendente |

Para criar um novo conceito use `OracleCertificationsScriptsUteis.CriarStructureByConceito "01-building-blocks" "<Conceito>"` (veja o [README da certificação](../README.md)).
