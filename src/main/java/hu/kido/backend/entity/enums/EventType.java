package hu.kido.backend.entity.enums;

import lombok.Getter;

@Getter
public enum EventType {
    TRAINING("Edzés"),
    CAMP("Edzőtábor"),
    BELT_TEST("Övvizsga");

    private final String displayName;

    EventType(String displayName){
        this.displayName = displayName;
    }
}
