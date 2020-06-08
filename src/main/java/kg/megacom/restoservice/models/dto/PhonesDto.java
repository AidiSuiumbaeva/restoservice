package kg.megacom.restoservice.models.dto;

import lombok.Data;

@Data
public class PhonesDto {
    private Long id;
    private String number;
    private boolean active;

}
