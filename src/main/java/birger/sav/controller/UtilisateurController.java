package birger.sav.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import birger.sav.entity.Utilisateur;
import birger.sav.service.UtilisateurService;

@RestController
@RequestMapping("/utilisateur")
public class UtilisateurController extends BaseController {

    @Autowired
    UtilisateurService utilisateurService;

    @GetMapping("/login")
    public Utilisateur login(String email, String password) {
        return this.utilisateurService.login(email, password) ;
    }
}
