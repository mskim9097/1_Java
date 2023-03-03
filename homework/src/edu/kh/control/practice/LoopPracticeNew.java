 package edu.kh.control.practice;

import java.util.Scanner;

public class LoopPracticeNew {

	/* �ǽ����� 1
	����ڷκ��� �� ���� ���� �Է� �޾� 1���� �� ���ڱ����� ���ڵ��� ��� ����ϼ���.
	��, �Է��� ���� 1���� ũ�ų� ���ƾ� �մϴ�. 
	���� 1 �̸��� ���ڰ� �Էµƴٸ� ��1 �̻��� ���ڸ� �Է����ּ��䡰�� ����ϼ���.
	*/
	public void practice1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("1�̻��� ���ڸ� �Է��ϼ��� : ");
		int input = sc.nextInt();

		if (input >= 1) {
			for (int i = 1; i <= input; i++) {
				System.out.print(i + " ");
			}
		} else {
			System.out.println("1 �̻��� ���ڸ� �Է����ּ���.");
		}
	}
	
	
	/* �ǽ����� 2
	����ڷκ��� �� ���� ���� �Է� �޾� 1���� �� ���ڱ����� ��� ���ڸ� �Ųٷ� ����ϼ���.
	��, �Է��� ���� 1���� ũ�ų� ���ƾ� �մϴ�. 
	*/
	public void practice2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("1�̻��� ���ڸ� �Է��ϼ��� : ");
		int input = sc.nextInt();

		if (input >= 1) {
			for (int i = input; i >= 1; i--) {
				System.out.print(i + " ");
			}
		} else {
			System.out.println("1 �̻��� ���ڸ� �Է����ּ���.");
		}
	}
	
	
	/* �ǽ����� 3
	1���� ����ڿ��� �Է� ���� �������� �������� ���� for���� �̿��Ͽ� ����ϼ���.
	*/
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �ϳ� �Է��ϼ��� : ");
		int num = sc.nextInt();
		
		int sum = 0;
		
		for(int i=1 ; i <= num ; i++) {
			sum += i;
			
			if(i < num) {
				System.out.print(i + " + ");
			} else {
				System.out.println(i + " = " + sum);
			}
		}
	}
	
	/* �ǽ����� 4
	 ����ڷκ��� �� ���� ���� �Է� �޾� �� ������ ���ڸ� ��� ����ϼ���.
	���� 1 �̸��� ���ڰ� �Էµƴٸ� ��1 �̻��� ���ڸ� �Է����ּ��䡰�� ����ϼ���.
	ex.
	ù ��° ���� : 8	ù ��° ���� : 4	ù ��° ���� : 9
	�� ��° ���� : 4 	�� ��° ���� : 8 	�� ��° ���� : 0
	4 5 6 7 8 			4 5 6 7 8 			1 �̻��� ���ڸ� �Է����ּ���.*/
	public void practice4() {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("ù ��° ���� : ");
		int num1 = sc.nextInt();
		
		System.out.print("�� ��° ���� : ");
		int num2 = sc.nextInt();

		if( num1 < 1  ||  num2 < 1 ) { // num1, num2 �߿� 1 �̸��� �ִ°�?
			System.out.println("1 �̻��� ���ڸ� �Է����ּ���.");
			
		} else { // �� �� 1 �̸��� �ƴϴ�
			//  8       4
			if(num1 > num2) { 
				/* ù��° �� num1�� num2���� Ŭ ���
				 * �� ������ �� ��ȯ�� ������Ѵ�.
				 * ù��° �� (����)~ �ι�°��(����)�� ���ǽ��� 
				 * �������ϱ� ������
				 * */
				
				// �� ������ �� ��ȯ
				int temp = num1;  //  temp : 8 / num1 : 8 / num2 : 4
				num1 = num2; //  temp : 8 / num1 : 4 / num2 : 4
				num2 = temp; //  temp : 8 / num1 : 4 / num2 : 8
			}
			
			for(int i=num1 ; i<=num2 ; i++) {
				System.out.print(i + " ");
			}
			
			
			/*int start = num1;
			int end = num2;
			
			if(num1 > num2) { // ���� �Է��� ���ڰ� ũ�� start / end�� �ٲ�
				start = num2;
				end = num1;
			}
			
			for(int i = start ; i <= end ; i++) {
				System.out.print(i + " ");
			}*/
			
			
			
			/*if(num1 < num2) {
				for(int i=num1 ; i<=num2 ; i++) {
					System.out.print(i + " ");
				}
			} else {
				for(int i=num2 ; i<=num1 ; i++) {
					System.out.print(i + " ");
				}
			}*/
			
		}
		
	}
	
	
	
	/* �ǽ����� 5
	 ����ڷκ��� �Է� ���� ������ ���� ����ϼ���.
	 */
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
		int num = sc.nextInt();
		
		System.out.printf("===== %d�� =====\n", num);
		for(int i = 1; i < 10; i++) {			
			System.out.printf("%d * %d = %d%n", num, i, (num * i));
		}
	}
	
	
	/* �ǽ����� 6
	����ڷκ��� �Է� ���� ������ �ܺ��� 9�ܱ��� ����ϼ���.
	��, 2~9�� ���̰� �ƴ� ���� �Է��ϸ� ��2~9 ���� ���ڸ� �Է����ּ��䡱�� ����ϼ���.*/
	public void practice6() {
		

		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� : ");
		int num = sc.nextInt();
		
		if( num >= 2 && num <=9 ) {
			/* ����ڰ� �Է��� ���� �� ���� 9�ܱ���
			 * ==> dan(input) ~ 9����
			 * dan(input) <= 9;
			 * */
			
			for(int dan = num ; dan <= 9 ; dan++) {
				
				System.out.println("===== " + dan + "�� =====");
				
				for(int i = 1 ; i<=9 ; i++) {
					System.out.printf("%d X %d = %2d \n" , dan , i , dan * i);
				}
				
				System.out.println(); // �� ���� �� �ٲ�
			}
			
		} else {
			System.out.println("2~9 ���� ���ڸ� �Է����ּ���");
		}

		
		
	}
	
	
	
	/* �ǽ�����7
	������ ���� ���� ������ �����ϼ���.
	ex.
	���� �Է� : 4
	*
	**
	***
	****
	*/
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int num = sc.nextInt();
		
		for(int row = 1; row <= num; row++) {
			for(int col = 1; col <= row; col++) {				
				System.out.print("*");
			}
			
			System.out.println(); // �ٹٲ�
		}
	}
	
	
	/* �ǽ����� 8
	������ ���� ���� ������ �����ϼ���.
	ex.
	���� �Է� : 4
	****
	***
	**
	*
	*/
	public void practice8() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int num = sc.nextInt();
		
		for(int row = num; row > 0; row--) {
			
			for(int col = row; col > 0; col--) {
				System.out.print("*");
			}
			
			System.out.println(); // �� �ٲ�
		}
	}
	
	
	/* �ǽ����� 9
	������ ���� ���� ������ �����ϼ���.
	ex.
	���� �Է� : 4
	   *
	  **
	 ***
	****
	
	*/ 
	public void practice9() {


		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Է� : ");
		int input = sc.nextInt(); // 4�Է½�
						//1) 1 <= 4;
		for(int row = 1 ; row <= input ; row++ ) {
							
			// if���� �̿��� Ǯ��   1) 1 <= 4
			for(int col = 1 ; col <= input ; col++) {
				// 1) 1 <= 4 - 1; -> 1 <= 3 true
				// 2) 2 <= 4 - 1; -> 2 <= 3 true
				// 3) 3 <= 4 - 1; -> 3 <= 3 true
				// 4) 4 <= 4 - 1; -> 4 <= 3 false
				// -> else������ �̵�
				if(col <= input - row) {
					System.out.print(" ");
					
				}else {
					// 4) 4 <= 4 - 1; -> 4 <= 3 false 
					// �� �� ó�� ����
					System.out.print("*");
				}
			}
			
			System.out.println(); // �ٹٲ�
		}

	}
	
	
	/* �ǽ����� 10
	������ ���� ���� ������ �����ϼ���.
	ex.
	���� �Է� : 3
	*
	**
	***
	**
	*
	*/
	// �ߴ���
	public void practice10() {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Է� : ");
		int input = sc.nextInt();
		
		// ���� �ﰢ��
		for(int row = 1 ; row <= input ; row++) {
			for(int col = 1 ; col <= row ; col++) {
				System.out.print("*");
			}
			System.out.println(); // �ٹٲ�
		}
		
		// �Ʒ��� �ﰢ��
		for(int row = input - 1; row >= 1 ; row--) {
			for(int col = 1 ; col <= row ; col++) {
				System.out.print("*");
			}
			System.out.println(); // �ٹٲ�
		}
		
		
		System.out.println("====================");
		
		
		for(int row=1; row<= input*2-1; row++) {
         
    	  if(row < input) {
        	  
             for(int col=1; col <= row; col++) {
                System.out.print("*");
             }
             
          } else {
             for(int col=input ; col > row-input; col--) {
                System.out.print("*");
             }
          }
          
          System.out.println();
       }
		
	}
	
	
	/* �ǽ����� 11
	������ ���� ���� ������ �����ϼ���.
	ex.
	���� �Է� : 4
	    *
	   ***
	  *****
	 *******
	*/
	// �������� �ϳ��� �þ
	// �Է��� ������ �� ��ŭ
	public void practice11() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Է� : ");
		// 4�Է½�
		int input = sc.nextInt();
						// 1) 1 <= 4
		for(int row = 1 ; row <= input ; row++ ) {
	
			// if���� �̿��� Ǯ��   1 <= 4 * 2 - 1;
			for(int col = 1 ; col <= input * 2 - 1; col++) {
				// ������ ���� �� ����: input�� 2�� ���Ѱ��� -1
				//		row	  cor ||      row  cor
				//1)  4 - 1 >= 1  ||  4 + 1 <= 1  true
				//2)  4 - 1 >= 2  ||  4 + 1 <= 2  true
				//3)  4 - 1 >= 3  ||  4 + 1 <= 3  true
				//4)  4 - 1 >= 4  ||  4 + 1 <= 4  false
				if( input-row>=col || input+row<=col) {
					System.out.print(" ");
					
				}else{
					System.out.print("*");
				}
			}
			
			System.out.println(); // �ٹٲ�
		}
		
	}
	
	/*  �ǽ����� 12
	������ ���� ���� ������ �����ϼ���.
	ex.
	���� �Է� : 5
	*****
	*   *
	*   *
	*   *
	*****
	*/
	public void practice12() {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Է� : ");
		int input = sc.nextInt();
		
		for(int row = 1 ; row <= input ; row++) {
			
			for(int col = 1 ; col <= input ; col++) {
				
				// ù ��° / ������ ��, ĭ�� ���� * ���
				// �Է��� ��ǲ�� ���̸�ŭ �࿭ ���̸� ����
				if(row == 1 || row == input || col == 1 || col == input) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	
	/* �ǽ����� 13
	1���� ����ڿ��� �Է� ���� ������ �߿��� 
	1) 2�� 3�� ����� ��� ����ϰ�
	2) 2�� 3�� ������� ������ ����ϼ���.
	* ����������� �� �̻��� ���� ������ ������ ������ � ���� �ش� ����� ������ �� 
	  ��� �������� 0�� ������ �� 
	ex.
	�ڿ��� �ϳ��� �Է��ϼ��� : 15
	2 3 4 6 8 9 10 12 14 15 // 2�� 3�� ���
	count : 2		// 2�� 3�� ����� (6, 12)
	 */
	public void practice13() {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�ڿ��� �ϳ��� �Է��ϼ��� : ");
		int input = sc.nextInt();

		int count = 0;
		
		for(int i = 1; i <= input ; i++) {
			
			// 2�� ��� �Ǵ� 3�� ����� ��� ���
			// => 2�� 3���� ���������� ���������� 0�� ���
			if(i % 2 == 0 || i % 3 == 0) {
				System.out.print(i + " ");
				
				// 2�� 3�� �������¸���? 
				// ==> 2�ε� ������ ��������, 3���ε� ������ ��������
				if(i % 2 == 0 && i % 3 == 0) {
					count++; // count ����
				}
			}
		}
		
		System.out.println("\ncount : " + count);
		
	}
}