package br.com.concurrency;

import java.util.concurrent.*;
/**
 * <p>Código presente no Ebook: <a href="https://a.co/d/0alQOByp" >OCP Oracle® Certified Professional Java® SE 21 Developer</a>
 * <p> » Capítulo 13 ■ Concorrência
 * <p> » » Escrevendo Código Thread-Safe
 * </ br>
 *
 * <p>Escute o áudio explicativo do propósito da questão na Evidência de Estudo: [TRABALHO EM PROGRESSO]
 * <p>NOTA: Versão 1 com o processamento de múltiplas threads lendo e escrevendo a variável `sheepCount` não atómica
 *
 */
public class SheepManagerV1 {
    private int sheepCount = 0;
    private void incrementAndReport() {
        System.out.print((++sheepCount) + " ");
    }
    public static void main(String[] args) {
        try (var service = Executors.newFixedThreadPool(20)) {
            SheepManagerV1 manager = new SheepManagerV1();
            for (int i = 0; i < 10; i++)
                service.submit(() -> manager.incrementAndReport());
        } } }
