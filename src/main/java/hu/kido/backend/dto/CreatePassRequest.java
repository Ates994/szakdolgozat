package hu.kido.backend.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreatePassRequest {
    private String name;
    private Integer price;
    private Long eventId;
}
