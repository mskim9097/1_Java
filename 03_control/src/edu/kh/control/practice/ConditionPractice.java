package edu.kh.control.practice;

import java.util.Scanner;

public class ConditionPractice {
	
	Scanner sc = new Scanner(System.in);
	
	public void practice1() {
		
		System.out.print("숫자를 한 개 입력하세요 : ");
		int input = sc.nextInt();
		
		String result; 
		
		if(input <= 0) {
			result = "양수만 입력해주세요.";
		} else if(input % 2 == 0) {
			result = "짝수입니다.";
		} else {
			result = "홀수입니다.";
		}
		System.out.println(result);
	}
	
	public void practice2() {
		
		System.out.print("국어 점수 : ");
		int kor = sc.nextInt();
		
		System.out.print("수학 점수 : ");
		int math = sc.nextInt();
		
		System.out.print("영어 점수 : ");
		int eng = sc.nextInt();
		
		int sum = kor + eng + math;
		double avg = sum / 3.0;
		
		boolean result = (kor >= 40) && (eng >= 40) 
				&& (math >= 40) && (avg >= 60);
		
		if(result) {
			System.out.println("국어 : " + kor);
			System.out.println("수학 : " + math);
			System.out.println("영어 : " + eng);
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
		
		String result;
		
		switch(month) {
		
		case 1: case 3: case 5: case 7: case 8: 
		case 10: case 12: result = month + "월은 31일까지 있습니다.";
		break;
		case 4: case 6: case 9: case 11: 
		result = month + "월은 30일까지 있습니다.";
		break;
		case 2: result = month + "월은 28일까지 있습니다.";
		break;
		default : result = month + "월은 잘못 입력된 달입니다.";		
		}
		
		System.out.println(result);
	}
	
	public void practice4() {
		
		System.out.print("키(m)를 입력해 주세요 : ");
		double height = sc.nextDouble();
		
		System.out.print("몸무게(kg)를 입력해 주세요 : ");
		double weight = sc.nextDouble();
		
		String result;
		
		double bmi = weight / (height * height);
		
		if(bmi >= 30) {
			result = "고도 비만";
		} else if(bmi < 18.5) {
			result = "저체중";
		} else if(bmi >= 25) {
			result = "비만";
		} else if(bmi >= 23) {
			result = "과체중";
		} else {
			result = "정상체중";
		}
		
		System.out.println("BMI 지수 : " + bmi);
		System.out.println(result);
		
	}
	
	public void practice5() {
		
		System.out.print("중간 고사 점수 : ");
		int score1 = sc.nextInt();
		System.out.print("기말 고사 점수 : ");
		int score2 = sc.nextInt();
		System.out.print("과제 점수 : ");
		int score3 = sc.nextInt();
		System.out.print("출석 횟수 : ");
		int score4 = sc.nextInt();
		
		
		
		double score5 = score1 * 0.2;
		double score6 = score2 * 0.3;
		double score7 = score3 * 0.3;
		double score8 = score4;
		double total = score5 + score6 + score7 + score8;
		//30퍼이상 결석시 페일 => 20회중 6회이상 결석시 페일
		if(score4 <= 14) {
			System.out.println("================= 결과 =================");
			System.out.println("Fail [출석 횟수 부족 (" + score4 + "/20)]");
		} else if(score4 > 20) {
			System.out.println("================= 결과 =================");
			System.out.println("출석일수를 다시 입력해주세요.");
		} else {
			if(total >= 70) {
				System.out.println("================= 결과 =================");
				System.out.println("중간 고사 점수(20) : " + score5);
				System.out.println("기말 고사 점수(30) : " + score6);
				System.out.println("과제 점수		(30) : " + score7);
				System.out.println("출석 점수		(20) : " + score8);
				System.out.println("총점 : " + total);
				System.out.println("PASS");
			} else {
				System.out.println("================= 결과 =================");
				System.out.println("중간 고사 점수(20) : " + score5);
				System.out.println("기말 고사 점수(30) : " + score6);
				System.out.println("과제 점수		(30) : " + score7);
				System.out.println("출석 점수		(20) : " + score8);
				System.out.println("총점 : " + total);
				System.out.println("Fail [점수 미달]");
			}
		}
		
	}
	
}
