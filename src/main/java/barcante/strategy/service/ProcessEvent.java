package barcante.strategy.service;

import barcante.strategy.domain.model.Notification;
import barcante.strategy.domain.model.impl.EventsNotification;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ProcessEvent {

    public void processEvent(EventsNotification message) {
        for (Notification n : message.getNotifications()) {
            System.out.println(n.getEventType());
        }
    }
}
