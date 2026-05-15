#!/bin/bash
# Filename: OracleCertificationsScriptsUteis_main.sh

#########################################################
#
# Auth: Paulo Sérgio <pss1suporte@gmail.com>
# Describe: Script Main que reuni as libs do projeto no geral
# version: 1.0
# license: MIT License
#
#########################################################

#########################################################
#
# Describe: Definir as Variaveis de ambiente necessárias para o processamento dos algoritmos
# Referencia: 
#
#########################################################
function OracleCertificationsScriptsUteis.setVenvsForAllAlgorithms(){

	export ABS_SCRIPT_PATH=$(realpath "${SCRIPT_PATH}")
  export ABS_DIRECTORY=$(dirname "${ABS_SCRIPT_PATH}")
	source "${ABS_DIRECTORY}/bin/unset_all_env.sh"
	export PARENT_MODULO="OracleCertificationsScriptsUteis"
  export SCRIPT_PATH="${BASH_SOURCE:-$0}"
	export SCRIPT_PATH="${BASH_SOURCE:-$0}"
	export ENV_WORKS="${ABS_DIRECTORY}/bin/env_works"
	export AUTOMATION_PATH="${HOME}/projetos/provedor-nuvem-certifications/scripts/src/main/automation"
	export TEMPLATES_PATH="${AUTOMATION_PATH}/OracleCertificationsScriptsUteis/templates"

  source "${ENV_WORKS}/env_works_tool_generate_OracleCertificationsScriptsUteis.sh"
	source "${ABS_DIRECTORY}/bin/vars_templates.sh"

}
export -f OracleCertificationsScriptsUteis.setVenvsForAllAlgorithms

OracleCertificationsScriptsUteis.setVenvsForAllAlgorithms
#########################################################

#########################################################
#
# Describe: Exemplo de como usar a API
# $1: ?????
# Referencia: 
#
#########################################################
function OracleCertificationsScriptsUteis.usage(){
  cat <<EOF
>>>>> MODELO DE USAGE <<<<<
>>>>> NÃO IMPLEMENTADO <<<<<

usage: ${0##*/} OracleCertificationsScriptsUteis.nomeMetodo [options] [args]
  
  Options:
    -h,--help     Print this help message
    --version     Print version
    -u            Get update
    --no-color    Disable colors

* This option '-u' still not implanted

EOF

}
export -f OracleCertificationsScriptsUteis.usage
if [[ $1 = @(-h|--help) ]];then
  OracleCertificationsScriptsUteis.usage 
  exit 0
fi
#########################################################

#########################################################
#
# Describe:  Estrutura do menu da OracleCertificationsScriptsUteis que sobreescrve
#            o da aplicação geral
# Referencia: 
#
#########################################################
function OracleCertificationsScriptsUteis.menu()
{

  	echo "####################################################"
  	echo "### $NAME_APP :: OracleCertificationsScriptsUteis.menu"
  	echo "####################################################"

	PS3="OracleCertificationsScriptsUteis »»» Selevione uma das opções: "
	select OPCAO in "Voltar" "Criar Projeto" tarefa3 tarefa4 tarefa5 fim; do
	case $OPCAO in
	  "Voltar")
  		    echo "###################################"
          #echo "OPCAO >> $OPCAO"
  				SpringBatch.menu "$ENV_WORKS"
          echo "###################################"
  			;;
		"Criar Projeto")
        echo ""
        echo "###################################"
        echo "Criar Projeto >> $OPCAO"
        echo "###################################"
        echo ""
			;;
		tarefa2)
        echo ""
				echo "###################################"
				echo "tarefa2 >> $OPCAO" 
				echo "###################################"
        echo ""
			;;
		tarefa3)
        echo ""
				echo "###################################"
				echo "tarefa3 >> $OPCAO" 
				echo "###################################"
        echo ""
			;;
		tarefa4)
        echo ""
				echo "###################################"
				echo "tarefa4 >> $OPCAO" 
				echo "###################################"
        echo ""
			;;
		fim)
		    echo "###################################"
        echo " OracleCertificationsScriptsUteis.menu »»» Finalizado!!"
        echo "###################################"
        break;;
		*)
        echo ""
				echo "###################################"
				echo "Opção não encontrada!"
				echo "###################################"
        echo ""
			;;
	esac
	done
	return 0; # Return value
}
export -f OracleCertificationsScriptsUteis.menu
#########################################################

#########################################################
#
# Describe: Instalação o SDKMAN no Fedora
#
# Referencia:
#
#########################################################
function OracleCertificationsScriptsUteis.installToolSDKMAN(){

##############################################
# Instalação o SDKMAN no Fedora
##############################################
curl -s get.sdkman.io | bash
source "${HOME}/.sdkman/bin/sdkman-init.sh"
sdk version
##############################################

}

export -f OracleCertificationsScriptsUteis.installToolSDKMAN
#########################################################

#########################################################
#
# Describe: Instalação do Java com o SDKMAN
#
# Referencia:
#
#########################################################
function OracleCertificationsScriptsUteis.installToolJavaComJDK(){

	export SDK_JAVA_VERSION="$1"

	if [[ "${SDK_JAVA_VERSION}" == "" ]]
	then
		SDK_JAVA_VERSION="17.0.11-amzn"
	fi

##############################################
# Instalação do Java com o SDKMAN
##############################################
sdk install java "${SDK_JAVA_VERSION}" -y
##############################################

}

export -f OracleCertificationsScriptsUteis.installToolJavaComJDK
#########################################################

#########################################################
#
# Describe: Instalação de todas as ferramentas
#
# Referencia:
#
#########################################################
function OracleCertificationsScriptsUteis.installAllTools(){
	
	OracleCertificationsScriptsUteis.installPreRequisito
  OracleCertificationsScriptsUteis.installToolSDKMAN
  OracleCertificationsScriptsUteis.installToolJavaComJDK "17.0.11-amzn"
	OracleCertificationsScriptsUteis.installDocker
	OracleCertificationsScriptsUteis.makeAllTools

}

export -f OracleCertificationsScriptsUteis.installAllTools
#########################################################

#########################################################
#
# Describe: Gerar as ferramentas e imagens Dockers necessários para o Hyperledger Fabric
#
# Referencia:
#
#########################################################
function OracleCertificationsScriptsUteis.makeAllTools(){
	
	echo -e "\n\n"
	echo -e "######################################################"
	echo -e "# OracleCertificationsScriptsUteis.makeAllTools: NÃO IMPLEMETADO AINDA!!"
	echo -e "######################################################"
	echo -e "\n\n"

}

export -f OracleCertificationsScriptsUteis.makeAllTools
#########################################################

#########################################################
#
# Describe: Instalação dos Pré-requisitos necessários
#
# Referencia: 
# @see: https://hyperledger-fabric.readthedocs.io/en/latest/prereqs.html#linux-ubuntu-debian-based-distro
#
#########################################################
function OracleCertificationsScriptsUteis.installPreRequisito(){

	sudo dnf -y check-update
	sudo dnf -y upgrade

	sudo dnf -y groupinstall 'Development Tools'
	sudo dnf -y group install "C Development Tools and Libraries"
	sudo dnf -y groupinstall @development-tools @development-libraries
	sudo dnf install -y make automake gcc gcc-c++ kernel-devel
	sudo dnf install -y git make cmake curl unzip g++ libtool jq

}

export -f OracleCertificationsScriptsUteis.installPreRequisito
#########################################################

#########################################################
#
# Describe: Instalação do Docker e o composer
#
# Referencia: 
#
#########################################################
function OracleCertificationsScriptsUteis.installDocker(){

	sudo dnf install -y docker-compose
	sudo dnf install -y docker-compose-plugin
	docker compose version

}

export -f OracleCertificationsScriptsUteis.installDocker
#########################################################

#########################################################
#
# Describe: Instalação do SDK para o Provedor de Nuvem: Amazon Web Services – AWS
#
# Referencia: 
#
#########################################################
function OracleCertificationsScriptsUteis.installSDKProvedorAWS(){

	export HELPER_TEXT_TEMPLATE=$(cat <<EOF

##############################################
Parametros para o algoritmo: 
	NAME_PROJECT  - Nome do Projeto no formato: NomeProjetoXPTO
	ARTIFACT_ID   - Artefato id no formato: nome-do-projeto
	ARCH          - Arquitetura para solução [arch/clean] (opcional)

Use o comando: 
	export NAME_PROJECT="NomeDoProjeto"
	export ARTIFACT_ID="nome-do-projeto"
	export ARCH="arch/clean"

	OracleCertificationsScriptsUteis.installSDKProvedorAWS "\${NAME_PROJECT}" "\${ARTIFACT_ID}" "\${GROUP_ID}" "\${ARCH}"

##############################################

	Ou apenas passar um arquivo com as variáveis:
	export ENV_WORKS="\${HOME}/env_works.sh"

	OracleCertificationsScriptsUteis.installSDKProvedorAWS "\${ENV_WORKS}" 

	NOTA: use o modelo em: \${CORE_PATH}/templates/env_works/env_works_tool_generate_MODELO.sh

##############################################

EOF
	);

  if [ $# -le 0 ]
  then
    echo -e "\n\n"
    echo -e "${HELPER_TEXT_TEMPLATE}"
    read -t 5 -p "Favor ferificar!!    .... 5 seconds only ..."
    echo -e "\n\n"
    return;
  fi

	echo -e "\n\n\n"
	echo "##############################################"
	echo "Algoritmo: OracleCertificationsScriptsUteis.installSDKProvedorAWS"
	echo "##############################################"
	
	export ENV_WORKS="$1"

	if [ -f "${ENV_WORKS}" ]
	then
		source "${ENV_WORKS}"
	else
		export NAME_PROJECT="$1"
		export ARTIFACT_ID="$2"
		export ARCH="$3"
	fi

	if [[ "${ARCH}" == "" ]]
	then
		ARCH="arch/clean"
	fi

	echo -e "\n\n"
	echo -e "######################################################"
	echo -e "# OracleCertificationsScriptsUteis.installSDKProvedorAWS: NÃO IMPLEMETADO AINDA!!"
	echo -e "######################################################"
	echo -e "\n\n"

	echo " Dados de entrada:"
	echo " NAME_PROJECT = ${NAME_PROJECT}"
	echo " ARTIFACT_ID = ${ARTIFACT_ID}"
	echo " ARTIFACT_ID_PATH = ${ARTIFACT_ID_PATH}"
	echo "##############################################"
	echo -e "\n\n\n"

	cd "${HOME}/projetos"

	echo "##############################################"
	echo " Processamento: OracleCertificationsScriptsUteis.installSDKProvedorAWS"
	echo "##############################################"

	cd "${ARTIFACT_ID_PATH}"

	echo "##############################################"
	echo " Saída esperada:"
	echo "##############################################"
  	read -t 5 -p "Favor ferificar!!    .... 5 seconds only ..."

	##############################################

}

export -f OracleCertificationsScriptsUteis.installSDKProvedorAWS
#########################################################

#########################################################
#
# Describe: Instalação do SDK para o Provedor de Nuvem: Microsoft Azure - MZ
#
# Referencia: 
#
#########################################################
function OracleCertificationsScriptsUteis.installSDKProvedorAzure(){

	export HELPER_TEXT_TEMPLATE=$(cat <<EOF

##############################################
Parametros para o algoritmo: 
	NAME_PROJECT  - Nome do Projeto no formato: NomeProjetoXPTO
	ARTIFACT_ID   - Artefato id no formato: nome-do-projeto
	ARCH          - Arquitetura para solução [arch/clean] (opcional)

Use o comando: 
	export NAME_PROJECT="NomeDoProjeto"
	export ARTIFACT_ID="nome-do-projeto"
	export ARCH="arch/clean"

	OracleCertificationsScriptsUteis.installSDKProvedorAzure "\${NAME_PROJECT}" "\${ARTIFACT_ID}" "\${GROUP_ID}" "\${ARCH}"

##############################################

	Ou apenas passar um arquivo com as variáveis:
	export ENV_WORKS="\${HOME}/env_works.sh"

	OracleCertificationsScriptsUteis.installSDKProvedorAzure "\${ENV_WORKS}" 

	NOTA: use o modelo em: \${CORE_PATH}/templates/env_works/env_works_tool_generate_MODELO.sh

##############################################

EOF
	);

  if [ $# -le 0 ]
  then
    echo -e "\n\n"
    echo -e "${HELPER_TEXT_TEMPLATE}"
    read -t 5 -p "Favor ferificar!!    .... 5 seconds only ..."
    echo -e "\n\n"
    return;
  fi

	echo -e "\n\n\n"
	echo "##############################################"
	echo "Algoritmo: OracleCertificationsScriptsUteis.installSDKProvedorAzure"
	echo "##############################################"
	
	export ENV_WORKS="$1"

	if [ -f "${ENV_WORKS}" ]
	then
		source "${ENV_WORKS}"
	else
		export NAME_PROJECT="$1"
		export ARTIFACT_ID="$2"
		export ARCH="$3"
	fi

	if [[ "${ARCH}" == "" ]]
	then
		ARCH="arch/clean"
	fi

	echo -e "\n\n"
	echo -e "######################################################"
	echo -e "# OracleCertificationsScriptsUteis.installSDKProvedorAzure: NÃO IMPLEMETADO AINDA!!"
	echo -e "######################################################"
	echo -e "\n\n"

	echo " Dados de entrada:"
	echo " NAME_PROJECT = ${NAME_PROJECT}"
	echo " ARTIFACT_ID = ${ARTIFACT_ID}"
	echo " ARTIFACT_ID_PATH = ${ARTIFACT_ID_PATH}"
	echo "##############################################"
	echo -e "\n\n\n"

	cd "${HOME}/projetos"

	echo "##############################################"
	echo " Processamento: OracleCertificationsScriptsUteis.installSDKProvedorAzure"
	echo "##############################################"

	cd "${ARTIFACT_ID_PATH}"

	#git log 
	#code .

	echo "##############################################"
	echo " Saída esperada:"
	echo "##############################################"
  	read -t 5 -p "Favor ferificar!!    .... 5 seconds only ..."

	##############################################

}

export -f OracleCertificationsScriptsUteis.installSDKProvedorAzure
#########################################################

#########################################################
#
# Describe: Instalação do SDK para o Provedor de Nuvem: Google Cloud Platform – GCP
#
# Referencia: 
#
#########################################################
function OracleCertificationsScriptsUteis.installSDKProvedorGCP(){

	export HELPER_TEXT_TEMPLATE=$(cat <<EOF

##############################################
Parametros para o algoritmo: 
	NAME_PROJECT  - Nome do Projeto no formato: NomeProjetoXPTO
	ARTIFACT_ID   - Artefato id no formato: nome-do-projeto
	ARCH          - Arquitetura para solução [arch/clean] (opcional)

Use o comando: 
	export NAME_PROJECT="NomeDoProjeto"
	export ARTIFACT_ID="nome-do-projeto"
	export ARCH="arch/clean"

	OracleCertificationsScriptsUteis.installSDKProvedorGCP "\${NAME_PROJECT}" "\${ARTIFACT_ID}" "\${GROUP_ID}" "\${ARCH}"

##############################################

	Ou apenas passar um arquivo com as variáveis:
	export ENV_WORKS="\${HOME}/env_works.sh"

	OracleCertificationsScriptsUteis.installSDKProvedorGCP "\${ENV_WORKS}" 

	NOTA: use o modelo em: \${CORE_PATH}/templates/env_works/env_works_tool_generate_MODELO.sh

##############################################

EOF
	);

  if [ $# -le 0 ]
  then
    echo -e "\n\n"
    echo -e "${HELPER_TEXT_TEMPLATE}"
    read -t 5 -p "Favor ferificar!!    .... 5 seconds only ..."
    echo -e "\n\n"
    return;
  fi

	echo -e "\n\n\n"
	echo "##############################################"
	echo "Algoritmo: OracleCertificationsScriptsUteis.installSDKProvedorGCP"
	echo "##############################################"
	
	export ENV_WORKS="$1"

	if [ -f "${ENV_WORKS}" ]
	then
		source "${ENV_WORKS}"
	else
		export NAME_PROJECT="$1"
		export ARTIFACT_ID="$2"
		export ARCH="$3"
	fi

	if [[ "${ARCH}" == "" ]]
	then
		ARCH="arch/clean"
	fi

	echo -e "\n\n"
	echo -e "######################################################"
	echo -e "# OracleCertificationsScriptsUteis.installSDKProvedorGCP: NÃO IMPLEMETADO AINDA!!"
	echo -e "######################################################"
	echo -e "\n\n"

	echo " Dados de entrada:"
	echo " NAME_PROJECT = ${NAME_PROJECT}"
	echo " ARTIFACT_ID = ${ARTIFACT_ID}"
	echo " ARTIFACT_ID_PATH = ${ARTIFACT_ID_PATH}"
	echo "##############################################"
	echo -e "\n\n\n"

	cd "${HOME}/projetos"

	echo "##############################################"
	echo " Processamento: OracleCertificationsScriptsUteis.installSDKProvedorGCP"
	echo "##############################################"

	cd "${ARTIFACT_ID_PATH}"

	#git log 
	#code .

	echo "##############################################"
	echo " Saída esperada:"
	echo "##############################################"
  	read -t 5 -p "Favor ferificar!!    .... 5 seconds only ..."

	##############################################

}

export -f OracleCertificationsScriptsUteis.installSDKProvedorGCP
#########################################################

#########################################################
#
# Describe: Instalação do SDK para o Provedor de Nuvem: Heroku – Plataform Cloud - Hpc
#
# Referencia: 
#
#########################################################
function OracleCertificationsScriptsUteis.installSDKProvedorHpc(){

	export HELPER_TEXT_TEMPLATE=$(cat <<EOF

##############################################
Parametros para o algoritmo: 
	NAME_PROJECT  - Nome do Projeto no formato: NomeProjetoXPTO
	ARTIFACT_ID   - Artefato id no formato: nome-do-projeto
	ARCH          - Arquitetura para solução [arch/clean] (opcional)

Use o comando: 
	export NAME_PROJECT="NomeDoProjeto"
	export ARTIFACT_ID="nome-do-projeto"
	export ARCH="arch/clean"

	OracleCertificationsScriptsUteis.installSDKProvedorHpc "\${NAME_PROJECT}" "\${ARTIFACT_ID}" "\${GROUP_ID}" "\${ARCH}"

##############################################

	Ou apenas passar um arquivo com as variáveis:
	export ENV_WORKS="\${HOME}/env_works.sh"

	OracleCertificationsScriptsUteis.installSDKProvedorHpc "\${ENV_WORKS}" 

	NOTA: use o modelo em: \${CORE_PATH}/templates/env_works/env_works_tool_generate_MODELO.sh

##############################################

EOF
	);

  if [ $# -le 0 ]
  then
    echo -e "\n\n"
    echo -e "${HELPER_TEXT_TEMPLATE}"
    read -t 5 -p "Favor ferificar!!    .... 5 seconds only ..."
    echo -e "\n\n"
    return;
  fi

	echo -e "\n\n\n"
	echo "##############################################"
	echo "Algoritmo: OracleCertificationsScriptsUteis.installSDKProvedorHpc"
	echo "##############################################"
	
	export ENV_WORKS="$1"

	if [ -f "${ENV_WORKS}" ]
	then
		source "${ENV_WORKS}"
	else
		export NAME_PROJECT="$1"
		export ARTIFACT_ID="$2"
		export ARCH="$3"
	fi

	if [[ "${ARCH}" == "" ]]
	then
		ARCH="arch/clean"
	fi

	echo -e "\n\n"
	echo -e "######################################################"
	echo -e "# OracleCertificationsScriptsUteis.installSDKProvedorHpc: NÃO IMPLEMETADO AINDA!!"
	echo -e "######################################################"
	echo -e "\n\n"

	echo " Dados de entrada:"
	echo " NAME_PROJECT = ${NAME_PROJECT}"
	echo " ARTIFACT_ID = ${ARTIFACT_ID}"
	echo " ARTIFACT_ID_PATH = ${ARTIFACT_ID_PATH}"
	echo "##############################################"
	echo -e "\n\n\n"

	cd "${HOME}/projetos"

	echo "##############################################"
	echo " Processamento: OracleCertificationsScriptsUteis.installSDKProvedorHpc"
	echo "##############################################"

	cd "${ARTIFACT_ID_PATH}"

	#git log 
	#code .

	echo "##############################################"
	echo " Saída esperada:"
	echo "##############################################"
  	read -t 5 -p "Favor ferificar!!    .... 5 seconds only ..."

	##############################################

}

export -f OracleCertificationsScriptsUteis.installSDKProvedorHpc
#########################################################

#########################################################
#
# Describe: Instalação do SDK para o Provedor de Nuvem: RedHat OpenShift - RhOpenShift
#
# Referencia: 
#
#########################################################
function OracleCertificationsScriptsUteis.installSDKProvedorRhOpenShift(){

	export HELPER_TEXT_TEMPLATE=$(cat <<EOF

##############################################
Parametros para o algoritmo: 
	NAME_PROJECT  - Nome do Projeto no formato: NomeProjetoXPTO
	ARTIFACT_ID   - Artefato id no formato: nome-do-projeto
	ARCH          - Arquitetura para solução [arch/clean] (opcional)

Use o comando: 
	export NAME_PROJECT="NomeDoProjeto"
	export ARTIFACT_ID="nome-do-projeto"
	export ARCH="arch/clean"

	OracleCertificationsScriptsUteis.installSDKProvedorRhOpenShift "\${NAME_PROJECT}" "\${ARTIFACT_ID}" "\${GROUP_ID}" "\${ARCH}"

##############################################

	Ou apenas passar um arquivo com as variáveis:
	export ENV_WORKS="\${HOME}/env_works.sh"

	OracleCertificationsScriptsUteis.installSDKProvedorRhOpenShift "\${ENV_WORKS}" 

	NOTA: use o modelo em: \${CORE_PATH}/templates/env_works/env_works_tool_generate_MODELO.sh

##############################################

EOF
	);

  if [ $# -le 0 ]
  then
    echo -e "\n\n"
    echo -e "${HELPER_TEXT_TEMPLATE}"
    read -t 5 -p "Favor ferificar!!    .... 5 seconds only ..."
    echo -e "\n\n"
    return;
  fi

	echo -e "\n\n\n"
	echo "##############################################"
	echo "Algoritmo: OracleCertificationsScriptsUteis.installSDKProvedorRhOpenShift"
	echo "##############################################"
	
	export ENV_WORKS="$1"

	if [ -f "${ENV_WORKS}" ]
	then
		source "${ENV_WORKS}"
	else
		export NAME_PROJECT="$1"
		export ARTIFACT_ID="$2"
		export ARCH="$3"
	fi

	if [[ "${ARCH}" == "" ]]
	then
		ARCH="arch/clean"
	fi

	echo -e "\n\n"
	echo -e "######################################################"
	echo -e "# OracleCertificationsScriptsUteis.installSDKProvedorRhOpenShift: NÃO IMPLEMETADO AINDA!!"
	echo -e "######################################################"
	echo -e "\n\n"

	echo " Dados de entrada:"
	echo " NAME_PROJECT = ${NAME_PROJECT}"
	echo " ARTIFACT_ID = ${ARTIFACT_ID}"
	echo " ARTIFACT_ID_PATH = ${ARTIFACT_ID_PATH}"
	echo "##############################################"
	echo -e "\n\n\n"

	cd "${HOME}/projetos"

	echo "##############################################"
	echo " Processamento: OracleCertificationsScriptsUteis.installSDKProvedorRhOpenShift"
	echo "##############################################"

	cd "${ARTIFACT_ID_PATH}"

	#git log 
	#code .

	echo "##############################################"
	echo " Saída esperada:"
	echo "##############################################"
  	read -t 5 -p "Favor ferificar!!    .... 5 seconds only ..."

	##############################################

}

export -f OracleCertificationsScriptsUteis.installSDKProvedorRhOpenShift
#########################################################

#########################################################
#
# Describe: Instalação do SDK para o Provedor de Nuvem: Oracle Cloud Insfrastructure - OCI
#
# Referencia: 
#
#########################################################
function OracleCertificationsScriptsUteis.installSDKProvedorOCI(){

	export HELPER_TEXT_TEMPLATE=$(cat <<EOF

##############################################
Parametros para o algoritmo: 
	NAME_PROJECT  - Nome do Projeto no formato: NomeProjetoXPTO
	ARTIFACT_ID   - Artefato id no formato: nome-do-projeto
	ARCH          - Arquitetura para solução [arch/clean] (opcional)

Use o comando: 
	export NAME_PROJECT="NomeDoProjeto"
	export ARTIFACT_ID="nome-do-projeto"
	export ARCH="arch/clean"

	OracleCertificationsScriptsUteis.installSDKProvedorOCI "\${NAME_PROJECT}" "\${ARTIFACT_ID}" "\${GROUP_ID}" "\${ARCH}"

##############################################

	Ou apenas passar um arquivo com as variáveis:
	export ENV_WORKS="\${HOME}/env_works.sh"

	OracleCertificationsScriptsUteis.installSDKProvedorOCI "\${ENV_WORKS}" 

	NOTA: use o modelo em: \${CORE_PATH}/templates/env_works/env_works_tool_generate_MODELO.sh

##############################################

EOF
	);

  if [ $# -le 0 ]
  then
    echo -e "\n\n"
    echo -e "${HELPER_TEXT_TEMPLATE}"
    read -t 5 -p "Favor ferificar!!    .... 5 seconds only ..."
    echo -e "\n\n"
    return;
  fi

	echo -e "\n\n\n"
	echo "##############################################"
	echo "Algoritmo: OracleCertificationsScriptsUteis.installSDKProvedorOCI"
	echo "##############################################"
	
	export ENV_WORKS="$1"

	if [ -f "${ENV_WORKS}" ]
	then
		source "${ENV_WORKS}"
	else
		export NAME_PROJECT="$1"
		export ARTIFACT_ID="$2"
		export ARCH="$3"
	fi

	if [[ "${ARCH}" == "" ]]
	then
		ARCH="arch/clean"
	fi

	echo -e "\n\n"
	echo -e "######################################################"
	echo -e "# OracleCertificationsScriptsUteis.installSDKProvedorOCI: NÃO IMPLEMETADO AINDA!!"
	echo -e "######################################################"
	echo -e "\n\n"

	echo " Dados de entrada:"
	echo " NAME_PROJECT = ${NAME_PROJECT}"
	echo " ARTIFACT_ID = ${ARTIFACT_ID}"
	echo " ARTIFACT_ID_PATH = ${ARTIFACT_ID_PATH}"
	echo "##############################################"
	echo -e "\n\n\n"

	cd "${HOME}/projetos"

	echo "##############################################"
	echo " Processamento: OracleCertificationsScriptsUteis.installSDKProvedorOCI"
	echo "##############################################"

	cd "${ARTIFACT_ID_PATH}"

	#git log 
	#code .

	echo "##############################################"
	echo " Saída esperada:"
	echo "##############################################"
  	read -t 5 -p "Favor ferificar!!    .... 5 seconds only ..."

	##############################################

}

export -f OracleCertificationsScriptsUteis.installSDKProvedorOCI
#########################################################

#########################################################
#
# Describe: Instalação do SDK para o Provedor de Nuvem: Spring Cloud - SP
#
# Referencia: 
#
#########################################################
function OracleCertificationsScriptsUteis.installSDKProvedorSp(){

	export HELPER_TEXT_TEMPLATE=$(cat <<EOF

##############################################
Parametros para o algoritmo: 
	NAME_PROJECT  - Nome do Projeto no formato: NomeProjetoXPTO
	ARTIFACT_ID   - Artefato id no formato: nome-do-projeto
	ARCH          - Arquitetura para solução [arch/clean] (opcional)

Use o comando: 
	export NAME_PROJECT="NomeDoProjeto"
	export ARTIFACT_ID="nome-do-projeto"
	export ARCH="arch/clean"

	OracleCertificationsScriptsUteis.installSDKProvedorSp "\${NAME_PROJECT}" "\${ARTIFACT_ID}" "\${GROUP_ID}" "\${ARCH}"

##############################################

	Ou apenas passar um arquivo com as variáveis:
	export ENV_WORKS="\${HOME}/env_works.sh"

	OracleCertificationsScriptsUteis.installSDKProvedorSp "\${ENV_WORKS}" 

	NOTA: use o modelo em: \${CORE_PATH}/templates/env_works/env_works_tool_generate_MODELO.sh

##############################################

EOF
	);

  if [ $# -le 0 ]
  then
    echo -e "\n\n"
    echo -e "${HELPER_TEXT_TEMPLATE}"
    read -t 5 -p "Favor ferificar!!    .... 5 seconds only ..."
    echo -e "\n\n"
    return;
  fi

	echo -e "\n\n\n"
	echo "##############################################"
	echo "Algoritmo: OracleCertificationsScriptsUteis.installSDKProvedorSp"
	echo "##############################################"
	
	export ENV_WORKS="$1"

	if [ -f "${ENV_WORKS}" ]
	then
		source "${ENV_WORKS}"
	else
		export NAME_PROJECT="$1"
		export ARTIFACT_ID="$2"
		export ARCH="$3"
	fi

	if [[ "${ARCH}" == "" ]]
	then
		ARCH="arch/clean"
	fi

	echo -e "\n\n"
	echo -e "######################################################"
	echo -e "# OracleCertificationsScriptsUteis.installSDKProvedorSp: NÃO IMPLEMETADO AINDA!!"
	echo -e "######################################################"
	echo -e "\n\n"

	echo " Dados de entrada:"
	echo " NAME_PROJECT = ${NAME_PROJECT}"
	echo " ARTIFACT_ID = ${ARTIFACT_ID}"
	echo " ARTIFACT_ID_PATH = ${ARTIFACT_ID_PATH}"
	echo "##############################################"
	echo -e "\n\n\n"

	cd "${HOME}/projetos"

	echo "##############################################"
	echo " Processamento: OracleCertificationsScriptsUteis.installSDKProvedorSp"
	echo "##############################################"

	cd "${ARTIFACT_ID_PATH}"

	#git log 
	#code .

	echo "##############################################"
	echo " Saída esperada:"
	echo "##############################################"
  	read -t 5 -p "Favor ferificar!!    .... 5 seconds only ..."

	##############################################

}

export -f OracleCertificationsScriptsUteis.installSDKProvedorSp
#########################################################

#########################################################
#
# Describe: Algoritmo para o processamento de um arquivo CSV pequeno!
#
# O Arquvo CSV para o processamento temos os seguintes parâmetros:
# **********************************************
#  a_coluna_cabecalho[0] = "ID"
#  a_coluna_cabecalho[1] = "PROJECT_NAME"
#  a_coluna_cabecalho[2] = "NAME_BRANCH_WORK"
#  a_coluna_cabecalho[3] = "ARTIFACT_ID_PARENT"
#  a_coluna_cabecalho[4] = "ARTIFACT_ID"
#  a_coluna_cabecalho[5] = "PROVEDOR"
#  a_coluna_cabecalho[6] = "PROJECT_DESCRIPTION"
#  a_coluna_cabecalho[7] = "LINK_CERTIFICATION"
#  a_coluna_cabecalho[8] = "TITULO_CERTIFICATION"
#  a_coluna_cabecalho[9] = "ARTIFACT_ID_SUB_CERTIFICATON"
#  a_coluna_cabecalho[10] = "LINK_GITHUB"
# **********************************************
# Referencia: 
#
#########################################################
function OracleCertificationsScriptsUteis.processamentoCSV(){

	export HELPER_TEXT_TEMPLATE=$(cat <<EOF

##############################################
Parametros para o algoritmo: 
	WORK_PATH      - Diretório de Trabalho
	INPUT_FILE_CSV - Local da Pasta completa do arquivo  CSV

Use o comando: 
	export WORK_PATH="\${HOME}/projetos/acmecorp-erp-hyperledger-fabric"
	export INPUT_FILE_CSV="\${HOME}/projetos/scripts-shell-uteis/src/test/core/data/arquivo_padrao_modelo.csv"

	OracleCertificationsScriptsUteis.processamentoCSV "\${WORK_PATH}" "\${INPUT_FILE_CSV}" 

##############################################

	Ou apenas passar um arquivo com as variáveis:
	export ENV_WORKS="\${HOME}/env_works.sh"

	OracleCertificationsScriptsUteis.processamentoCSV "\${ENV_WORKS}" 

	NOTA: use o modelo em: \${CORE_PATH}/templates/env_works/env_works_tool_generate_MODELO.sh

##############################################

EOF
	);

  if [ $# -le 0 ]
  then
    echo -e "\n\n"
    echo -e "${HELPER_TEXT_TEMPLATE}"
    read -t 5 -p "Favor ferificar!!    .... 5 seconds only ..."
    echo -e "\n\n"
    return;
  fi

	export ENV_WORKS="$1"

	if [ -f "${ENV_WORKS}" ]
	then
		source "${ENV_WORKS}"
	else
		export WORK_PATH="$1"
		export INPUT_FILE_CSV="$2"
	fi

	cd "${HOME}/projetos"

	#export README_PROVEDOR_NUVEM=$(cat -e "${TEMPLATES_PATH}/README_provedor_nuvem.md")
	export README_PROVEDOR_NUVEM="${TEMPLATES_PATH}/README_provedor_nuvem.md"
	export TOKEN_SEPARACAO=","

	export ARTIFACT_ID_PARENT_PATH="${HOME}/projetos/"
	export CERTIFICATION_PATH=""
	export WORK_PATH=""

	##############################################
	# Alterar o valor da Variável IFS (internal field separator) 
	##############################################
	oldIFS=$IFS
	IFS="${TOKEN_SEPARACAO}"
	##############################################
	countLine=0

	a_coluna_values=()
	a_coluna_cabecalho=()

	while read line
	do
		if [ ${countLine} -eq 0 ]
		then
			a_coluna_cabecalho=($(echo "${line}" | grep "${TOKEN_SEPARACAO}"))
			countLine=$[ ${countLine} + 1 ]
		else 

			a_coluna_values=($(echo "${line}" | grep "${TOKEN_SEPARACAO}"))
		fi

		export PROJECT_NAME=$(echo ${a_coluna_values[1]} | sed s/"\""//g ) 
		export NAME_BRANCH_WORK=$(echo ${a_coluna_values[2]} | sed s/"\""//g ) 
		export ARTIFACT_ID_PARENT=$(echo ${a_coluna_values[3]} | sed s/"\""//g ) 
		export ARTIFACT_ID=$(echo ${a_coluna_values[4]} | sed s/"\""//g ) 
		export PROVEDOR=$(echo ${a_coluna_values[5]} | sed s/"\""//g ) 
		export PROJECT_DESCRIPTION=$(echo ${a_coluna_values[6]} | sed s/"\""//g ) 
		export LINK_CERTIFICATION=$(echo ${a_coluna_values[7]} | sed s/"\""//g ) 
		export TITULO_CERTIFICATION=$(echo ${a_coluna_values[8]} | sed s/"\""//g ) 
		export ARTIFACT_ID_SUB_CERTIFICATON=$(echo ${a_coluna_values[9]} | sed s/"\""//g ) 
		export LINK_GITHUB=$(echo ${a_coluna_values[10]} | sed s/"\""//g ) 
		#**********************************************

		ARTIFACT_ID_PARENT_PATH="${HOME}/projetos/${ARTIFACT_ID_PARENT}"
		CERTIFICATION_PATH="${ARTIFACT_ID_PARENT_PATH}/${ARTIFACT_ID}/${ARTIFACT_ID_SUB_CERTIFICATON}"
		WORK_PATH="${CERTIFICATION_PATH}"

		OracleCertificationsScriptsUteis.criarEstruturaPastasRepoGenerico "${WORK_PATH}"

		if [ ! -f "${WORK_PATH}/README.md" ]
		then
			cp "${README_PROVEDOR_NUVEM}" "${WORK_PATH}/README.md"
			sed -i -e 's%{{PROJECT_NAME}}%'"${PROJECT_NAME}"'%g' "${WORK_PATH}/README.md"
			sed -i -e 's%{{ARTIFACT_ID}}%'"${ARTIFACT_ID}"'%g' "${WORK_PATH}/README.md"
			sed -i -e 's%{{ARTIFACT_ID_PARENT}}%'"${ARTIFACT_ID_PARENT}"'%g' "${WORK_PATH}/README.md"
			sed -i -e 's%{{ARTIFACT_ID_SUB_CERTIFICATON}}%'"${ARTIFACT_ID_SUB_CERTIFICATON}"'%g' "${WORK_PATH}/README.md"
			sed -i -e 's%{{TITULO_CERTIFICATION}}%'"${TITULO_CERTIFICATION}"'%g' "${WORK_PATH}/README.md"
			sed -i -e 's%{{LINK_GITHUB}}%'"${LINK_GITHUB}"'%g' "${WORK_PATH}/README.md"
			sed -i -e 's%{{LINK_CERTIFICATION}}%'"${LINK_CERTIFICATION}"'%g' "${WORK_PATH}/README.md"

		fi


	 countLine=$[ ${countLine} + 1 ]

	done < "${INPUT_FILE_CSV}"

	##############################################
	# Voltar o valor da Variável IFS (internal field separator) 
	##############################################
	IFS=$oldIFS
	##############################################

	return 1;

	##############################################

}

export -f OracleCertificationsScriptsUteis.processamentoCSV
#########################################################

#########################################################
#
# Describe: Criar a estrutura padrão de um repo genérico
#
# Referencia: 
#
#########################################################
function OracleCertificationsScriptsUteis.criarEstruturaPastasRepoGenerico(){

	export HELPER_TEXT_TEMPLATE=$(cat <<EOF

##############################################
Parametros para o algoritmo: 
	WORK_PATH  - Pasta raiz onde criará estrutura do projeto

Use o comando: 
	export WORK_PATH="\${HOME}/projetos/\${ARTIFACT_ID_PARENT}"

	OracleCertificationsScriptsUteis.criarEstruturaPastasRepoGenerico "\${WORK_PATH}" 

##############################################

	Ou apenas passar um arquivo com as variáveis:
	export ENV_WORKS="\${HOME}/env_works.sh"

	OracleCertificationsScriptsUteis.criarEstruturaPastasRepoGenerico "\${ENV_WORKS}" 

	NOTA: use o modelo em: \${CORE_PATH}/templates/env_works/env_works_tool_generate_MODELO.sh

##############################################

EOF
	);

  if [ $# -le 0 ]
  then
    echo -e "\n\n"
    echo -e "${HELPER_TEXT_TEMPLATE}"
    read -t 5 -p "Favor ferificar!!    .... 5 seconds only ..."
    echo -e "\n\n"
    return;
  fi

	echo -e "\n\n\n"
	echo "##############################################"
	echo "Algoritmo: OracleCertificationsScriptsUteis.criarEstruturaPastasRepoGenerico"
	echo "##############################################"
	
	export ENV_WORKS="$1"

	if [ -f "${ENV_WORKS}" ]
	then
		source "${ENV_WORKS}"
	else
		export WORK_PATH="$1"
	fi

	echo -e "\n\n"
	echo -e "######################################################"
	echo -e "# OracleCertificationsScriptsUteis.criarEstruturaPastasRepoGenerico: "
	echo -e "######################################################"
	echo -e "\n\n"

	echo " Dados de entrada:"
	echo " WORK_PATH = ${WORK_PATH}"
	echo " ARTIFACT_ID = ${ARTIFACT_ID}"
	echo " ARTIFACT_ID_PATH = ${ARTIFACT_ID_PATH}"
	echo " PROJECT_NAME = ${PROJECT_NAME}"
	echo " NAME_BRANCH_WORK = ${NAME_BRANCH_WORK}"
	
	echo "##############################################"
	echo -e "\n\n\n"

	cd "${HOME}/projetos"

	if [ ! -d "${WORK_PATH}" ]
	then
		
		mkdir -p "${WORK_PATH}/docs/imgs"
		touch "${WORK_PATH}/docs/imgs/.gitkeep"

		mkdir -p "${WORK_PATH}/docs/indexacoes"
		touch "${WORK_PATH}/docs/indexacoes/.gitkeep"
		
		mkdir -p "${WORK_PATH}/docs/provedores_nuvem"
		touch "${WORK_PATH}/docs/provedores_nuvem/.gitkeep"

		mkdir -p "${WORK_PATH}/scripts/src/main/automation"
		touch "${WORK_PATH}/scripts/src/main/automation/.gitkeep"

		mkdir -p "${WORK_PATH}/scripts/src/test/automation"
		touch "${WORK_PATH}/scripts/src/test/automation/.gitkeep"

	fi
	
	read -t 5 -p "Favor aguarde um momento!!    .... 5 segundos somente ..."
	##############################################

}

export -f OracleCertificationsScriptsUteis.criarEstruturaPastasRepoGenerico
#########################################################

#########################################################
#
# Função Principal: Main do projeto: OracleCertificationsScriptsUteis
# $1: Primeiro parametro da função
# Referencia: @see 
#
#########################################################
function OracleCertificationsScriptsUteis()
{
  export LISTA_MANU
  LISTA_MANU=$(cat <<EOF
##############################################
 # Algoritmo de Trabalho
 #1) Criar a estrutura de pastas!
 #      echo -e "Não implementado
 #2) Instalações necessárias!
 #      echo -e "Não implementado
 #3) Passo 3
 #      echo -e "Não implementado
 #4) Passo 4
 #
 #NOTA: para cada passo criar uma função!
 ###############################################
EOF
  );
  echo -e "${LISTA_MANU}"
	return 0;
}

export -f OracleCertificationsScriptsUteis
#########################################################

