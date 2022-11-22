package birger.sav.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import birger.sav.entity.Evenement;

public interface EvenementRepository extends JpaRepository<Evenement, Integer> {
    
}
