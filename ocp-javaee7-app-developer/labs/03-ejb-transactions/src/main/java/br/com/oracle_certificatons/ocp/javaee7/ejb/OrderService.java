package br.com.oracle_certificatons.ocp.javaee7.ejb;

import java.util.concurrent.Future;
import javax.ejb.AsyncResult;
import javax.ejb.Asynchronous;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.interceptor.Interceptors;

@Stateless
@Interceptors(LoggingInterceptor.class)
public class OrderService {

    static final int STOCK = 10;

    @EJB
    AuditService audit;

    /** CMT com o atributo padrão (REQUIRED), declarado só para ficar explícito. */
    @TransactionAttribute(TransactionAttributeType.REQUIRED)
    public int placeOrder(String product, int quantity) throws InsufficientStockException {
        if (quantity <= 0) {
            throw new IllegalArgumentException("Quantidade deve ser positiva"); // exceção de sistema
        }
        if (audit != null) {
            audit.log("pedido " + product + " x" + quantity);
        }
        if (quantity > STOCK) {
            throw new InsufficientStockException("Estoque insuficiente para " + product);
        }
        return STOCK - quantity;
    }

    @Asynchronous
    public Future<Integer> countPendingOrders() {
        return new AsyncResult<>(42);
    }
}
