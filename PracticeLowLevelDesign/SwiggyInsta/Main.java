package PracticeLowLevelDesign.SwiggyInsta;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        // Create an instance of DeliveryService
        DeliveryService deliveryService = new DeliveryServiceImpl();

        // Create an instance of DeliveryController
        DeliveryController deliveryController = new DeliveryController(deliveryService);

        // Create an order
        Order order = new Order();
        order.setOrderId("123");
        order.setOrderTime(LocalDateTime.now());
        order.setTotalAmount(100.0);

        // Schedule delivery for the order
        LocalDateTime deliveryTime = LocalDateTime.of(2024, 4, 15, 10, 0); // Example delivery time
        deliveryController.scheduleDeliveryForOrder(order, deliveryTime);
    }
}
