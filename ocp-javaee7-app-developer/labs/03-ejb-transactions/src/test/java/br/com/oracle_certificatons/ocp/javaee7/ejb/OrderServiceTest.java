package br.com.oracle_certificatons.ocp.javaee7.ejb;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

/** Testa só a regra de negócio; transação e interceptors exigem o container. */
class OrderServiceTest {

    private final OrderService service = new OrderService();

    @Test
    void devolveEstoqueRestante() throws Exception {
        assertEquals(7, service.placeOrder("livro", 3));
    }

    @Test
    void estoqueInsuficienteEExcecaoDeAplicacao() {
        assertThrows(InsufficientStockException.class, () -> service.placeOrder("livro", 11));
    }

    @Test
    void quantidadeInvalidaEExcecaoDeSistema() {
        assertThrows(IllegalArgumentException.class, () -> service.placeOrder("livro", 0));
    }
}
