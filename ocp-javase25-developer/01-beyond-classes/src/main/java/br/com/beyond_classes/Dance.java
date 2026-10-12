package br.com.beyond_classes;
/**
 * <p>Código presente no Ebook: <a href="https://a.co/d/0alQOByp" >OCP Oracle® Certified Professional Java® SE 21 Developer</a>
 * <p> » Capítulo 7 ■ Além das Classes
 * <p> » » Implementando Interfaces
 * <p> » » » Modificadores Conflitantes
 * </ br>
 * <p> » Capítulo 8 ■ Lambdas e Interfaces Funcionais
 * <p> » » Codificando Interfaces Funcionais
 * <p> » » » Definindo uma Interface Funcional
 * </ br>
 *
 * <p>Escute o áudio explicativo do propósito da questão na Evidência de Estudo: [TRABALHO EM PROGRESSO]
 */
//@FunctionalInterface  // DOES NOT COMPILE
public interface Dance {
//    private int count = 4;  // DOES NOT COMPILE
//    protected void step();  // DOES NOT COMPILE
    void move();
    void rest();
}
