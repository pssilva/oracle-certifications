Módulo: 03-logica-negocios-ejbs
--------

Tópico 03 do exame **1Z0-900 — Java EE 7 Application Developer**: *Implementar lógica de negócios usando EJBs*.

Para este módulo usaremos como base de referência o Livro: [Beginning Java EE 7 — Antonio Goncalves (Apress, 2013)](https://a.co/d/04zua8PD); complemento: [Java EE 7 Tutorial](https://docs.oracle.com/javaee/7/tutorial/partentbeans.htm).

| Item | Valor |
| --- | --- |
| Versões EE 7 cobradas | EJB 3.2 |
| Peso estimado | Alto (estimativa; a Oracle não publica percentuais) |
| Dia(s) do cronograma | 6–7 (18/10–19/10) |
| Leitura | Goncalves cap. 7–9 |
| Pacote Java | `br.com.oracle_certificatons.ocp.javaee7.ejb` |

## Objetivo

Itens oficiais cobrados no exame:

- [ ] Session beans síncronos e assíncronos, callbacks de ciclo de vida e interceptadores
- [ ] Transações CMT vs BMT
- [ ] Timers

Complementos (fora da lista oficial; apoiam os itens acima):

- [ ] Interceptors 1.2 e JTA 1.2 (APIs de apoio)

Conceitos OCP
-------------

Os conceitos se encontram na pasta: `03-logica-negocios-ejbs/docs/feynman/`

- [Session Beans: Stateless, Stateful e Singleton](docs/feynman/session-beans/README.md)
- [Métodos Assíncronos (@Asynchronous)](docs/feynman/metodos-assincronos/README.md)
- [Callbacks e Interceptors](docs/feynman/callbacks-interceptors/README.md)
- [Transações CMT x BMT](docs/feynman/transacoes-cmt-bmt/README.md)
- [Timer Service](docs/feynman/timer-service/README.md)

## Laboratório

Organize o estudo em três níveis (seção 7 do plano):

1. **Código existente**: leia o exemplo em `src/main`, identifique a API, explique o ciclo de vida e preveja o resultado.
2. **Experimento mínimo**: altere uma anotação, escopo, consulta ou configuração e observe a consequência.
3. **Evidência de domínio**: registre o objetivo oficial atendido, os conceitos envolvidos e uma questão de revisão.

### Experimentos sugeridos

- [ ] Lançar `IllegalStateException` dentro de `placeOrder` e verificar rollback + descarte da instância.
- [ ] Trocar `@ApplicationException(rollback = true)` para `false` e comparar o efeito no banco.
- [ ] Mudar o atributo de `AuditService.log` de `REQUIRES_NEW` para `MANDATORY` e chamar sem transação.
- [ ] Montar a tabela dos 6 atributos de transação com uma analogia para cada um.

## Pegadinhas

Hipóteses para **provar no código** (marque quando comprovar; acrescente as que descobrir):

- [ ] Atributo de transação padrão em CMT é `REQUIRED`.
- [ ] Exceção de sistema (unchecked) faz rollback e descarta a instância (exceto Singleton).
- [ ] Exceção de aplicação *não* faz rollback, a não ser com `@ApplicationException(rollback = true)`.
- [ ] `@Asynchronous` só aceita retorno `void` ou `Future<V>`.
- [ ] `@Schedule` é persistente por padrão; `second`, `minute` e `hour` têm padrão `"0"`.
- [ ] Singleton usa concorrência gerenciada pelo container com `@Lock(WRITE)` por padrão.

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
mvn -pl 03-logica-negocios-ejbs -am clean package
# implantar no Payara Server / GlassFish 4.1 (Java EE 7 full profile)
asadmin deploy --force=true 03-logica-negocios-ejbs/target/03-logica-negocios-ejbs.war
```
