package com.dxctraining.consoleapp.entities;

import com.dxctraining.entities.Author;
import com.dxctraining.entities.Book;

public class BookItem extends Book {
	private double version;
	private String language;
	public BookItem(String name,double cost,Author author, double version ,String language) {
		super(name,cost,author);
		this.version=version;
		this.language=language;
	}
	public double getVersion() {
		return version;
	}
	public void setVersion(double version) {
		this.version = version;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}

}
