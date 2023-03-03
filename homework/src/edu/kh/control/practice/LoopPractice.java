package edu.kh.control.practice;

import java.util.Scanner;

public class LoopPractice {
	
	Scanner sc = new Scanner(System.in);
	
	public void practice1() {
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int input = sc.nextInt();
		
		if(input < 1) {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		} else {
			for(int i = 1; i <= input; i++) {
				System.out.print(i +" ");
			}
		}
	}
	
	public void practice2() {
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int input = sc.nextInt();
		
		if(input < 1) {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		} else {
			for(int i = input; i >= 1; i--) {
				System.out.print(i + " ");
			}
		}
	}
	
	public void practice3() {
		
		int sum = 0;
		System.out.print("정수를 하나 입력하세요 : ");
		int input = sc.nextInt();
		
		for(int i = 1; i <= input; i++) {
			sum += i;
			if(i < input) {
				System.out.print(i + " + ");
			} else {
				System.out.print(i + " = " + sum);
			}
		}
		
	}
	
	public void practice4() {
		
		System.out.print("첫 번째 숫자 : ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 숫자 : ");
		int num2 = sc.nextInt();
		
		if(num1 < 1 || num2 < 1) {
			System.out.println("1 이상의 숫자를 입력해주세요");
		} else if(num1 >= num2) {
			for(int i = num2; i <= num1; i++) {
				System.out.print(i + " ");
			}
		} else {
			for(int i = num1; i <= num2; i++) {
				System.out.print(i + " ");
			}
		}
	}
	
	public void practice5() {
		
		System.out.print("숫자 : ");
		int input = sc.nextInt();
		System.out.println("===== " + input + "단 =====");
		
		for(int i = 1; i <= 9; i++) {
			System.out.printf("%d * %d = %d\n", input, i, input * i);
		}
		
	}
	
	public void practice6() {
		
		System.out.print("숫자 : ");
		int input = sc.nextInt();
		
		if(input >= 10) {
			System.out.println("2~9 사이 숫자만 입력해주세요.");
		} else {
			for(int i = input; i <= 9; i++) {
				System.out.println("===== " + i + "단 =====");
				for(int j = 1; j <= 9; j++) {
					System.out.printf("%d * %d = %d\n", i, j, i * j);
				}
			} 
		}
	}
	
	public void practice7() {
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		for(int i = 1; i <= input; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void practice8() {
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		for(int i = 1; i <= input; i++) {
			for(int j = input; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void practice9() {
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		for(int i = 1; i <= input; i++) {
			for(int j = 1; j <= input; j++) {
				if(j <= input - i) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
	
	public void practice10() {
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		for(int i = 1; i <= input; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
				
		for(int i = 1; i <= input -1; i++) {
			for(int j = input - 1; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
	public void practice11() {
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		for(int i = 1; i <= input; i++) {
			for(int j = 1; j <= 2 * input -1; j++) {
				if(j <= input - i || j >= input + i) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
	
	public void practice12() {
		System.out.println("정수 입력 : ");
		int input = sc.nextInt();
		
		for(int i = 1; i <= input; i++) {
			for(int j = 1; j <= input; j++) {
				if(i == 1 || i == input) {
					System.out.print("*");
				}else if(j == 1 || j == input) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	
	public void pracice13() {
		System.out.print("자연수 하나를 입력하세요 : ");
		int input = sc.nextInt();
		
		int count = 0;
		for(int i = 1; i <= input; i++) {
			if(i % 2 == 0 || i % 3 == 0) {
				System.out.print(i + " ");
				if(i % 2 == 0 && i % 3 == 0) {
					count ++;
				}
			} 
			
		}
		System.out.println("\ncount : " + count);
		
	}

}
