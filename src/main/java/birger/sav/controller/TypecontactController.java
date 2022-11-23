package birger.sav.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import birger.sav.entity.Typecontact;
import birger.sav.service.TypecontactService;

@RestController
@RequestMapping("/typecontacts")
public class TypecontactController extends BaseController {
    @Autowired
    TypecontactService typecontactService;
    @GetMapping("")
    public List<Typecontact> typeContacts(){
        return this.typecontactService.findAll();
    }
}
