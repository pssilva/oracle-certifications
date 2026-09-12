package br.com.concurrency;

import java.util.concurrent.Executors;

/**
 * <p>Código presente no Ebook: <a href="https://a.co/d/0alQOByp" >OCP Oracle® Certified Professional Java® SE 21 Developer</a>
 * <p> » Capítulo 13 ■ Concorrência
 * <p> » » Entendendo Liveness
 * <p> » » » Deadlock
 * </ br>
 *
 * <p>Escute o áudio explicativo com os conceitos envolvidos na Evidência de Estudo: [TRABALHO EM PROGRESSO]
 *
 */
public class Deadlock {
    public record Fox(String name) {
        public void eatAndDrink(Food food, Water water) {
            synchronized(food) {
                System.out.println(name() + " Got Food!");
                move();
                synchronized(water) {
                    System.out.println(name() + " Got Water!");
                }
            }
        }

        public void drinkAndEat(Food food, Water water) {
            synchronized(water) {
                System.out.println(name() + " Got Water!");
                move();
                synchronized(food) {
                    System.out.println(name() + " Got Food!");
                }
            }
        }

        public void move() {
            try { Thread.sleep(100); } catch (InterruptedException e) {}
        }

        public static void main(String[] args) {
            // Create participants and resources
            var foxy = new Fox("Foxy");
            var tails = new Fox("Tails");
            var food = new Food();
            var water = new Water();
            // Process data
            try (var service = Executors.newScheduledThreadPool(10)) {
                service.submit(() -> foxy.eatAndDrink(food,water));
                service.submit(() -> tails.drinkAndEat(food,water));
            }
        }
    }
}


class Food {}
class Water {}
