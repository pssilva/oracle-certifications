#!/bin/bash
# Filename: ocp-training-lab.sh

#########################################################
#
# Auth: Paulo Sérgio <pss1suporte@gmail.com>
# Describe: Script para Transforme o repositório em um "OCP Training Lab"
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
function OracleCertificationsScriptsUteis.OCPTrainingLabStructure(){

    export ARTIFACT_ID_PARENT="oracle-certifications"
    export ARTIFACT_ID="ocp-javase25-developer"
    export WORK_PATH="${HOME}/projetos/${ARTIFACT_ID_PARENT}/${ARTIFACT_ID}"
    export OCP_STUDY_PATH="${WORK_PATH}/docs/ocp-study"
    
	cd "${WORK_PATH}"

	if [ ! -d "${OCP_STUDY_PATH}" ]
	then
		
		mkdir -p "${OCP_STUDY_PATH}"
		touch "${OCP_STUDY_PATH}/knowledge-matrix.md"
		touch "${OCP_STUDY_PATH}/error-log.md"
		touch "${OCP_STUDY_PATH}/cheat-sheet.md"

	fi
	echo -e "\n\n"
	read -t 5 -p "Favor aguarde um momento!!    .... 5 segundos somente ..."
	echo -e "\n\n"
	##############################################

}
export -f OracleCertificationsScriptsUteis.OCPTrainingLabStructure

#########################################################