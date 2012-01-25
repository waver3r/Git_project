package com.kat.bookstore.domain;

public class Book {
	
		public long id;
		public String title;
		public String author;
		private int price;
		public int year;
		public BookGenre genre;
		public boolean cleanShelf;
		
		//public Book(){}
		
		public Book(String title, String author, BookGenre genre, int year, int price)
		{
			this.title= title;
			this.author=author;
			this.genre=genre;
			this.year=year;
			this.price=price;
			this.cleanShelf=false;
		}
		
		public void printBook()
		{
			System.out.println("Tytul: "+title + "\tAutor: "+ author + "\tCena: " + price + "PLN" );
		}

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public String getAuthor() {
			return author;
		}

		public void setAuthor(String author) {
			this.author = author;
		}
				
		public BookGenre getGenre() {
			return genre;
		}
		
		public void setGenre(BookGenre genre) {
			this.genre = genre;
		}
		
		public int getYear() {
			return year;
		}

		public void setYear(int year) {
			this.year = year;
		}
		
		public int getPrice() {
			return price;
		}
		
		public void setPrice(int price) throws PriceBelowZeroException
		{
			if (price <0)
					throw new PriceBelowZeroException("cena nie moze byc ujemna");
			else this.price=price;
		}
		
		public boolean isCleanShelf() {
			return cleanShelf;
		}

		public void setCleanShelf(boolean cleanBox) {
			this.cleanShelf = cleanBox;
		}
		
		public long getId() {
			return id;
		}
		
		public void setId(long id) {
			this.id = id;
		}
	}