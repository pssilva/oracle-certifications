package br.com.beyond_classes;
/**
 * <p>Código presente no Ebook: <a href="https://a.co/d/0alQOByp" >OCP Oracle® Certified Professional Java® SE 21 Developer</a>
 * <p> » Capítulo 7 ■ Além das Classes
 * <p> » » Criando Classes Aninhadas
 * <p> » » » Declarando uma Classe Interna (*Inner Class*)
 * </ br>
 *
 * <p>Escute o áudio explicativo do propósito da questão na Evidência de Estudo: [TRABALHO EM PROGRESSO]
 */
public class Home {

    private String greeting = "Hi";  // Outer class instance variable

    protected class Room {           // Inner class declaration
        public int repeat = 3;
        public void enter() {
            for (int i = 0; i < repeat; i++) greet(greeting);
        }
        private static void greet(String message) {
            System.out.println(message);
        }
    }

    public void enterRoom() {        // Instance method in outer class
        var room = new Room();        // Create the inner class instance
        room.enter();
    }
    public static void main(String[] args) {
        var home = new Home();        // Create the outer class instance
        home.enterRoom();
    }
}
