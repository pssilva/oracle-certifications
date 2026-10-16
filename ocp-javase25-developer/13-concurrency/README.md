Módulo: 13-concurrency — Concorrência
--------

> Ordem de estudo: **14 de 15** · anterior: [12-packaging-deployment](../12-packaging-deployment/README.md) · próximo: [09-io-api](../09-io-api/README.md)

Base de referência: livro [OCP Oracle Certified Professional Java SE 21 Developer: Study Guide Exam 1Z0-830](https://a.co/d/0alQOByp) — **Chapter 13: Concurrency**.

Exame alvo: [1Z0-831: Java SE 25 Developer Professional](https://mylearn.oracle.com/ou/exam/java-se-25-developer-professional-1z0-831/40805/161532/270890).

## Objetivo

Threads de plataforma e virtuais, `Runnable`/`Callable`, `ExecutorService`, scoped values (Java 25), código thread-safe (locks, atômicos), coleções concorrentes e parallel streams.

### Tópicos do exame cobertos

- 8. Multithreading e execução concorrente

Conceitos OCP
-------------

Cada conceito segue a [Técnica Feynman](https://youtu.be/CN_SCpGuJ_w?si=7eqvv5fpdCkjXVdz) em `docs/feynman/<conceito>/` (`README.md`, `evidencias/`, `mistakes/`, `questions-exam/`).

| Conceito | Seção do livro | Objetivo 1Z0-831 | Evidências |
|----------|----------------|------------------|------------|
| [Threads de Plataforma e Virtuais](docs/feynman/threads-plataforma-virtuais/README.md) | Introducing Threads | 8.1 Criar threads de plataforma e virtuais; ciclo de vida da thread | ⏳ pendente |
| [Executor Service, Runnable e Callable](docs/feynman/executor-service-runnable-callable/README.md) | Creating Threads with the Concurrency API | 8.1 Runnable, Callable e serviços Executor | ⏳ pendente |
| [Scoped Values](docs/feynman/scoped-values/README.md) | ScopedValue.where(...).run(...) | 8.1 Valores com escopo para compartilhar contexto imutável | ⏳ pendente |
| [Thread-safety, Locks e Atômicos](docs/feynman/thread-safety-locks-e-atomicos/README.md) | Writing Thread-Safe Code / Identifying Threading Problems | 8.2 Código thread-safe com bloqueios e API concorrente | ⏳ pendente |
| [Coleções Concorrentes](docs/feynman/colecoes-concorrentes/README.md) | Using Concurrent Collections | 8.3 Processar coleções concorrentemente | ⏳ pendente |
| [Parallel Streams](docs/feynman/parallel-streams/README.md) | Working with Parallel Streams | 8.3 Fluxos paralelos | ✅ 1 img |

Para criar um novo conceito use `OracleCertificationsScriptsUteis.CriarStructureByConceito "13-concurrency" "<Conceito>"` (veja o [README da certificação](../README.md)).
