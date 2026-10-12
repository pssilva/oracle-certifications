package br.com.concurrency;

import java.util.concurrent.locks.*;
import java.util.stream.*;

/**
 * <p>Código presente no Ebook: <a href="https://a.co/d/0alQOByp" >OCP Oracle® Certified Professional Java® SE 21 Developer</a>
 * <p>Capítulo 13 ■ Concorrência > Questões de Revisão:
 * <p> QUESTÃO: 2. Dado que a soma dos números de 1 (inclusive) a 10 (exclusive) é 45,
 * quais são os possíveis resultados da execução do seguinte programa?
 * (Escolha todas as que se aplicam.)
 *
 * </ br>
 *
 * <p>Escute o áudio explicativo do propósito da questão na Evidência de Estudo: [TRABALHO EM PROGRESSO]
 *
 */
public class Bank {
    private final Lock vault = new ReentrantLock();
    private int total = 0;

    public void deposit(int value) {
        try{
            System.out.println("  " + value);
            vault.tryLock();
            total += value;

        } finally {
            vault.unlock();
        }
    }

    public static void main(String[] args){
        var bank = new Bank();
        IntStream.range(1, 10).parallel()
            .forEach(bank::deposit);
        System.out.println(bank.total);
    }
}
