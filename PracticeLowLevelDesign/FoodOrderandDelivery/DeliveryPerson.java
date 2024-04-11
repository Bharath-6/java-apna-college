package PracticeLowLevelDesign.FoodOrderandDelivery;

import java.util.ArrayList;
import java.util.List;

public class DeliveryPerson {
    private String name;
    private int id;
    private List<Order> assignedOrders;

    public DeliveryPerson(String name, int id) {
        this.name = name;
        this.id = id;
        this.assignedOrders = new ArrayList<>();
    }

    public void deliverOrder(Order order) {
        order.markAsDelivered();
        assignedOrders.remove(order);
        System.out.println("Order " + order.getOrderId() + " has been delivered by " + name);
    }
    public void addOrder(Order order){
        assignedOrders.add(order);
    }
}

