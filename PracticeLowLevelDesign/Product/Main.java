package PracticeLowLevelDesign.Product;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("Laptop", 1000.0, 1);
        Product product2 = new Product("Headphones", 50.0, 2);

        ShoppingCart cart = new ShoppingCart();

        cart.addProduct(product1);
        cart.addProduct(product2);

        cart.checkout();
    }
}
