Módulo: 11-modules — Módulos
--------

> Ordem de estudo: **12 de 15** · anterior: [04-exceptions-localization](../04-exceptions-localization/README.md) · próximo: [12-packaging-deployment](../12-packaging-deployment/README.md)

Base de referência: livro [OCP Oracle Certified Professional Java SE 21 Developer: Study Guide Exam 1Z0-830](https://a.co/d/0alQOByp) — **Chapter 12: Modules**.

Exame alvo: [1Z0-831: Java SE 25 Developer Professional](https://mylearn.oracle.com/ou/exam/java-se-25-developer-professional-1z0-831/40805/161532/270890).

## Objetivo

Declaração de módulos (`exports`, `requires transitive`, `opens` e reflexão), serviços (provedor, consumidor, `ServiceLoader`), tipos de módulos (nomeados, automáticos, sem nome), migração e declarações `import module` (Java 25).

### Tópicos do exame cobertos

- 7. Empacotamento e implantação de código Java

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

### Descrevendo com o jar

Para obter informações do módulo `feeding`, use os seguintes comandos:

```shell

export ARTIFACT_ID_PARENT="oracle-certifications"
export ARTIFACT_ID="ocp-javase25-developer"
export TOOL_NAME="OracleCertificationsScriptsUteis"
export WORK_PATH="${HOME}/projetos/${ARTIFACT_ID_PARENT}/${ARTIFACT_ID}"
        
cd "${WORK_PATH}/11-modules"

jar -f zoo.animal.feeding.jar -d
 
jar --file zoo.animal.feeding.jar --describe-module
```

### Aprendendo sobre Dependências com o jdeps

Para obter informações do artefacto `Animatronic.java`, use os seguintes comandos:

```shell

export ARTIFACT_ID_PARENT="oracle-certifications"
export ARTIFACT_ID="ocp-javase25-developer"
export TOOL_NAME="OracleCertificationsScriptsUteis"
export WORK_PATH="${HOME}/projetos/${ARTIFACT_ID_PARENT}/${ARTIFACT_ID}"
        
cd "${WORK_PATH}/11-modules"

jar -cvf br.com.modules.zoo.dinos.jar src/main/java/br/com/modules/zoo/dinos

jdeps br.com.modules.zoo.dinos.jar

jdeps -s br.com.modules.zoo.dinos.jar

```

Conceitos OCP
-------------

Cada conceito segue a [Técnica Feynman](https://youtu.be/CN_SCpGuJ_w?si=7eqvv5fpdCkjXVdz) em `docs/feynman/<conceito>/` (`README.md`, `evidencias/`, `mistakes/`, `questions-exam/`).

| Conceito | Seção do livro | Objetivo 1Z0-831 | Evidências |
|----------|----------------|------------------|------------|
| [Módulos](docs/feynman/modulos/README.md) | Introducing Modules / Creating and Running a Modular Program | 7.1 Definir módulos | ✅ 7 img |
| [Diretivas module-info e Reflexão](docs/feynman/diretivas-module-info-e-reflexao/README.md) | Diving into the Module Declaration (exports, requires transitive, opens) | 7.1 Expor conteúdo (inclusive por reflexão) e declarar dependências | ⏳ pendente |
| [Serviços, Provedores e Consumidores](docs/feynman/servicos-provedores-e-consumidores/README.md) | Creating a Service | 7.1 Definir serviços, provedores e consumidores | ⏳ pendente |
| [Tipos de Módulos e Migração](docs/feynman/tipos-de-modulos-e-migracao/README.md) | Comparing Types of Modules / Migrating an Application | 7.3 Migração com módulos sem nome e automáticos | ⏳ pendente |
| [Declarações de Importação de Módulos](docs/feynman/declaracoes-de-importacao-de-modulos/README.md) | import module java.base; | 7.1 Usar declarações de importação de módulos | ⏳ pendente |

Para criar um novo conceito use `OracleCertificationsScriptsUteis.CriarStructureByConceito "11-modules" "<Conceito>"` (veja o [README da certificação](../README.md)).
