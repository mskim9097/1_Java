package com.kh.practice.snack.view;

import java.util.Scanner;

import com.kh.practice.snack.controller.SnackController;

public class SnackMenu {
	
	private Scanner sc = new Scanner(System.in);
	private SnackController scr = new SnackController();
	
	public void menu() {
				
		int num = 0;	
				
		do {
			System.out.println("�������� �Է��ϼ���.");
			try {
				System.out.print("���� : ");
				String kind = sc.next();
				System.out.print("�̸� : ");
				String name = sc.next();
				System.out.print("�� : ");
				String flavor = sc.next();
				System.out.print("���� : ");
				int numOf = sc.nextInt();
				sc.nextLine();
				System.out.print("���� : ");
				int price = sc.nextInt();
				
				System.out.println(scr.savaData(kind, name, flavor, numOf, price));
				num = 1;
			} catch (Exception e) {
				System.out.println("�ٽ� �Է����ּ���.");
				sc.nextLine();
			}
						
		}while(num != 1);
		
		String result = sc.next();
		
		if(result.toUpperCase().equals("Y")) {
			System.out.println(scr.confirmData());
		}
				
		
	}

}
