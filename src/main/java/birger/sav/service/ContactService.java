package birger.sav.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import birger.sav.dao.ContactDAO;
import birger.sav.entity.Contact;
import birger.sav.repository.ContactRepository;

@RestController
public class ContactService {
    @Autowired
    ContactRepository contactRepository;

    @Autowired
    ContactDAO contactDAO;

    public List<Contact> findAll(){
        return contactRepository.findAll();
    }

    public List<Contact> getContact(int idtypeContact, String mot, double proximite ){
        return this.contactDAO.getContact(idtypeContact, mot, proximite);
    }
}
