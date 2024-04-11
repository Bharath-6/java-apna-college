package PracticeLowLevelDesign.FoodOrderandDelivery;

import java.util.List;


public class Order {
    private int orderId;
    private List<FoodItem> items;
    private boolean delivered;

    public Order(int orderId, List<FoodItem> items) {
        this.orderId = orderId;
        this.items = items;
        this.delivered = false;
    }

    public int getOrderId() {
        return orderId;
    }

    public boolean isDelivered() {
        return delivered;
    }

    public void markAsDelivered() {
        delivered = true;
    }
    public void markAsPrepared(){
        System.out.println("Prepared");
    }
}


