package br.com.oracle_certificatons.ocp.javaee7.cdi;

import javax.enterprise.context.ApplicationScoped;

/** Sem qualifier explícito: recebe @Default (e @Any). */
@ApplicationScoped
public class StandardDiscount implements DiscountPolicy {

    @Override
    public double apply(double price) {
        return price * 0.95;
    }
}
