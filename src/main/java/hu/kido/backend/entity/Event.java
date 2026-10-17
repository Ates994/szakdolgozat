package hu.kido.backend.entity;

import hu.kido.backend.entity.enums.EventType;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "event")
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @Enumerated(EnumType.STRING)
    private EventType eventType;

    @ManyToOne
    private TrainingType trainingType;
    private String description;
    //TODO Image Entity-t létrehozni, hogy a jövőben általánosan szerkeszthető legyen
    private Integer maxParticipants;
    private Boolean publicEvent = false;


}
