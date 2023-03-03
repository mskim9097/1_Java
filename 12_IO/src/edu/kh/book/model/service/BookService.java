package edu.kh.book.model.service;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import edu.kh.book.model.vo.Book;


public class BookService {
	
	Scanner sc = new Scanner(System.in);
	
	private List<Book> bookList = new ArrayList<Book>();
	private List<Book> favoriteList = new ArrayList<Book>();
	
	public BookService() {
		
		
	}
	
	public void displayMenu() {
		
		int menuNum = 0;
		
		System.out.println("=====도서 목록 프로그램=====");
		
		do {
			
			System.out.println("1. 도서 등록");
			System.out.println("2. 도서 조회");
			System.out.println("3. 도서 수정");
			System.out.println("4. 도서 삭제");
			System.out.println("5. 즐겨찾기 추가");
			System.out.println("6. 즐겨찾기 취소");
			System.out.println("0. 프로그램 종료");
			System.out.print("메뉴 선택 >>");
			
			try {
				
				menuNum = sc.nextInt();
				
				switch(menuNum) {
				
				case 1: System.out.println(addBook());break;
				case 2: selectBook(); break;
				case 3: System.out.println(updateBook());break;
				case 4: System.out.println(deleteBook());break;
				case 5: addFavorite(); break;
				case 6: System.out.println(removeFavorite());break;
				case 0: System.out.println("프로그램을 종료합니다."); break;
				default: System.out.println("잘못 입력하셨습니다.");
				
				}
				
			} catch (Exception e) {
				System.out.println("잘못 입력하셨습니다.");
				sc.nextLine();
				menuNum = -1;
			}
			
		}while(menuNum != 0);
		
	}
	
	public String addBook() throws Exception{
		
		System.out.println("=====도서 등록=====");
		sc.nextLine();
		
		
		System.out.print("도서 명 : ");
		String name = sc.nextLine();
		System.out.print("작가 명 : ");
		String author = sc.nextLine();
		System.out.print("도서 가격 : " );
		int price = sc.nextInt();
		sc.nextLine();
		System.out.print("출판사 : ");
		String company = sc.nextLine();
		
		if(bookList.add(new Book(name, author, price, company))) {
			return "도서 등록 성공";
		} else {
			return "도서 등록 실패";
		}
		
	}
	
	public void selectBook() {
		
		System.out.println("=====도서 조회=====");
		
		if(bookList.isEmpty()) {
			System.out.println("등록된 도서가 없습니다.");
			
			return;
		}
		int index = 0;
		for(Book book : bookList) {
			// std에는 for문 반복 시 마다 0,1,2,... 인덱스 요소들을 한번 씩 저장됨.
						
			System.out.print((index++) + "번 : ");
			System.out.println(book);
			
		}
				
	}
	
	
	public String updateBook() throws Exception{
		
		System.out.println("=====도서 정보 수정=====");
		
		System.out.print("수정 할 도서의 인덱스 입력: ");
		int index = sc.nextInt();
		
		if(bookList.isEmpty()) {
			return "입력된 도서 정보가 없습니다.";
		} else if(index < 0) {
			return "음수는 입력할 수 없습니다.";
		} else if(index >= bookList.size()) {

			return "범위를 넘어선 값을 입력할 수 없습니다.";
		} else {
			
			System.out.println(index + "번째 인덱스에 저장된 도서 정보");
			System.out.println(bookList.get(index));
			sc.nextLine();
			
			System.out.print("수정할 도서 명 : ");
			String name = sc.nextLine();
			System.out.print("수정할 작가 명 : ");
			String author = sc.nextLine();
			System.out.print("수정할 도서 가격 : ");
			int price = sc.nextInt();
			sc.nextLine();
			System.out.print("수정할 출판사 : ");
			String company = sc.nextLine();
			
			Book temp = bookList.set(index, new Book(name, author, price, company));
			
			return temp + " 도서의 정보가 수정 되었습니다.";
			
		}
		
		
	}
	
	public String deleteBook() throws Exception{
		
		System.out.print("삭제 할 도서의 인덱스 입력: ");
		int index = sc.nextInt();
		
		if(bookList.isEmpty()) {
			return "입력된 도서 정보가 없습니다.";
		} else if(index < 0) {
			return "음수는 입력할 수 없습니다.";
		} else if(index >= bookList.size()) {

			return "범위를 넘어선 값을 입력할 수 없습니다.";
			
		} else {
			System.out.print("정말 삭제 하겠습니까? (Y/N)");
			char ch = sc.next().toUpperCase().charAt(0);
			
			if(ch == 'Y') {
				Book temp = bookList.remove(index);
				return temp.getName() + "의 정보가 제거되었습니다.";
			} else {
				return "취소하였습니다";
			}
			
		}
			
		
	}
	
	
	
	public void addFavorite() {
		
		if(bookList.isEmpty()) {
			System.out.println("등록된 책 정보가 없습니다.");
			return;
			
		}
		
		System.out.print("즐겨찾기 추가할 도서 인덱스 입력 : ");
		
		int index = sc.nextInt();
		
		favoriteList.add(bookList.get(index));
		System.out.println(bookList.get(index).getName() + " 책이 즐겨찾기에 추가되었습니다.");
		
		FileWriter fw = null;
		
		int num = 0;
		
		try {
			
			fw = new FileWriter("favorites.txt");
			
			fw.write("===== 즐겨찾기 도서목록 =====\n");
			
			for(Book book : favoriteList) {												
				fw.write(num + "번 ");
				fw.write(book.getName()+ " ");
				fw.write(book.getAuthor() + "\n");
				
				num ++;
				
				
			}
			
			
		} catch(IOException e) {
			e.printStackTrace();
			
		} finally {
			
			try {
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}	
		
	}
	
	public String removeFavorite() {
		
		FileWriter fw = null;
		int num = 0;
		
		
		System.out.print("삭제 할 즐겨찾기 도서의 인덱스 입력: ");
		int index = sc.nextInt();
		
		if(favoriteList.isEmpty()) {
			return "입력된 도서 정보가 없습니다.";
		} else if(index < 0) {
			return "음수는 입력할 수 없습니다.";
		} else if(index >= favoriteList.size()) {

			return "범위를 넘어선 값을 입력할 수 없습니다.";
			
		} else {
			System.out.print("정말 삭제 하겠습니까? (Y/N)");
			char ch = sc.next().toUpperCase().charAt(0);
			
			if(ch == 'Y') {
				Book temp = favoriteList.remove(index);
				
				try {
					
					fw = new FileWriter("favorites.txt");
					
					fw.write("===== 즐겨찾기 도서목록 =====\n");
					
					for(Book book : favoriteList) {												
						fw.write(num + "번 ");
						fw.write(book.getName()+ " ");
						fw.write(book.getAuthor() + "\n");
						
						num ++;
					}
					
				} catch(IOException e) {
					e.printStackTrace();
					
				} finally {
					
					try {
						fw.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
				return temp.getName() + "가 즐겨찾기에서 제거되었습니다.";
				
			} else if(ch == 'N'){
				return "취소하였습니다.";
			} else{
				return "잘못 입력하셨습니다.";
			}
			
		}
		
		
	}

}
