package PracticeLowLevelDesign.SwiggyInsta;



import java.time.LocalDateTime;

// Define the interface for scheduling delivery
public interface DeliveryService {
    void scheduleDelivery(Order order, LocalDateTime deliveryTime);
}
