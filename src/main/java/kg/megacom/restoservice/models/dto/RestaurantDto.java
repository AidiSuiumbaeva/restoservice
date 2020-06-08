package kg.megacom.restoservice.models.dto;

import kg.megacom.restoservice.models.Phones;
import lombok.Data;

import java.util.Set;

@Data
public class RestaurantDto {
    private Long id;
    private String  name;
    private String address;
    private double lat;
    private double lon;
    private boolean active;
    private String logo;
    private Set<Phones> phones;
}
