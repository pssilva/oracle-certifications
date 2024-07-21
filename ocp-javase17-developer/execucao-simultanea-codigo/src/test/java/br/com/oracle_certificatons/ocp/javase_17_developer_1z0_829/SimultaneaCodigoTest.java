package br.com.oracle_certificatons.ocp.javase_17_developer_1z0_829;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SimultaneaCodigoTest {

  SimultaneaCodigo simultaneaCodigo = new SimultaneaCodigo();

  @Test
  @Description("")
  void testCriandoThread() {
    assertInstanceOf(Thread.class,simultaneaCodigo.criandoThread());
  }

}
