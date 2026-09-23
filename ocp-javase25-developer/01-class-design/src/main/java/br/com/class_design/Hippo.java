package br.com.class_design;
/**
 * <p>Código presente no Ebook: <a href="https://a.co/d/0alQOByp" >OCP Oracle® Certified Professional Java® SE 21 Developer</a>
 * <p> Capítulo 6 ■ Projeto de Classes
 * <p> » » Inicializando Objetos
 * <p> » » » Inicializar Classe X
 *
 * <p> » » Criando Classes Abstratas
 * <p> » » » Criando uma Classe Concreta
 * </ br>
 *
 * <p>Escute o áudio explicativo do propósito da questão na Evidência de Estudo: [TRABALHO EM PROGRESSO]
 */
public class Hippo extends Animal {
    public static void main(String[] grass) {
        System.out.print("C");
        new Hippo();
        new Hippo();
        new Hippo();
    }
    static { System.out.print("B"); }

    @Override
    public String getName() {
        return "Hippo-B";
    }
}
