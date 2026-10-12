package br.com.class_design;
/**
 * <p>Código presente no Ebook: <a href="https://a.co/d/0alQOByp" >OCP Oracle® Certified Professional Java® SE 21 Developer</a>
 * <p> Capítulo 6 ■ Projeto de Classes
 * <p> » » Criando Classes
 * <p> » » » Declarando Construtores
 * <p> » » » Criando um Construtor
 * </ br>
 *
 * <p>Escute o áudio explicativo do propósito da questão na Evidência de Estudo: [TRABALHO EM PROGRESSO]
 */
public class Cuttlefish {

     private String name = "swimmy";
      { System.out.println(name); }
     private static int COUNT = 0;
     static { System.out.println(COUNT); }
     { COUNT++; System.out.println(COUNT); }

     public Cuttlefish() {
        System.out.println("Constructor");
    }

    public static void main(String[] args) {
       System.out.println("Ready");
       new Cuttlefish();
    }
}
