Módulo: 05-servicos-soap-jaxws-jaxb
--------

Tópico 05 do exame **1Z0-900 — Java EE 7 Application Developer**: *Implementar serviços SOAP usando JAX-WS e JAXB*.

Para este módulo usaremos como base de referência o Livro: [Beginning Java EE 7 — Antonio Goncalves (Apress, 2013)](https://a.co/d/04zua8PD); complemento: [Java EE 7 Tutorial](https://docs.oracle.com/javaee/7/tutorial/partwebsvcs.htm).

| Item | Valor |
| --- | --- |
| Versões EE 7 cobradas | JAX-WS 2.2, JAXB 2.2 |
| Peso estimado | Médio (estimativa; a Oracle não publica percentuais) |
| Dia(s) do cronograma | 16 (28/10) |
| Leitura | Goncalves cap. 12 (XML/JAXB) e 14 (SOAP) |
| Pacote Java | `br.com.oracle_certificatons.ocp.javaee7.soap` |

## Objetivo

Itens oficiais cobrados no exame:

- [ ] Serviços e clientes SOAP
- [ ] Mapeamento Java ↔ XML Schema, marshal e unmarshal

Conceitos OCP
-------------

Os conceitos se encontram na pasta: `05-servicos-soap-jaxws-jaxb/docs/feynman/`

- [Serviços e Clientes SOAP (JAX-WS)](docs/feynman/servicos-e-clientes-soap/README.md)
- [JAXB: Mapeamento Java ↔ XML](docs/feynman/jaxb-mapeamento-xml/README.md)

## Laboratório

Organize o estudo em três níveis (seção 7 do plano):

1. **Código existente**: leia o exemplo em `src/main`, identifique a API, explique o ciclo de vida e preveja o resultado.
2. **Experimento mínimo**: altere uma anotação, escopo, consulta ou configuração e observe a consequência.
3. **Evidência de domínio**: registre o objetivo oficial atendido, os conceitos envolvidos e uma questão de revisão.

### Experimentos sugeridos

- [ ] Implantar e abrir `CatalogService?wsdl`; identificar `portType`, `binding` e `service`.
- [ ] Anotar um método com `@WebMethod(exclude = true)` e conferir o WSDL gerado.
- [ ] Remover `@XmlRootElement` de `BookXml` e observar a falha no `marshal`.
- [ ] Gerar um cliente com `wsimport` a partir do WSDL e chamar `findBook`.

## Pegadinhas

Hipóteses para **provar no código** (marque quando comprovar; acrescente as que descobrir):

- [ ] Todo método público de um `@WebService` é exposto, salvo `@WebMethod(exclude = true)`.
- [ ] Stateless e Singleton podem ser endpoints SOAP; Stateful não.
- [ ] Sem `@XmlRootElement` é preciso envolver o objeto em `JAXBElement` para fazer marshal.
- [ ] Acesso padrão do JAXB é `PUBLIC_MEMBER` (getters/setters e campos públicos).

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
mvn -pl 05-servicos-soap-jaxws-jaxb -am clean package
# implantar no Payara Server / GlassFish 4.1 (Java EE 7 full profile)
asadmin deploy --force=true 05-servicos-soap-jaxws-jaxb/target/05-servicos-soap-jaxws-jaxb.war
```
