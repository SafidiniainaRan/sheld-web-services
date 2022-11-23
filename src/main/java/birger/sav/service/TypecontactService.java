package birger.sav.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import birger.sav.entity.Typecontact;

import birger.sav.repository.TypecontactRepository;

@Service
public class TypecontactService {
    @Autowired
    TypecontactRepository TypecontactRepository;

    public List<Typecontact> findAll(){
        return TypecontactRepository.findAll();
    }
}