Módulo: 04-exceptions-localization — Exceções e Localização
--------

> Ordem de estudo: **11 de 15** · anterior: [07-streams](../07-streams/README.md) · próximo: [11-modules](../11-modules/README.md)

Base de referência: livro [OCP Oracle Certified Professional Java SE 21 Developer: Study Guide Exam 1Z0-830](https://a.co/d/0alQOByp) — **Chapter 11: Exceptions and Localization**.

Exame alvo: [1Z0-831: Java SE 25 Developer Professional](https://mylearn.oracle.com/ou/exam/java-se-25-developer-professional-1z0-831/40805/161532/270890).

## Objetivo

`try/catch/finally`, multi-catch, try-with-resources, exceções personalizadas, `Locale`, resource bundles e formatação/parsing de mensagens, datas, horas, números, moeda e percentual.

### Tópicos do exame cobertos

- 4. Tratamento de exceções
- 10. Localização

Conceitos OCP
-------------

Cada conceito segue a [Técnica Feynman](https://youtu.be/CN_SCpGuJ_w?si=7eqvv5fpdCkjXVdz) em `docs/feynman/<conceito>/` (`README.md`, `evidencias/`, `mistakes/`, `questions-exam/`).

| Conceito | Seção do livro | Objetivo 1Z0-831 | Evidências |
|----------|----------------|------------------|------------|
| [Exceptions](docs/feynman/exceptions/README.md) | Understanding Exceptions / Recognizing Exception Classes | 4.1 Hierarquia checked/unchecked | ✅ 4 img |
| [Multi-catch e Finally](docs/feynman/multi-catch-finally/README.md) | Handling Exceptions | 4.1 try/catch/finally e multi-catch | ⏳ pendente |
| [Recursos Try-Catch](docs/feynman/recursos-try-catch/README.md) | Automating Resource Management | 4.1 try-with-resources | ✅ 4 img |
| [Exceções Personalizadas](docs/feynman/excecoes-personalizadas/README.md) | Understanding Exceptions (custom exceptions) | 4.1 Exceções personalizadas | ⏳ pendente |
| [Internacionalização e Localização](docs/feynman/internacionalizacao-localizacao/README.md) | Supporting Internationalization and Localization | 10.1 Localização usando Locale | ⏳ pendente |
| [Resource Bundles](docs/feynman/resource-bundles/README.md) | Loading Properties with Resource Bundles | 10.1 Pacotes de recursos | ⏳ pendente |
| [Formatação de Números, Moeda e Percentual](docs/feynman/formatacao-numeros-moeda-percentual/README.md) | Formatting Values / Supporting Internationalization (NumberFormat, CompactNumberFormat) | 10.2 Formatar números, valores monetários e percentuais | ⏳ pendente |
| [Formatação de Mensagens, Datas e Horas](docs/feynman/formatacao-mensagens-datas-horas/README.md) | Formatting Values (DateTimeFormatter, MessageFormat) | 10.2 Analisar e formatar mensagens, datas e horas | ⏳ pendente |

Para criar um novo conceito use `OracleCertificationsScriptsUteis.CriarStructureByConceito "04-exceptions-localization" "<Conceito>"` (veja o [README da certificação](../README.md)).
