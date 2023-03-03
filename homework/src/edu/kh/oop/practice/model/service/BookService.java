package edu.kh.oop.practice.model.service;

import edu.kh.oop.practice.model.vo.Book;

public class BookService {
	
	public void practice() {
		Book book1 = new Book();
		
		Book book2 = new Book("�ڹ�������", 30000, 0.2, "���ü�");
		
		System.out.println(book1.toString());
		System.out.println(book2.toString());
		System.out.println("===========================");
		
		book1.setTitle("C���");
		book1.setPrice(30000);
		book1.setDiscountRate(0.1);
		book1.setAuthor("ȫ�浿");
		
		System.out.println("������ ��� Ȯ��");
		System.out.println(book1.toString());
		System.out.println("===========================");
		
		System.out.println("������ = " + book1.getTitle());
		System.out.println("���ε� ���� = " + (int)(book1.getPrice() - (book1.getPrice() * book1.getDiscountRate())) + "��");
		System.out.println("������ = " + book2.getTitle());
		System.out.println("���ε� ���� = " + (int)(book2.getPrice() - (book2.getPrice() * book2.getDiscountRate())) + "��");
	}

}
