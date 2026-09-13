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



#########################################################
#
# Describe: 
# Referencia: 
#
#########################################################
function OracleCertificationsScriptsUteis.CriarStructureByConceito(){

    export NOME_MODULO="$1"
    export CONCEITO="$2"

    export ARTIFACT_ID_PARENT="oracle-certifications"
    export ARTIFACT_ID="ocp-javase25-developer"
    export WORK_PATH="${HOME}/projetos/${ARTIFACT_ID_PARENT}/${ARTIFACT_ID}"
    export OCP_STUDY_PATH="${WORK_PATH}/docs/ocp-study"
    
	export README_TEMPLATE=$(cat <<EOF
Módulo: {{NOME_MODULO}} 
--------

Para este módulo usaremos como base de referência o Livro: [OCP Oracle Certified Professional Java SE 21 Developer: Study Guide Exam 1Z0-830](https://a.co/d/0alQOByp).

## Objetivo

Descrição sucinta vem aqui ..... 

Conceitos OCP
-------------

Os conceitos se encontram na pasta: \`{{FEYNMAN_PATH}}\`

[TRABALHO EM PROGRESSO]

- [Conceito XPTO 1](#)
- [Conceito XPTO 2](#)
- [Conceito XPTO 3](#)


EOF
	);


export MISTAKES_TEMPLATE=$(cat <<EOF
MISTAKE-001
----------

Tema:
Autoboxing

Código:
Integer x = null;
int y = x;

Resultado:
NullPointerException

Por que errei:
Confundi wrapper com primitive.

Regra:
Unboxing de null gera NPE.

Revisões:
D+1  ✓
D+3  ✓
D+7  ✗
D+14 —

EOF
	);


	export FEYNMAN_TEMPLATE=$(cat <<EOF
# Técnica Feynman 

Tendo em mente o vídeo [Como APRENDER QUALQUER COISA de maneira INTELIGENTE | A Técnica Feynman](https://youtu.be/CN_SCpGuJ_w?si=7eqvv5fpdCkjXVdz)! 

Aplicando o protocolo Feynman de 60 minutos especificamente para o CONCEITO: {{CONCEITO}}! E usar os áudios e cards para aplicar a [técnica revisão espaçada](https://youtu.be/XG0CAM_VYdE?si=-YqvN01n5A44NIGC).


## Escolha o Assunto (0-2 min)

CONCEITO: {{CONCEITO}}

## Escrever à Mão (2-25 min)

Numa folha de papel (card), escreva: 


\`\`\`
O que é?
Como funciona?
Por que funciona?
Quando usar?
Quando NÃO usar?
Qual pegadinha?

\`\`\`

E tire uma foto de evidência e coloque na pasta: \`{{EVIDENCIA_PATH}}\`

## Explique em voz alta (25-40 min)

Explique sem condultas como se estivesse ensinando para um desenvolvedor Jr.


## Grave Áudio (40-50 min)

Gravar o áudio auto explicativo sem consultas, assim acionando, ativando e consolidando a rede do conhecimento.

O áudio pode começar com alguma coisa assim:

> "Hoje vou explicar como se eu estivesse ensinando um desenvolvedor Java júnior..."

Isso força você a abandonar o reconhecimento passivo e fazer recuperação ativa.

## Verificar (50-60 min)

Fazer a revisão de correções do material, do roteiro do áudio! 
Buscando complementando com mais detalhes ou deixar a explicação o mais simples possível para qualquer criança de 5 anos possa entender!


## Código :: Pratique 

Pratique com código e responda questões da prova de certificação

NOTA: 

\`\`\`java

// Coloque o código aqui!!

\`\`\`


EOF
	);


	cd "${WORK_PATH}"

	echo -e "\n\n"	
	echo "##############################################"
	echo "# CONCEITO: ${CONCEITO}"
	echo "##############################################"
	for pasta in "${WORK_PATH}"/*; do


		NOME_PASTA=$(basename "${pasta}")


		if [[ "$NOME_PASTA" == "docs" ]]; then

			continue

		fi


		if [[ -d "${pasta}" ]]; then
		
			echo "Processando: ${pasta}"
			echo "Nome Diretório: ${NOME_PASTA}"
			echo -e "\n\n"	

			# Compara com o parâmetro de entrada
			if [[ "$NOME_PASTA" == "$NOME_MODULO" ]]; then

				if [[ ! -f "${pasta}/README.md" ]]; then

					CONCEITO_NOME_PASTA=$(echo "${CONCEITO}" \
						| tr '[:upper:]' '[:lower:]' \
						| sed 's/[[:space:]]\+/-/g' \
						| sed 's/--\+/-/g' \
						| sed 's/\///g')

					CONCEITO_NOME_PASTA="${CONCEITO_NOME_PASTA//--/-}"

					echo -e "${README_TEMPLATE}" > "${pasta}/README.md"
					
					sed -i -e 's%{{NOME_MODULO}}%'"${NOME_MODULO}"'%g' "${pasta}/README.md"
					sed -i -e 's%{{FEYNMAN_PATH}}%'"${pasta}/docs/feynman/${CONCEITO_NOME_PASTA}/"'%g' "${pasta}/README.md"

				fi

				CONCEITO_PATH="${pasta}/docs/feynman/${CONCEITO_NOME_PASTA}/"
				mkdir -p "${CONCEITO_PATH}/evidencias/imgs"
				touch "${CONCEITO_PATH}/evidencias/imgs/.gitkeep"

				mkdir -p "${CONCEITO_PATH}/evidencias/audios"
				touch "${CONCEITO_PATH}/evidencias/audios/.gitkeep"

				mkdir -p "${CONCEITO_PATH}/mistakes"
				mkdir -p "${CONCEITO_PATH}/questions-exam"
				touch "${CONCEITO_PATH}/questions-exam/.gitkeep"

				echo -e "${FEYNMAN_TEMPLATE}" > "${CONCEITO_PATH}/README.md"
				echo -e "${MISTAKES_TEMPLATE}" > "${CONCEITO_PATH}/mistakes/mistakes-modelo.md"

				sed -i -e 's%{{CONCEITO}}%'"${CONCEITO}"'%g' "${CONCEITO_PATH}/README.md"
				
				break
			fi


		fi

	done

	echo "##############################################"
	echo -e "\n\n"
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
export -f OracleCertificationsScriptsUteis.CriarStructureByConceito

#########################################################