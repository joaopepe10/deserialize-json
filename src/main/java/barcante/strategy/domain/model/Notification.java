package barcante.strategy.domain.model;

import barcante.strategy.core.EventType;
import barcante.strategy.domain.model.impl.BannerNotification;
import barcante.strategy.domain.model.impl.CommunicationNotification;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        property = "eventType"
)
@JsonSubTypes({
        @JsonSubTypes.Type(value = BannerNotification.class, name = "BANNER"),
        @JsonSubTypes.Type(value = CommunicationNotification.class, name = "COMMUNICATION")
})
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Notification {

    private EventType eventType;

}
