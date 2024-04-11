package PracticeLowLevelDesign.FoodOrderandDelivery;

import java.util.ArrayList;

public class Customer {
    private String name;
    private String address;
    private ArrayList<Order> orders;

    public Customer(String name, String address) {
        this.name = name;
        this.address = address;
        this.orders = new ArrayList<>();
    }

    // You'll implement methods related to placing and tracking orders
    // Methods to be implemented: placeOrder(), trackOrder()
    public void placeOrder(Order order, Restaurant restaurant){
        orders.add(order);
        restaurant.receiveOrder(order);
    }
    public void trackOrder(Order order){
       if(order.isDelivered()){
            System.out.println("Order is delivered");
       }
       else{
            System.out.println("The order is pending");
       }
    }
    
}