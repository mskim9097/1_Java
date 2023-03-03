package edu.kh.control.practice;

import java.util.Scanner;

public class ConditionPractice {
	
	Scanner sc = new Scanner(System.in);
	
	public void practice1() {
		
		System.out.print("���ڸ� �Ѱ� �Է��ϼ��� : ");
		int input = sc.nextInt();
		
		if(input < 1) {
			System.out.println("����� �Է����ּ���.");
		} else if(input % 2 == 0) {
			System.out.println("¦���Դϴ�.");
		} else {
			System.out.println("Ȧ���Դϴ�.");
		}
		
	}
	
	public void practice2() {
		
		int sum = 0;
		System.out.print("�������� : ");
		int inputKor = sc.nextInt();
		System.out.print("�������� : ");
		int inputMath = sc.nextInt();
		System.out.print("�������� : ");
		int inputEng = sc.nextInt();
		
		sum = inputKor + inputMath + inputEng;
		double avg = sum / 3;
		
		
		
		if(inputKor >= 40 && inputMath >= 40 && inputEng >= 40 && sum / 3 >= 60) {
			System.out.println("���� : " + inputKor);
			System.out.println("���� : " + inputMath);
			System.out.println("���� : " + inputEng);
			System.out.println("�հ� : " + sum);
			System.out.println("��� : " + avg);
			System.out.println("�����մϴ�, �հ��Դϴ�!");
		} else {
			System.out.println("���հ��Դϴ�.");
		}
	}
	
	public void practice3() {
		
		System.out.print("1~12 ������ ���� �Է� : ");
		int month = sc.nextInt();
		
		switch(month) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			System.out.println(month + "���� 31�ϱ��� �ֽ��ϴ�."); break;
		case 4: case 6: case 9: case 11:
			System.out.println(month + "���� 30�ϱ��� �ֽ��ϴ�."); break;
		case 2: System.out.println(month + "���� 28�ϱ��� �ֽ��ϴ�."); break;
		default: System.out.println(month + "���� �߸� �Էµ� ���Դϴ�.");
		}
	}
	
	public void practice4() {
		
		System.out.print("Ű(m)�� �Է��� �ּ��� : ");
		double height = sc.nextDouble();
		System.out.print("������(kg)�� �Է��� �ּ��� : ");
		double weight = sc.nextDouble();
		
		double bmi = weight / (height * height);
		
		String result;
		
		if(bmi >= 30) {
			result = "�� ��";
		} else if(bmi >= 25) {
			result = "��";
		} else if (bmi >= 23) {
			result = "��ü��";
		} else if (bmi >= 18.5) {
			result = "����ü��";
		} else {
			result = "��ü��";
		}
		
		System.out.println("BMI ���� : " + bmi);
		System.out.println(result);
	}
	
	public void practice5() {
		
		System.out.print("�߰� ��� ���� : ");
		double score1 = sc.nextInt();
		System.out.print("�⸻ ��� ���� : ");
		double score2 = sc.nextInt();
		System.out.print("���� ���� : ");
		double score3 = sc.nextInt();
		System.out.print("�⼮ Ƚ�� : ");
		double score4 = sc.nextInt();
		
		System.out.println("=================���================");
		
		score1 *= 0.2;
		score2 *= 0.3;
		score3 *= 0.3;
		
		double sum = 0;
		sum = score1 + score2 + score3 + score4;
				
		if(score4 <= 14) {
			System.out.println("Fail [�⼮ Ƚ�� ���� (" + (int)score4 + "/20)]");
		} else {
			System.out.println("�߰� ��� ����(20) : " + score1);
			System.out.println("�⸻ ��� ����(30) : " + score2);
			System.out.println("���� ����		(30) : " + score3);
			System.out.println("�⼮ ���� 	(20) : " + score4);
			System.out.println("���� : " + sum);
			
			if(sum >= 70) {
				System.out.println("PASS");
			} else {
				System.out.println("Fail [���� �̴�]");
			}
		}
		
	}

}
