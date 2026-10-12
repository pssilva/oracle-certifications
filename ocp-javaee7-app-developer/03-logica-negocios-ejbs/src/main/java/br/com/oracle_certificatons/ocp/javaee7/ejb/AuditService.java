package br.com.oracle_certificatons.ocp.javaee7.ejb;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;

@Stateless
public class AuditService {

    /** Grava em transação própria: o log sobrevive ao rollback de quem chamou. */
    @TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
    public void log(String message) {
        System.out.println("[AUDIT] " + message);
    }
}
