Módulo: 04-servico-mensagens-jms
--------

Tópico 04 do exame **1Z0-900 — Java EE 7 Application Developer**: *Usar a API Java Message Service (JMS)*.

Para este módulo usaremos como base de referência o Livro: [Beginning Java EE 7 — Antonio Goncalves (Apress, 2013)](https://tenlong.com.tw/products/9781430246268); complemento: [Java EE 7 Tutorial](https://docs.oracle.com/javaee/7/tutorial/partmessaging.htm).

| Item | Valor |
| --- | --- |
| Versões EE 7 cobradas | JMS 2.0 |
| Peso estimado | Médio (estimativa; a Oracle não publica percentuais) |
| Dia(s) do cronograma | 15 (27/10) |
| Leitura | Goncalves cap. 13 |
| Pacote Java | `br.com.oracle_certificatons.ocp.javaee7.jms` |

## Objetivo

Itens oficiais cobrados no exame:

- [ ] Modelos ponto a ponto e pub/sub
- [ ] Produtores e consumidores em SE e EE
- [ ] Transações com JMS
- [ ] Message-Driven Beans

Conceitos OCP
-------------

Os conceitos se encontram na pasta: `04-servico-mensagens-jms/docs/feynman/`

- [Modelos Ponto a Ponto e Publish/Subscribe](docs/feynman/modelos-p2p-pubsub/README.md)
- [Produtores e Consumidores (JMSContext)](docs/feynman/produtores-e-consumidores/README.md)
- [Transações com JMS](docs/feynman/transacoes-jms/README.md)
- [Message-Driven Beans](docs/feynman/message-driven-beans/README.md)

## Laboratório

Organize o estudo em três níveis (seção 7 do plano):

1. **Código existente**: leia o exemplo em `src/main`, identifique a API, explique o ciclo de vida e preveja o resultado.
2. **Experimento mínimo**: altere uma anotação, escopo, consulta ou configuração e observe a consequência.
3. **Evidência de domínio**: registre o objetivo oficial atendido, os conceitos envolvidos e uma questão de revisão.

### Experimentos sugeridos

- [ ] Enviar 10 mensagens para a fila e observar o MDB consumindo em paralelo (pool).
- [ ] Trocar a fila por um tópico e criar dois assinantes; comparar com a fila.
- [ ] Lançar exceção em `onMessage` e observar a reentrega (`JMSRedelivered`).
- [ ] Escrever um consumidor Java SE com `JMSContext.createConsumer(...).receive()`.

## Pegadinhas

Hipóteses para **provar no código** (marque quando comprovar; acrescente as que descobrir):

- [ ] `JMSContext` injetado com `@Inject` é gerenciado pelo container: chamar `close()` lança `IllegalStateRuntimeException`.
- [ ] Dentro de uma transação JTA, os argumentos `transacted`/`acknowledgeMode` de `createSession` são ignorados.
- [ ] `@JMSDestinationDefinition` (EE 7) define destinos portáveis sem configurar o servidor.
- [ ] MDB não tem interface de cliente: só é acionado por mensagens.

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
mvn -pl 04-servico-mensagens-jms -am clean package
# implantar no Payara Server / GlassFish 4.1 (Java EE 7 full profile)
asadmin deploy --force=true 04-servico-mensagens-jms/target/04-servico-mensagens-jms.war
```
