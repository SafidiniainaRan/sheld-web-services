package birger.sav.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import birger.sav.entity.Contact;

public interface ContactRepository extends JpaRepository<Contact, Integer>{
    
}
