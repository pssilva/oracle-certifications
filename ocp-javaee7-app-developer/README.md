# Oracle Certifications: OCP Java EE 7 Application Developer

Se trata de um projeto prático prova de conceito - POC para deixar pegadas digitais e um comprometimento público para aplicar o foco e disciplia e com isso  ser próativo para os processos seletivos onde as equipes técnicas de recrutadores tenham condições e evidências para verificar se o meu perfil pode atender as necessidades das oportunidades.

## Visão do Projeto

Objetivo é focar  no uso prático real dos conceitos abstratos do conteúdo programático das certificações: 

 - Java EE
    - [Java EE 7 Application Developer (Exam Number: 1Z0-900)](https://education.oracle.com/cat%C3%A1logo-de-produtos-ouexam-pexam_1z0-900/pexam_1Z0-900)
 
 Tendo em mente que para a presente Certificação: 

  - O Conteúdo programático identificar os objetivos;
  - Para cada Objetivo dos Tópicos, explodir em habilidades;
  - Para cada habilidade, identificar boas práticas de uso Empírico;
  - Identificar a forma de como é cobrado o conhecimento no exame;
  - identificar, em projetos open-source, o uso dos conceitos na prática;
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


#### 📋 Pré-requisitos

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
cd "${HOME}/projetos/ocp-javaee7-app-developer"
sdk use java 17.0.11-amzn
mvn clean install
source ~/.bash_profile
idea .
```

---

## 🔩 Débitos Técnicos

Aqui temos uma lista do que idenficamos com status de pendente:

### Funcionalidades Aplicação

Segue abaixo (não se limita) os objetivos do presente projeto:

- [X] ~~Formatando documentação README.md~~
- [ ] Indexação completa do vídeo longo: [VIDEO LONGO 071518 – 03.04.02.01.17.06 – 1 How to pass Exam 1Z0-811 | Java Oracle Certified Foundations Associate in 20 hours | Part1 – Questões](../docs/indexacoes/VIDEO%20LONGO%20071518%20–%2003.04.02.01.17.06%20–%201%20How%20to%20pass%20Exam%201Z0-811%20|%20Java%20Oracle%20Certified%20Foundations%20Associate%20in%2020%20hours%20|%20Part1%20–%20Questões.pdf) (mais detalhes veja [aqui](../docs/indexacoes/README.md))
- [ ] Indexação completa do vídeo longo: [VIDEO LONGO 074048 – 03.04.02.01.17.06 – 2 How to pass Exam 1Z0-811 | Java Oracle Certified Foundations Associate in 20 hours | Part 2 – Questões](../docs/indexacoes/VIDEO%20LONGO%20074048%20–%2003.04.02.01.17.06%20–%202%20How%20to%20pass%20Exam%201Z0-811%20|%20Java%20Oracle%20Certified%20Foundations%20Associate%20in%2020%20hours%20|%20Part%202%20–%20Questões.pdf) (mais detalhes veja [aqui](../docs/indexacoes/README.md))
- [ ] Indexação completa do vídeo longo: [VIDEO LONGO – 061942 – 03.04.02.01.17.06 – 3 How to pass Exam 1Z0-811 | Java Oracle Certified Foundations Associate in 20 hours | Part 3 – Questões](../docs/indexacoes/VIDEO%20LONGO%20–%20061942%20–%2003.04.02.01.17.06%20–%203%20How%20to%20pass%20Exam%201Z0-811%20|%20Java%20Oracle%20Certified%20Foundations%20Associate%20in%2020%20hours%20|%20Part%203%20–%20Questões.pdf) (mais detalhes veja [aqui](../docs/indexacoes/README.md))
- [ ] Organizar o Código Usando o Sistema de Módulos do Java. Um módulo para cada Tópico do Conteúdo Programático da Certificação
  - [ ] Entenda a Arquitetura Java EE
  - [ ] Gerenciar persistência usando entidades JPA e BeanValidation
  - [ ] Implementar lógica de negócios usando EJBs
  - [ ] Use a API do serviço de mensagens Java
  - [ ] Implemente serviços SOAP usando APIs JAX-WS e JAXB
  - [ ] Crie aplicativos Web Java usando Servlets
  - [ ] Crie aplicativos Web Java usando JSPs
  - [ ] Implementar serviços REST usando API JAX-RS
  - [ ] Crie aplicativos Java usando WebSockets
  - [ ] Desenvolva aplicações web usando JSFs
  - [ ] Aplicativos Java EE 7 seguros
  - [ ] Use Beans CDI
  - [ ] Use API de simultaneidade em aplicativos Java EE 7
  - [ ] Use a API Batch em aplicativos Java EE 7
- [ ] Criar um Caso de Uso para cada API do Java EE e os seus respectivos Casos de Testes
  - [ ] JavaServer Faces (JSF) 2.3	
  - [ ] API de Persistência Java (JPA) 2.2	
  - [ ] Enterprise JavaBeans (EJB) 3.2	
  - [ ] Contextos e Injeção de Dependência (CDI) 2.0	
  - [ ] API Java Para Processamento JSON (JSON-P) 1.1	
  - [ ] API Java Para Ligação JSON (JSON-B) 1.0	
  - [ ] API Java Para WebSocket 1.0	
  - [ ] Serviço de Mensagens Java (JMS) 2.0	
  - [ ] API de Segurança Java EE 1.0	
  - [ ] API Java Para Serviços da Web RESTful (JAX-RS) 2.1	
  - [ ] API Java Para Serviços da Web XML (JAX-WS) 2.2	
  - [ ] Servlets 4.0	
  - [ ] Linguagem de Expressão (EL) 3.0	
  - [ ] JavaServer Pages (JSP) 2.3	
  - [ ] Interface de Nomenclatura e Diretório Java (JNDI) 1.2	
  - [ ] API de Transação Java (JTA) 1.2	
  - [ ] Serviço de Transação Java (JTS) 1.0	
  - [ ] Java Mail 1.5	
  - [ ] Arquitetura do Conector Java EE (JCA) 1.7	
  - [ ] Arquitetura Java para Ligação XML (JAXB) 2.2	
  - [ ] Extensões de Gerenciamento Java (JMX) 1.2	
  - [ ] Biblioteca de Tags Padrão Para JavaServer Pages (JSTL) 1.2	
  - [ ] Validação de Bean 2.0	
  - [ ] Gerenciado Beans 1.0	
  - [ ] Interceptadores 1.2	
  - [ ] Utilitários de Simultaneidade (Concurrency) para Java EE 1.0	
  - [ ] Aplicativos em Lote (Batch) para a Plataforma Java 1.0
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

Seque aqui as ferramentas utilizadas na construção presente projeto:

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

Seque abaixo as referências bibliográficas usadas no presente projeto:

### Livros

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
