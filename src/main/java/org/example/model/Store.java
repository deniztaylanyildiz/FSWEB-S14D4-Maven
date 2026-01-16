package org.example.model;

public class Store {
    public static void main(String[] args) {

        ProductForSale[] products=new ProductForSale[3];
        products[0] = new Chocolate("Bitter", 25, "70% Cocoa dark chocolate",12);
        products[1] = new Coke("Classic", 30, "Refreshing cold drink", 0.5);
        products[2] = new Bread("Whole Wheat", 12, "Healthy whole grain bread", 0.12);
        listProducts(products);
    }

    public static void listProducts(ProductForSale[] products) {
        if (products != null) {
            for (ProductForSale product : products) {
                if (product != null) {
                    product.showDetails();
                    System.out.println("-------------------------");
                }
            }
        }
    }
}