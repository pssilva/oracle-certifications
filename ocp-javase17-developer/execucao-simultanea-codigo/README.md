# Oracle Certifications: OCP Java SE 17 Developer

## Gerenciando a Execução Simultânea / Concorrentes de Código

Módulo dedicado para o processamento paralelo com a linguagem Java SE.

## Visão do Projeto

Objetivo é focar  no uso prático real dos conceitos abstratos do conteúdo programático das certificações: 

 - Java SE
    - [Java SE 17 Developer
(Exam Number: 1Z0-829)](https://education.oracle.com/cat%C3%A1logo-de-produtos-ouexam-pexam_1z0-829/pexam_1Z0-829)
 
 Tendo em mente que para a presente Certificação: 

  - O Conteúdo programático identificar os objetivos;
  - Para cada Objetivo dos Tópicos, explodir em habilidades;
  - Para cada habilidade, identificar boas práticas de uso Empírico;
  - Identificar a forma de como é cobrado o conhecimento no exame;
  - identificar, em projetos open-source, o uso dos conceitos na prática;
  - Elaborar estratégias (checklists) de refatoração para aplicar boas práticas em projetos legados;

---

## 🔩 Débitos Técnicos

Aqui temos uma lista do que idenficamos com status de pendente:

### Funcionalidades Aplicação

Segue abaixo (não se limita) os objetivos do presente projeto:

- [X] ~~Formatando documentação README.md~~

--- 

## OBJETIVOS DO EXAME OCP ABORDADOS NESTE CAPÍTULO
  
  - Gerenciando a Execução Simultânea (Concurrent) de Código
    * Crie threads de trabalho usando Runnable e Callable, gerencie o ciclo de vida do thread, incluindo automações fornecidas por diferentes serviços Executor e API simultânea
    * Desenvolva código thread-safe, usando diferentes mecanismos de bloqueio e API simultânea
    * Processe coleções Java simultaneamente, incluindo o uso de fluxos paralelos.
  
Procuro evidência as proficiências nas seguintes habilidades técnicas:

- [Metodologia Básica de Análise de Algoritmos](#GOODRICH-Michael-T)
- Técnicas em [Análise Código-fonte Legados](#FEATHERS-michael);
- Técnicas em [Refatoração Código-fonte Legados](#FEATHERS-michael);
- Implementar Soluções usando algoritmos Reutilizáveis


### Questões Relevantes

Buscaresmos responder:

#### Como o sistema decide o que executar quando há mais threads disponíveis do que CPUs?

### Mentalidade PDCA

Tendo em mente que sempre buscamos melhorar o protocolo de trabalho operacinal do dia a dia usando empirismo (colocar realmente em prática os conheicmentos abstratos)

NOTA: Não se trata de ficar ditando regras no trabalho da equipe, mas sim melhorar o [meu operacional pessoal de trabalho](#da-analise-exploratoria) e com isso agregar valor melhorando a perfomance:

<img src="../../docs/imgs/pdca.png" alt="PDCA: Aplicar na prática o empirismo" title="PDCA" style="width:475px;"/>

--- 

<a href="#FOWLER-Martin" id="da-analise-exploratoria">
<img src="../../docs/imgs/DA - Análise de Repositório Genárico.drawio.png" alt="Diagrama: Documentação Elaboração do Diagrama de Atividade da Análise Exploratória Genérico" title="Documentação: Processo Genérico: Atividades da Análise Exploratória de um Repositório"/>
</a>

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

<p align="justify"> 
[<a id="SELIKOFF-Scott">SELIKOFF, Scott; BOYARSKY, Jeanne</a>]. OCP Oracle® Certified Professional Java SE 17 Developer Study Guide Exam 1Z0-829 1 Ed. Cidade da publicação: Editora, ano de publicação. 1056 páginas. 1 Ed. (Nome da série e/ou coleção, 978-1119864585). Disponível em: < <a href="https://a.co/d/08ATqoe7">https://a.co/d/08ATqoe7 </a> >. Acesso em: 03 jul. 2024.
</p>

---

### Vídeos / Playlists

---
