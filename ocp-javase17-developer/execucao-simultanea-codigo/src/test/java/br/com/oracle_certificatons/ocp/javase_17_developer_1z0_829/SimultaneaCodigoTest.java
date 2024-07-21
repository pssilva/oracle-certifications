package br.com.oracle_certificatons.ocp.javase_17_developer_1z0_829;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SimultaneaCodigoTest {

  SimultaneaCodigo simultaneaCodigo = new SimultaneaCodigo();

  @Test
  void OneTest() {
      assert(simultaneaCodigo.getOne() == 1);
      assertEquals(1, simultaneaCodigo.getOne());
  }

}
