package birger.sav.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import birger.sav.dao.ContactDAO;
import birger.sav.entity.Contact;
import birger.sav.service.ContactService;
@RestController
@RequestMapping("/contacts")
public class ContactController extends BaseController {
    @Autowired
    ContactService contactService;

    @GetMapping("")
    public List<Contact> contacts(){
        return this.contactService.findAll();
    }

    @GetMapping("filter")
    public List<Contact> getContact(int idtypeContact, String mot, double proximite ){
        return this.contactService.getContact(idtypeContact, mot, proximite);
    }
}
