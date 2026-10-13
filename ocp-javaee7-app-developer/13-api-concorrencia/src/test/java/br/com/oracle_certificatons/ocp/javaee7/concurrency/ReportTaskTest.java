package br.com.oracle_certificatons.ocp.javaee7.concurrency;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.junit.jupiter.api.Test;

/** Fora do container um ExecutorService comum faz o papel do ManagedExecutorService. */
class ReportTaskTest {

    @Test
    void executaEmOutraThread() throws Exception {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        try {
            String result = executor.submit(new ReportTask("vendas")).get();
            assertTrue(result.startsWith("Relatório vendas"));
        } finally {
            executor.shutdown();
        }
    }
}
