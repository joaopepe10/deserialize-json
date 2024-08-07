package barcante.strategy.domain.model.impl;

import barcante.strategy.core.EventType;
import barcante.strategy.domain.model.Notification;
import lombok.*;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommunicationNotification extends Notification {

    private String message;
    private List<String> eventsId;

    @Builder
    public CommunicationNotification(EventType eventType, String message, List<String> eventsId) {
        super(eventType);
        this.message = message;
        this.eventsId = eventsId;
    }

}
