package br.com.oracle_certificatons.ocp.javase_17_developer_1z0_829;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

import static org.junit.jupiter.api.Assertions.assertInstanceOf;
import org.junit.jupiter.api.Test;

class SimultaneaCodigoTest {

  SimultaneaCodigo simultaneaCodigo = new SimultaneaCodigo();

  @Test
  @Description("Crie Thread de trabalho comum com Expressão Lambda")
  void testCriandoThread() {
    assertInstanceOf(Thread.class,simultaneaCodigo.criandoThread());
  }

  @Test
  @Description("Crie Thread de trabalho usando Runnable")
  void testCriandoThreadComRunnable() {
    assertInstanceOf(Runnable.class,simultaneaCodigo.criandoThreadComRunnable());
  }

  @Test
  @Description("Crie Thread de trabalho usando Callable")
  void testCriandoThreadComCallable() throws InterruptedException, ExecutionException {
    assertInstanceOf(Callable.class,simultaneaCodigo.criandoThreadComCallable());
  }

  @Test
  @Description("Gerencie o ciclo de vida do Thread")
  void testGerencieCicloVidaThread() {
    assertInstanceOf(Integer.class,simultaneaCodigo.gerencieCicloVidaThread());
  }

  @Test
  @Description("Interromper Thread")
  void testInterronperThread() {
    assertInstanceOf(Integer.class,simultaneaCodigo.interronperThread());
  }

  @Test
  @Description("Criando Threads Com a API de Simultaneidade")
  void testCriandoThreadAPISimultaneidade(){
    assertInstanceOf(ExecutorService.class,simultaneaCodigo.criandoThreadAPISimultaneidade());
  }

  @Test
  @Description("Desligando Um Executor de Thread")
  void testDesligandoExecutorService(){
    assertInstanceOf(Future.class,simultaneaCodigo.desligandoExecutorService(5));
  }

  @Test
  @Description("Aguardando Resultados")
  void aguardandoresultadoFuture(){
    assertInstanceOf(Future.class,simultaneaCodigo.aguardandoresultadoFuture());
  }

  

}
