#!/bin/bash
# ==============================================================
# Filename: OracleCertificationsScriptsUteis_menu_test.sh

# Auth: Paulo Sérgio da Silva <pss1suporte@gmail.com>
# Describe: Script para testa a função OracleCertificationsScriptsUteis.menu
# version: 1.0
# license: MIT License
#
# ==============================================================

# ==============================================================
# Variaveis de trabalho
# ==============================================================
export NAME_PROJECT="OracleCertificationsScriptsUteis"
export ARTIFACT_ID="{{ARTIFACT_ID}}"
export PARENT_MODULO="OracleCertificationsScriptsUteis"
export NOME_MODULO="{{NOME_MODULO}}"
export ROOT_PATH_SCRIPT="automation"

export CORE_PATH="${HOME}/projetos/scripts-shell-uteis/src/main/core"
source "${CORE_PATH}/bin/env_works/env_works_tool_generate_core.sh"

export PATH_SCRITP="${AUTOMATION_PATH}/${PARENT_MODULO}/${NOME_MODULO}"
export SCRIPT_TOOL="${PATH_SCRITP}/${NOME_MODULO}_main.sh"
# ==============================================================

cd "$PATH_SCRITP"

source "$SCRIPT_TOOL"

########################################

OracleCertificationsScriptsUteis.menu
#OracleCertificationsScriptsUteis.menu "$PATH_WORK" "$GROUP_ID" "$ARTIFACT_ID"

echo -e "\n\n\n"
echo -e "################################"
echo -e "# Para testa o código gerado use os comandos: "
echo -e " cd \${ARTIFACT_ID_PATH}"
echo -e " rm -Rf \${ARTIFACT_ID_PATH}"
echo -e " echo \${ARTIFACT_ID_PATH}"
pwd
echo -e "################################"
echo -e "\n\n\n"

#cd "$HOME"

########################################################
# 
# Para executra use os seguintes comandos:
#  
# NOTA: PATH_SRC_TEST pode ser 
#           [src/test/core/src/main/core] 
#           ou 
#           [src/test/automation/src/main/automation]
#
# sudo chmod +x ${HOME}/projetos/acmecorp-erp-hyperledger-fabric/scripts/src/test/automation/OracleCertificationsScriptsUteis/OracleCertificationsScriptsUteis_menu_test.sh
# source ${HOME}/projetos/acmecorp-erp-hyperledger-fabric/scripts/src/test/automation/OracleCertificationsScriptsUteis/OracleCertificationsScriptsUteis_menu_test.sh
#
########################################################
