package com.dxctraining.entities;

import com.dxctraining.entities.Author;
import com.dxctraining.entities.Book;

public class Fictional extends Book {
	private String character;
	
	
	public Fictional(String bname,double cost, Author author,String character) {
        super(bname,cost,author);
		this.character=character;
	}


	public String getCharacter() {
		return character;
	}


	public void setCharacter(String character) {
		this.character = character;
	}
	

}
