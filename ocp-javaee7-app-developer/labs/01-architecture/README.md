Módulo: 01-architecture
--------

Tópico 01 do exame **1Z0-900 — Java EE 7 Application Developer**: *Entender a Arquitetura Java EE*.

Para este módulo usaremos como base de referência o Livro: [Beginning Java EE 7 — Antonio Goncalves (Apress, 2013)](https://tenlong.com.tw/products/9781430246268); complemento: [Java EE 7 Tutorial](https://docs.oracle.com/javaee/7/tutorial/overview.htm).

| Item | Valor |
| --- | --- |
| Versões EE 7 cobradas | Plataforma 7 |
| Peso estimado | Médio (estimativa; a Oracle não publica percentuais) |
| Dia(s) do cronograma | 1–2 (13/10–14/10) |
| Leitura | Goncalves cap. 1; Tutorial parte I (Overview) e "Packaging Applications" |
| Pacote Java | `br.com.oracle_certificatons.ocp.javaee7.architecture` |

## Objetivo

Itens oficiais cobrados no exame:

- [ ] Padrões, containers, APIs e serviços do EE 7
- [ ] Componentes por camada (web, negócio, web services)
- [ ] Empacotar e implantar (WAR, EJB-JAR, EAR)
- [ ] Ciclo de vida e escopos de EJB e CDI
- [ ] Relação entre beans, anotações, injeção e JNDI

Conceitos OCP
-------------

Os conceitos se encontram na pasta: `labs/01-architecture/docs/feynman/`

- [Containers e Camadas](docs/feynman/containers-e-camadas/README.md)
- [Empacotamento WAR, EJB-JAR e EAR](docs/feynman/empacotamento-war-ejbjar-ear/README.md)
- [JNDI e Injeção de Recursos](docs/feynman/jndi-e-injecao-de-recursos/README.md)
- [Ciclo de Vida e Escopos EJB x CDI](docs/feynman/ciclo-de-vida-e-escopos/README.md)

## Laboratório

Organize o estudo em três níveis (seção 7 do plano):

1. **Código existente**: leia o exemplo em `src/main`, identifique a API, explique o ciclo de vida e preveja o resultado.
2. **Experimento mínimo**: altere uma anotação, escopo, consulta ou configuração e observe a consequência.
3. **Evidência de domínio**: registre o objetivo oficial atendido, os conceitos envolvidos e uma questão de revisão.

### Experimentos sugeridos

- [ ] Implantar o WAR e acessar `/platform`: observar `java:module/ModuleName` e `java:app/AppName`.
- [ ] Trocar `@Stateless` por `@Singleton` em `GreetingBean` e registrar quantas instâncias são criadas.
- [ ] Montar um EAR mínimo (WAR + EJB-JAR) e comparar os nomes JNDI portáveis `java:global/...`.

## Pegadinhas

Hipóteses para **provar no código** (marque quando comprovar; acrescente as que descobrir):

- [ ] Desde o EE 6, EJBs (EJB Lite) podem ser empacotados direto no WAR, sem EJB-JAR.
- [ ] Nome JNDI portável: `java:global[/app]/module/bean[!interface-qualificada]`.
- [ ] EE 7 traz recursos padrão: `java:comp/DefaultDataSource` e `java:comp/DefaultJMSConnectionFactory`.
- [ ] No EE 7 o `beans.xml` é opcional: sem ele vale `bean-discovery-mode="annotated"`.

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
mvn -pl labs/01-architecture -am clean package
# implantar no Payara Server / GlassFish 4.1 (Java EE 7 full profile)
asadmin deploy --force=true labs/01-architecture/target/01-architecture.war
```
