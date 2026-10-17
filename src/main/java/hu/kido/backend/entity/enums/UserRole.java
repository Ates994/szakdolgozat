package hu.kido.backend.entity.enums;

import lombok.Getter;

@Getter
public enum UserRole {
    ADMIN("Admin"),
    MODERATOR("Moderator"), //Tanár, pl Shihan, aki tud létrehozni órákat és órákra jelentkeztetni
    MEMBER("Member");

    private final String displayName;

    UserRole(String displayName) {
        this.displayName = displayName;
    }
}
