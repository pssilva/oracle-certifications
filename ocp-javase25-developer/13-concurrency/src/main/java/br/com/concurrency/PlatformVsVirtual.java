package br.com.concurrency;

import java.util.stream.Stream;

/**
 * <p>Código presente no Ebook: <a href="https://a.co/d/0alQOByp" >OCP Oracle® Certified Professional Java® SE 21 Developer</a>
 * <p> » Capítulo 13 ■ Concorrência
 * <p> » » Introdução a Threads
 * <p> » » » Cenário do Mundo Real
 * <p> » » » » Threads de Plataforma vs. Threads Virtuais
 * </ br>
 *
 * <p>Escute o áudio explicativo do propósito da questão na Evidência de Estudo: [TRABALHO EM PROGRESSO]
 *
 */
public class PlatformVsVirtual {
    static void waitUp() {
        try {
            Thread.sleep(1_000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public static void main(String[] args) throws InterruptedException {

        Bank bank = new Bank();

        var threads = Stream.generate(() -> Thread.ofPlatform()
                        .unstarted(PlatformVsVirtual::waitUp))
                .limit(1_000_000)
                .toList();
        threads.forEach(Thread::start);
        for (var t : threads)
            t.join();


    }
}
