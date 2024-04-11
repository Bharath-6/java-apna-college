package PracticeLowLevelDesign.FoodOrderandDelivery;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Create a restaurant and add some food items to its menu
        Restaurant restaurant = new Restaurant();
        restaurant.addToMenu(new FoodItem("Pizza", 10.99));
        restaurant.addToMenu(new FoodItem("Burger", 8.99));
        restaurant.addToMenu(new FoodItem("Pasta", 12.99));

        // Create a customer
        Customer customer = new Customer("John Doe", "123 Main St");

        // Place an order
        ArrayList<FoodItem> orderItems = new ArrayList<>();
        orderItems.add(restaurant.getMenu().get(0)); // Adding Pizza to the order
        Order order = new Order(1, orderItems);
        customer.placeOrder(order, restaurant);

        // Prepare the order
        restaurant.prepareOrder(order);

        // Create a delivery person
        DeliveryPerson deliveryPerson = new DeliveryPerson("Mike", 101);

        // Assign the delivery person to the order
        restaurant.assignDeliveryPerson(order, deliveryPerson);

        // Deliver the order
        deliveryPerson.deliverOrder(order);

        // Track order status
        customer.trackOrder(order);
    }
}
