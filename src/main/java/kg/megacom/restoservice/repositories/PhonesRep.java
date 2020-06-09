package kg.megacom.restoservice.repositories;

import kg.megacom.restoservice.models.Phones;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PhonesRep extends JpaRepository<Phones,Long> {
}
