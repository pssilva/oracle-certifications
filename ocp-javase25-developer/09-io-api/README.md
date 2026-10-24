Módulo: 09-io-api — API de E/S
--------

> Ordem de estudo: **15 de 15** · anterior: [13-concurrency](../13-concurrency/README.md)

Base de referência: livro [OCP Oracle Certified Professional Java SE 21 Developer: Study Guide Exam 1Z0-830](https://a.co/d/0alQOByp) — **Capítulo 14 ■ Entrada/Saída I/O**.

Exame alvo: [1Z0-831: Java SE 25 Developer Professional](https://mylearn.oracle.com/ou/exam/java-se-25-developer-professional-1z0-831/40805/161532/270890).

## Objetivo

`Path` e `Files` (NIO.2), fluxos de E/S para arquivos, console, e serialização/desserialização de objetos.

### Tópicos do exame cobertos

- 9. Entrada e saída com a API de E/S

Conceitos OCP
-------------

Cada conceito segue a [Técnica Feynman](https://youtu.be/CN_SCpGuJ_w?si=7eqvv5fpdCkjXVdz) em `docs/feynman/<conceito>/` (`README.md`, `evidencias/`, `mistakes/`, `questions-exam/`).

| Conceito | Seção do livro | Objetivo 1Z0-831 | Evidências |
|----------|----------------|------------------|------------|
| [I/O API e NIO.2](docs/feynman/io-api-nio2/README.md) | Referencing Files and Directories / Operating on File and Path | 9.3 Objetos Path e java.nio.file | ✅ 2 img |
| [Path, Files e Atributos](docs/feynman/path-files-atributos/README.md) | Operating on File and Path / Working with Advanced APIs | 9.3 Construir, percorrer, criar, ler e escrever Path e propriedades | ⏳ pendente |
| [IO Streams Leitura e Escrita](docs/feynman/io-streams-leitura-escrita/README.md) | Introducing I/O Streams / Reading and Writing Files | 9.1 Ler e escrever arquivos com fluxos de E/S | ⏳ pendente |
| [Console e Interação com Usuário](docs/feynman/console-interacao-usuario/README.md) | Interacting with Users | 9.1 Ler e escrever dados do console | ⏳ pendente |
| [Serialization](docs/feynman/serialization/README.md) | Serializing Data | 9.2 Serializar e desserializar objetos | ✅ 2 img |

Para criar um novo conceito use `OracleCertificationsScriptsUteis.CriarStructureByConceito "09-io-api" "<Conceito>"` (veja o [README da certificação](../README.md)).
