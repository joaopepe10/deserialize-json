package barcante.strategy.core;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum EventType {

    BANNER("BANNER"),
    COMMUNICATION("COMMUNICATION");

    private String value;

    @JsonValue
    public String getValue(){
        return this.value;
    }

    EventType(String value){
        this.value = value;
    }

    @JsonCreator
    public static EventType fromValue(String value) {
        for (EventType eventType : EventType.values()) {
            if (eventType.value.equalsIgnoreCase(value)) {
                return eventType;
            }
        }
        throw new IllegalArgumentException("Unknown enum type " + value);
    }

}
