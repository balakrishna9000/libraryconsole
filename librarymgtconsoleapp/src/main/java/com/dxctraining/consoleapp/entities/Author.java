package com.dxctraining.consoleapp.entities;

public class Author {
	private int id;
	private String authorname;
	
	
	public Author(int id,String authorname) {
		this.id=id;
		this.authorname=authorname;
		
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getAuthorname() {
		return authorname;
	}


	public void setAuthorname(String authorname) {
		this.authorname = authorname;
	}	
	

}
