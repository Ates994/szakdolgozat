package hu.kido.backend.dto;

import lombok.Getter;

@Getter
public class CreatePassRequest {
    private String name;
    private Integer price;
    private Long eventId;
}
