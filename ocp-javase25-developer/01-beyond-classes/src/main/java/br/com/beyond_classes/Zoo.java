package br.com.beyond_classes;
/**
 * <p>Código presente no Ebook: <a href="https://a.co/d/0alQOByp" >OCP Oracle® Certified Professional Java® SE 21 Developer</a>
 * <p> » Capítulo 7 ■ Além das Classes
 * <p> » » Encapsulando Dados com Registros
 * <p> » » » Usando *Pattern Matching* com *Records*
 * </ br>
 *
 * <p>Escute o áudio explicativo do propósito da questão na Evidência de Estudo: [TRABALHO EM PROGRESSO]
 */
public class Zoo  {

    public static void main(String[] args) {

      Object animal = new Monkey("George", 3);

        if(animal instanceof Monkey(String name, int myAge)) {
            System.out.println("Hello " + name);
            System.out.println("Your age is " + myAge);
          }
    }
}
