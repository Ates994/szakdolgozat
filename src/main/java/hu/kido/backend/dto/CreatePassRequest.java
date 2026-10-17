package hu.kido.backend.dto;

import hu.kido.backend.entity.Event;
import lombok.Getter;

@Getter
public class CreatePassRequest {
    private String name;
    private Integer price;
    private Boolean active;
    private Event event;
}
