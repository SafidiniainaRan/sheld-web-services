package birger.sav.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import birger.sav.entity.EvenementUtilisateur;

public interface EvenementUtilisateurRepository extends JpaRepository<EvenementUtilisateur, Integer> {
    
}
