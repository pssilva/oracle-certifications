package br.com.oracle_certificatons.ocp.javaee7.servlets;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class VisitCounterTest {

    @Test
    void primeiraVisitaSemCookie() {
        assertEquals(1, VisitCounter.next((String) null));
    }

    @Test
    void incrementaValorExistente() {
        assertEquals(4, VisitCounter.next("3"));
    }

    @Test
    void valorCorrompidoReinicia() {
        assertEquals(1, VisitCounter.next("abc"));
    }
}
