package kg.megacom.restoservice.repositories;

import kg.megacom.restoservice.models.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RestaurantRep extends JpaRepository<Restaurant,Long> {
}
