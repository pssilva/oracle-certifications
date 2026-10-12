package br.com.oracle_certificatons.ocp.javaee7.cdi;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;

import javax.enterprise.event.Event;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

/** Sem container CDI: injeção manual, como um teste unitário de bean. */
@ExtendWith(MockitoExtension.class)
class CheckoutServiceTest {

    @Mock
    Event<OrderPlaced> event;

    @Test
    void aplicaDescontoPremiumEImpostoEDisparaEvento() {
        CheckoutService service = new CheckoutService();
        service.discount = new PremiumDiscount();
        service.taxRate = 0.10;
        service.orderPlaced = event;

        assertEquals(88.0, service.checkout(100.0), 0.0001);
        verify(event).fire(any(OrderPlaced.class));
    }
}
