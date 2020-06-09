package kg.megacom.restoservice.mappers;

import kg.megacom.restoservice.models.Restaurant;
import kg.megacom.restoservice.models.dto.RestaurantDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface RestaurantMapper {
    RestaurantMapper RESTAURANT_MAPPER= Mappers.getMapper(RestaurantMapper.class);

    Restaurant restaurantToRestaurantDto(RestaurantDto restaurantDto);
    RestaurantDto restaurantDtoToRestaurant(Restaurant restaurant);


    List<Restaurant> restaurantToRestaurantDtos(List<RestaurantDto> restaurantDtos);
    List<RestaurantDto> restaurantDtosToRestaurants(List<Restaurant> restaurant);

}
