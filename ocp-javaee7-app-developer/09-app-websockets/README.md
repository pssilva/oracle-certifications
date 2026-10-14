Módulo: 09-app-websockets
--------

Tópico 09 do exame **1Z0-900 — Java EE 7 Application Developer**: *Criar aplicações Java usando WebSockets*.

Para este módulo usaremos como base de referência o Livro: [Beginning Java EE 7 — Antonio Goncalves (Apress, 2013)](https://a.co/d/04zua8PD); complemento: [Java EE 7 Tutorial](https://docs.oracle.com/javaee/7/tutorial/websocket.htm).

| Item | Valor |
| --- | --- |
| Versões EE 7 cobradas | WebSocket 1.0 |
| Peso estimado | Médio (estimativa; a Oracle não publica percentuais) |
| Dia(s) do cronograma | 14 (26/10) |
| Leitura | Tutorial "Java API for WebSocket" |
| Pacote Java | `br.com.oracle_certificatons.ocp.javaee7.websocket` |

## Objetivo

Itens oficiais cobrados no exame:

- [ ] Estilo de comunicação e ciclo de vida
- [ ] Endpoints servidor e cliente (JSR 356)
- [ ] Encoders e decoders de mensagens

Conceitos OCP
-------------

Os conceitos se encontram na pasta: `09-app-websockets/docs/feynman/`

- [Ciclo de Vida do WebSocket](docs/feynman/ciclo-de-vida-websocket/README.md)
- [Endpoints Anotados e Programáticos](docs/feynman/endpoints-anotados-e-programaticos/README.md)
- [Encoders e Decoders](docs/feynman/encoders-e-decoders/README.md)

## Laboratório

Organize o estudo em três níveis (seção 7 do plano):

1. **Código existente**: leia o exemplo em `src/main`, identifique a API, explique o ciclo de vida e preveja o resultado.
2. **Experimento mínimo**: altere uma anotação, escopo, consulta ou configuração e observe a consequência.
3. **Evidência de domínio**: registre o objetivo oficial atendido, os conceitos envolvidos e uma questão de revisão.

### Experimentos sugeridos

- [ ] Abrir duas abas conectadas em `/chat` e verificar o broadcast.
- [ ] Logar `this.hashCode()` em `@OnOpen` para confirmar uma instância por conexão.
- [ ] Trocar `getBasicRemote()` por `getAsyncRemote()` e comparar.
- [ ] Escrever um `@ClientEndpoint` Java SE usando `ContainerProvider.getWebSocketContainer()`.

## Pegadinhas

Hipóteses para **provar no código** (marque quando comprovar; acrescente as que descobrir):

- [ ] Por padrão é criada uma instância do endpoint por conexão.
- [ ] Só pode existir um `@OnMessage` por tipo de mensagem (texto, binária, pong).
- [ ] `getBasicRemote()` é síncrono; `getAsyncRemote()` devolve `Future` ou usa `SendHandler`.
- [ ] Encoders/decoders precisam ser declarados em `@ServerEndpoint(encoders=..., decoders=...)`.

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
mvn -pl 09-app-websockets -am clean package
# implantar no Payara Server / GlassFish 4.1 (Java EE 7 full profile)
asadmin deploy --force=true 09-app-websockets/target/09-app-websockets.war
```
