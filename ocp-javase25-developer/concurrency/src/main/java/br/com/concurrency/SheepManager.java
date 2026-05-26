package br.com.concurrency;

import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * <p>Código presente no Ebook: <a href="https://a.co/d/0alQOByp" >OCP Oracle® Certified Professional Java® SE 21 Developer</a>
 * <p> » Capítulo 13 ■ Concorrência
 * <p> » » Escrevendo Código Thread-Safe
 * </ br>
 *
 * <p>Escute o áudio explicativo do propósito da questão na Evidência de Estudo: [TRABALHO EM PROGRESSO]
 *
 */
public class SheepManager {
    private final Object herd = new Object();
    private int sheepCount = 0;
    private AtomicInteger aSheepCount = new AtomicInteger(0);
    private void incrementAndReport() {
        synchronized(this) {
            System.out.print((++sheepCount) + " ");
        }
    }
    private void incrementAndReportAtomic() {
        System.out.print((aSheepCount.incrementAndGet()) + " ");
    }

    private void incrementAndReportEmOutroobjeto(){
        synchronized(herd) {
            System.out.print((++sheepCount) + " ");
        }
    }

    /**
     * <p>Código presente no Ebook: <a href="https://a.co/d/0alQOByp" >OCP Oracle® Certified Professional Java® SE 21 Developer</a>
     * <p> » Capítulo 13 ■ Concorrência
     * <p> » » Escrevendo Código Thread-Safe
     * <p> » » » Sincronizando Métodos
     * <p> Equivalente ao método {@link singSynch}
     */
    void sing() {
        synchronized(this) {
            System.out.print("La la la!");
        }
    }

    /**
     * <p>Código presente no Ebook: <a href="https://a.co/d/0alQOByp" >OCP Oracle® Certified Professional Java® SE 21 Developer</a>
     * <p> » Capítulo 13 ■ Concorrência
     * <p> » » Escrevendo Código Thread-Safe
     * <p> » » » Sincronizando Métodos
     * <p> Equivalente ao método {@link sing}
     * </ br>
     *
     *
     */
    synchronized void singSynch() {
        System.out.print("La la la!");
    }

    /**
     * <p>Código presente no Ebook: <a href="https://a.co/d/0alQOByp" >OCP Oracle® Certified Professional Java® SE 21 Developer</a>
     * <p> » Capítulo 13 ■ Concorrência
     * <p> » » Escrevendo Código Thread-Safe
     * <p> » » » Sincronizando Métodos
     * <p> Equivalente ao método {@link danceSynch}
     * </ br>
     *
     */
    static void dance() {
        synchronized(SheepManager.class) {
            System.out.print("Time to dance!");
        }
    }
    static synchronized void danceSynch() {
        System.out.print("Time to dance!");
    }

    /**
     * <p>Código presente no Ebook: <a href="https://a.co/d/0alQOByp" >OCP Oracle® Certified Professional Java® SE 21 Developer</a>
     * <p> » Capítulo 13 ■ Concorrência
     * <p> » » Entendendo o Framework de Locks
     * <p> » » » Aplicando um ReentrantLock
     * </ br>
     *
     */
    void reemtrantlock(){
        // Implementation #1 with a synchronized block
        var object = new Object();
        synchronized(object) {
            // Protected code
        }

        // Implementation #2 with a Lock
        var myLock = new ReentrantLock();
        try {
            myLock.lock();
            // Protected code
        } finally {
            myLock.unlock();
        }
    }

    /**
     * <p>Código presente no Ebook: <a href="https://a.co/d/0alQOByp" >OCP Oracle® Certified Professional Java® SE 21 Developer</a>
     * <p> » Capítulo 13 ■ Concorrência
     * <p> » » Entendendo o Framework de Locks
     * <p> » » » Tentando Adquirir um Lock
     * </ br>
     *
     */
    static void printHello(Lock myLock) {
        try {
            myLock.lock();
            System.out.println("Hello");
        } finally {
            myLock.unlock();
        }
    }

    /**
     * <p>Código presente no Ebook: <a href="https://a.co/d/0alQOByp" >OCP Oracle® Certified Professional Java® SE 21 Developer</a>
     * <p> » Capítulo 13 ■ Concorrência
     * <p> » » Entendendo o Framework de Locks
     * <p> » » » Tentando Adquirir um Lock
     * </ br>
     *
     */
    static void tryLock() {
        var myLock = new ReentrantLock();
        Thread.ofPlatform().start(() -> printHello(myLock));
        if (myLock.tryLock()) {
            try {
                System.out.println("Lock obtained, entering protected code");
            } finally {
                myLock.unlock();
            }
        } else {
            System.out.println("Unable to acquire lock, doing something else");
        }
    }


    public static void main(String[] args) {
        try (var service = Executors.newFixedThreadPool(20)) {
            SheepManager manager = new SheepManager();
            for (int i = 0; i < 10; i++){
                // service.submit(manager::incrementAndReport);
                // service.submit(manager::incrementAndReportEmOutroobjeto);
                synchronized(manager) {
                    service.submit(manager::incrementAndReport);
                }
            }
        }
    }




}
