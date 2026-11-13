package hu.kido.backend.dto;

import lombok.Getter;

@Getter
public class UpdatePassRequest {
    private String name;
    private Integer price;
    private Boolean active;
    private Long eventId;
}
