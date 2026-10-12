package br.com.class_design;
/**
 * <p>Código presente no Ebook: <a href="https://a.co/d/0alQOByp" >OCP Oracle® Certified Professional Java® SE 21 Developer</a>
 * <p> Capítulo 6 ■ Projeto de Classes
 * <p> » » Inicializando Objetos
 * <p> » » » Inicializando campos final
 * </ br>
 *
 * <p>Escute o áudio explicativo do propósito da questão na Evidência de Estudo: [TRABALHO EM PROGRESSO]
 */
public class MouseHouse {
    private final int volume;
    private final String name;
    public MouseHouse() {
        this.name = "Empty House";   // Constructor assignment
    }
    {
        volume = 10;  // Instance initializer assignment
    }
//    public MouseHouse() {  // DOES NOT COMPILE
//        this.volume = 2;    // DOES NOT COMPILE
//    }
}
