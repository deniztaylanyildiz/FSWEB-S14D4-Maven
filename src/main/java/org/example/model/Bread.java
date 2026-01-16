package org.example.model;

public class Bread extends ProductForSale{
    private double carbonValue;
    public Bread(String type, int price, String description,double carbonValue) {
        super(type, price, description);
        this.carbonValue=carbonValue;
    }

    public Bread(String type, int price, String description) {
        super(type, price, description);
    }

    @Override
    void showDetails() {
        System.out.println("The type is"+getType());
        System.out.println("The price is"+getPrice());
        System.out.println("The description is"+getDescription());
        System.out.println("The cacaoValue is"+carbonValue);
    }
}
