package com.dxctraining.dao;

import com.dxctraining.consoleapp.entities.Book;
import com.dxctraining.consoleapp.exceptions.BookNotFoundException;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class BookDaoImpl implements IBookDao{

    //equivalent to @Autowired
    //@Autowired
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Book findBookById(int idArg) {
       Book book=entityManager.find(Book.class,idArg);
        if(book==null){
            throw new BookNotFoundException("book not found for id="+idArg);
        }
        return book;
    }

    @Override
    public Book update(Book book) {
        book=entityManager.merge(book);
        return book;
    }

    @Override
    public Book save (Book book) {
        entityManager.persist(book);//insertion
        return book;
    }

    @Override
    public void remove(int id) {
     Book book= findBookById(id) ;
     entityManager.remove(book);
    }

    @Override
    public Book findBookByName(String bName){
        String jpaql="from Book where name=:bname";
        Query query= entityManager.createQuery(jpaql);
        query.setParameter("ename",bName);
        List<Book>list=query.getResultList();
        Book book=null;
        if(!list.isEmpty()){
           book=list.get(0);
        }
        return book;
    }
}