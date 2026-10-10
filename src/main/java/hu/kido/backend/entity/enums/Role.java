package hu.kido.backend.entity.enums;

import lombok.Getter;

@Getter
public enum Role {
    ADMIN("Admin"),
    MEMBER("Member");

    private final String displayName;

    Role(String displayName) {
        this.displayName = displayName;
    }
}
