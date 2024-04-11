package SwiggyPreference;

import java.time.LocalDateTime;

public class DeliveryServiceImpl implements DeliveryService {

    public void scheduleDelivery(Order order, LocalDateTime deliveryTime) {
        // Logic to schedule delivery for the given order at the specified time
        // This could involve updating the order status and notifying the delivery service
        order.setScheduledDeliveryTime(deliveryTime);
        System.out.println("The delivery time set to " + deliveryTime);
    }

    public void updateDeliveryStatus(Order order, DeliveryStatus status) {
        // Logic to update the delivery status for the given order
        order.setDeliveryStatus(status);
        System.out.println("Delivery status updated to " + status + " for order " + order.getOrderId());
    }
}
