package br.com.concurrency;

/**
 * <p>Código presente no Ebook: <a href="https://a.co/d/0alQOByp" >OCP Oracle® Certified Professional Java® SE 21 Developer</a>
 * <p> » Capítulo 13 ■ Concorrência
 * <p> » » Criando uma Thread
 * <p> » » » Trabalhando com Threads Daemon
 * </ br>
 *
 * <p>Escute o áudio explicativo com os conceitos envolvidos na Evidência de Estudo: [TRABALHO EM PROGRESSO]
 *
 */
public class Zoo {
    public static void pause() {               // Defines the thread task
        try {
            Thread.sleep(10_000);        // Wait for 10 seconds
        } catch (InterruptedException e) {}
        System.out.println("Thread finished!");
    }

    public static void main(String[] unused) {
        var job = Thread.ofPlatform().daemon(true).start(Zoo::pause);
        //var job = Thread.ofPlatform().start(Zoo::pause);
        System.out.println("Main method finished!");
    }

}
