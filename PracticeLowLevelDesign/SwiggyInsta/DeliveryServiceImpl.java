package PracticeLowLevelDesign.SwiggyInsta;

import java.time.LocalDateTime;

// Example usage of the DeliveryService interface
public class DeliveryServiceImpl implements DeliveryService {

    public void scheduleDelivery(Order order, LocalDateTime deliveryTime) {
        // Logic to schedule delivery for the given order at the specified time
        // This could involve updating the order status and notifying the delivery
        // service
        order.setScheduledDeliveryTime(deliveryTime);
        System.out.println("The delivery time set to " + deliveryTime);
    }
}
