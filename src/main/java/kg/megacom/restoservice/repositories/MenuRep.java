package kg.megacom.restoservice.repositories;

import kg.megacom.restoservice.models.Menu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MenuRep extends JpaRepository<Menu, Long> {
}
