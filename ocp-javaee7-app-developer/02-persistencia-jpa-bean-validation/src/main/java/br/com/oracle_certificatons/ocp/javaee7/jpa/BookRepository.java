package br.com.oracle_certificatons.ocp.javaee7.jpa;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.validation.Valid;

@Stateless
public class BookRepository {

    @PersistenceContext(unitName = "labPU")
    private EntityManager em;

    public Book create(@Valid Book book) {
        em.persist(book);
        return book;
    }

    public Book find(Long id) {
        return em.find(Book.class, id);
    }

    public List<Book> findAll() {
        return em.createNamedQuery(Book.FIND_ALL, Book.class).getResultList();
    }
}
