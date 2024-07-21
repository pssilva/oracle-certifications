package br.com.oracle_certificatons.ocp.javase_17_developer_1z0_829;

import static org.junit.jupiter.api.Assertions.*;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

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
    assertInstanceOf(Runnable.class,simultaneaCodigo.criandoThreadComRunneble());
  }

  @Test
  @Description("Crie Thread de trabalho usando Callable")
  void testCriandoThreadComCallable() throws InterruptedException, ExecutionException {
    assertInstanceOf(Callable.class,simultaneaCodigo.criandoThreadComCallable());
  }

}
