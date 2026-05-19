# Oracle Certifications (oracle-certifications)

Se trata de um projeto prático prova de conceito - POC para deixar pegadas digitais e um comprometimento público para aplicar o foco e disciplia e com isso  ser próativo para os processos seletivos onde as equipes técnicas de recrutadores tenham condições e evidências para verificar se o meu perfil pode atender as necessidades das oportunidades.

## Visão do Projeto

Objetivo é focar  no uso prático real dos conceitos abstratos do conteúdo programático das certificações: [Todas Certificações Oracle > Software > Java](https://education.oracle.com/oracle-certification-exams-list?regularExams): 

 - Java SE
    - [Java SE 17 Developer
(Exam Number: 1Z0-829)](https://education.oracle.com/cat%C3%A1logo-de-produtos-ouexam-pexam_1z0-829/pexam_1Z0-829)
 - Java EE
    - [Java EE 7 Application Developer (Exam Number: 1Z0-900)](https://education.oracle.com/cat%C3%A1logo-de-produtos-ouexam-pexam_1z0-900/pexam_1Z0-900)

 - Oracle Cloud Infrastructure - OCI
    -  [Oracle Cloud Infrastructure 2024 DevOps Professional (Exam Number: 1Z0-1109-24)](https://education.oracle.com/ouexam-pexam_1z0-1109-24/pexam_1Z0-1109-24)
    - [Oracle Cloud Infrastructure 2024 Multicloud Architect Associate (Exam Number: 1Z0-1115-24)](https://education.oracle.com/ouexam-pexam_1z0-1115-24/pexam_1Z0-1115-24)
    - [Oracle Cloud Infrastructure 2024 Foundations Associate (Exam Number: 1Z0-1085-24)](https://education.oracle.com/ouexam-pexam_1z0-1085-24/pexam_1Z0-1085-24)

Tendo em mente que para cada Certificação: 

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
  - Aplicar técncia para [Análise Explorativa da Implementação dos Artefatos](#da-analise-exploratoria)
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
export SCRIPT_PATH="${HOME}/projetos/${ARTIFACT_ID}/scripts"
export AUTOMATION_PATH="${SCRIPT_PATH}/src/main/automation"
export TOOL_PATH="${AUTOMATION_PATH}/${TOOL_NAME}"

source "${TOOL_PATH}/OracleCertificationsScriptsUteis_main.sh"

OracleCertificationsScriptsUteis.installAllTools

```

#### Módulos Internos

Para cada certificação um projeto / módulo dedicaro. Depois de instalar as ferramentas necessárias.

Executar o projeto `ocp-javase17-developer`, use os seguintes comandos:

```bash
cd "${HOME}/projetos/ocp-javase17-developer"
sdk use java 17.0.11-amzn
mvn clean install
source ~/.bash_profile
idea .
```

Executar o projeto `oci-devops-professional`, use os seguintes comandos:

```bash
cd "${HOME}/projetos/oci-devops-professional"
sdk use java 17.0.11-amzn
mvn clean install
source ~/.bash_profile
idea .
```

Executar o projeto `oci-multicloud-architect-associate`, use os seguintes comandos:


```bash
cd "${HOME}/projetos/oci-multicloud-architect-associate"
sdk use java 17.0.11-amzn
mvn clean install
source ~/.bash_profile
idea .
```

Executar o projeto `ocp-javaee7-app-developer`, use os seguintes comandos:


```bash
cd "${HOME}/projetos/ocp-javaee7-app-developer"
sdk use java 17.0.11-amzn
mvn clean install
source ~/.bash_profile
idea .
```

## Implantar no Heroku

A maneira mais fácil de implantar seu aplicativo é usar a [Plataforma do Heroku](https://devcenter.heroku.com/start) dos criadores dos princípios: [Os Doze Fatores (The Twelve-Factor App)](https://12factor.net/pt_br/).

Confira [documentação de implantação do Heroku](https://devcenter.heroku.com/start) para mais detalhes.

---

## 🔩 Débitos Técnicos

Aqui temos uma lista do que idenficamos com status de pendente:

### Funcionalidades Aplicação

Segue abaixo (não se limita) os objetivos do presente projeto:

- [X] ~~Formatando documentação README.md~~
- [ ] Indexação completa do vídeo longo: [VIDEO LONGO 071518 – 03.04.02.01.17.06 – 1 How to pass Exam 1Z0-811 | Java Oracle Certified Foundations Associate in 20 hours | Part1 – Questões](docs/indexacoes/VIDEO%20LONGO%20071518%20–%2003.04.02.01.17.06%20–%201%20How%20to%20pass%20Exam%201Z0-811%20|%20Java%20Oracle%20Certified%20Foundations%20Associate%20in%2020%20hours%20|%20Part1%20–%20Questões.pdf) 
  - Mais detalhes veja [aqui](docs/indexacoes/README.md)
- [ ] Indexação completa do vídeo longo: [VIDEO LONGO 074048 – 03.04.02.01.17.06 – 2 How to pass Exam 1Z0-811 | Java Oracle Certified Foundations Associate in 20 hours | Part 2 – Questões](docs/indexacoes/VIDEO%20LONGO%20074048%20–%2003.04.02.01.17.06%20–%202%20How%20to%20pass%20Exam%201Z0-811%20|%20Java%20Oracle%20Certified%20Foundations%20Associate%20in%2020%20hours%20|%20Part%202%20–%20Questões.pdf) 
  - Mais detalhes veja [aqui](docs/indexacoes/README.md)
- [ ] Indexação completa do vídeo longo: [VIDEO LONGO – 061942 – 03.04.02.01.17.06 – 3 How to pass Exam 1Z0-811 | Java Oracle Certified Foundations Associate in 20 hours | Part 3 – Questões](docs/indexacoes/VIDEO%20LONGO%20–%20061942%20–%2003.04.02.01.17.06%20–%203%20How%20to%20pass%20Exam%201Z0-811%20|%20Java%20Oracle%20Certified%20Foundations%20Associate%20in%2020%20hours%20|%20Part%203%20–%20Questões.pdf) 
  - Mais detalhes veja [aqui](docs/indexacoes/README.md)
- [ ] Scritps de Automação
  - [X] ~~instalação das Ferramentas de Desenvolvimento.~~
  - [ ] Para as principais funcionalidade (features) disponíveis no Java SE
  - [ ] Para as principais as Java EE APIs (temos cerca de 27 APIs) 
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

<img src="docs/imgs/pdca.png" alt="PDCA: Aplicar na prática o empirismo" title="PDCA" style="width:475px;"/>

--- 

<a href="#FOWLER-Martin" id="da-analise-exploratoria">
<img src="docs/imgs/DA - Análise de Repositório Genárico.drawio.png" alt="Diagrama: Documentação Elaboração do Diagrama de Atividade da Análise Exploratória Genérico" title="Documentação: Processo Genérico: Atividades da Análise Exploratória de um Repositório"/>
</a>

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

## Referências Usadas

Segue abaixo as referências bibliográficas usadas no presente projeto:

### Livros

---

<p align="justify">
[<a id="BOYARSKY-Jeanne">BOYARSKY, Jeanne</a>]; [<a id="SELIKOFF-Scott">SELIKOFF, Scott</a>]: OCP Oracle® Certified Professional Java® SE 21 Developer: Study Guide Exam 1Z0-830 ISBNs: 9781394286614 (paperback), 9781394286638 (ePDF), 9781394286621 (ePub). Published by John Wiley & Sons, Inc., Hoboken, New Jersey. Published simultaneously in Canada and the United Kingdom. 1040 pages. 1st Edition,  November 27, 2024 Disponível em: < <a href="https://a.co/d/0alQOByp">https://a.co/d/0alQOByp</a>>.Acesso em: 16 mai. 2026.
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

<p align="justify"> 
[<a id="SELIKOFF-Scott">SELIKOFF, Scott; BOYARSKY, Jeanne</a>]. OCP Oracle® Certified Professional Java SE 17 Developer Study Guide Exam 1Z0-829 1 Ed. Cidade da publicação: Editora, ano de publicação. 1056 páginas. 1 Ed. (Nome da série e/ou coleção, 978-1119864585). Disponível em: < <a href="https://a.co/d/08ATqoe7">https://a.co/d/08ATqoe7 </a> >. Acesso em: 03 jul. 2024.
</p>

---

### Vídeos / Playlists

---

<p align="justify"> 
[<a id="1-How-to-pass-Exam-1Z0-811">#1 HOW TO PASS EXAM 1Z0-811 | Java Oracle Certified Foundations Associate in 20 hours | Part1</a>]. Direção: Canal do youtube @elearningfreechannel. Produção: Canal do youtube @elearningfreechannel. Realização: Canal do youtube @elearningfreechannel. Roteiro: Canal do youtube @elearningfreechannel. Fotografia: N/A. Intérpretes: N/A. Local: Canal do youtube @elearningfreechannel, 23 de jan. de 2022. Indicação do suporte físico e duração entre parênteses, demais características (streams, som, cor, legenda, tradução, vídeo stream). Disponível em: < <a href="https://youtu.be/Dzz-sb8huWk?si=o1TE15Go3bsz4uH4"> https://youtu.be/Dzz-sb8huWk?si=o1TE15Go3bsz4uH4 </a> >. Acesso em: 29 jun. 2024
</p>

---

<p align="justify"> 
[<a id="2-How-to-pass-Exam-1Z0-811">#2 How to pass Exam 1Z0-811 | Java Oracle Certified Foundations Associate in 20 hours | Part 2</a>]. Direção: Canal do youtube @elearningfreechannel. Produção: Canal do youtube @elearningfreechannel. Realização: Canal do youtube @elearningfreechannel. Roteiro: Canal do youtube @elearningfreechannel. Fotografia: N/A. Intérpretes: N/A. Local: Canal do youtube @elearningfreechannel, 23 de jan. de 2022. Indicação do suporte físico e duração entre parênteses, demais características (streams, som, cor, legenda, tradução, vídeo stream). Disponível em: < <a href="https://youtu.be/C70IE3C9HiY"> https://youtu.be/C70IE3C9HiY </a> >. Acesso em: 29 jun. 2024
</p>

---

<p align="justify"> 
[<a id="3-How-to-pass-Exam-1Z0-811">#3 How to pass Exam 1Z0-811 | Java Oracle Certified Foundations Associate in 20 hours | Part 3</a>]. Direção: Canal do youtube @elearningfreechannel. Produção: Canal do youtube @elearningfreechannel. Realização: Canal do youtube @elearningfreechannel. Roteiro: Canal do youtube @elearningfreechannel. Fotografia: N/A. Intérpretes: N/A. Local: Canal do youtube @elearningfreechannel, 23 de jan. de 2022. Indicação do suporte físico e duração entre parênteses, demais características (streams, som, cor, legenda, tradução, vídeo stream). Disponível em: < <a href="https://youtu.be/Ngl9awIcMXI?t=0"> https://youtu.be/Ngl9awIcMXI?t=0 </a> >. Acesso em: 29 jun. 2024
</p>

---
