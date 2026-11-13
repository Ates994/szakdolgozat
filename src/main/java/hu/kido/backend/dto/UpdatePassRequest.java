package hu.kido.backend.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UpdatePassRequest {
    private String name;
    private Integer price;
    private Boolean active;
    private Long eventId;
}
