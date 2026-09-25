



export ARTIFACT_ID="oracle-certifications"
export TOOL_NAME="OracleCertificationsScriptsUteis"
export SCRIPT_PATH="${HOME}/projetos/${ARTIFACT_ID}/scripts"
export AUTOMATION_PATH="${SCRIPT_PATH}/src/main/automation"
export TOOL_PATH="${AUTOMATION_PATH}/${TOOL_NAME}"

source "${TOOL_PATH}/ocp-training-lab.sh"
OracleCertificationsScriptsUteis.CriarStructureByConceito "01-beyond-classes" "Classes Aninhadas"
# OracleCertificationsScriptsUteis.CriarStructureByConceito "01-beyond-classes" "Enums"
# OracleCertificationsScriptsUteis.CriarStructureByConceito "06-lambdas-functional-interfaces" "Interfaces Funcional"
# OracleCertificationsScriptsUteis.CriarStructureByConceito "01-beyond-classes" "Classes Sealed"
# OracleCertificationsScriptsUteis.CriarStructureByConceito "01-class-design" "Classes Abstratas"
# OracleCertificationsScriptsUteis.CriarStructureByConceito "01-beyond-classes" "Polimorfismo"
# OracleCertificationsScriptsUteis.CriarStructureByConceito "01-beyond-classes" "Polimorfismo"
# OracleCertificationsScriptsUteis.CriarStructureByConceito "01-class-design" "Herança"
# OracleCertificationsScriptsUteis.CriarStructureByConceito "01-beyond-classes" "Ecapsulamento"
# OracleCertificationsScriptsUteis.CriarStructureByConceito "01-class-design" "Construtores"
# OracleCertificationsScriptsUteis.CriarStructureByConceito "03-methods" "Métodos"
# OracleCertificationsScriptsUteis.CriarStructureByConceito "15-core-apis" "Classes / Objetos"
# OracleCertificationsScriptsUteis.CriarStructureByConceito "15-core-apis" "Datas e Horas"
# OracleCertificationsScriptsUteis.CriarStructureByConceito "15-core-apis" "Strings-2"
# OracleCertificationsScriptsUteis.CriarStructureByConceito "01-beyond-classes" "TituloConceitoXPTO_11"
# OracleCertificationsScriptsUteis.CriarStructureByConceito "01-building-blocks" "Operações / Casting"
# OracleCertificationsScriptsUteis.CriarStructureByConceito "14-operators" "Operações"

# OracleCertificationsScriptsUteis.OCPTrainingLabStructure
#source /home/pssilva/projetos/oracle-certifications/scripts/src/main/automation/OracleCertificationsScriptsUteis/ocp-training-lab.sh

echo "${TOOL_PATH}"