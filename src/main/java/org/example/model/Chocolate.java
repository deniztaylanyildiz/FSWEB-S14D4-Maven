package org.example.model;

public class Chocolate extends ProductForSale{

    private double cacaoValue;
    public Chocolate(String type, int price, String description,double cacaoValue) {
        super(type, price, description);
        this.cacaoValue=cacaoValue;
    }
    public Chocolate(String type, int price, String description) {
        super(type, price, description);
    }

    @Override
    void showDetails() {
        System.out.println("The type is"+getType());
        System.out.println("The price is"+getPrice());
        System.out.println("The description is"+getDescription());
        System.out.println("The cacaoValue is"+cacaoValue);
    }
}
