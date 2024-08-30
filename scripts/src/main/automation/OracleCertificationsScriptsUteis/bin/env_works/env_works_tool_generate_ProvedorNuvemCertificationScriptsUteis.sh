#!/bin/bash
########################################
#
# Filename: env_works_tool_generate_core.sh
#
# Variaveis da ferramenta de geração de código: scripts-shell-uteis
# para o projeto: OracleCertificationsScriptsUteis
#
########################################
export OUTPUT_TMP_FILE=$(mktemp /tmp/temp.XXXXXX)

export SCRIPTS_SHELL_UTEIS_PATH="${HOME}/projetos/scripts-shell-uteis"

## Nome do algoritmo da ferramenta para automação
export NAME_PROJECT_TOOL="OracleCertificationsScriptsUteis"

export AUTOMATION_PATH="${SCRIPTS_SHELL_UTEIS_PATH}/src/main/automation"

export TEMPLATE_PATH="${AUTOMATION_PATH}/${NAME_PROJECT_TOOL}/templates"

########################################
