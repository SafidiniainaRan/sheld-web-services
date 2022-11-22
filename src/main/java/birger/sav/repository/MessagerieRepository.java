package birger.sav.repository;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import birger.sav.entity.Messagerie;

public interface MessagerieRepository extends JpaRepository<Messagerie, Integer> {

    public Page<Messagerie> findAll(Pageable pageable) ;

}