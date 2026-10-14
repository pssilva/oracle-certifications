Módulo: 14-api-batch
--------

Tópico 14 do exame **1Z0-900 — Java EE 7 Application Developer**: *Usar a API Batch em aplicações Java EE 7*.

Para este módulo usaremos como base de referência o Livro: [Beginning Java EE 7 — Antonio Goncalves (Apress, 2013)](https://a.co/d/04zua8PD); complemento: [Java EE 7 Tutorial](https://docs.oracle.com/javaee/7/tutorial/batch-processing.htm).

| Item | Valor |
| --- | --- |
| Versões EE 7 cobradas | Batch 1.0 |
| Peso estimado | Baixo (estimativa; a Oracle não publica percentuais) |
| Dia(s) do cronograma | 18 (30/10) |
| Leitura | Tutorial "Batch Processing" |
| Pacote Java | `br.com.oracle_certificatons.ocp.javaee7.batch` |

## Objetivo

Itens oficiais cobrados no exame:

- [ ] Jobs com JSL XML
- [ ] API JSR 352

Complementos (fora da lista oficial; apoiam os itens acima):

- [ ] Chunk (reader/processor/writer), batchlet e JobOperator — como a API é usada na prática

Conceitos OCP
-------------

Os conceitos se encontram na pasta: `14-api-batch/docs/feynman/`

- [Job Specification Language (JSL)](docs/feynman/jsl-jobs/README.md)
- [Chunk: Reader, Processor e Writer](docs/feynman/chunk-processing/README.md)
- [Batchlet](docs/feynman/batchlet/README.md)
- [JobOperator e Contextos](docs/feynman/job-operator/README.md)

## Laboratório

Organize o estudo em três níveis (seção 7 do plano):

1. **Código existente**: leia o exemplo em `src/main`, identifique a API, explique o ciclo de vida e preveja o resultado.
2. **Experimento mínimo**: altere uma anotação, escopo, consulta ou configuração e observe a consequência.
3. **Evidência de domínio**: registre o objetivo oficial atendido, os conceitos envolvidos e uma questão de revisão.

### Experimentos sugeridos

- [ ] Iniciar o job `uppercase-job` via `/batch/start` e consultar o `BatchStatus`.
- [ ] Mudar `item-count` de 3 para 1 e contar quantas vezes o writer é chamado.
- [ ] Lançar exceção no processor e configurar `skippable-exception-classes`.
- [ ] Adicionar um `<decision>` e um `<split>` ao JSL.

## Pegadinhas

Hipóteses para **provar no código** (marque quando comprovar; acrescente as que descobrir):

- [ ] O JSL fica em `META-INF/batch-jobs/<nome>.xml` (no WAR: `WEB-INF/classes/META-INF/batch-jobs`).
- [ ] `item-count` padrão do chunk é 10.
- [ ] `JobOperator.start(...)` devolve o `executionId` (long) e não bloqueia.
- [ ] Propriedades do JSL chegam via `@Inject @BatchProperty`.

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
mvn -pl 14-api-batch -am clean package
# implantar no Payara Server / GlassFish 4.1 (Java EE 7 full profile)
asadmin deploy --force=true 14-api-batch/target/14-api-batch.war
```
