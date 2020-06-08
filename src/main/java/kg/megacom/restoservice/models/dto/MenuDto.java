package kg.megacom.restoservice.models.dto;

import kg.megacom.restoservice.models.Restaurant;
import lombok.Data;

@Data
public class MenuDto {
    private Long id;
    private String name;
    private boolean active;
    private Restaurant restaurant;
}
