package com.dxctraining.service;

import com.dxctraining.consoleapp.entities.Book;

public interface IBookService {
    Book findBookById(int id);

    Book update(Book book);

    Book save(Book book);

    void remove(int id);

    Book findbookByName(String bName);
}