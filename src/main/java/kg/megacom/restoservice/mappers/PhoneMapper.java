package kg.megacom.restoservice.mappers;

import kg.megacom.restoservice.models.Phones;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PhoneMapper {
    PhoneMapper PHONE_MAPPER= Mappers.getMapper(PhoneMapper.class);
}
