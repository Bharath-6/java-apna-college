package PracticeLowLevelDesign.Product;

public class Product {
    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    // You'll code the calculateTotalPrice method here
    // calculateTotalPrice()
    public double calculateTotalPrice(){
        return price;
    }
}
