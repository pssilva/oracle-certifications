package br.com.concurrency;

import java.util.concurrent.Executors;

/**
 * <p>Código presente no Ebook: <a href="https://a.co/d/0alQOByp" >OCP Oracle® Certified Professional Java® SE 21 Developer</a>
 * <p> » Capítulo 13 ■ Concorrência
 * <p> » » Criando Threads com a API de Concorrência
 * <p> » » » Encerrando um Executor de Threads
 * </ br>
 *
 * <p>Escute o áudio explicativo com os conceitos envolvidos na Evidência de Estudo: [TRABALHO EM PROGRESSO]
 *
 */
public class MissingClose {
    public static void main(String[] args) {
        var service = Executors.newSingleThreadExecutor();
        service.submit(() -> System.out.println("Never stops"));
    }
}
