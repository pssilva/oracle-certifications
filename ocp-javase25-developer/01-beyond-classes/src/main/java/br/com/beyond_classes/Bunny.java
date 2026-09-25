package br.com.beyond_classes;
/**
 * <p>Código presente no Ebook: <a href="https://a.co/d/0alQOByp" >OCP Oracle® Certified Professional Java® SE 21 Developer</a>
 * <p> » Capítulo 7 ■ Além das Classes
 * <p> » » Implementando Interfaces
 * <p> » » » Declarando Métodos Estáticos em Interfaces
 * <p> » » » » Regras de Definição de Métodos Estáticos em Interfaces
 * </ br>
 *
 * <p>Escute o áudio explicativo do propósito da questão na Evidência de Estudo: [TRABALHO EM PROGRESSO]
 */
public class Bunny implements Hop {
    public void printDetails() {
       // System.out.println(getJumpHeight());  // DOES NOT COMPILE
        System.out.println(Hop.getJumpHeight());
    }
}