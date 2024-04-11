package PracticeLowLevelDesign.SwiggyInsta;

import java.time.LocalDateTime;

// API Controller class
public class DeliveryController {
    private DeliveryService deliveryService;

    public DeliveryController(DeliveryService deliveryService) {
        this.deliveryService = deliveryService;
    }

    // API endpoint to schedule delivery for an order
    public void scheduleDeliveryForOrder(Order order, LocalDateTime deliveryTime) {
        deliveryService.scheduleDelivery(order, deliveryTime);
    }
}
