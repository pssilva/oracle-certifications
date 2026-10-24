Módulo: 10-app-web-jsf
--------

Tópico 10 do exame **1Z0-900 — Java EE 7 Application Developer**: *Desenvolver aplicações Web usando JSF*.

Para este módulo usaremos como base de referência o Livro: [Beginning Java EE 7 — Antonio Goncalves (Apress, 2013)](https://a.co/d/04zua8PD); complemento: [Java EE 7 Tutorial](https://docs.oracle.com/javaee/7/tutorial/partwebtier.htm).

| Item | Valor |
| --- | --- |
| Versões EE 7 cobradas | JSF 2.2 |
| Peso estimado | Alto (estimativa; a Oracle não publica percentuais) |
| Dia(s) do cronograma | 11–12 (23/10–24/10) |
| Leitura | Goncalves cap. 10–11 |
| Pacote Java | `br.com.oracle_certificatons.ocp.javaee7.jsf` |

## Objetivo

Itens oficiais cobrados no exame:

- [ ] Arquitetura, ciclo de vida e navegação
- [ ] Sintaxe e tag libraries
- [ ] Localização e mensagens
- [ ] EL e integração com CDI

Conceitos OCP
-------------

Os conceitos se encontram na pasta: `10-app-web-jsf/docs/feynman/`

- [Arquitetura e as 6 Fases do Ciclo de Vida](docs/feynman/arquitetura-ciclo-vida/README.md)
- [Navegação Implícita e Explícita](docs/feynman/navegacao/README.md)
- [Facelets e Tag Libraries](docs/feynman/facelets-tag-libraries/README.md)
- [Localização e Mensagens](docs/feynman/localizacao-mensagens/README.md)
- [EL e Integração com CDI](docs/feynman/el-integracao-cdi/README.md)

## Laboratório

Organize o estudo em três níveis (seção 7 do plano):

1. **Código existente**: leia o exemplo em `src/main`, identifique a API, explique o ciclo de vida e preveja o resultado.
2. **Experimento mínimo**: altere uma anotação, escopo, consulta ou configuração e observe a consequência.
3. **Evidência de domínio**: registre o objetivo oficial atendido, os conceitos envolvidos e uma questão de revisão.

### Experimentos sugeridos

- [ ] Submeter o formulário vazio e ver em qual fase a validação interrompe o ciclo.
- [ ] Adicionar `immediate="true"` no botão e observar o pulo de fases.
- [ ] Navegar com `return "result"` e depois com `"result?faces-redirect=true"`; comparar a URL.
- [ ] Criar `messages_en.properties` e alternar o idioma da página.

## Pegadinhas

Hipóteses para **provar no código** (marque quando comprovar; acrescente as que descobrir):

- [ ] Fases: Restore View, Apply Request Values, Process Validations, Update Model Values, Invoke Application, Render Response.
- [ ] Falha de validação pula direto para Render Response.
- [ ] Navegação implícita: a string retornada vira `<string>.xhtml`.
- [ ] JSF 2.2 trouxe `@FlowScoped`, `@ViewScoped` compatível com CDI e atributos *pass-through* HTML5.

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
mvn -pl 10-app-web-jsf -am clean package
# implantar no Payara Server / GlassFish 4.1 (Java EE 7 full profile)
asadmin deploy --force=true 10-app-web-jsf/target/10-app-web-jsf.war
```
