package kg.megacom.restoservice.models.dto;

import lombok.Data;

@Data
public class DishesDto {
    private Long id;
    private String name;
    private double size;
    private String img;
}
