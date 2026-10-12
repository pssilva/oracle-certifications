package br.com.oracle_certificatons.ocp.javaee7.cdi;

import java.util.logging.Logger;
import javax.enterprise.inject.Disposes;
import javax.enterprise.inject.Produces;
import javax.enterprise.context.Dependent;
import javax.enterprise.inject.spi.InjectionPoint;

/** @Dependent: sem anotação definidora o bean não é descoberto no modo "annotated". */
@Dependent
public class Resources {

    @Produces
    @TaxRate
    double taxRate() {
        return 0.10;
    }

    /** Producer com InjectionPoint: um logger com o nome da classe que injeta. */
    @Produces
    Logger logger(InjectionPoint ip) {
        return Logger.getLogger(ip.getMember().getDeclaringClass().getName());
    }

    /** Disposer: chamado quando o bean produzido sai de escopo. */
    void close(@Disposes Logger logger) {
        logger.fine("logger descartado");
    }
}
