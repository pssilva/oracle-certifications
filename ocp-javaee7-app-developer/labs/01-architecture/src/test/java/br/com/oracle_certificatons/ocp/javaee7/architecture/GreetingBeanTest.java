package br.com.oracle_certificatons.ocp.javaee7.architecture;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class GreetingBeanTest {

    private final GreetingBean bean = new GreetingBean();

    @Test
    void deveCumprimentarPeloNome() {
        assertEquals("Olá, Ana!", bean.greet(" Ana "));
    }

    @Test
    void deveUsarNomePadraoQuandoVazio() {
        assertEquals("Olá, Java EE 7!", bean.greet(null));
        assertEquals("Olá, Java EE 7!", bean.greet("  "));
    }
}
