package hu.kido.backend.dto;

import lombok.Getter;
import lombok.Setter;
import hu.kido.backend.entity.enums.UserRole;

@Getter
@Setter
public class CreateUserRequest {

    private UserRole userRole;
    private String foreName;
    private String surName;
    private String email;
}
