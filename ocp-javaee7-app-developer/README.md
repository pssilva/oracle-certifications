# Oracle Certifications: OCP Java EE 7 Application Developer

Se trata de um projeto prático prova de conceito - POC para deixar pegadas digitais e um comprometimento público para aplicar o foco e disciplia e com isso  ser próativo para os processos seletivos onde as equipes técnicas de recrutadores tenham condições e evidências para verificar se o meu perfil pode atender as necessidades das oportunidades.

## Visão do Projeto

Objetivo é focar no uso prático real dos conceitos abstratos do conteúdo programático das certificações: 

 - Java EE
    - [Java EE 7 Application Developer (Exam Number: 1Z0-900)](https://mylearn.oracle.com/ou/exam/java-ee-7-application-developer-1z0-900/105037/110661/170392)
 
 Tendo em mente que para a presente Certificação: 

  - O Conteúdo programático identificar os objetivos;
  - Para cada Objetivo dos Tópicos, explodir em habilidades;
  - Para cada habilidade, identificar boas práticas de uso Empírico;
  - Identificar a forma de como é cobrado o conhecimento no exame;
  - identificar, em projetos open-source, o uso dos conceitos, na prática;
  - Elaborar estratégias (checklists) de refatoração para aplicar boas práticas em projetos legados;

--- 

## Proficiências

Procuro evidência as proficiências nas seguintes habilidades técnicas:

- [Metodologia Básica de Análise de Algoritmos](#GOODRICH-Michael-T)
- Técnicas em [Análise Código-fonte Legados](#FEATHERS-michael);
- Técnicas em [Refatoração Código-fonte Legados](#FEATHERS-michael);
- Implementar Soluções usando algoritmos Reutilizáveis


Projeto inicializado com o [`Scripts de automação próprio`]().

## 🚀 Começando

### 🔧 Instalação

Para obter o presente projeto use os seguintes comandos:

```bash
mkdir -p "${HOME}/projetos"
cd "${HOME}/projetos"
git clone https://github.com/pssilva/oracle-certifications.git
cd oracle-certifications
source ~/.bash_profile
idea .
```


#### Pré-requisitos

Depois de baixar o projeto: De que coisas precisamos para atuar no projeto `oracle-certifications` e executá-lo?

Para isso, use os comandos do script de automação:

```bash

export ARTIFACT_ID="oracle-certifications"
export TOOL_NAME="OracleCertificationsScriptsUteis"
export SCRIPT_PATH="${HOME}/projetos${ARTIFACT_ID}/scripts"
export AUTOMATION_PATH="${SCRIPT_PATH}/src/main/automation"
export TOOL_PATH="${AUTOMATION_PATH}/${TOOL_NAME}"

source "${TOOL_PATH}/OracleCertificationsScriptsUteis_main.sh"

OracleCertificationsScriptsUteis.installAllTools

```


Depois de instalar as ferramentas necessárias.

Executar o projeto `ocp-javaee7-app-developer`, use os seguintes comandos:

```bash
export ARTIFACT_ID_PARENT="oracle-certifications"
export ARTIFACT_ID="ocp-javaee7-app-developer"
cd "${HOME}/projetos/${ARTIFACT_ID_PARENT}/${ARTIFACT_ID}"
sdk install java 8.0.472-amzn
sdk use java 8.0.472-amzn      # o exame cobra Java EE 7: GlassFish/Payara 4.1 rodam em Java 8
mvn clean verify               # gera um WAR por módulo em NN-*/target/
source ~/.bash_profile
idea .
```

> Também compila com o JDK 25 do POM raiz: o perfil `jdk9-plus` usa `--release 8`.

Para implantar um laboratório, use um servidor **Java EE 7 Full Profile** — [Payara Server 4.1](https://www.payara.fish/downloads/payara-platform-community-edition/) ou [GlassFish 4.1](https://javaee.github.io/glassfish/download) (JMS/MDB exigem o full profile):

```bash
asadmin start-domain
asadmin deploy --force=true 06-app-web-servlets/target/06-app-web-servlets.war
# http://localhost:8080/06-app-web-servlets/hello?name=Ana
```

### 🧪 Estrutura do Laboratório

O repositório é usado como laboratório durante os 21 dias do [Plano de Estudos](study-plan/daily-log.md), em três níveis:
**código existente** (ler e prever o resultado) → **experimento mínimo** (alterar e observar) → **evidência de domínio** (objetivo atendido + questão de revisão).

```
ocp-javaee7-app-developer/
├── README.md
├── pom.xml                      # POM pai: javaee-api 7.0 (provided), Java 8, JUnit 5
├── study-plan/
│   ├── objectives-checklist.md  # 14 tópicos × itens oficiais (E/C/Q/R)
│   ├── daily-log.md             # cronograma de 21 dias + registro diário
│   ├── feynman-notes.md         # índice das versões de 10 linhas + critérios de prontidão
│   └── error-log.md             # índice de MISTAKEs com revisão espaçada
├── 01-arquitetura-javaee/       # um módulo Maven (WAR) por tópico do exame,
├── ...                          # numerado na ordem oficial do 1Z0-900
├── 14-api-batch/
│   └── (cada NN-tópico/)
│       ├── README.md            # objetivos, experimentos, pegadinhas, Feynman do tópico
│       ├── src/main/java/br/com/oracle_certificatons/ocp/javaee7/<pacote>/
│       ├── src/test/java/...
│       └── docs/feynman/<conceito>/
│           ├── README.md        # protocolo Feynman de 60 min
│           ├── mistakes/        # registros MISTAKE-NNN
│           ├── questions-exam/  # questões do conceito
│           └── evidencias/      # imgs/ (cards) e audios/
└── mock-exams/                  # simulados 1 e 2 (Dias 19–20)
```

Para criar a estrutura da [Técnica Feynman](https://youtu.be/CN_SCpGuJ_w?si=7eqvv5fpdCkjXVdz) de um novo conceito,
use `OracleCertificationsScriptsUteis.CriarStructureByConceito "{{NOME_MODULO}}" "{{CONCEITO}}" "ocp-javaee7-app-developer"`:

```bash
export ARTIFACT_ID="oracle-certifications"
export TOOL_NAME="OracleCertificationsScriptsUteis"
export SCRIPT_PATH="${HOME}/projetos/${ARTIFACT_ID}/scripts"
export AUTOMATION_PATH="${SCRIPT_PATH}/src/main/automation"
export TOOL_PATH="${AUTOMATION_PATH}/${TOOL_NAME}"

source "${TOOL_PATH}/ocp-training-lab.sh"
OracleCertificationsScriptsUteis.CriarStructureByConceito "12-beans-cdi" "Alternatives e Specialization" "ocp-javaee7-app-developer"
```

---

## Débitos Técnicos

Aqui temos uma lista do que idenficamos com status de pendente:

### Funcionalidades Aplicação

Segue abaixo (não se limita) os objetivos do presente projeto:

- [X] ~~Formatando documentação README.md~~
- [ ] Indexação completa do vídeo longo: [VIDEO LONGO 071518 – 03.04.02.01.17.06 – 1 How to pass Exam 1Z0-811 | Java Oracle Certified Foundations Associate in 20 hours | Part1 – Questões](../docs/indexacoes/VIDEO%20LONGO%20071518%20–%2003.04.02.01.17.06%20–%201%20How%20to%20pass%20Exam%201Z0-811%20|%20Java%20Oracle%20Certified%20Foundations%20Associate%20in%2020%20hours%20|%20Part1%20–%20Questões.pdf) (mais detalhes veja [aqui](../docs/indexacoes/README.md))
- [ ] Indexação completa do vídeo longo: [VIDEO LONGO 074048 – 03.04.02.01.17.06 – 2 How to pass Exam 1Z0-811 | Java Oracle Certified Foundations Associate in 20 hours | Part 2 – Questões](../docs/indexacoes/VIDEO%20LONGO%20074048%20–%2003.04.02.01.17.06%20–%202%20How%20to%20pass%20Exam%201Z0-811%20|%20Java%20Oracle%20Certified%20Foundations%20Associate%20in%2020%20hours%20|%20Part%202%20–%20Questões.pdf) (mais detalhes veja [aqui](../docs/indexacoes/README.md))
- [ ] Indexação completa do vídeo longo: [VIDEO LONGO – 061942 – 03.04.02.01.17.06 – 3 How to pass Exam 1Z0-811 | Java Oracle Certified Foundations Associate in 20 hours | Part 3 – Questões](../docs/indexacoes/VIDEO%20LONGO%20–%20061942%20–%2003.04.02.01.17.06%20–%203%20How%20to%20pass%20Exam%201Z0-811%20|%20Java%20Oracle%20Certified%20Foundations%20Associate%20in%2020%20hours%20|%20Part%203%20–%20Questões.pdf) (mais detalhes veja [aqui](../docs/indexacoes/README.md))
- [X] ~~Organizar o código em módulos Maven: um módulo para cada tópico do conteúdo programático da certificação~~

### Tópicos da Certificação

Tomando como base [Exam 1Z0-900: Java EE 7 Application Developer](https://mylearn.oracle.com/ou/exam/java-ee-7-application-developer-1z0-900/105037/110661/170392)
(~70 questões, corte de 66%). Atenção: o exame cobra as versões do **Java EE 7**, não do EE 8
(nada de JSF 2.3, JPA 2.2, CDI 2.0, Servlet 4.0, JSON-B ou Security API 1.0).

| # | Tópico | Laboratório | Versões EE 7 | Peso estimado | Dia(s) |
| --- | --- | --- | --- | --- | --- |
| 01 | [Entender a Arquitetura Java EE](01-arquitetura-javaee/README.md) | `01-arquitetura-javaee` | Plataforma 7 | Médio | 1–2 (13/10–14/10) |
| 02 | [Gerenciar persistência usando entidades JPA e Bean Validation](02-persistencia-jpa-bean-validation/README.md) | `02-persistencia-jpa-bean-validation` | JPA 2.1, BV 1.1 | Alto | 4–5 (16/10–17/10) |
| 03 | [Implementar lógica de negócios usando EJBs](03-logica-negocios-ejbs/README.md) | `03-logica-negocios-ejbs` | EJB 3.2 | Alto | 6–7 (18/10–19/10) |
| 04 | [Usar a API Java Message Service (JMS)](04-servico-mensagens-jms/README.md) | `04-servico-mensagens-jms` | JMS 2.0 | Médio | 15 (27/10) |
| 05 | [Implementar serviços SOAP usando JAX-WS e JAXB](05-servicos-soap-jaxws-jaxb/README.md) | `05-servicos-soap-jaxws-jaxb` | JAX-WS 2.2, JAXB 2.2 | Médio | 16 (28/10) |
| 06 | [Criar aplicações Web Java usando Servlets](06-app-web-servlets/README.md) | `06-app-web-servlets` | Servlet 3.1 | Alto | 8–9 (20/10–21/10) |
| 07 | [Criar aplicações Web Java usando JSPs](07-app-web-jsp/README.md) | `07-app-web-jsp` | JSP 2.3, EL 3.0 | Médio | 9–10 (21/10–22/10) |
| 08 | [Implementar serviços REST usando a API JAX-RS](08-servicos-rest-jaxrs/README.md) | `08-servicos-rest-jaxrs` | JAX-RS 2.0 | Alto | 13 (25/10) |
| 09 | [Criar aplicações Java usando WebSockets](09-app-websockets/README.md) | `09-app-websockets` | WebSocket 1.0 | Médio | 14 (26/10) |
| 10 | [Desenvolver aplicações Web usando JSF](10-app-web-jsf/README.md) | `10-app-web-jsf` | JSF 2.2 | Alto | 11–12 (23/10–24/10) |
| 11 | [Proteger aplicações Java EE 7](11-seguranca-javaee7/README.md) | `11-seguranca-javaee7` | Servlet/EJB security | Médio | 17 (29/10) |
| 12 | [Usar beans CDI](12-beans-cdi/README.md) | `12-beans-cdi` | CDI 1.1 | Alto | 3 (15/10) |
| 13 | [Usar a API de Concorrência em aplicações Java EE 7](13-api-concorrencia/README.md) | `13-api-concorrencia` | Concurrency 1.0 | Baixo | 18 (30/10) |
| 14 | [Usar a API Batch em aplicações Java EE 7](14-api-batch/README.md) | `14-api-batch` | Batch 1.0 | Baixo | 18 (30/10) |

O peso é estimativa a partir da quantidade de itens por tópico; a Oracle não publica percentuais.
O acompanhamento item a item fica em [study-plan/objectives-checklist.md](study-plan/objectives-checklist.md).

- [ ] Scritps de Automação
  - [X] ~~instalação das Ferramentas de Desenvolvimento.~~
  - [ ] Criar automação para as principais funcionalidade (features) disponíveis no Java EE
- [ ] [Metodologia Básica de Análise de Algoritmos](#GOODRICH-Michael-T)
  - [ ] Aplicar técncia para análise explorativa da implementação do [AxonFramework](https://github.com/AxonFramework/AxonFramework) e dos seus respectivos conceitos: [DDD, CQRS, Microservices e Event Sourcing](https://www.axoniq.io/concepts)
  - [ ] Aplicar técncia para análise explorativa da implementação do [Axon Server](https://github.com/AxonIQ/axon-server-se)
- [ ] [Implementar Testes (TDD)](#GONZALEZ_Javier_cap_11): Técnica Red-Green-Refact
- [ ] [Teste e Monitoramento de Aplicativos Simultâneos](#GONZALEZ_Javier_cap_11): Ferramenta Java VisualVM
- [ ] Descrição sucinta da tarefa a ser feita aqui ......
- [ ] Descrição sucinta [TRABALHO EM PROGRESSO]

### Atividades - DevOps

- [ ] Implementação dos Pipelines CI/CD de Implatação num Provedor de Nuvem (mais detalhes veja [aqui](docs/provedores_nuvem/README.md)).
- [ ] Implementar restrições de Commit no Git: vinculado com o ID de regra de negócio e ID do checklist de validação das entragas de funcionalidades (mais detalhes [aqui](docs/checklists/README.md))
- [ ] Implementar Dockerfiles para Kubernetes
- [ ] Colocar em prática o Desenvolvimento Orientado a Interface onde se deve desacoplar a aplicação do procedor de nuvem (Princípio da Segregação de Interface (ISP) - SOLID) (mais detalhes veja [aqui](docs/provedores_nuvem/README.md))
- [ ] Implementar Arquitetura Orienta a Eventos ([EDA](https://aws.amazon.com/pt/what-is/eda/))

### Suporte / Sustentação

- [ ] Abordagem API First e Implementação da Especificação do [OpenAPI (antido Swagger)](https://swagger.io/specification/) para integração com o back-end
- [ ] Clusterização da Solução em Diversas [VM em multicloud Nuvem]() para integração com o back-end

---

## 📦 Desenvolvimento

- [ ] Inplementar o gernciador de tarefas Gruntfile.js

### Mentalidade PDCA

Tendo em mente que sempre buscamos melhorar o protocolo de trabalho operacinal do dia a dia usando empirismo (colocar realmente em prática os conheicmentos abstratos):

<img src="../docs/imgs/pdca.png" alt="PDCA: Aplicar na prática o empirismo" title="PDCA" style="width:475px;"/>

---

## 🛠️ Construído com

Segue aqui as ferramentas utilizadas na construção presente projeto:

### Ferramentas

* [Docker](https://www.docker.com/get-started/)
* [NVM](https://github.com/nvm-sh/nvm?tab=readme-ov-file#intro) - Node Version Manager
* [Terminal Shell Linux (WSL)](https://learn.microsoft.com/pt-br/windows/wsl/install)


## 🖇️ Colaborando

Por favor, leia o [COLABORACAO.md](COLABORACAO.md) para obter detalhes sobre o nosso código de conduta e o processo para nos enviar pedidos de solicitação.

## 📌 Versão

Nós usamos [SemVer](http://semver.org/) para controle de versão. Para as versões disponíveis, observe as [tags neste repositório](https://github.com/suas/tags/do/projeto).

## ✒️ Autores

Mencione todos aqueles que ajudaram a levantar o projeto desde o seu início

* **Um desenvolvedor** - *Trabalho Inicial* - [pssilva](https://github.com/pssilva)


Você também pode ver a lista de todos os [colaboradores](COLABORACAO.md) que participaram deste projeto.

---

## 📄 Licença

Este projeto está sob a licença (sua licença) - veja o arquivo [LICENSE](LICENSE) para detalhes.

---

## 🎁 Expressões de Gratidão

  Primeiro confesso aqui publicamente a minha gratidão ao Criado! E reconheço Jesus Cristo como o meu Senhor e Salvador! E que tudo é para honra e glória do Altissímo! Amém!! 📢

  Expresso gratidão pelas contribuções para comunidade aos seguintes Canais do Youtube:

- [Devs JavaGirl BR (@DevsJavaGirlBR)](https://www.youtube.com/@DevsJavaGirlBR)
- [Giuliana Bezerra (@giulianabezerra)](https://www.youtube.com/@giulianabezerra)
- [Fernanda Kipper | Dev (@kipperdev)](https://www.youtube.com/@kipperdev)
- [Loiane Groner (@loianegroner)](https://www.youtube.com/@loianegroner)
- [RinaldoDev (@rinaldodev)](https://www.youtube.com/@rinaldodev)

---

## Referencias Usadas

Segue abaixo as referências bibliográficas usadas no presente projeto:

### Livros

---

<p align="justify">
[<a id="GONCALVES-Antonio">GONCALVES, Antonio</a>]: Beginning Java EE 7. Apress, 2013. ISBN 978-1430246268. Livro guia do plano de estudos. Disponível em: < <a href="https://a.co/d/04zua8PD">https://a.co/d/04zua8PD</a> >. Acesso em: 12 out. 2026.
</p>

---

<p align="justify">
[<a id="ORACLE-JavaEE7-Tutorial">ORACLE</a>]: The Java EE 7 Tutorial. Fonte oficial complementar (Servlets, JSP, WebSocket, Security, Batch, Concurrency). Disponível em: < <a href="https://docs.oracle.com/javaee/7/tutorial/">https://docs.oracle.com/javaee/7/tutorial/</a> >. Acesso em: 12 out. 2026.
</p>

---

<p align="justify">
[<a id="FEATHERS-michael">MARTIN, Robert C. | FEATHERS Michael</a>]: Working Effectively with Legacy Code. Library of Congress Cataloging-in-Publication Data: 2004108115 Copyright © 2005 Pearson Education, Inc. Prentice Hall Professional Technical Reference Upper Saddle River, NJ 07458. ISBN 0-13-117705-2 (Robert C. Martin Series, número). Disponível em: < <a href="https://a.co/d/3RZL8Sl">https://a.co/d/3RZL8Sl</a> >. Acesso em: 16 Mai. 2024.
</p>

---

<p align="justify">
[<a id="GOETZ-Brian">GOETZ ,Brian; PEIERLS ,Tim; BLOCH, Joshua et al</a>]. Java Concurrency in Practice. 1 Ed. Addison-Wesley Professional; 1st edition (May 9, 2006). 432 pages. (Nome da série e/ou coleção, 978-0-321-34960-6). Disponível em: < <a href="https://a.co/d/4T05Xuz"> https://a.co/d/4T05Xuz </a> > . Acesso em: dia 12 jun. 2024.
</p>

---

### Vídeos / Playlists

---
