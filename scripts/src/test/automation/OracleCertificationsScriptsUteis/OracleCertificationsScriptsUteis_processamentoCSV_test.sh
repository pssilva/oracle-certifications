#!/bin/bash
# ==============================================================
# Filename: OracleCertificationsScriptsUteis_processamentoCSV_test.sh

# Auth: Paulo Sérgio da Silva <pss1suporte@gmail.com>
# Describe: Script para testa a função OracleCertificationsScriptsUteis.processamentoCSV
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

export AUTOMATION_PATH="${HOME}/projetos/provedor-nuvem-certifications/scripts/src/main/automation"
export DATAS_PATH="${AUTOMATION_PATH}/OracleCertificationsScriptsUteis/datas"
export PATH_SCRITP="${AUTOMATION_PATH}/${PARENT_MODULO}"

source "${PATH_SCRITP}/bin/env_works/env_works_tool_generate_${PARENT_MODULO}.sh"

export SCRIPT_TOOL="${PATH_SCRITP}/${PARENT_MODULO}_main.sh"
# ==============================================================

cd "${PATH_SCRITP}"

source "${SCRIPT_TOOL}"

# ==============================================================

export WORK_PATH="${HOME}/projetos/provedor-nuvem-certifications"
export INPUT_FILE_CSV="${DATAS_PATH}/arquivo_certificacoes_parametors.csv"

OracleCertificationsScriptsUteis.processamentoCSV "${WORK_PATH}" "${INPUT_FILE_CSV}"

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
# sudo chmod +x ${HOME}/projetos/provedor-nuvem-certifications/scripts/src/test/automation/OracleCertificationsScriptsUteis/OracleCertificationsScriptsUteis_processamentoCSV_test.sh
# source ${HOME}/projetos/provedor-nuvem-certifications/scripts/src/test/automation/OracleCertificationsScriptsUteis/OracleCertificationsScriptsUteis_processamentoCSV_test.sh
#
########################################################
