package br.com.lambdas.functional.interfaces;
/**
 * <p>Código presente no Ebook: <a href="https://a.co/d/0alQOByp" >OCP Oracle® Certified Professional Java® SE 21 Developer</a>
 * <p> » Capítulo 8 ■ Lambdas e Interfaces Funcionais
 * <p> » » Codificando Interfaces Funcionais
 * <p> » » » Definindo uma Interface Funcional
 * <p> » » » » A Anotação @FunctionalInterface
 * </ br>
 *
 * <p>Escute o áudio explicativo do propósito da questão na Evidência de Estudo: [TRABALHO EM PROGRESSO]
 */
public interface Dash {
    void reach();
    default void fall() {}
    static int getBackUp() { return 100; }
    private static boolean checkHeight() { return true; }
}
