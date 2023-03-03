package edu.kh.control.condition;

import java.util.Scanner;

public class ConditionExample { // 기능 정의용 클래스
	
	public void ex1() {
		// if문
		// - 조건식이 true 일 때만 내부 코드 수행
		
		/* [작성법]
		 *  if(조건식) {
		 *  	조건식이 true 일 때 수행될 코드
		 *  }
		 *  
		 *    
		 * if - else 문
		 * - 조건식 결과가 true면 if문,
		 *   false면 else 구문이 수행됨.
		 *   
		 * [작성법]
		 * if(조건식) {
		 * 		조건식이 true일 때 수행될 코드
		 * } else {
		 * 		조건식이 false일 때 수행될 코드
		 * }
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		// 입력된 정수가 양수인지 검사
		if(input > 0) {
			System.out.println("양수 입니다.");		
		} else {
			System.out.println("양수가 아닙니다.");
		}
		
		/*if(input <= 0) {
			System.out.println("양수가 아닙니다.");
		}*/
		
	}
	
	public void ex2() {
		// 홀짝 검사
		// 입력받은 값이 홀인지 짝인지 출력
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 입력 : ");
		int input = sc.nextInt();
		
		if(input % 2 == 0) {
			System.out.println("짝수 입니다.");	
		} else {
			System.out.println("홀수 입니다.");	
		}
	}
	
	public void ex3() {
		// 달(month)를 입력받아 해당 달에 맞는 계절 출력
		
		Scanner sc = new Scanner(System.in);
		System.out.print("달 입력: ");
		int month = sc.nextInt();
		
		// 사용자에게 온도를 받음.
		System.out.print("온도 입력: ");
		int temperature = sc.nextInt();
		
		String season;
		
		// 봄: 3,4,5
		// 여름: 6,7,8
		// 가을: 9,10,11
		// 겨울: 12,1,2
		if(month == 3 || month == 4 || month == 5 ) {
			season = "봄";
		} else if(month >= 6 && month <= 8) {
			season = "여름";
			
			if(temperature >= 35) {
				// season = season + "";
				// season = "여름" + "폭염 경보"
				season += " 폭염 경보";
			}else if(temperature >= 33) {
				season += " 폭염 주의보";
			}
			
		} else if(month >= 9 && month <=11) {
			season = "가을";
		} else if(month == 12 || month == 1 || month == 2 ) {
			season = "거울";
		} else {
			season = "해당하는 계절 없음";
		}
		
		System.out.println(season);
	}
	
	public void ex4() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		if(age <= 13) {
			System.out.println("어린이 입니다.");	
		} else if(age > 19) {
			System.out.println("성인 입니다.");
		} else {
			System.out.println("청소년 입니다.");
		}		
	}
	
	public void ex5() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수(100점 만점): ");
		int score = sc.nextInt();
		
		String result; // 결과를 담을 String 변수선언
		
		if(score > 100 || score < 0) {
			result = "잘못 입력하셨습니다";
		} else if(score >= 90) {
			result = "A";
		} else if(score >= 80) {
			result = "B";
		} else if(score >= 70) {
			result = "C";
		} else if(score >= 60) {
			result = "D";
		} else {
			result = "F";
		}
		
		System.out.println(result);
	}
	
	public void ex6() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		String result; // 결과 담을 변수 선언. 초기화X
		
		if(age > 100 || age < 0) {
			result = "나이를 잘못 입력 하셨습니다";	
		} else {
			
			System.out.print("키 : ");
			double height = sc.nextDouble();
			
			if(height > 250.0 || height < 0 ) {
				result = "키를 잘못 입력 하셨습니다";
			} else { 
				// 키를 잘 입력한 경우
				
				if(age < 12 && height >= 140.0) { // 나이X, 키 O
					result = "키는 적절하나, 나이는 적절치 않음";
				} else if(age >= 12 && height < 140.0) { // 나이O, 키X
					result = "나이는 적절하나, 키는 적절치 않음";
				} else if(age < 12 && height < 140.0) {
					result = "나이와 키 모두 적절치 않음";
				} else {
					result = "탑승 가능";
				}
			}		
		}		
		System.out.println(result);
	}
	
}
