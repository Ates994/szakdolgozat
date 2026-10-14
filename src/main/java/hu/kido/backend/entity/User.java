//Matching 1-to-1 to a relational database. The DB record
package hu.kido.backend.entity;
import hu.kido.backend.entity.enums.UserBeltRank;
import hu.kido.backend.entity.enums.UserRole;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;


@Getter
@Setter
@Entity

@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private UserRole userRole = UserRole.MEMBER;

    private String foreName;
    private String surName;
    private LocalDate birthDate;

    @Column(nullable = false, unique = true)
    private String email;

    private String zipCode;
    private String city;
    private String address;
    private String phoneNumber;

    @Enumerated(EnumType.STRING)
    private UserBeltRank userBeltRank = UserBeltRank.NO_KYU;

}
