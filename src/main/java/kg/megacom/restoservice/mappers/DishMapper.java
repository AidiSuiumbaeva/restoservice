package kg.megacom.restoservice.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface DishMapper {
    DishMapper DISH_MAPPER= Mappers.getMapper(DishMapper.class);
}
