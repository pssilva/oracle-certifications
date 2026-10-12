package br.com.beyond_classes;
/**
 * <p>Código presente no Ebook: <a href="https://a.co/d/0alQOByp" >OCP Oracle® Certified Professional Java® SE 21 Developer</a>
 * <p> » Capítulo 7 ■ Além das Classes
 * <p> » » Implementando Interfaces
 * <p> » » » Estendendo uma Interface
 * </ br>
 *
 * <p>Escute o áudio explicativo do propósito da questão na Evidência de Estudo: [TRABALHO EM PROGRESSO]
 */
public interface ZooTrainTour {
    abstract int getTrainName();
    private static void ride() {}
    default void playHorn() { getTrainName(); ride(); }
    // public static void slowDown() { playHorn(); } // Não compila
    static void speedUp() { ride(); }
}
