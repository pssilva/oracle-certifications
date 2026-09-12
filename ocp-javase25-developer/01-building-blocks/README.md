# OCP Java SE 25 Developer: Bloco de Construção (building-blocks)

Se trata de um projeto prático prova de conceito - POC para deixar pegadas digitais e um comprometimento público para aplicar o foco e disciplia e com isso  ser próativo para os processos seletivos onde as equipes técnicas de recrutadores tenham condições e evidências para verificar se o meu perfil pode atender as necessidades das oportunidades.

## Visão do Projeto

Objetivo é focar  no uso prático real dos conceitos abstratos do conteúdo programático das certificações:

- Java SE
    - [Java SE 25 Developer
      (Exam Number: 1Z0-831)](https://mylearn.oracle.com/ou/exam/java-se-25-developer-professional-1z0-831/40805/161532/270890)

Tendo em mente que para a presente Certificação:

- O Conteúdo programático identificar os objetivos;
- Para cada Objetivo dos Tópicos, explodir em habilidades;
- Para cada habilidade, identificar boas práticas de uso Empírico;
- Identificar a forma de como é cobrado o conhecimento no exame;
- identificar, em projetos open-source, o uso dos conceitos na prática;
- Elaborar estratégias (checklists) de refatoração para aplicar boas práticas em projetos legados;

--- 

### OBJETIVOS DO EXAME OCP ABORDADOS NESTE MÓDULO

- Manipulação de Data, Hora, Texto, Valores Numéricos e Booleanos
  - Utilizar tipos primitivos e classes wrapper. Avaliar expressões aritméticas e booleanas, utilizando a API Math e aplicando regras de precedência, conversões de tipo e casting.

- Utilizar Conceitos de Orientação a Objetos em Java
  - Declarar e instanciar objetos Java, incluindo objetos de classes aninhadas, e explicar o ciclo de vida do objeto, incluindo criação, reatribuição de referências e coleta de lixo.
  - Compreender escopos de variáveis, aplicar encapsulamento e criar objetos imutáveis. Utilizar inferência de tipo de variável local.


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

Executar o projeto `ocp-javase25-developer`, use os seguintes comandos:

```bash
export ARTIFACT_ID_PARENT="oracle-certifications"
export ARTIFACT_ID="oracle-certifications"
cd "${HOME}/projetos/${ARTIFACT_ID_PARENT}/${ARTIFACT_ID}"
sdk install java 25.0.3-amzn
sdk default java 25.0.3-amzn
mvn clean install
source ~/.bash_profile
idea .
```

---

## Débitos Técnicos

Aqui temos uma lista do que idenficamos com status de pendente:

### Funcionalidades Aplicação

Segue abaixo (não se limita) os objetivos do presente projeto:

- [X] ~~Formatando documentação README.md~~
- [x] ~~Indexação completa do vídeo longo: [VIDEO LONGO 071518 – 03.04.02.01.17.06 – 1 How to pass Exam 1Z0-811 | Java Oracle Certified Foundations Associate in 20 hours | Part1 – Questões](../../docs/indexacoes/VIDEO%20LONGO%20071518%20–%2003.04.02.01.17.06%20–%201%20How%20to%20pass%20Exam%201Z0-811%20|%20Java%20Oracle%20Certified%20Foundations%20Associate%20in%2020%20hours%20|%20Part1%20–%20Questões.pdf)~~
    - Mais detalhes veja [aqui](../../docs/indexacoes/README.md)
- [X] ~~Indexação completa do vídeo longo: [VIDEO LONGO 074048 – 03.04.02.01.17.06 – 2 How to pass Exam 1Z0-811 | Java Oracle Certified Foundations Associate in 20 hours | Part 2 – Questões](../../docs/indexacoes/VIDEO%20LONGO%20074048%20–%2003.04.02.01.17.06%20–%202%20How%20to%20pass%20Exam%201Z0-811%20|%20Java%20Oracle%20Certified%20Foundations%20Associate%20in%2020%20hours%20|%20Part%202%20–%20Questões.pdf)~~
    - Mais detalhes veja [aqui](../../docs/indexacoes/README.md)
- [X] ~~Indexação completa do vídeo longo: [VIDEO LONGO – 061942 – 03.04.02.01.17.06 – 3 How to pass Exam 1Z0-811 | Java Oracle Certified Foundations Associate in 20 hours | Part 3 – Questões](../../docs/indexacoes/VIDEO%20LONGO%20–%20061942%20–%2003.04.02.01.17.06%20–%203%20How%20to%20pass%20Exam%201Z0-811%20|%20Java%20Oracle%20Certified%20Foundations%20Associate%20in%2020%20hours%20|%20Part%203%20–%20Questões.pdf)~~
    - Mais detalhes veja [aqui](../../docs/indexacoes/README.md)

### Tópicos da Certificação
- [ ] Tratamento de data, hora, texto, valores numéricos e booleanos
    - [ ] Use classes primitivas e wrapper.
    - [ ] Avaliar expressões aritméticas e booleanas, usando a API Math
    - [ ] Aplicando regras de precedência
    - [ ] conversões de tipo e casting.
    - [ ] Manipular texto, incluindo blocos de texto, usando as classes String e StringBuilder.
    - [ ] Manipular objetos de data, hora, duração, período, instante e fuso horário, incluindo horário de verão, usando a API Date-Time.

- [ ] Aplicar Princípios de Orientação a Objetos em Programas Java
    - [ ] Declarar e instanciar objetos Java
    - [ ] incluindo objetos de classe aninhados
    - [ ] explicar o ciclo de vida do objeto, incluindo criação, reatribuição de referências e coleta de lixo.

    - [ ] Criar classes e registros
        - [X] ~~Classes definir e usar campos e métodos de instância~~
        - [ ] Classes definir e usar campos e métodos estáticos
        - [ ] Construtores, incluindo corpos de construtores flexíveis
        - [ ] Inicializadores de instância e estáticos.

    - [ ] Implementar métodos sobrecarregados, incluindo métodos var-arg.

    - [ ] Compreender escopos de variáveis, aplicar encapsulamento e criar objetos imutáveis.
    - [ ] Utilize inferência de tipo de variável local e variáveis ​​sem nome.

    - [ ] Implemente herança, incluindo tipos abstratos e selados
        - [ ] bem como classes de registro.
        - [ ] Sobrescreva métodos, incluindo os da classe Object. Implemente polimorfismo e diferencie entre tipo de objeto e tipo de referência.

    - [ ] Crie e utilize interfaces
        - [ ] identifique interfaces funcionais
        - [ ] utilize métodos de interface privados, estáticos e padrão.

    - [ ] Crie e utilize tipos enum com campos, métodos e construtores.

### Atividades - DevOps

- [ ] Scritps de Automação
    - [X] ~~instalação das Ferramentas de Desenvolvimento.~~
    - [ ] Criar automação para as principais funcionalidade (features) disponíveis no Java SE
- [ ] [Metodologia Básica de Análise de Algoritmos](#GOODRICH-Michael-T)
    - Aplicar técncia para [Análise Explorativa da Implementação dos Artefatos](#da-analise-exploratoria)
- [ ] [Implementar Testes (TDD)](#GONZALEZ_Javier_cap_11): Técnica Red-Green-Refact
- [ ] Descrição sucinta [TRABALHO EM PROGRESSO]

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

<img src="../../docs/imgs/pdca.png" alt="PDCA: Aplicar na prática o empirismo" title="PDCA" style="width:475px;"/>

---

<a href="#FOWLER-Martin" id="da-analise-exploratoria">
<img src="../../docs/imgs/DA - Análise de Repositório Genárico.drawio.png" alt="Diagrama: Documentação Elaboração do Diagrama de Atividade da Análise Exploratória Genérico" title="Documentação: Processo Genérico: Atividades da Análise Exploratória de um Repositório"/>
</a>

---

## 🛠️ Construído com

Seque aqui as ferramentas utilizadas na construção presente projeto:

### Ferramentas

* [Docker](https://www.docker.com/get-started/)
* [NVM](https://github.com/nvm-sh/nvm?tab=readme-ov-file#intro) - Node Version Manager
* [Terminal Shell Linux (WSL)](https://learn.microsoft.com/pt-br/windows/wsl/install)


---

## Referências Usadas

Seque abaixo as referências bibliográficas usadas no presente projeto:

### Livros

---

<p align="justify">
[<a id="BOYARSKY-Jeanne">BOYARSKY, Jeanne</a>]; [<a id="SELIKOFF-Scott">SELIKOFF, Scott</a>]: OCP Oracle® Certified Professional Java® SE 21 Developer: Study Guide Exam 1Z0-830 ISBNs: 9781394286614 (paperback), 9781394286638 (ePDF), 9781394286621 (ePub). Published by John Wiley & Sons, Inc., Hoboken, New Jersey. Published simultaneously in Canada and the United Kingdom. 1040 pages. 1st Edition,  November 27, 2024 Disponível em: < <a href="https://a.co/d/0alQOByp">https://a.co/d/0alQOByp</a>>.Acesso em: 16 mai. 2026.
</p>

---

### Vídeos / Playlists

---

Veja mais detalhes da estratégia de Indexação de vídeos [aqui](https://github.com/pssilva/oracle-certifications/blob/main/docs/indexacoes/README.md)