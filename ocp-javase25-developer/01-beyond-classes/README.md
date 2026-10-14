Módulo: 01-beyond-classes — Além das Classes
--------

> Ordem de estudo: **7 de 15** · anterior: [01-class-design](../01-class-design/README.md) · próximo: [06-lambdas-functional-interfaces](../06-lambdas-functional-interfaces/README.md)

Base de referência: livro [OCP Oracle Certified Professional Java SE 21 Developer: Study Guide Exam 1Z0-830](https://a.co/d/0alQOByp) — **Chapter 7: Beyond Classes**.

Exame alvo: [1Z0-831: Java SE 25 Developer Professional](https://mylearn.oracle.com/ou/exam/java-se-25-developer-professional-1z0-831/40805/161532/270890).

## Objetivo

Interfaces (métodos `default`, `static` e `private`), enums com campos/métodos/construtores, tipos `sealed`, records, classes aninhadas e polimorfismo (tipo do objeto × tipo da referência).

### Tópicos do exame cobertos

- 3. Princípios de Orientação a Objetos

Conceitos OCP
-------------

Cada conceito segue a [Técnica Feynman](https://youtu.be/CN_SCpGuJ_w?si=7eqvv5fpdCkjXVdz) em `docs/feynman/<conceito>/` (`README.md`, `evidencias/`, `mistakes/`, `questions-exam/`).

| Conceito | Seção do livro | Objetivo 1Z0-831 | Evidências |
|----------|----------------|------------------|------------|
| [Interfaces](docs/feynman/interfaces/README.md) | Implementing Interfaces | 3.6 Criar e utilizar interfaces | ✅ 2 img |
| [Métodos de Interface Default, Static e Private](docs/feynman/metodos-de-interface-default-static-e-private/README.md) | Implementing Interfaces (interface members) | 3.6 Métodos de interface privados, estáticos e padrão | ⏳ pendente |
| [Enums](docs/feynman/enums/README.md) | Working with Enums | 3.7 Enum com campos, métodos e construtores | ✅ 1 img |
| [Classes Sealed](docs/feynman/classes-sealed/README.md) | Sealing Classes | 3.5 Tipos selados | ✅ 3 img |
| [Records](docs/feynman/records/README.md) | Encapsulating Data with Records | 3.2 Criar registros; 3.5 classes de registro | ⏳ pendente |
| [Encapsulamento](docs/feynman/ecapsulamento/README.md) | Encapsulating Data with Records | 3.4 Aplicar encapsulamento | ✅ 1 img |
| [Classes Aninhadas](docs/feynman/classes-aninhadas/README.md) | Creating Nested Classes | 3.1 Objetos de classe aninhados | ✅ 2 img |
| [Polimorfismo](docs/feynman/polimorfismo/README.md) | Understanding Polymorphism | 3.5 Polimorfismo; tipo de objeto vs tipo de referência | ✅ 1 img |

Para criar um novo conceito use `OracleCertificationsScriptsUteis.CriarStructureByConceito "01-beyond-classes" "<Conceito>"` (veja o [README da certificação](../README.md)).
