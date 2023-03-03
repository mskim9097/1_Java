package edu.kh.book.model.vo;

public class Book {
	
	private String name; // 책 이름
	private String author; // 작가
	private int price; // 가격
	private String company; // 출판사
	
	public Book() {}

	public Book(String name, String author, int price, String company) {
		super();
		this.name = name;
		this.author = author;
		this.price = price;
		this.company = company;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	@Override
	public String toString() {
		return name + " " + author + " " + price + " " + company;
	}

	

	
	

}
