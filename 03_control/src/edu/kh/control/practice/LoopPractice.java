package edu.kh.control.practice;

import java.util.Scanner;

public class LoopPractice {
	
	Scanner sc = new Scanner(System.in);
	
	public void practice1() {
		
		System.out.print("1 이상의 숫자를 입력하세요 : ");
		int input = sc.nextInt();
		
		if(input >= 1) {
			for(int i = 1; i <= input; i++) {
				System.out.print(i + " ");
			}
		} else {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		}
		
	}
	
	public void practice2() {
		
		System.out.print("1 이상의 숫자를 입력하세요 : ");
		int input = sc.nextInt();
		
		if(input >= 1) {
			for(int i = input; i >= 1; i--) {
				System.out.print(i + " ");
			}
		} else {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		}
	}
	
	public void practice3() { // 질문: 문제는 양수인거처럼 물어보
							//는데 정수를 입력하라고해서 일단 양수만
							//적용되게했어요
		
		
		System.out.print("정수를 하나 입력하세요 : ");
		int input = sc.nextInt();
		int sum = 0;
		
		for(int i = 1; i <= input; i++) {
			sum += i;
			if(i < input) {
				System.out.print(i + " + ");
			} else {
				System.out.print(i + " = " + sum);
			}

		}
	}
	
	public void practice4() { //////집에서 풀이랑 비교
		
		System.out.print("첫 번째 숫자 : ");
		int input1 = sc.nextInt();
		System.out.print("두 번쨰 숫자 : ");
		int input2 = sc.nextInt();
		
		if(input1 < 1 || input2 < 1) {
			System.out.println("1 이상의 숫자를 입력해주세요.");
			
		} else if(input1 >= input2) {
			for ( int i = input2; i <= input1; i++)
				System.out.print(i + " ");
		} else {
			for ( int i = input1; i <= input2; i++)
				System.out.print(i + " ");
		}
	}
	
	public void practice5() {
		
		System.out.print("숫자 : ");
		int input = sc.nextInt();
		System.out.printf("===== %d단 =====\n", input);
		
		for(int i = 1; i <= 9; i++) {			
			System.out.printf("%2d * %2d = %2d%n", input, i, (input * i));
		}
		
	}
	
	public void practice6() { ////// 집에서 풀이랑 비교
		
		System.out.print("숫자 : ");
		int input = sc.nextInt();
		
		if(input > 9 || input < 2) {
			System.out.println("2~9 사이의 숫자만 입력해주세요.");
			
		} else {			
			for(int x = input; x <= 9 ; x++) {
				System.out.println("===== " + x + "단 =====");

				for(int y = 1; y <= 9 ; y++) {					
					System.out.printf("%2d X %2d = %2d%n", x, y, x*y);

				}
			}
		}
	}
	
	public void practice7() {
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		for(int x = 1; x <= input; x++) {
			for(int y = 1; y <= x; y++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
	
	public void practice8() { ////// 집에서 풀이랑 비교
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		for(int x = 1; x <= input; x++) {
			for(int y = input; y >= x; y--) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
	
	public void practice9() {
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		for(int x = 1; x <= input; x++) {
			for(int y = 1; y <= input; y++) {
				if(y <= input - x) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println("");
		}
	}
	
	public void practice10() {
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		for(int x = 1; x <= input; x++) {
			for(int y = 1; x >= y; y++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int x = 1; x < input; x++) {
			for(int y = input; y > x; y--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void practice11() { //////////풀이 확인
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		for(int x = 1; x <= input; x++) {
			for(int y = 1; y <= input - x; y++) {
				System.out.print(" ");
		}
			for(int y = 1; y <= 2 * x - 1; y++) {
				System.out.print("*");
			}
			System.out.println();

		}
	}
	
	public void practice12() {
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		for(int x = 1; x <= input; x++) {
			for(int y = 1; y <= input; y++) {
				if(x == 1 || x == input || y == 1 || y == input) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}
	
	public void practice13() {
		
		System.out.print("자연수 하나를 입력하세요 : ");
		int input = sc.nextInt();
		int count = 0;
		
		
		for(int x = 1; x <= input; x++) {
			if(x % 2 == 0 || x % 3 == 0) {
				System.out.print(x + " ");
				
				if(x % 2 == 0 && x % 3 == 0) {
					count ++;
				}
			}			
		}		
		
		System.out.println("\ncount : " + count);
		
		
	}

}