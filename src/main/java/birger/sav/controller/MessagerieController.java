package birger.sav.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import birger.sav.entity.Categoriemessagerie;
import birger.sav.entity.EvenementUtilisateur;
import birger.sav.entity.Messagerie;
import birger.sav.entity.Modelemessage;
import birger.sav.entity.Processmessagerie;
import birger.sav.entity.Typemessagerie;
import birger.sav.service.EvenementService;
import birger.sav.service.MessagerieService;

@RestController
@RequestMapping("/messagerie")
public class MessagerieController extends BaseController {
    
    /*
     * STATIC Variables
     */
    private static final int EVENEMENT_UTILISATEUR = 1 ;

    /*
     * SERVICES
     */
    @Autowired
    private MessagerieService messagerieService ;

    @Autowired
    private EvenementService evenementService ;

    /*
     * ENVOI Message
     */
    @PostMapping("/send")
    public void send(@RequestBody Messagerie messagerie, @RequestBody EvenementUtilisateur evenementUtilisateur) {
        this.getMessagerieService().send(messagerie) ;
        evenementUtilisateur.setIdevenement(this.getEvenementUtilisateur());
        this.getEvenementService().save(evenementUtilisateur);
    }

    /*
     * LISTE des TABLES en RELATION avec MESSAGERIE
     */
    @GetMapping("/categories")
    public List<Categoriemessagerie> listeCategorie() {
        return this.getMessagerieService().listeCategorie() ;
    }

    @GetMapping("/types")
    public List<Typemessagerie> listeType() {
        return this.getMessagerieService().listeType() ;
    }

    @GetMapping("/process")
    public List<Processmessagerie> listeProcess() {
        return this.getMessagerieService().listeProcess() ;
    }

    @GetMapping("/modeles")
    public List<Modelemessage> listeModele() {
        return this.getMessagerieService().listeModele() ;
    }

    /*
     * MODELE de message UNIQUE
     */
    @GetMapping("/modele/{id}")
    public Modelemessage getModeleMessage(@PathVariable int id) {
        return this.getMessagerieService().getModeleMessage(id) ;
    }

    /*
     * GETTERS and SETTERS
     */
    public MessagerieService getMessagerieService() {
        return messagerieService;
    }

    public void setMessagerieService(MessagerieService messagerieService) {
        this.messagerieService = messagerieService;
    }

    public EvenementService getEvenementService() {
        return evenementService;
    }

    public void setEvenementService(EvenementService evenementService) {
        this.evenementService = evenementService;
    }

    public int getEvenementUtilisateur() {
        return EVENEMENT_UTILISATEUR;
    }

}
