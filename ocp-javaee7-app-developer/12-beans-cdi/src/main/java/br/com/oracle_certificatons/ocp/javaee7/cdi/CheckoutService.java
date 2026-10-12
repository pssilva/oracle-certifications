package br.com.oracle_certificatons.ocp.javaee7.cdi;

import javax.enterprise.event.Event;
import javax.inject.Inject;

@Service
public class CheckoutService {

    @Inject
    @Premium
    DiscountPolicy discount;

    @Inject
    Event<OrderPlaced> orderPlaced;

    @Inject
    @TaxRate
    double taxRate;

    public double checkout(double price) {
        double total = discount.apply(price) * (1 + taxRate);
        orderPlaced.fire(new OrderPlaced(total));
        return total;
    }
}
