package br.com.oracle_certificatons.ocp.javaee7.cdi;

public class OrderPlaced {

    private final double total;

    public OrderPlaced(double total) {
        this.total = total;
    }

    public double getTotal() {
        return total;
    }
}
