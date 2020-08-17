package com.dxctraining.service;

import com.dxctraining.consoleapp.dao.IBookDao;
import com.dxctraining.consoleapp.entities.Book;
import com.dxctraining.consoleapp.exceptions.InvalidArgumentException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

// transactional will inform spring that it has to open transaction at every method in this class
@Transactional
@Service
public class BookServiceImpl implements IBookService{

    @Autowired
    private IBookDao dao;

    @Override
    public Book findBookById(int id) {
       Book book= dao.findBookById(id);
        return book;
    }


    @Override
    public Book update(Book book) {
        validate(book);
        book=dao.update(book);
        return book;
    }

    @Override
    public Book save(Book book) {
        validate(book);
        book=dao.save(book);
        return book;
    }

    @Override
    public void remove(int id) {
       dao.remove(id);
    }

    public void validate(Object arg){
        if(arg==null){
            throw new InvalidArgumentException("argument is null");
        }
    }

    @Override
    public Book findBookByName(String bName) {
       Book book =dao.findBookByName(bName);
       return book;
    }
}