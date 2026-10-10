package hu.kido.backend.dto;

import lombok.Getter;
import lombok.Setter;
import hu.kido.backend.entity.enums.Role;
import hu.kido.backend.entity.enums.BeltRank;
import java.time.LocalDate;

@Getter
@Setter
public class UpdateUserRequest {

    private Role role;
    private String foreName;
    private String surName;
    private LocalDate birthDate;
    private String email;
    private String zipCode;
    private String city;
    private String address;
    private String phoneNumber;
    private BeltRank beltRank;
}
