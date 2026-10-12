Módulo: 02-jpa-validation
--------

Tópico 02 do exame **1Z0-900 — Java EE 7 Application Developer**: *Gerenciar persistência usando entidades JPA e Bean Validation*.

Para este módulo usaremos como base de referência o Livro: [Beginning Java EE 7 — Antonio Goncalves (Apress, 2013)](https://tenlong.com.tw/products/9781430246268); complemento: [Java EE 7 Tutorial](https://docs.oracle.com/javaee/7/tutorial/partpersist.htm).

| Item | Valor |
| --- | --- |
| Versões EE 7 cobradas | JPA 2.1, BV 1.1 |
| Peso estimado | Alto (estimativa; a Oracle não publica percentuais) |
| Dia(s) do cronograma | 4–5 (16/10–17/10) |
| Leitura | Goncalves cap. 3 (Bean Validation), 4–6 (JPA) |
| Pacote Java | `br.com.oracle_certificatons.ocp.javaee7.jpa` |

## Objetivo

Itens oficiais cobrados no exame:

- [ ] Entidades e mapeamento O/R
- [ ] EntityManager, transações e locking
- [ ] Conversões, validações e geração de chaves
- [ ] JPQL

Complementos (fora da lista oficial; apoiam os itens acima):

- [ ] Relacionamentos e herança (base do mapeamento O/R)
- [ ] Criteria API

Conceitos OCP
-------------

Os conceitos se encontram na pasta: `labs/02-jpa-validation/docs/feynman/`

- [Entidades e Mapeamento O/R](docs/feynman/entidades-mapeamento-or/README.md)
- [Relacionamentos e Herança](docs/feynman/relacionamentos-e-heranca/README.md)
- [EntityManager, Transações e Locking](docs/feynman/entitymanager-transacoes-locking/README.md)
- [JPQL e Criteria API](docs/feynman/jpql/README.md)
- [Bean Validation](docs/feynman/bean-validation/README.md)
- [Conversores e Geração de Chaves](docs/feynman/conversores-e-geracao-chaves/README.md)

## Laboratório

Organize o estudo em três níveis (seção 7 do plano):

1. **Código existente**: leia o exemplo em `src/main`, identifique a API, explique o ciclo de vida e preveja o resultado.
2. **Experimento mínimo**: altere uma anotação, escopo, consulta ou configuração e observe a consequência.
3. **Evidência de domínio**: registre o objetivo oficial atendido, os conceitos envolvidos e uma questão de revisão.

### Experimentos sugeridos

- [ ] Persistir um `Book` inválido (título vazio) e observar `ConstraintViolationException` no `persist`.
- [ ] Remover `@Version` e simular duas edições concorrentes; recolocar e observar `OptimisticLockException`.
- [ ] Chamar `merge` em uma entidade detached e verificar que o argumento continua detached.
- [ ] Escrever 5 consultas JPQL (named, dinâmica, com JOIN, agregação e Criteria).

## Pegadinhas

Hipóteses para **provar no código** (marque quando comprovar; acrescente as que descobrir):

- [ ] `merge()` devolve a instância gerenciada; o objeto passado continua *detached*.
- [ ] JPQL usa nomes de entidade e atributos, não de tabelas e colunas.
- [ ] Locking otimista exige um atributo `@Version`.
- [ ] `AttributeConverter` (JPA 2.1) não se aplica a `@Id`, `@Version`, relacionamentos nem `@Enumerated`/`@Temporal`.
- [ ] `@GeneratedValue` sem estratégia equivale a `GenerationType.AUTO`.

## Feynman do Tópico

### Explicação simples

[TRABALHO EM PROGRESSO]

### Analogia

[TRABALHO EM PROGRESSO]

### Lacunas encontradas

- [ ] ...

### Versão de 10 linhas

[TRABALHO EM PROGRESSO]

## Como executar

```bash
cd "${HOME}/projetos/oracle-certifications/ocp-javaee7-app-developer"
sdk use java 8.0.472-amzn
mvn -pl labs/02-jpa-validation -am clean package
# implantar no Payara Server / GlassFish 4.1 (Java EE 7 full profile)
asadmin deploy --force=true labs/02-jpa-validation/target/02-jpa-validation.war
```
