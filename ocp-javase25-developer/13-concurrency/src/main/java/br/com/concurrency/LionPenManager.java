package br.com.concurrency;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.Executors;
/**
 * <p>Código presente no Ebook: <a href="https://a.co/d/0alQOByp" >OCP Oracle® Certified Professional Java® SE 21 Developer</a>
 * <p> » Capítulo 13 ■ Concorrência
 * <p> » » Escrevendo Código Thread-Safe
 * <p> » » » Orquestrando Tarefas com um CyclicBarrier
 * </ br>
 *
 * <p>Escute o áudio explicativo do propósito da questão na Evidência de Estudo: [TRABALHO EM PROGRESSO]
 *
 */
public class LionPenManager {

    private void removeLions() { System.out.println("Removing lions");   }
    private void cleanPen()    { System.out.println("Cleaning the pen"); }
    private void addLions()    { System.out.println("Adding lions");     }
    public void performTask() {
        removeLions();
        cleanPen();
        addLions();
    }
    public static void main(String[] args) {
        try (var service = Executors.newFixedThreadPool(4)) {
            var manager = new LionPenManager();
            for (int i = 0; i < 4; i++)
                service.submit(() -> manager.performTask());
        }
    }
}

class LionPenManagerV2 {
    private void removeLions() { System.out.println("Removing lions");   }
    private void cleanPen()    { System.out.println("Cleaning the pen"); }
    private void addLions()    { System.out.println("Adding lions");     }
    public void performTask(CyclicBarrier c1, CyclicBarrier c2) {
        try {
            removeLions();
            c1.await();
            cleanPen();
            c2.await();
            addLions();
        } catch (InterruptedException | BrokenBarrierException e) {
            // Handle checked exceptions here
        }
    }
    public static void main(String[] args) {
        try (var service = Executors.newFixedThreadPool(4)) {
            var manager = new LionPenManagerV2();
            var c1 = new CyclicBarrier(4);
            var c2 = new CyclicBarrier(4,
                    () -> System.out.println("*** Pen Cleaned!"));
            for (int i = 0; i < 4; i++)
                service.submit(() -> manager.performTask(c1, c2));
        }
    }
}
