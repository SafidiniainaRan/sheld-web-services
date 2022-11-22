package birger.sav.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import birger.sav.entity.Utilisateur;

public interface UtilisateurRepository extends JpaRepository<Utilisateur, Integer> {
    
    public Utilisateur findUtilisateurByContactAndMotdepasse(String contact, String motdepasse);
}
