package org.example.model;

public class Coke extends ProductForSale{
    private double sugarValue;
    public Coke(String type, int price, String description,double sugarValue) {
        super(type, price, description);
        this.sugarValue=sugarValue;
    }
    public Coke(String type, int price, String description) {
        super(type, price, description);
    }

    @Override
    void showDetails() {
        System.out.println("The type is"+getType());
        System.out.println("The price is"+getPrice());
        System.out.println("The description is"+getDescription());
        System.out.println("The cacaoValue is"+sugarValue);
    }
}
