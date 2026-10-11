Módulo: 11-modules 
--------

Para este módulo usaremos como base de referência o Livro: [OCP Oracle Certified Professional Java SE 21 Developer: Study Guide Exam 1Z0-830](https://a.co/d/0alQOByp).

## Objetivo

Descrição sucinta vem aqui ..... 


## Código :: Pratique

Pratique com código e responda questões da prova de certificação


### Comandos Shell

Para compilar o módulo indicado no livro, use os seguintes comandos: 

```shell

export ARTIFACT_ID_PARENT="oracle-certifications"
export ARTIFACT_ID="ocp-javase25-developer"
export TOOL_NAME="OracleCertificationsScriptsUteis"
export WORK_PATH="${HOME}/projetos/${ARTIFACT_ID_PARENT}/${ARTIFACT_ID}"
        
cd "${WORK_PATH}/11-modules"

javac --module-path "${WORK_PATH}/11-modules" -d feeding/target/classes ${WORK_PATH}/11-modules/feeding/src/main/java/zoo/animal/feeding/*.java feeding/module-info.java

```

Conceitos OCP
-------------

Os conceitos se encontram na pasta: `/home/pssilva/projetos/oracle-certifications/ocp-javase25-developer/11-modules/docs/feynman/modulos/`

[TRABALHO EM PROGRESSO]

- [Conceito XPTO 1](#)
- [Conceito XPTO 2](#)
- [Conceito XPTO 3](#)
