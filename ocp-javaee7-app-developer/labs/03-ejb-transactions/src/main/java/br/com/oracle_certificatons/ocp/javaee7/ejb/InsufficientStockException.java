package br.com.oracle_certificatons.ocp.javaee7.ejb;

import javax.ejb.ApplicationException;

/** Exceção de aplicação: por padrão NÃO faria rollback; aqui forçamos com rollback = true. */
@ApplicationException(rollback = true)
public class InsufficientStockException extends Exception {

    public InsufficientStockException(String message) {
        super(message);
    }
}
