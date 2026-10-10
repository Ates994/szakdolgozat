package hu.kido.backend.dto;

import lombok.Getter;
import lombok.Setter;
import hu.kido.backend.entity.enums.Role;

@Getter
@Setter
public class CreateUserRequest {

    private Role role;
    private String foreName;
    private String surName;
    private String email;
}
