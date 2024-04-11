package PracticeLowLevelDesign.Product;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Product> products;

    public ShoppingCart() {
        this.products = new ArrayList<>();
    }

    // Method to add a product to the shopping cart
    public void addProduct(Product product) {
        products.add(product);
    }

    // Method to remove a product from the shopping cart
    public void removeProduct(Product product) {
        products.remove(product);
    }

    // Method to perform checkout (calculate total price, clear cart, etc.)
    public void checkout() {
        // Add logic for checkout here (e.g., calculate total price, clear cart, etc.)
        // This method will depend on your specific requirements
        double totalPrice = 0;
        for (Product product : products) {
            totalPrice += product.calculateTotalPrice();
        }
        System.out.println("The total price is " + totalPrice);
    }
}
