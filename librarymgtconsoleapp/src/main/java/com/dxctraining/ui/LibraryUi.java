package com.dxctraining.ui;

import com.dxctraining.consoleapp.entities.Book;
import com.dxctraining.consoleapp.entities.BookItem;
import com.dxctraining.consoleapp.exceptions.BookNotFoundException;
import com.dxctraining.consoleapp.exceptions.InvalidArgumentException;
import com.dxctraining.consoleapp.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class LibraryUi {
    @Autowired
    private IBookService service;


    @PostConstruct
    public void runUi() {
        try {
            Book book1 = new BookItem("java",2000,"james gosling",5.4,java);
            Book book2 = new BookItem("python", 2500,"rossum",2.7,python);
            book1 = service.save(book1);
            book2 = service.save(book2);

            int id1 = book1.getId();
            Book fetched1 = service.findBookById(id1);
            System.out.println("fetcehd book =" + fetched1.getName() + " " + fetched1.getAge());

            Book fetched2 = service.findBookByName("vineel");
            System.out.println("fetched by name=" + fetched2.getName() + " " + fetched2.getId());
        } catch (BookNotFoundException e) {
            e.printStackTrace();
        } catch (InvalidArgumentException e) {
            e.printStackTrace();
        }
    }


}