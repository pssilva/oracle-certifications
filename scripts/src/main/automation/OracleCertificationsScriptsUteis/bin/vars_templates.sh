#!/bin/bash
########################################
#
# Filename: vars_templates.sh
#
# Variaveis usadas como templates e retuilização!
# para o projeto: {{NAME_PROJECT}}
#
########################################

#!/bin/bash
########################################
#
# Filename: vars_templates.sh
#
# Variaveis usadas como templates e retuilização!
# para o projeto: {{NAME_PROJECT}}
#
########################################

export MAVEN_SUREIFRE_PLUGIN=$(cat <<EOF
    <plugin>
        <groupId>org.apache.maven.plugins</groupId>
        <artifactId>maven-surefire-plugin</artifactId>
        <version>\$\{surefire-plugin-version\}</version>
        <configuration>
            <skipTests>true</skipTests>
        </configuration>
    </plugin>
EOF
);


VAR_TEMPLATE=$(cat <<EOF

########################################
# Aqui é o corpo MODELO para ser retutilizado 
########################################

Tokens (chaves): 
- {{NAME_PROJECT}} - Nome do projetos
- {{ARTIFACT_ID}}  - Artefato ID para ser usado como nome da pasta / diretório raiz do projeto
- {{WORK_PATH}}    - Caminho completo para checar no diretório raiz (ARTIFACT_ID) do projeto

########################################

EOF
);

########################################
