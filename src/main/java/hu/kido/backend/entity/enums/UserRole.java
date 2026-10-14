package hu.kido.backend.entity.enums;

import lombok.Getter;

@Getter
public enum UserRole {
    ADMIN("Admin"),
    MEMBER("Member");

    private final String displayName;

    UserRole(String displayName) {
        this.displayName = displayName;
    }
}
