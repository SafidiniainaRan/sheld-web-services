package birger.sav.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import birger.sav.entity.Contact;

@Service
public class ContactDAO {
    @Autowired
    EntityManager entityManager;

    public List<Contact> getContact(int idtypeContact, String nomContact, double proximite) {
        List<Contact> contacts = new ArrayList<>();

        CriteriaBuilder cb = entityManager.getCriteriaBuilder();

        CriteriaQuery<Contact> cq = cb.createQuery(Contact.class);
        Root<Contact> from = cq.from(Contact.class);

        List<Predicate> predicates = new ArrayList<>();

        if (idtypeContact > 0) {
            predicates.add(cb.equal(from.get("idtypecontact"), idtypeContact));

        }
        if (nomContact != null && !nomContact.isEmpty()) {
            predicates.add(cb.like(from.get("nomContact"), "%" + nomContact + "%"));
        }
        cq.select(from).where(predicates.toArray(new Predicate[predicates.size()]));
        TypedQuery<Contact> q = entityManager.createQuery(cq);

        contacts = q.getResultList();
        return contacts;
    }
}
