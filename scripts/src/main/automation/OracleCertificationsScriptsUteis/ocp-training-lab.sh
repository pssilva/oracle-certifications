#!/bin/bash
# Filename: ocp-training-lab.sh

#########################################################
#
# Auth: Paulo Sérgio <pss1suporte@gmail.com>
# Describe: Script para Transforme o repositório em um "OCP Training Lab"
# version: 2.0
# license: MIT License
#
# Certificações suportadas (3º parâmetro ARTIFACT_ID):
#   - ocp-javase25-developer    (padrão) módulos na raiz, estudo em docs/ocp-study
#   - ocp-javaee7-app-developer módulos em labs/, estudo em study-plan
#
#########################################################

#########################################################
#
# Describe: Define as variáveis da certificação (perfil): caminhos, livro e
#           blocos dos templates. Usada pelas demais funções.
# Uso: OracleCertificationsScriptsUteis.ConfigurarCertificacao "{{ARTIFACT_ID}}"
#
#########################################################
function OracleCertificationsScriptsUteis.ConfigurarCertificacao(){

    export ARTIFACT_ID_PARENT="oracle-certifications"
    export ARTIFACT_ID="${1:-ocp-javase25-developer}"
    export WORK_PATH="${HOME}/projetos/${ARTIFACT_ID_PARENT}/${ARTIFACT_ID}"

    case "${ARTIFACT_ID}" in

        ocp-javase25-developer)
            export MODULOS_PATH="${WORK_PATH}"
            export OCP_STUDY_PATH="${WORK_PATH}/docs/ocp-study"
            export OCP_STUDY_FILES="knowledge-matrix.md error-log.md cheat-sheet.md"
            export EXAME="1Z0-831: Java SE 25 Developer Professional"
            export LIVRO_TITULO="OCP Oracle Certified Professional Java SE 21 Developer"
            export LIVRO_REFERENCIA="[OCP Oracle Certified Professional Java SE 21 Developer: Study Guide Exam 1Z0-830](https://a.co/d/0alQOByp)."
            export BLOCO_EXPLICACAO=""
            export BLOCO_VERIFICAR=""
            export BLOCO_PRATIQUE="Pratique com código e responda questões da prova de certificação

NOTA: "
            ;;

        ocp-javaee7-app-developer)
            export MODULOS_PATH="${WORK_PATH}/labs"
            export OCP_STUDY_PATH="${WORK_PATH}/study-plan"
            export OCP_STUDY_FILES="objectives-checklist.md daily-log.md feynman-notes.md error-log.md"
            export EXAME="1Z0-900: Java EE 7 Application Developer"
            export LIVRO_TITULO="Beginning Java EE 7 (Antonio Goncalves)"
            export LIVRO_REFERENCIA="[Beginning Java EE 7 — Antonio Goncalves (Apress, 2013)](https://tenlong.com.tw/products/9781430246268); complemento: [Java EE 7 Tutorial](https://docs.oracle.com/javaee/7/tutorial/)."
            export BLOCO_EXPLICACAO="
Use **uma analogia** por conceito (ex.: EJB Stateless = caixa de banco, qualquer atendente serve; Stateful = gerente da sua conta).

### Explicação simples

[TRABALHO EM PROGRESSO]

### Analogia

[TRABALHO EM PROGRESSO]
"
            export BLOCO_VERIFICAR="
Onde a explicação travou ou ficou vaga é uma **lacuna**: volte ao livro/Tutorial e prove no código.

### Lacunas encontradas

- [ ] ...

### Versão de 10 linhas

> Até 10 linhas, sem jargão não definido. Regra de saída do dia: se não couber, o conceito volta na revisão do dia seguinte.
"
            export BLOCO_PRATIQUE="Pratique no laboratório do módulo e responda questões da prova de certificação em \`questions-exam/\`.
Cada erro vira um registro em \`mistakes/\` e uma linha no \`study-plan/error-log.md\`.

NOTA: "
            ;;

        *)
            echo "ERRO: certificação '${ARTIFACT_ID}' não suportada." >&2
            echo "Use: ocp-javase25-developer | ocp-javaee7-app-developer" >&2
            return 1
            ;;
    esac

}
export -f OracleCertificationsScriptsUteis.ConfigurarCertificacao

#########################################################



#########################################################
#
# Describe: Substitui todas as ocorrências de um placeholder por um valor
#           literal (sem interpretar &, /, % ou \ como sed faria).
# Uso: OracleCertificationsScriptsUteis.SubstituirPlaceholder "texto" "{{CHAVE}}" "valor"
#
#########################################################
function OracleCertificationsScriptsUteis.SubstituirPlaceholder(){

    local texto="$1"
    local chave="$2"
    local valor="$3"
    local resultado=""

    while [[ "${texto}" == *"${chave}"* ]]; do
        resultado+="${texto%%"${chave}"*}${valor}"
        texto="${texto#*"${chave}"}"
    done

    printf '%s' "${resultado}${texto}"

}
export -f OracleCertificationsScriptsUteis.SubstituirPlaceholder

#########################################################



#########################################################
#
# Describe: Converte o nome do conceito em nome de pasta
#           ("Internacionalização e Localização" -> "internacionalizacao-e-localizacao").
# Uso: OracleCertificationsScriptsUteis.SlugConceito "{{CONCEITO}}"
#
#########################################################
function OracleCertificationsScriptsUteis.SlugConceito(){

    echo "$1" \
        | LC_ALL=C.UTF-8 iconv -f UTF-8 -t ASCII//TRANSLIT \
        | tr '[:upper:]' '[:lower:]' \
        | sed -e 's/[^a-z0-9]\+/-/g' -e 's/^-//' -e 's/-$//'

}
export -f OracleCertificationsScriptsUteis.SlugConceito

#########################################################



#########################################################
#
# Describe: Cria os arquivos de acompanhamento de estudo da certificação.
# Uso: OracleCertificationsScriptsUteis.OCPTrainingLabStructure ["{{ARTIFACT_ID}}"]
#
#########################################################
function OracleCertificationsScriptsUteis.OCPTrainingLabStructure(){

    OracleCertificationsScriptsUteis.ConfigurarCertificacao "$1" || return 1

    mkdir -p "${OCP_STUDY_PATH}"
    for arquivo in ${OCP_STUDY_FILES}; do
        [[ -f "${OCP_STUDY_PATH}/${arquivo}" ]] || touch "${OCP_STUDY_PATH}/${arquivo}"
    done

    echo -e "\n\n"
    read -t 5 -p "Favor aguarde um momento!!    .... 5 segundos somente ..."
    echo -e "\n\n"
    ##############################################

}
export -f OracleCertificationsScriptsUteis.OCPTrainingLabStructure

#########################################################



#########################################################
#
# Describe: Cria a estrutura da Técnica Feynman de um conceito dentro de um módulo.
# Uso: OracleCertificationsScriptsUteis.CriarStructureByConceito "{{NOME_MODULO}}" "{{CONCEITO}}" ["{{ARTIFACT_ID}}"]
# Ex.: OracleCertificationsScriptsUteis.CriarStructureByConceito "07-streams" "Streams"
#      OracleCertificationsScriptsUteis.CriarStructureByConceito "12-cdi" "Qualifiers" "ocp-javaee7-app-developer"
#
#########################################################
function OracleCertificationsScriptsUteis.CriarStructureByConceito(){

    export NOME_MODULO="$1"
    export CONCEITO="$2"

    if [[ -z "${NOME_MODULO}" || -z "${CONCEITO}" ]]; then
        echo "Uso: OracleCertificationsScriptsUteis.CriarStructureByConceito \"{{NOME_MODULO}}\" \"{{CONCEITO}}\" [\"{{ARTIFACT_ID}}\"]" >&2
        return 1
    fi

    OracleCertificationsScriptsUteis.ConfigurarCertificacao "$3" || return 1

	export README_TEMPLATE=$(cat <<EOF
Módulo: {{NOME_MODULO}}
--------

Para este módulo usaremos como base de referência o Livro: {{LIVRO_REFERENCIA}}

## Objetivo

Descrição sucinta vem aqui .....

Conceitos OCP
-------------

Os conceitos se encontram na pasta: \`docs/feynman/\`

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
{{CONCEITO}}

Código:
// trecho mínimo que reproduz o erro

Resultado:
// o que realmente aconteceu

Por que errei:
// ...

Regra:
// a regra, em uma linha

Revisões:
D+1  —
D+3  —
D+7  —
D+14 —

EOF
	);


	export FEYNMAN_TEMPLATE=$(cat <<EOF
# Técnica Feynman

Tendo em mente o vídeo [Como APRENDER QUALQUER COISA de maneira INTELIGENTE | A Técnica Feynman](https://youtu.be/CN_SCpGuJ_w?si=7eqvv5fpdCkjXVdz)!

Aplicando o protocolo Feynman de 60 minutos especificamente para o CONCEITO: {{CONCEITO}}! E usar os áudios e cards para aplicar a [técnica revisão espaçada](https://youtu.be/XG0CAM_VYdE?si=-YqvN01n5A44NIGC).


## Escolha o Assunto (0-2 min)

CONCEITO: {{CONCEITO}}

Exame: {{EXAME}} · Módulo: {{NOME_MODULO}}

Base referêncial Livro: {{LIVRO_REFERENCIA}}

\`\`\`
{{LIVRO_TITULO}}
» Capítulo NN ■ ??????????
» » ?????????? ...
» » » ?????????? ...
» » » » ?????????? ...

\`\`\`

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

### Evidências

E tire uma foto de evidência e coloque na pasta: \`{{EVIDENCIA_PATH}}\`

<!-- <img src="evidencias/imgs/evidencia-{{CONCEITO_SLUG}}-4em1.jpeg" alt="Conceito: {{CONCEITO}}" title="{{CONCEITO}}" style="width:250px;"/> -->


## Explique em voz alta (25-40 min)

Explique sem consultas como se estivesse ensinando para um desenvolvedor Jr.
{{BLOCO_EXPLICACAO}}

## Grave Áudio (40-50 min)

Gravar o áudio auto explicativo sem consultas, assim acionando, ativando e consolidando a rede do conhecimento.

O áudio pode começar com alguma coisa assim:

> "Hoje vou explicar como se eu estivesse ensinando um desenvolvedor Java júnior..."

Isso força você a abandonar o reconhecimento passivo e fazer recuperação ativa.

IMPORTANTE: Tendo em mente o vídeo: [Você Aprendeu Idiomas do Jeito Errado a Vida Toda — Richard Feynman Explica](https://youtu.be/7iFNXjXLY7Y?si=b9M_xaJjytUxnRKy), assim que possível, gravar áudios em inglês também para praticar as habilidades de escrita e fala! Assim, buscando recondicionar o cérebro para se adaptar e entender inglês!

## Verificar (50-60 min)

Fazer a revisão de correções do material, do roteiro do áudio!
Buscando complementando com mais detalhes ou deixar a explicação o mais simples possível para qualquer criança de 5 anos possa entender!
{{BLOCO_VERIFICAR}}

## Código :: Pratique

{{BLOCO_PRATIQUE}}

\`\`\`java

// Coloque o código aqui!!

\`\`\`

Procure responder o seguinte:

\`\`\`

Respondeu no mínimo 10 questões do simulador do exame?
Quais são as pegadinhas mais comuns no exame?

\`\`\`

EOF
	);

	echo -e "\n\n"
	echo "##############################################"
	echo "# CERTIFICAÇÃO: ${ARTIFACT_ID}"
	echo "# CONCEITO: ${CONCEITO}"
	echo "##############################################"

	local pasta="${MODULOS_PATH}/${NOME_MODULO}"

	if [[ "${NOME_MODULO}" == "docs" || ! -d "${pasta}" ]]; then

		echo "ERRO: módulo '${NOME_MODULO}' não encontrado em ${MODULOS_PATH}" >&2
		echo "Módulos disponíveis:" >&2
		find "${MODULOS_PATH}" -mindepth 1 -maxdepth 1 -type d -name '[0-9]*' -printf '  %f\n' 2>/dev/null | sort >&2
		return 1

	fi

	echo "Processando: ${pasta}"
	echo -e "\n\n"

	local CONCEITO_NOME_PASTA
	CONCEITO_NOME_PASTA=$(OracleCertificationsScriptsUteis.SlugConceito "${CONCEITO}")
	local CONCEITO_PATH="${pasta}/docs/feynman/${CONCEITO_NOME_PASTA}"
	# caminho relativo à raiz da certificação (portável entre máquinas)
	local EVIDENCIA_PATH="${CONCEITO_PATH#"${WORK_PATH}/"}/evidencias/imgs"

	if [[ ! -f "${pasta}/README.md" ]]; then

		local readme="${README_TEMPLATE}"
		readme=$(OracleCertificationsScriptsUteis.SubstituirPlaceholder "${readme}" "{{NOME_MODULO}}" "${NOME_MODULO}")
		readme=$(OracleCertificationsScriptsUteis.SubstituirPlaceholder "${readme}" "{{LIVRO_REFERENCIA}}" "${LIVRO_REFERENCIA}")
		printf '%s\n' "${readme}" > "${pasta}/README.md"

	fi

	if [[ -f "${CONCEITO_PATH}/README.md" ]]; then

		echo "Conceito já existe: ${CONCEITO_PATH} (nada foi alterado)"

	else

		mkdir -p "${CONCEITO_PATH}/evidencias/imgs" "${CONCEITO_PATH}/evidencias/audios" \
			"${CONCEITO_PATH}/mistakes" "${CONCEITO_PATH}/questions-exam"
		touch "${CONCEITO_PATH}/evidencias/imgs/.gitkeep" "${CONCEITO_PATH}/evidencias/audios/.gitkeep" \
			"${CONCEITO_PATH}/questions-exam/.gitkeep"

		local feynman="${FEYNMAN_TEMPLATE}"
		local chave
		for chave in CONCEITO NOME_MODULO EXAME LIVRO_REFERENCIA LIVRO_TITULO \
			BLOCO_EXPLICACAO BLOCO_VERIFICAR BLOCO_PRATIQUE; do
			feynman=$(OracleCertificationsScriptsUteis.SubstituirPlaceholder "${feynman}" "{{${chave}}}" "${!chave}")
		done
		feynman=$(OracleCertificationsScriptsUteis.SubstituirPlaceholder "${feynman}" "{{CONCEITO_SLUG}}" "${CONCEITO_NOME_PASTA}")
		feynman=$(OracleCertificationsScriptsUteis.SubstituirPlaceholder "${feynman}" "{{EVIDENCIA_PATH}}" "${EVIDENCIA_PATH}")
		printf '%s\n' "${feynman}" > "${CONCEITO_PATH}/README.md"

		OracleCertificationsScriptsUteis.SubstituirPlaceholder "${MISTAKES_TEMPLATE}" "{{CONCEITO}}" "${CONCEITO}" \
			> "${CONCEITO_PATH}/mistakes/mistakes-modelo.md"
		echo >> "${CONCEITO_PATH}/mistakes/mistakes-modelo.md"

		echo "Criado: ${CONCEITO_PATH}"
		echo "Lembrete: adicione o link na seção 'Conceitos OCP' de ${pasta}/README.md:"
		echo "  - [${CONCEITO}](docs/feynman/${CONCEITO_NOME_PASTA}/README.md)"

	fi

	echo "##############################################"
	echo -e "\n\n"
	mkdir -p "${OCP_STUDY_PATH}"
	for arquivo in ${OCP_STUDY_FILES}; do
		[[ -f "${OCP_STUDY_PATH}/${arquivo}" ]] || touch "${OCP_STUDY_PATH}/${arquivo}"
	done
	echo -e "\n\n"
	read -t 5 -p "Favor aguarde um momento!!    .... 5 segundos somente ..."
	echo -e "\n\n"
	##############################################

}
export -f OracleCertificationsScriptsUteis.CriarStructureByConceito

#########################################################
