Módulo: 01-class-design — Design de Classes
--------

> Ordem de estudo: **6 de 15** · anterior: [03-methods](../03-methods/README.md) · próximo: [01-beyond-classes](../01-beyond-classes/README.md)

Base de referência: livro [OCP Oracle Certified Professional Java SE 21 Developer: Study Guide Exam 1Z0-830](https://a.co/d/0alQOByp) — **Chapter 6: Class Design**.

Exame alvo: [1Z0-831: Java SE 25 Developer Professional](https://mylearn.oracle.com/ou/exam/java-se-25-developer-professional-1z0-831/40805/161532/270890).

## Objetivo

Herança, construtores (incluindo corpos de construtores flexíveis do Java 25), ordem de inicialização, classes abstratas, objetos imutáveis e sobrescrita de métodos (incluindo os de `Object`).

### Tópicos do exame cobertos

- 3. Princípios de Orientação a Objetos

Conceitos OCP
-------------

Cada conceito segue a [Técnica Feynman](https://youtu.be/CN_SCpGuJ_w?si=7eqvv5fpdCkjXVdz) em `docs/feynman/<conceito>/` (`README.md`, `evidencias/`, `mistakes/`, `questions-exam/`).

| Conceito | Seção do livro | Objetivo 1Z0-831 | Evidências |
|----------|----------------|------------------|------------|
| [Herança](docs/feynman/heranca/README.md) | Understanding Inheritance / Inheriting Members | 3.5 Implementar herança | ✅ 4 img |
| [Construtores](docs/feynman/construtores/README.md) | Declaring Constructors | 3.2 Construtores | ✅ 1 img |
| [Corpos de Construtores Flexíveis](docs/feynman/corpos-de-construtores-flexiveis/README.md) | Declaring Constructors + JEP 513 Flexible Constructor Bodies (fora do livro) | 3.2 Construtores, incluindo corpos de construtores flexíveis | ⏳ pendente |
| [Inicializadores de Instância e Static](docs/feynman/inicializadores-de-instancia-e-static/README.md) | Initializing Objects | 3.2 Inicializadores de instância e estáticos | ⏳ pendente |
| [Classes Abstratas](docs/feynman/classes-abstratas/README.md) | Creating Abstract Classes | 3.5 Tipos abstratos | ✅ 1 img |
| [Objetos Imutáveis](docs/feynman/objetos-imutaveis/README.md) | Creating Immutable Objects | 3.4 Criar objetos imutáveis | ⏳ pendente |
| [Sobrescrita e Métodos de Object](docs/feynman/sobrescrita-e-metodos-de-object/README.md) | Inheriting Members (overriding, hiding) | 3.5 Sobrescrever métodos, incluindo os da classe Object | ⏳ pendente |

Para criar um novo conceito use `OracleCertificationsScriptsUteis.CriarStructureByConceito "01-class-design" "<Conceito>"` (veja o [README da certificação](../README.md)).
