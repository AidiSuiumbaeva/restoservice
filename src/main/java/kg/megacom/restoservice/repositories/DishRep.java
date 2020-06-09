package kg.megacom.restoservice.repositories;

import kg.megacom.restoservice.models.Dishes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DishRep extends JpaRepository<Dishes, Long> {
}
