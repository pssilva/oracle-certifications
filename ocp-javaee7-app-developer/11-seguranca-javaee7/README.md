Módulo: 11-seguranca-javaee7
--------

Tópico 11 do exame **1Z0-900 — Java EE 7 Application Developer**: *Proteger aplicações Java EE 7*.

Para este módulo usaremos como base de referência o Livro: [Beginning Java EE 7 — Antonio Goncalves (Apress, 2013)](https://a.co/d/04zua8PD); complemento: [Java EE 7 Tutorial](https://docs.oracle.com/javaee/7/tutorial/partsecurity.htm).

| Item | Valor |
| --- | --- |
| Versões EE 7 cobradas | Servlet/EJB security |
| Peso estimado | Médio (estimativa; a Oracle não publica percentuais) |
| Dia(s) do cronograma | 17 (29/10) |
| Leitura | Goncalves cap. 8 (Authorization); Tutorial "Security" |
| Pacote Java | `br.com.oracle_certificatons.ocp.javaee7.security` |

## Objetivo

Itens oficiais cobrados no exame:

- [ ] Segurança declarativa e programática
- [ ] Autenticação com roles, security constraints e login modules
- [ ] Padrões de segurança em web services

Conceitos OCP
-------------

Os conceitos se encontram na pasta: `11-seguranca-javaee7/docs/feynman/`

- [Segurança Declarativa](docs/feynman/seguranca-declarativa/README.md)
- [Segurança Programática](docs/feynman/seguranca-programatica/README.md)
- [Autenticação, Roles e Login Modules](docs/feynman/autenticacao-e-login-modules/README.md)
- [Segurança em Web Services](docs/feynman/seguranca-web-services/README.md)

## Laboratório

Organize o estudo em três níveis (seção 7 do plano):

1. **Código existente**: leia o exemplo em `src/main`, identifique a API, explique o ciclo de vida e preveja o resultado.
2. **Experimento mínimo**: altere uma anotação, escopo, consulta ou configuração e observe a consequência.
3. **Evidência de domínio**: registre o objetivo oficial atendido, os conceitos envolvidos e uma questão de revisão.

### Experimentos sugeridos

- [ ] Acessar `/admin/report` sem login, com usuário `user` e com usuário `admin`.
- [ ] Remover o `<auth-constraint>` e depois deixá-lo vazio; comparar os dois efeitos.
- [ ] Trocar `FORM` por `BASIC` no `web.xml`.
- [ ] Chamar `ReportService.adminReport()` com um usuário sem role e observar `EJBAccessException`.

## Pegadinhas

Hipóteses para **provar no código** (marque quando comprovar; acrescente as que descobrir):

- [ ] `<auth-constraint/>` vazio nega acesso a todos; ausência de `<auth-constraint>` libera a todos.
- [ ] Login FORM usa `j_security_check`, `j_username` e `j_password`.
- [ ] Servlet usa `isUserInRole`/`getUserPrincipal`; EJB usa `isCallerInRole`/`getCallerPrincipal`.
- [ ] `<transport-guarantee>CONFIDENTIAL</transport-guarantee>` força HTTPS.
- [ ] Servlet 3.1 trouxe `<deny-uncovered-http-methods/>`.

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
mvn -pl 11-seguranca-javaee7 -am clean package
# implantar no Payara Server / GlassFish 4.1 (Java EE 7 full profile)
asadmin deploy --force=true 11-seguranca-javaee7/target/11-seguranca-javaee7.war
```
