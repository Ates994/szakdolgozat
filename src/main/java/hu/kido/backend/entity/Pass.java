package hu.kido.backend.entity;

import hu.kido.backend.entity.enums.PassValidityType;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity

@Table(name = "pass")
public class Pass {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToOne
    private TrainingType trainingType;

    private Integer price;
    private Boolean active = true;

    @Enumerated(EnumType.STRING)
    private PassValidityType passValidityType;

    private Integer passValidityLength;
    private Integer passOccasions;
}
