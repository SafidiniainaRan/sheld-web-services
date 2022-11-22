package birger.sav.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import birger.sav.entity.Utilisateur;
import birger.sav.repository.UtilisateurRepository;

@Service
public class UtilisateurService {
    @Autowired
    UtilisateurRepository utilisateurRepository;

    public Utilisateur login(@RequestParam String email, @RequestParam String password){
        
        return this.utilisateurRepository.findUtilisateurByContactAndMotdepasse(email, password);
    }
}
