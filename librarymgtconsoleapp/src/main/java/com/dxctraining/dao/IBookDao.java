package com.dxctraining.dao;

import com.dxctraining.consoleapp.entities.*;

public interface IBookDao {

    Book findookById(int id);

    Book update(Book book);

    Book save(Book book);

    void remove(int id);

    Book findBookByName(String bName);

	Book findBookById(int idArg);
}