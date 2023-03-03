package com.kh.practice.snack.view;

import java.util.Scanner;

import com.kh.practice.snack.controller.SnackController;

public class SnackMenu {
	
	private Scanner sc = new Scanner(System.in);
	private SnackController scr = new SnackController();
	
	public void menu() {
				
		int num = 0;	
				
		do {
			System.out.println("스낵류를 입력하세요.");
			try {
				System.out.print("종류 : ");
				String kind = sc.next();
				System.out.print("이름 : ");
				String name = sc.next();
				System.out.print("맛 : ");
				String flavor = sc.next();
				System.out.print("개수 : ");
				int numOf = sc.nextInt();
				sc.nextLine();
				System.out.print("가격 : ");
				int price = sc.nextInt();
				
				System.out.println(scr.savaData(kind, name, flavor, numOf, price));
				num = 1;
			} catch (Exception e) {
				System.out.println("다시 입력해주세요.");
				sc.nextLine();
			}
						
		}while(num != 1);
		
		String result = sc.next();
		
		if(result.toUpperCase().equals("Y")) {
			System.out.println(scr.confirmData());
		}
				
		
	}

}
