package barcante.strategy.domain.model.impl;

import barcante.strategy.domain.model.Notification;
import lombok.*;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class EventsNotification {

    private BannerNotification bannerNotification;
    private CommunicationNotification communicationNotification;
    private List<Notification> notifications;
}


