package barcante.strategy.domain.model.impl;

import barcante.strategy.core.EventType;
import barcante.strategy.domain.model.Notification;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BannerNotification extends Notification {

    private String id;
    private String title;
    private String text;

    @Builder
    public BannerNotification(EventType eventType, String id, String title, String text) {
        super(eventType);
        this.id = id;
        this.title = title;
        this.text = text;
    }
}
