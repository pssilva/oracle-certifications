package br.com.class_design;
/**
 * <p>Código presente no Ebook: <a href="https://a.co/d/0alQOByp" >OCP Oracle® Certified Professional Java® SE 21 Developer</a>
 * <p> Capítulo 6 ■ Projeto de Classes
 * <p> » » Herdando Membros
 * <p> » » » Sobrescrita de Método
 * <p> » » » » Regra nº 4: Tipos de Retorno Covariantes
 * </ br>
 *
 * <p>Escute o áudio explicativo do propósito da questão na Evidência de Estudo: [TRABALHO EM PROGRESSO]
 */
public class Rhino {
    protected CharSequence getName() {
        return "rhino";
    }
    protected String getColor() {
        return "grey, black, or white";
    }
}
