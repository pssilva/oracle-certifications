Módulo: 13-api-concorrencia
--------

Tópico 13 do exame **1Z0-900 — Java EE 7 Application Developer**: *Usar a API de Concorrência em aplicações Java EE 7*.

Para este módulo usaremos como base de referência o Livro: [Beginning Java EE 7 — Antonio Goncalves (Apress, 2013)](https://tenlong.com.tw/products/9781430246268); complemento: [Java EE 7 Tutorial](https://docs.oracle.com/javaee/7/tutorial/concurrency-utilities.htm).

| Item | Valor |
| --- | --- |
| Versões EE 7 cobradas | Concurrency 1.0 |
| Peso estimado | Baixo (estimativa; a Oracle não publica percentuais) |
| Dia(s) do cronograma | 18 (30/10) |
| Leitura | Tutorial "Concurrency Utilities for Java EE" |
| Pacote Java | `br.com.oracle_certificatons.ocp.javaee7.concurrency` |

## Objetivo

Itens oficiais cobrados no exame:

- [ ] Concurrency Utilities
- [ ] ManagedExecutorService

Complementos (fora da lista oficial; apoiam os itens acima):

- [ ] ManagedScheduledExecutorService, ContextService e ManagedThreadFactory

Conceitos OCP
-------------

Os conceitos se encontram na pasta: `13-api-concorrencia/docs/feynman/`

- [ManagedExecutorService](docs/feynman/managed-executor-service/README.md)
- [ManagedScheduledExecutorService e Trigger](docs/feynman/managed-scheduled-executor/README.md)
- [ContextService e ManagedThreadFactory](docs/feynman/context-service-e-thread-factory/README.md)

## Laboratório

Organize o estudo em três níveis (seção 7 do plano):

1. **Código existente**: leia o exemplo em `src/main`, identifique a API, explique o ciclo de vida e preveja o resultado.
2. **Experimento mínimo**: altere uma anotação, escopo, consulta ou configuração e observe a consequência.
3. **Evidência de domínio**: registre o objetivo oficial atendido, os conceitos envolvidos e uma questão de revisão.

### Experimentos sugeridos

- [ ] Chamar `/report` e verificar que a tarefa roda numa thread gerenciada com contexto JNDI.
- [ ] Tentar um lookup JNDI de dentro de um `new Thread()` comum e comparar.
- [ ] Implementar `ManagedTaskListener` e logar `taskSubmitted`/`taskDone`.

## Pegadinhas

Hipóteses para **provar no código** (marque quando comprovar; acrescente as que descobrir):

- [ ] Recurso padrão: `java:comp/DefaultManagedExecutorService`.
- [ ] Executores gerenciados não podem ser encerrados pela aplicação (`shutdown` lança `IllegalStateException`).
- [ ] `ContextService.createContextualProxy` propaga o contexto do container para objetos fora dele.

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
mvn -pl 13-api-concorrencia -am clean package
# implantar no Payara Server / GlassFish 4.1 (Java EE 7 full profile)
asadmin deploy --force=true 13-api-concorrencia/target/13-api-concorrencia.war
```
