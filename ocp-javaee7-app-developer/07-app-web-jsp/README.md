Módulo: 07-app-web-jsp
--------

Tópico 07 do exame **1Z0-900 — Java EE 7 Application Developer**: *Criar aplicações Web Java usando JSPs*.

Para este módulo usaremos como base de referência o Livro: [Beginning Java EE 7 — Antonio Goncalves (Apress, 2013)](https://a.co/d/04zua8PD); complemento: [Java EE 7 Tutorial](https://docs.oracle.com/javaee/7/tutorial/jsf-el.htm).

| Item | Valor |
| --- | --- |
| Versões EE 7 cobradas | JSP 2.3, EL 3.0 |
| Peso estimado | Médio (estimativa; a Oracle não publica percentuais) |
| Dia(s) do cronograma | 9–10 (21/10–22/10) |
| Leitura | Tutorial (EE 5/6) "JavaServer Pages" e EE 7 "Expression Language" |
| Pacote Java | `br.com.oracle_certificatons.ocp.javaee7.jsp` |

## Objetivo

Itens oficiais cobrados no exame:

- [ ] Ciclo de vida
- [ ] Sintaxe, tag libraries (JSTL) e EL
- [ ] Tratamento de erros com Servlets e JSP

Conceitos OCP
-------------

Os conceitos se encontram na pasta: `07-app-web-jsp/docs/feynman/`

- [Ciclo de Vida e Sintaxe JSP](docs/feynman/ciclo-de-vida-e-sintaxe-jsp/README.md)
- [JSTL e Tag Libraries](docs/feynman/jstl-tag-libraries/README.md)
- [Expression Language 3.0](docs/feynman/expression-language/README.md)
- [Tratamento de Erros (error-page)](docs/feynman/tratamento-de-erros/README.md)

## Laboratório

Organize o estudo em três níveis (seção 7 do plano):

1. **Código existente**: leia o exemplo em `src/main`, identifique a API, explique o ciclo de vida e preveja o resultado.
2. **Experimento mínimo**: altere uma anotação, escopo, consulta ou configuração e observe a consequência.
3. **Evidência de domínio**: registre o objetivo oficial atendido, os conceitos envolvidos e uma questão de revisão.

### Experimentos sugeridos

- [ ] Abrir `index.jsp` e inspecionar o servlet gerado no diretório de trabalho do servidor.
- [ ] Comparar `<%@ include %>` com `<jsp:include>` alterando o arquivo incluído sem reimplantar.
- [ ] Chamar `boom.jsp` e ver a `error.jsp` exibindo `${pageContext.exception}`.
- [ ] Testar operadores do EL 3.0: `+=` para concatenar e lambdas `${(x -> x * 2)(21)}`.

## Pegadinhas

Hipóteses para **provar no código** (marque quando comprovar; acrescente as que descobrir):

- [ ] A JSP é traduzida para um servlet: `jspInit()`, `_jspService()`, `jspDestroy()`.
- [ ] `<%@ include %>` é em tempo de tradução; `<jsp:include>` é em tempo de requisição.
- [ ] `${}` é avaliação imediata; `#{}` é diferida (usada no JSF).
- [ ] Só páginas com `isErrorPage="true"` têm o objeto implícito `exception`.

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
mvn -pl 07-app-web-jsp -am clean package
# implantar no Payara Server / GlassFish 4.1 (Java EE 7 full profile)
asadmin deploy --force=true 07-app-web-jsp/target/07-app-web-jsp.war
```
