package br.com.oracle_certificatons.ocp.javaee7.cdi;

import javax.enterprise.context.ApplicationScoped;

@Premium
@ApplicationScoped
public class PremiumDiscount implements DiscountPolicy {

    @Override
    public double apply(double price) {
        return price * 0.80;
    }
}
