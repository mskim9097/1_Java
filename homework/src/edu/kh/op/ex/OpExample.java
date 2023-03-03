package edu.kh.op.ex;

import java.util.Scanner;

/* �̹� �������ʹ� �̸� �����ϱ� �ٶ��ٴ� ������ ���
 * �뵵�� �°� Ŭ���� �и��ϴ� �۾��� ������ ���̴�.
 * Ŭ���� �̾ ���� ��Ű���ȿ� ExampleRun �� ������ش�.
 * �� �ȿ� ���θ޼ҵ� �����.
 * 
 * �׽�Ʈ, ������ �����뵵 �� �̿ܿ�
 * �������� ������Ʈ �� �� ���ݱ��� ��� ������� ���� X
 * �ڹ��� Ư¡? ��ü������
 * ��ǻ�;ȿ� ����� ����ִ�.
 * ���� ������ �ְ� �������� �����Ѵ�.
 * ���� ����, �������� �л��̶� ������ �ֵ���.
 * �ڵ� �����Ŭ������ ������ ���ุ ��Ű�� Ŭ����
 * */

/* �׽�Ʈ�� �����ڵ�� ���⿡ �ۼ� */
public class OpExample { // ���� �ڵ� �ۼ��� Ŭ����
	
	// ex1() method�޼���: ��ü ���� ���α׷��ֿ��� ��ü�� ���õ� ���� ��ƾ (�Ǵ� �Լ�)
	// -> OpExample�� ������ �ִ� ��� �� ex1()�̶�� ���
	public void ex1() {
		System.out.println("OpExample Ŭ������ ex1() ��� ����");
		System.out.println("Ŭ���� �и� �׽�Ʈ");
		System.out.println("println �ڵ��ϼ� �غþ��~");
	}
	/* ������ ���� �������� �ȵȴ�. main �޼��忡�� ���� ���߱� ���� */

	/* ��Ŭ������ ����Ŭ���� �������� �����ؼ� �����ֱ� */
	// ex2() �޼���
	public void ex2() {
		Scanner sc = new Scanner(System.in);
		// ����ɶ� ExampleRun -> OpExample -> Scanner ������ ����
		// ������Ű������ �ֱ� �ʱ⶧���� import(����)�ؿ;��մϴ�.
		
		System.out.print("���� �Է� 1 : ");
	    int input1 = sc.nextInt(); // ���� �ԷµǴ� ������ �о��.
	    
	    System.out.print("���� �Է� 2 : ");
	    int input2 = sc.nextInt();
	    
	    System.out.printf("%d / %d = %d\n", input1, input2, input1 / input2);
	    System.out.printf("%d %% %d = %d\n", input1, input2, input1 % input2);
	    				   // %% : printf ���� '%' ���� ����ϴ� ���
		
	}
	
	
	/* ������_ ppt4������ ���������� */
	public void ex3() {
		// ����(����, ����) ������ : ++, --
		// -> �ǿ�����(��)�� 1 ���� �Ǵ� ���� ��Ű�� ������
		
		int iNum1 = 10;
		int iNum2 = 10;
		
		iNum1++; // iNum1 1 ����
		iNum2--; // iNum2 1 ����
		
		System.out.println("iNum1 : " + iNum1);
		System.out.println("iNum2 : " + iNum2);
		
		
		// ���� ���� :  ++3  , --2  �����ڰ� ���ʿ� ��ġ
		// -> �ٸ� �����ں��� ���� ����/����
		int temp1 = 5;
		System.out.println( ++temp1  +  5 ); // 10
						//  ++5  + 5
						//  6   +  5  ==  11
		
		System.out.println("temp1 : " + temp1); // 6
		
		
		// ���� ���� : 10++, 6--   �����ڰ� ���ʿ� ��ġ
		// -> �ٸ� �����ں��� ���߿� ����/����
		int temp2 = 3;
		System.out.println(  temp2-- + 2  ); // 5
						//    3--    + 2  = 5
						//    temp2 = 2; (1 ����)
						//  ==> temp2 �� 2
		System.out.println("temp2 : " + temp2); // 2
		
		
		int a = 3;
		int b = 5;
		int c = a++ + --b;
		
		//		(a)3++ + --5(b)
		// c =  (a)3++ +  4(b)
		// c =  7
		
		// �̷���� a �������� a++ == 3+1 == 4
		
		// ���������� a,b,c�� ���� ���ΰ�?
		System.out.printf("%d / %d / %d\n", a, b, c); 
		// 4 / 4 / 7
	}
	
	
	public void ex4() {
		
		// �� ������ : >,  <,  >=,  <=,  ==,  !=
		// - �� �������� ����� �׻� ����(true / false)
		// - ��ȣ(=)�� ���Ե� �����ڿ��� ��ȣ�� �׻� ������!!
		
		// ���� ��ȣ�� = , ==  � ��?
		// -> ==  
		//   ��?  ��ȣ 1��(=)�� ���� �����ڷ� ���
		//       -> ������ ���ؼ� �ΰ�(==)�� "����"��� �ǹ̷� ���
		
		
		int a = 10;
		int b = 20;
		
		System.out.println( a > b ); // false
		System.out.println( a < b ); // true
		System.out.println( a != b ); // true
		System.out.println( (a == b) == false ); // true
						// () ��ȣ�ȿ��ִ°� ���� ����
						// false == false --> true
		System.out.println("-------------------------");
		
		int c = 4;
		int d = 5;
		
		System.out.println(  c < d  ); // true
		System.out.println(  c + 1 <= d ); //  true
						//  4  + 1 <= 5  
						/* ��������� �񱳿��꺸�� �켱���� ����! 
						 * ==> ���ϱ����*/
		System.out.println(  c >= d - 1); // true
		
		System.out.println(  (++c != d) == (--c != d)     );
						//   (++4 != 5) -> false
						// 				   (--5 != 5) -> true
						//    false     ==   true
						//    -> false
		
		System.out.println("-------------------------");
		
		int temp = 723;
		
		System.out.println("temp�� ¦���ΰ�? "     +  (temp % 2 == 0) );
		System.out.println("temp�� ¦���ΰ�? "     +  (temp % 2 != 1) );
		
		System.out.println("temp�� Ȧ���ΰ�? "     +  (temp % 2 == 1)  );
		System.out.println("temp�� Ȧ���ΰ�? "     +  (temp % 2 != 0)  );
		
		
		
		System.out.println("temp�� 3�� ����ΰ�? " +  (temp % 3 == 0) );
		System.out.println("temp�� 4�� ����ΰ�? " +  (temp % 4 == 0) );
		System.out.println("temp�� 5�� ����ΰ�? " +  (temp % 5 == 0) );
		
	}
	
	
	public void ex5() {
		
		// �� ������ : &&(AND) , ||(OR)
		// => ���Ը��ؼ�, �� �� �¾ƾ� true, �� �� �ϳ��� �ƴϸ� false
		
		
		// &&(AND) ������ : �� �� true�̸� true,  ������ false
		// ��, �׸���(~�̰�), ~�鼭, ~�̸鼭, ~���� ~����, ~����
		
		// ex) ����� �ٳ���, ��� �׸��� �ٳ���, ��� �̸鼭 �ٳ���
		
		int a = 101;
		
		// a�� 100 �̻� �̸鼭 ¦���ΰ�? true
		System.out.println( a >= 100 ); // a�� 100 �̻�?  true
		
		System.out.println( a % 2 == 0 ); // a�� ¦��? true
		
		System.out.println( (a >= 100) && (a % 2 == 0) ); // true
		
		
		int b = 5;
		
		// b�� 1���� 10���� ���� ���� ���ԵǾ� �ִ°�?
		// (b�� 1���� 10 ������ �����ΰ�?)
		// (b�� 1���� ũ�ų� �����鼭 10���� �۰ų� ������?)
		
		System.out.println( b >= 1 ); // b�� 1 �̻��ΰ�? true
		
		System.out.println( b <= 10 ); // b�� 10 �����ΰ�? true
		
		System.out.println( (b >= 1) && (b <= 10) );
		
		
		
		System.out.println("-----------------------");
		
		// || (OR) ������ : �� �� false �̸� false,  ������ true  (AND�� �ݴ�)
		// �Ǵ�, ~�ų�, ~�̰ų�
		
		int c = 10;
		
		// c�� 10�� �ʰ� �߰ų� ¦���ΰ�?
		
		System.out.println(  (c > 10) || (c % 2 == 0)  );
	}
	
	
	public void ex6() {
		
		// �� ���� ������ : !
		// -> �� ���� �ݴ�� �ٲٴ� ������
		
		boolean bool1 = true;
		boolean bool2 = !bool1; // false
		
		System.out.println("bool1 : " + bool1); // true 
		System.out.println("bool2 : " + bool2); // false
		
		
		System.out.println("-------------------------");
		
		Scanner sc = new Scanner(System.in);
		
		// ������ �ϳ� �Է� �޾��� ��
		// 1) �ش� ������ 1���� 100���� ���� �´��� Ȯ�� (1�̻� 100����)
		// 2) (�ݴ�) 1���� 100���� ���� �ƴ��� Ȯ��
		
		System.out.print("���� �Է� : ");
		int input = sc.nextInt();
		
		// 1 <= input <= 100
		boolean result1 =  1<=input  &&  input<=100;
						// (input >= 1)  &&  (input <= 100)
		
		System.out.printf("%d��/�� 1 �̻�, 100 ������ �����ΰ�? : %b\n", input, result1);
		
		
		// 1 �̻� �̸鼭 100 ���� <->  1 �̸� �Ǵ� 100 �ʰ�
		boolean result2 =  (input < 1)  || (input > 100);
		
		boolean result3 =  !( (input >= 1)  &&  (input <= 100) );
		
		System.out.printf("%d��/�� 1 �̸�, 100 �ʰ� �����ΰ�? %b / %b\n", input, result2, result3);
		
		
	}


	public void ex7() {
		
		// ���� ���� ������ : += , -= , *= , /= , %=
		// -> �ǿ����ڰ� �ڽŰ� ���� �� ����� �ٽ� �ڽſ��� ����
		
		int a = 10;
		
		// a�� 1 ����
		a++; // a = a + 1,    a += 1
		System.out.println("a�� 1 ���� : " + a); // 11
		
		// a�� 4 ����
		a += 4;
		System.out.println("a�� 4 ���� : " + a); // 15
		
		// a�� 10 ����
		a -= 10;
		System.out.println("a�� 10 ���� : " + a); // 5
		
		// a�� 3�� ����
		a *= 3;
		System.out.println("a�� 3�� ���� : " + a); // 15
		
		// a�� 6���� ������ �� ��
		a /= 6;
		System.out.println("a�� 6���� ������ �� �� : " + a); // 2
		
		// a�� 2�� ������ �� ������
		a %= 2;
		System.out.println("a�� 2�� ������ �� ������ : " + a); // 0
		
	}
	
	
	public void ex8() {
		
		// ���� ������  :   ���ǽ� ? ��1 : ��2
		
		// - ���ǽ��� ����� true�̸� ��1,
		//   false�̸� ��2�� �����ϴ� ������
		
		// * ���ǽ� : ���� ����� true / false�� ��
		//			  (��, ��, �� ���� ������ ����)
		
		
		int num = 30;
		
		// num�� 30���� ũ��(�ʰ�) : "num�� 30���� ū �� �̴�."
		// �ƴϸ�                  : "num�� 30 ������ �� �̴�."  ���
		
		String str1 = "num�� 30���� ū �� �̴�.";
		String str2 = "num�� 30 ������ �� �̴�.";
		
		String result = num > 30  ? str1 : str2;
						// ���ǽ� ? ��1 : ��2;
						//			 t     f
		
		// num ���� 30�� �ʰ��ϸ� str1
		// num ���� 30�� �ʰ����� ���ϸ� str2��
		// result ������ ����
		
		System.out.println(result);
		
		
		System.out.println("============================");
		
		// �Է� ���� ������ �������� ������� ����
		// ��, 0�� ����� ó��
		
		// ex)
		// ���� �Է� : 4
		// ��� �Դϴ�.
		
		// ���� �Է� : -5
		// ���� �Դϴ�.
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Է� : ");
		int input = sc.nextInt();
		
		String str3 = "��� �Դϴ�.";
		String str4 = "���� �Դϴ�.";
		
		String result2 = input >= 0 ? str3 : str4;
		
		System.out.println(result2);
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
