Módulo: 08-servicos-rest-jaxrs
--------

Tópico 08 do exame **1Z0-900 — Java EE 7 Application Developer**: *Implementar serviços REST usando a API JAX-RS*.

Para este módulo usaremos como base de referência o Livro: [Beginning Java EE 7 — Antonio Goncalves (Apress, 2013)](https://a.co/d/04zua8PD); complemento: [Java EE 7 Tutorial](https://docs.oracle.com/javaee/7/tutorial/partwebsvcs.htm).

| Item | Valor |
| --- | --- |
| Versões EE 7 cobradas | JAX-RS 2.0 |
| Peso estimado | Alto (estimativa; a Oracle não publica percentuais) |
| Dia(s) do cronograma | 13 (25/10) |
| Leitura | Goncalves cap. 12 (JSON-P) e 15 (RESTful) |
| Pacote Java | `br.com.oracle_certificatons.ocp.javaee7.rest` |

## Objetivo

Itens oficiais cobrados no exame:

- [ ] Convenções REST
- [ ] Serviços e clientes JAX-RS

Complementos (fora da lista oficial; apoiam os itens acima):

- [ ] Providers, filtros e interceptors
- [ ] JSON-P 1.0 para montar as respostas

Conceitos OCP
-------------

Os conceitos se encontram na pasta: `08-servicos-rest-jaxrs/docs/feynman/`

- [Convenções REST](docs/feynman/convencoes-rest/README.md)
- [Recursos e Parâmetros](docs/feynman/recursos-e-parametros/README.md)
- [Providers, Filtros e Interceptors](docs/feynman/providers-filtros-interceptors/README.md)
- [Cliente JAX-RS 2.0](docs/feynman/cliente-jaxrs/README.md)

## Laboratório

Organize o estudo em três níveis (seção 7 do plano):

1. **Código existente**: leia o exemplo em `src/main`, identifique a API, explique o ciclo de vida e preveja o resultado.
2. **Experimento mínimo**: altere uma anotação, escopo, consulta ou configuração e observe a consequência.
3. **Evidência de domínio**: registre o objetivo oficial atendido, os conceitos envolvidos e uma questão de revisão.

### Experimentos sugeridos

- [ ] Chamar `GET /api/books/1` e `GET /api/books/99`; comparar 200 e 404.
- [ ] Fazer o método retornar `null` e observar o status 204.
- [ ] Criar um `ContainerRequestFilter` que registra método e URI.
- [ ] Escrever um cliente com `ClientBuilder.newClient().target(...)`.

## Pegadinhas

Hipóteses para **provar no código** (marque quando comprovar; acrescente as que descobrir):

- [ ] Por padrão, uma classe recurso é criada a cada requisição.
- [ ] Método de recurso que retorna `null` (ou `void`) gera `204 No Content`.
- [ ] `@ApplicationPath` deve anotar uma subclasse de `javax.ws.rs.core.Application`.
- [ ] `@DefaultValue` não se aplica a `@PathParam` faltante: sem match o recurso não é chamado.

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
mvn -pl 08-servicos-rest-jaxrs -am clean package
# implantar no Payara Server / GlassFish 4.1 (Java EE 7 full profile)
asadmin deploy --force=true 08-servicos-rest-jaxrs/target/08-servicos-rest-jaxrs.war
```
