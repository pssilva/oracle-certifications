package br.com.lambdas.functional.interfaces;
/**
 * <p>Código presente no Ebook: <a href="https://a.co/d/0alQOByp" >OCP Oracle® Certified Professional Java® SE 21 Developer</a>
 * <p> » Capítulo 7 ■ Além das Classes
 * <p> » » Selando Classes
 * <p> » » » Declarando uma Classe Selada
 * </ br>
 * <p> » Capítulo 8 ■ Lambdas e Interfaces Funcionais
 * <p> » » Codificando Interfaces Funcionais
 * <p> » » » Definindo uma Interface Funcional
 * </ br>
 *
 * <p>Escute o áudio explicativo do propósito da questão na Evidência de Estudo: [TRABALHO EM PROGRESSO]
 */
public final class Tiger implements Sprint {
    public void sprint(int speed) {
        System.out.println("Animal is sprinting fast! " + speed);
    }
}

//public final class Tiger extends Mammal {}  // DOES NOT COMPILE