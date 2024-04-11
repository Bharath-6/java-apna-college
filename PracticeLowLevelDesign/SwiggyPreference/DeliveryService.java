package SwiggyPreference;

import java.time.LocalDateTime;

public interface DeliveryService {
    void scheduleDelivery(Order order, LocalDateTime deliveryTime);
    void updateDeliveryStatus(Order order, DeliveryStatus status);
}
