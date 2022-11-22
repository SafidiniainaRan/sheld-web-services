package birger.sav.service;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import birger.sav.entity.EvenementUtilisateur;
import birger.sav.repository.EvenementRepository;
import birger.sav.repository.EvenementUtilisateurRepository;

@Service
public class EvenementService {
    
    @Autowired
    private EvenementRepository evenementRepository ;

    @Autowired
    private EvenementUtilisateurRepository evenementUtilisateurRepository ;

    /*
     * SAVE
     */
    public void save(EvenementUtilisateur evenementUtilisateur) {
        evenementUtilisateur.setDatedebut(LocalDateTime.now());
        evenementUtilisateur.setEstActive(1);
        this.getEvenementUtilisateurRepository().save(evenementUtilisateur) ;
    }

    /*
     * GETTERS and SETTERS
     */
    public EvenementUtilisateurRepository getEvenementUtilisateurRepository() {
        return evenementUtilisateurRepository;
    }

    public void setEvenementUtilisateurRepository(EvenementUtilisateurRepository evenementUtilisateurRepository) {
        this.evenementUtilisateurRepository = evenementUtilisateurRepository;
    }

    public EvenementRepository getEvenementRepository() {
        return evenementRepository;
    }

    public void setEvenementRepository(EvenementRepository evenementRepository) {
        this.evenementRepository = evenementRepository;
    }

}
