package hu.kido.backend.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "user_pass")
public class UserPass {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private User user;

    @ManyToOne
    private Pass pass;

    @ManyToOne
    private EventOccurrence eventOccurrence;

    private LocalDateTime purchasedAt;
    private LocalDate validFrom;
    private LocalDate validUntil;


}
