package br.com.oracle_certificatons.ocp.javaee7.cdi;

import java.util.logging.Logger;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.Observes;
import javax.inject.Inject;

@ApplicationScoped
public class OrderAuditor {

    @Inject
    Logger logger;

    void onOrder(@Observes OrderPlaced event) {
        logger.info("Pedido observado: " + event.getTotal());
    }
}
