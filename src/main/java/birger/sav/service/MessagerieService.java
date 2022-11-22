package birger.sav.service;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import birger.sav.entity.Categoriemessagerie;
import birger.sav.entity.Messagerie;
import birger.sav.entity.Modelemessage;
import birger.sav.entity.Processmessagerie;
import birger.sav.entity.Typemessagerie;
import birger.sav.repository.Categoriemessagerie_grpRepository;
import birger.sav.repository.MessagerieRepository;
import birger.sav.repository.ModelemessageRepository;
import birger.sav.repository.ProcessmessagerieRepository;
import birger.sav.repository.Typemessagerie_grpRepository;

@Service
public class MessagerieService {

    private static final int LIGNE_MESSAGERIE = 10 ;

    @Autowired
    private ProcessmessagerieRepository processmessagerieRepository ;

    @Autowired
    private Categoriemessagerie_grpRepository categoriemessagerie_grpRepository ;

    @Autowired
    private Typemessagerie_grpRepository typemessagerie_grpRepository ;

    @Autowired
    private ModelemessageRepository modelemessageRepository ;

    @Autowired
    private MessagerieRepository messagerieRepository ;

    /*
     * MESSAGERIE Liste
     */
    public Map<String, Object> listeMessageries(int page, String sortByColumn) {
        Pageable pageable = PageRequest.of(page, MessagerieService.getLIGNE_MESSAGERIE(), Sort.by(sortByColumn).descending()) ;
        Page<Messagerie> messages = this.getMessagerieRepository().findAll(pageable) ;
        HashMap<String, Object> map = new HashMap<>() ;
        map.put("messages", messages) ;
        map.put("totalpage", messages.getTotalPages()) ;
        map.put("currentpage", messages.getNumber()) ;
        return map ;
    }

    /*
     * MESSAGERIE Envoie
     */
    public Messagerie send(Messagerie messagerie) {
        messagerie.setDateheureenvoi(LocalDateTime.now());
        messagerie.setDatedebut(LocalDateTime.now());
        this.getMessagerieRepository().save(messagerie) ;
        return messagerie ;
    }

    /*
     * MESSAGERIE Suppression
     */
    public void delete(int id) {
        Optional<Messagerie> messagerie = this.getMessagerieRepository().findById(id) ;
        if (messagerie.isPresent()) {
            Messagerie message = messagerie.get() ;
            message.setEstActive("0");
            message.setDatefin(LocalDateTime.now());
            this.getMessagerieRepository().save(message) ;
        }
    }

    /*
     * PROCESS Messagerie
     */
    public List<Processmessagerie> listeProcess() {
        return this.getProcessmessagerieRepository().findAll() ;
    }

    /*
     * CATEGORIE Messagerie
     */
    public List<Categoriemessagerie> listeCategorie() {
        return this.getCategoriemessagerie_grpRepository().findAll() ;
    }

    /*
     * TYPE Messagerie
     */
    public List<Typemessagerie> listeType() {
        return this.getTypemessagerie_grpRepository().findAll() ;
    }

    /*
     * MODELE Messagerie
     */
    public List<Modelemessage> listeModele() {
        return this.getModelemessageRepository().findAll() ;
    }

    public Modelemessage getModeleMessage(int id) {
        Optional<Modelemessage> modele = this.getModelemessageRepository().findById(id) ;
        if (modele.isPresent()) return modele.get() ;
        return null ;
    }

    /*
     * GETTERS and SETTERS
     */

    public Categoriemessagerie_grpRepository getCategoriemessagerie_grpRepository() {
        return categoriemessagerie_grpRepository;
    }

    public void setCategoriemessagerie_grpRepository(Categoriemessagerie_grpRepository categoriemessagerie_grpRepository) {
        this.categoriemessagerie_grpRepository = categoriemessagerie_grpRepository;
    }

    public ProcessmessagerieRepository getProcessmessagerieRepository() {
        return processmessagerieRepository;
    }

    public void setProcessmessagerieRepository(ProcessmessagerieRepository processmessagerieRepository) {
        this.processmessagerieRepository = processmessagerieRepository;
    }

    public Typemessagerie_grpRepository getTypemessagerie_grpRepository() {
        return typemessagerie_grpRepository;
    }

    public void setTypemessagerie_grpRepository(Typemessagerie_grpRepository typemessagerie_grpRepository) {
        this.typemessagerie_grpRepository = typemessagerie_grpRepository;
    }

    public ModelemessageRepository getModelemessageRepository() {
        return modelemessageRepository;
    }

    public void setModelemessageRepository(ModelemessageRepository modelemessageRepository) {
        this.modelemessageRepository = modelemessageRepository;
    }

    public MessagerieRepository getMessagerieRepository() {
        return messagerieRepository;
    }

    public void setMessagerieRepository(MessagerieRepository messagerieRepository) {
        this.messagerieRepository = messagerieRepository;
    }

    public static int getLIGNE_MESSAGERIE() {
        return LIGNE_MESSAGERIE;
    }

}
