package br.com.class_design;
/**
 * <p>Código presente no Ebook: <a href="https://a.co/d/0alQOByp" >OCP Oracle® Certified Professional Java® SE 21 Developer</a>
 * <p> Capítulo 6 ■ Projeto de Classes
 * <p> » » Inicializando Objetos
 * <p> » » » Inicializando Instâncias
 * <p> » » » » Inicializar Instância de X
 * </ br>
 *
 * <p>Escute o áudio explicativo do propósito da questão na Evidência de Estudo: [TRABALHO EM PROGRESSO]
 */
public class ZooTickets {
    private String name = "BestZoo";
     { System.out.print(name + "-"); }
     private static int COUNT = 0;
     static { System.out.print(COUNT + "-"); }
     static { COUNT += 10; System.out.print(COUNT + "-"); }

    public ZooTickets() {
        System.out.print("z-");
    }

    public static void main(String ... patrons) {
         new ZooTickets();
    }
}
