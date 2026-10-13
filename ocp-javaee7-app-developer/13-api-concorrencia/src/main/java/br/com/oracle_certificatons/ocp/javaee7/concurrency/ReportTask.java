package br.com.oracle_certificatons.ocp.javaee7.concurrency;

import java.util.concurrent.Callable;

public class ReportTask implements Callable<String> {

    private final String name;

    public ReportTask(String name) {
        this.name = name;
    }

    @Override
    public String call() {
        return "Relatório " + name + " gerado na thread " + Thread.currentThread().getName();
    }
}
