package TP4;

import java.util.Objects;

public class Book {
	private final String title;
	private final String author;
	
	public Book() {
		this("<No title>", "<No author>");
	}
	
	public Book(String titre) {
		this(titre, "<no author>");
	}
	public Book(String pTitle,String pAuthor) {
		this.title = Objects.requireNonNull(pTitle, "Le titre ne peut pas être null");
		this.author = Objects.requireNonNull(pAuthor, "L'auteur ne peut pas être null");
	}
	
	public String getTitle() {
		if(this.title == null) return "-1";
		return this.title;
	}
	public String getAuthor() {
		if(this.title == null) return "-1";
		return this.author;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj) return true;
		if(obj == null || this.getClass() != obj.getClass()) return false;
		
		Book objBook = (Book) obj;
		if(this.getTitle().equals(objBook.getTitle()) && this.getAuthor().equals(objBook.getAuthor())) return true;
		return false;
	}
	
	@Override
	public String toString() {
		return this.title + " by " + this.author;
	}
}
