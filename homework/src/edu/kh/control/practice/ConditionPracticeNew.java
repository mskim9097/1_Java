package edu.kh.control.practice;

import java.util.Scanner;

public class ConditionPracticeNew {
	
	public void practice1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ڸ� �� �� �Է��ϼ��� : ");
		int input = sc.nextInt();
		
//		if(input > 0) { // ���
//			
//			if(input % 2 == 0) { // ¦��
//				System.out.println("¦�� �Դϴ�.");
//			}else { // Ȧ��
//				System.out.println("Ȧ�� �Դϴ�.");
//			}
//			
//		} else {
//			System.out.println("����� �Է����ּ���.");
//		}
		
		
		String result;
		
		if(input <= 0) {
			result = "����� �Է����ּ���.";
		} else if (input % 2 == 0) {
			result = "¦�� �Դϴ�.";
		} else {
			result = "Ȧ�� �Դϴ�.";
		}
		
		System.out.println(result);
	}
	
	
	public void practice2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� ���� : ");
		int kor = sc.nextInt();
		
		System.out.print("���� ���� : ");
		int math = sc.nextInt();
		
		System.out.print("���� ���� : ");
		int eng = sc.nextInt();
		
		int sum = kor + math + eng; // �հ�
		
		double avg = sum / 3.0; // ���
		
		if(kor >= 40 && math >= 40 && eng >= 40 && avg >= 60 ) { // �հ�
			System.out.println("���� : " + kor);
			System.out.println("���� : " + math);
			System.out.println("���� : " + eng);
			System.out.println("�հ� : " + sum);
			System.out.println("��� : " + avg);
			
			System.out.println("�����մϴ�. �հ��Դϴ�.");
		} else { // ���հ�
			
			System.out.println("���հ��Դϴ�.");
		}
		
	}
	
	
	public void practice3() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1~12 ���� ���� �Է� : ");
		int month = sc.nextInt();
		
		// 30�� : 4 6 9 11
		// 31�� : 1 3 5 7 8 10 12
		// 28�� : 2
		switch(month) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			System.out.println(month + "���� 31�� ���� �ֽ��ϴ�.");
			break;
			
		case 4: case 6: case 9: case 11:
			System.out.println(month + "���� 30�� ���� �ֽ��ϴ�.");
			break;
		
		case 2:
			System.out.println(month + "���� 28�� ���� �ֽ��ϴ�.");
			break;
			
		default: System.out.println(month + "���� �߸� �Էµ� ���Դϴ�.");
		}

	}
	
	
	
	public void practice4() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ű(m)�� �Է��� �ּ��� : ");
		double height = sc.nextDouble();
		
		System.out.print("������(kg)�� �Է��� �ּ��� : ");
		double weight = sc.nextDouble();
		
		// BMI = ������ / (Ű(m) * Ű(m))
		double bmi = weight / (height * height);
		System.out.println("BMI ���� : " + bmi);
		
//		18.5�̸��� ��� ��ü��  
//		18.5�̻� 23�̸��� ��� ����ü��
//		23�̻� 25�̸��� ��� ��ü�� 
//		25�̻� 30�̸��� ��� ��
//		30�̻��� ��� �� ��
		
		String result ;
		
		if(bmi < 18.5) {
			result = "��ü��";
			
		} else if(bmi < 23) {
			result = "����ü��";
			
		} else if(bmi < 25) {
			result = "��ü��";
			
		} else if(bmi < 30) {
			result = "��";
			
		} else {
			result = "����";
		}

		System.out.println(result);
	}
	
	
	
	
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		
		// ������ ���� : ���뼺
		
		System.out.print("�߰� ��� ���� : ");
		double midTerm = sc.nextInt(); // int�� �Է� �޾Ƶ� ���� ���� �� double �ڵ� ����ȯ
		
		System.out.print("�⸻ ��� ���� : ");
		double finalTerm = sc.nextInt();
		
		System.out.print("���� ���� : ");
		double report = sc.nextInt();
		
		System.out.print("�⼮ Ƚ�� : ");
		double attendance = sc.nextInt();
		
		// ������ ������ ������ �°� ����
		midTerm   *= 0.2;   // midTerm = midTerm * 0.2;
		finalTerm *= 0.3;   
		report    *= 0.3;   
		//attendance *= 1; // attendance = attendance * 5 * 0.2;
		
		System.out.println("================= ��� =================");
		
		
		if(attendance <= 20 * (1 - 0.3)  ) { // 14�� ���� �⼮ ���� ���
			System.out.println("Fail [�⼮ Ƚ�� ����] (" + (int)attendance + "/20)");
													// �Ҽ��� ���� ó��
			
		}else { // �⼮ ����
			System.out.printf("�߰� ��� ����(20) : %.1f \n" , midTerm);
			System.out.printf("�⸻ ��� ����(30) : %.1f \n" , finalTerm);
			System.out.printf("���� ����     (30) : %.1f \n" , report);
			System.out.printf("�⼮ ����     (20) : %.1f \n" , attendance);
			
			double sum =  midTerm + finalTerm + report + attendance;
			
			System.out.printf("���� : %.1f \n" , sum);
			
			if(sum >= 70.0) {
				System.out.println("PASS");
			}else {
				System.out.println("Fail [���� �̴�]");
			}
		}
		
	}
	
	
}