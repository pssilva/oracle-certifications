#!/bin/bash
# Filename: check-ambiente-sdk.sh

#########################################################
#
# Auth: Paulo Sérgio <pss1suporte@gmail.com>
# Describe: Script principal para verificar o ambiente SDK depois de instalar as ferramentas!
# version: 1.0
# license: MIT License
#
#########################################################

#########################################################
#
# Describe: 
# Referencia: 
#
#########################################################
function OracleCertificationsScriptsUteis.checkAmbienteSDK(){

    export ARTIFACT_ID_PARENT="oracle-certifications"
    export ARTIFACT_ID="ocp-javase25-developer"
    cd "${HOME}/projetos/${ARTIFACT_ID_PARENT}/${ARTIFACT_ID}"

    echo -e "\n\n"
	echo -e "######################################################"
	echo -e "# Verificar o Java use o comando: $ java --version"
    java --version
	echo -e "######################################################"
	echo -e "\n\n"

    echo -e "\n\n"
	echo -e "######################################################"
	echo -e "# Verificar o Compilador do Java use o comando: $ javac --version"
    javac --version
	echo -e "######################################################"
	echo -e "\n\n"

    echo -e "\n\n"
	echo -e "######################################################"
	echo -e "# Verificar o Gerenciador de Dependência Maven use o comando: $ mvn --version"
    mvn --version
	echo -e "######################################################"
	echo -e "\n\n"
    echo -e "\n\n"
	echo -e "######################################################"
	echo -e "# Verificar o Gerenciador de Versão Git o comando: $ git --version"
    git --version
	echo -e "######################################################"
	echo -e "\n\n"
}
export -f OracleCertificationsScriptsUteis.checkAmbienteSDK

#########################################################