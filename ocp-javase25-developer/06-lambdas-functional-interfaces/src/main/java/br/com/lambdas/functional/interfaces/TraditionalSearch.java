package br.com.lambdas.functional.interfaces;

import java.util.ArrayList;
import java.util.List;
/**
 * <p>Código presente no Ebook: <a href="https://a.co/d/0alQOByp" >OCP Oracle® Certified Professional Java® SE 21 Developer</a>
 * <p> » Capítulo 8 ■ Lambdas e Interfaces Funcionais
 * <p> » » Escrevendo Lambdas Simples
 * <p> » » » Analisando um Exemplo de Lambda
 * </ br>
 *
 * <p>Escute o áudio explicativo do propósito da questão na Evidência de Estudo: [TRABALHO EM PROGRESSO]
 */
public class TraditionalSearch {

     public static void main(String[] args) {

        // list of animals
        var animals = new ArrayList<Animal>();
        animals.add(new Animal("fish", false, true));
        animals.add(new Animal("kangaroo", true, false));
        animals.add(new Animal("rabbit", true, false));
        animals.add(new Animal("turtle", false, true));

        // pass class that does check
        print(animals, new CheckIfHopper());
    }

    private static void print(List<Animal> animals, CheckTrait checker) {
       for (Animal animal : animals) {

        // General check
         if (checker.test(animal))
             System.out.print(animal + " ");
       }
       System.out.println();
    }
}
