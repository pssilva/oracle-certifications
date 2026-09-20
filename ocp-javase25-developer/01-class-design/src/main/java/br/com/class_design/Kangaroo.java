package br.com.class_design;

public class Kangaroo extends Marsupial {
    public double getAverageWeight() {
        return super.getAverageWeight()+20;
    }
    public static void main(String[] args) {
        System.out.println(new Marsupial().getAverageWeight());  // 50.0
        System.out.println(new Kangaroo().getAverageWeight());   // 70.0
    }
}