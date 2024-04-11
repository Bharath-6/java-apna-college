package PracticeLowLevelDesign.FoodOrderandDelivery;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Restaurant {
    private HashMap<Integer, Order> orders;
    private List<FoodItem> menu;

    public Restaurant() {
        this.orders = new HashMap<>();
        this.menu = new ArrayList<>();
    }

    public void receiveOrder(Order order) {
        orders.put(order.getOrderId(), order);
    }

    public void prepareOrder(Order order) {
        // Assume preparation logic here
        order.markAsPrepared();
    }

    public void assignDeliveryPerson(Order order, DeliveryPerson deliveryPerson) {
        deliveryPerson.addOrder(order);
    }

    public void addToMenu(FoodItem item) {
        menu.add(item);
    }

    public List<FoodItem> getMenu() {
        return menu;
    }
}
