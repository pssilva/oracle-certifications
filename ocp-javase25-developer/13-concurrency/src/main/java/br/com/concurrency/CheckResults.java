package br.com.concurrency;

import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/**
 * <p>Código presente no Ebook: <a href="https://a.co/d/0alQOByp" >OCP Oracle® Certified Professional Java® SE 21 Developer</a>
 * <p> » Capítulo 13 ■ Concorrência
 * <p> » » Criando Threads com a API de Concorrência
 * <p> » » » Aguardando Resultados
 * </ br>
 *
 * <p>Escute o áudio explicativo com os conceitos envolvidos na Evidência de Estudo: [TRABALHO EM PROGRESSO]
 *
 */
public class CheckResults {
    private static int counter = 0;
    public static void main(String[] unused) throws Exception {
        try (var service = Executors.newSingleThreadExecutor()) {
            Future<?> result = service.submit(() -> {
                for (int i = 0; i < 1_000_000; i++) counter++;
            });
            result.get(10, TimeUnit.SECONDS);  // Returns null for Runnable
            System.out.println("Reached!");
        } catch (TimeoutException e) {
            System.out.println("Not reached in time");
       }
    }
}
