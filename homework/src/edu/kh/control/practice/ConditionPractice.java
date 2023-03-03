package edu.kh.control.practice;

import java.util.Scanner;

public class ConditionPractice {
	
	Scanner sc = new Scanner(System.in);
	
	public void practice1() {
		
		System.out.print("숫자를 한개 입력하세요 : ");
		int input = sc.nextInt();
		
		if(input < 1) {
			System.out.println("양수만 입력해주세요.");
		} else if(input % 2 == 0) {
			System.out.println("짝수입니다.");
		} else {
			System.out.println("홀수입니다.");
		}
		
	}
	
	public void practice2() {
		
		int sum = 0;
		System.out.print("국어점수 : ");
		int inputKor = sc.nextInt();
		System.out.print("수학점수 : ");
		int inputMath = sc.nextInt();
		System.out.print("영어점수 : ");
		int inputEng = sc.nextInt();
		
		sum = inputKor + inputMath + inputEng;
		double avg = sum / 3;
		
		
		
		if(inputKor >= 40 && inputMath >= 40 && inputEng >= 40 && sum / 3 >= 60) {
			System.out.println("국어 : " + inputKor);
			System.out.println("수학 : " + inputMath);
			System.out.println("영어 : " + inputEng);
			System.out.println("합계 : " + sum);
			System.out.println("평균 : " + avg);
			System.out.println("축하합니다, 합격입니다!");
		} else {
			System.out.println("불합격입니다.");
		}
	}
	
	public void practice3() {
		
		System.out.print("1~12 사이의 정수 입력 : ");
		int month = sc.nextInt();
		
		switch(month) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			System.out.println(month + "월은 31일까지 있습니다."); break;
		case 4: case 6: case 9: case 11:
			System.out.println(month + "월은 30일까지 있습니다."); break;
		case 2: System.out.println(month + "월은 28일까지 있습니다."); break;
		default: System.out.println(month + "월은 잘못 입력된 달입니다.");
		}
	}
	
	public void practice4() {
		
		System.out.print("키(m)를 입력해 주세요 : ");
		double height = sc.nextDouble();
		System.out.print("몸무게(kg)를 입력해 주세요 : ");
		double weight = sc.nextDouble();
		
		double bmi = weight / (height * height);
		
		String result;
		
		if(bmi >= 30) {
			result = "고도 비만";
		} else if(bmi >= 25) {
			result = "비만";
		} else if (bmi >= 23) {
			result = "과체중";
		} else if (bmi >= 18.5) {
			result = "정상체중";
		} else {
			result = "저체중";
		}
		
		System.out.println("BMI 지수 : " + bmi);
		System.out.println(result);
	}
	
	public void practice5() {
		
		System.out.print("중간 고사 점수 : ");
		double score1 = sc.nextInt();
		System.out.print("기말 고사 점수 : ");
		double score2 = sc.nextInt();
		System.out.print("과제 점수 : ");
		double score3 = sc.nextInt();
		System.out.print("출석 횟수 : ");
		double score4 = sc.nextInt();
		
		System.out.println("=================결과================");
		
		score1 *= 0.2;
		score2 *= 0.3;
		score3 *= 0.3;
		
		double sum = 0;
		sum = score1 + score2 + score3 + score4;
				
		if(score4 <= 14) {
			System.out.println("Fail [출석 횟수 부족 (" + (int)score4 + "/20)]");
		} else {
			System.out.println("중간 고사 점수(20) : " + score1);
			System.out.println("기말 고사 점수(30) : " + score2);
			System.out.println("과제 점수		(30) : " + score3);
			System.out.println("출석 점수 	(20) : " + score4);
			System.out.println("총점 : " + sum);
			
			if(sum >= 70) {
				System.out.println("PASS");
			} else {
				System.out.println("Fail [점수 미달]");
			}
		}
		
	}

}
