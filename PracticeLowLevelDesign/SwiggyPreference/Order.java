package SwiggyPreference;

import java.time.LocalDateTime;
import java.util.List;

import SwiggyInsta.Item;

public class Order {
    private String orderId;
    private List<Item> items;
    private double totalAmount;
    private LocalDateTime orderTime;
    private LocalDateTime scheduledDeliveryTime;
    private DeliveryStatus deliveryStatus; // New field for delivery status

    // Constructors, getters, and setters

    public String getOrderId(){
        return orderId;
    }
    public List<Item> getItems() {
        return items;
    }
    public void setItems(List<Item> items) {
        this.items = items;
    }
    public double getTotalAmount() {
        return totalAmount;
    }
    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }
    public LocalDateTime getOrderTime() {
        return orderTime;
    }
    public void setOrderTime(LocalDateTime orderTime) {
        this.orderTime = orderTime;
    }
    public LocalDateTime getScheduledDeliveryTime() {
        return scheduledDeliveryTime;
    }
    public void setScheduledDeliveryTime(LocalDateTime scheduledDeliveryTime) {
        this.scheduledDeliveryTime = scheduledDeliveryTime;
    }
    public DeliveryStatus getDeliveryStatus() {
        return deliveryStatus;
    }
    public void setDeliveryStatus(DeliveryStatus deliveryStatus) {
        this.deliveryStatus = deliveryStatus;
    }
    public void setOrderId(String orderId){
        this.orderId = orderId;
    }
}