Módulo: 15-core-apis — APIs Principais
--------

> Ordem de estudo: **4 de 15** · anterior: [02-making-decisions](../02-making-decisions/README.md) · próximo: [03-methods](../03-methods/README.md)

Base de referência: livro [OCP Oracle Certified Professional Java SE 21 Developer: Study Guide Exam 1Z0-830](https://a.co/d/0alQOByp) — **Chapter 4: Core APIs**.

Exame alvo: [1Z0-831: Java SE 25 Developer Professional](https://mylearn.oracle.com/ou/exam/java-se-25-developer-professional-1z0-831/40805/161532/270890).

## Objetivo

`String`, `StringBuilder` e text blocks, igualdade, arrays, API `Math` e API Date-Time (data, hora, `Duration`, `Period`, `Instant`, fusos e horário de verão).

### Tópicos do exame cobertos

- 1. Tratamento de data, hora, texto, valores numéricos e booleanos
- 5. Arrays e coleções

Conceitos OCP
-------------

Cada conceito segue a [Técnica Feynman](https://youtu.be/CN_SCpGuJ_w?si=7eqvv5fpdCkjXVdz) em `docs/feynman/<conceito>/` (`README.md`, `evidencias/`, `mistakes/`, `questions-exam/`).

| Conceito | Seção do livro | Objetivo 1Z0-831 | Evidências |
|----------|----------------|------------------|------------|
| [Strings](docs/feynman/strings/README.md) | Creating and Manipulating Strings | 1.5 Manipular texto com String | ✅ 2 img |
| [StringBuilder e Text Blocks](docs/feynman/stringbuilder-e-text-blocks/README.md) | Using the StringBuilder Class / Text Blocks | 1.5 Manipular texto, incluindo blocos de texto, com StringBuilder | ⏳ pendente |
| [Classes e Objetos](docs/feynman/classes-objetos/README.md) | Understanding Equality | 3.5 Sobrescrita de equals/hashCode (igualdade) | ✅ 1 img |
| [Array](docs/feynman/array/README.md) | Understanding Arrays | 5.1 Criar arrays, ordenar e buscar | ✅ 3 img |
| [Math API](docs/feynman/math-api/README.md) | Calculating with Math APIs | 1.2 Expressões aritméticas usando a API Math | ⏳ pendente |
| [Datas e Horas](docs/feynman/datas-horas/README.md) | Working with Dates and Times | 1.6 Data, hora (API Date-Time) | ✅ 2 img |
| [Duration, Period e Instant](docs/feynman/duration-period-e-instant/README.md) | Working with Dates and Times (Period, Duration, Instant) | 1.6 Duração, período e instante | ⏳ pendente |
| [Fusos Horários e Horário de Verão](docs/feynman/fusos-horarios-e-horario-de-verao/README.md) | Working with Dates and Times (ZonedDateTime, DST) | 1.6 Fuso horário, incluindo horário de verão | ⏳ pendente |

Para criar um novo conceito use `OracleCertificationsScriptsUteis.CriarStructureByConceito "15-core-apis" "<Conceito>"` (veja o [README da certificação](../README.md)).
