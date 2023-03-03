package edu.kh.op.ex;

import java.util.Scanner;

/* 이번 진도부터는 미리 적응하기 바란다는 마음을 담아
 * 용도에 맞게 클래스 분리하는 작업을 진행할 것이다.
 * 클래스 이어서 같은 패키지안에 ExampleRun 을 만들어준다.
 * 그 안에 메인메소드 만들것.
 * 
 * 테스트, 간단한 연습용도 등 이외에
 * 실제적인 프로젝트 할 때 지금까지 썼던 방식으로 쓰면 X
 * 자바의 특징? 객체지향언어
 * 컴퓨터안에 사람이 살고있다.
 * 각자 역할이 있고 맡은일을 수행한다.
 * 나는 강사, 여러분은 학생이란 역할이 있듯이.
 * 코드 실행용클래스는 오로지 실행만 시키는 클래스
 * */

/* 테스트할 예제코드는 여기에 작성 */
public class OpExample { // 예제 코드 작성용 클래스
	
	// ex1() method메서드: 객체 지향 프로그래밍에서 객체와 관련된 서브 루틴 (또는 함수)
	// -> OpExample이 가지고 있는 기능 중 ex1()이라는 기능
	public void ex1() {
		System.out.println("OpExample 클래스에 ex1() 기능 수행");
		System.out.println("클래스 분리 테스트");
		System.out.println("println 자동완성 해봤어요~");
	}
	/* 위에꺼 실행 돌려봤자 안된다. main 메서드에서 실행 안했기 때문 */

	/* 런클래스랑 예제클래스 양쪽으로 분할해서 보여주기 */
	// ex2() 메서드
	public void ex2() {
		Scanner sc = new Scanner(System.in);
		// 실행될때 ExampleRun -> OpExample -> Scanner 순으로 만들어냄
		// 같은패키지내에 있기 않기때문에 import(수입)해와야합니다.
		
		System.out.print("정수 입력 1 : ");
	    int input1 = sc.nextInt(); // 다음 입력되는 정수를 읽어옴.
	    
	    System.out.print("정수 입력 2 : ");
	    int input2 = sc.nextInt();
	    
	    System.out.printf("%d / %d = %d\n", input1, input2, input1 / input2);
	    System.out.printf("%d %% %d = %d\n", input1, input2, input1 % input2);
	    				   // %% : printf 에서 '%' 문자 출력하는 방법
		
	}
	
	
	/* 연산자_ ppt4페이지 증감연산자 */
	public void ex3() {
		// 증감(증가, 감소) 연산자 : ++, --
		// -> 피연산자(값)를 1 증가 또는 감소 시키는 연산자
		
		int iNum1 = 10;
		int iNum2 = 10;
		
		iNum1++; // iNum1 1 증가
		iNum2--; // iNum2 1 감소
		
		System.out.println("iNum1 : " + iNum1);
		System.out.println("iNum2 : " + iNum2);
		
		
		// 전위 연산 :  ++3  , --2  연산자가 앞쪽에 배치
		// -> 다른 연산자보다 먼저 증가/감소
		int temp1 = 5;
		System.out.println( ++temp1  +  5 ); // 10
						//  ++5  + 5
						//  6   +  5  ==  11
		
		System.out.println("temp1 : " + temp1); // 6
		
		
		// 후위 연산 : 10++, 6--   연산자가 뒤쪽에 배치
		// -> 다른 연산자보다 나중에 증가/감소
		int temp2 = 3;
		System.out.println(  temp2-- + 2  ); // 5
						//    3--    + 2  = 5
						//    temp2 = 2; (1 감소)
						//  ==> temp2 는 2
		System.out.println("temp2 : " + temp2); // 2
		
		
		int a = 3;
		int b = 5;
		int c = a++ + --b;
		
		//		(a)3++ + --5(b)
		// c =  (a)3++ +  4(b)
		// c =  7
		
		// 미뤄놨던 a 후위연산 a++ == 3+1 == 4
		
		// 최종적으로 a,b,c는 각각 얼마인가?
		System.out.printf("%d / %d / %d\n", a, b, c); 
		// 4 / 4 / 7
	}
	
	
	public void ex4() {
		
		// 비교 연산자 : >,  <,  >=,  <=,  ==,  !=
		// - 비교 연산자의 결과는 항상 논리값(true / false)
		// - 등호(=)가 포함된 연산자에서 등호는 항상 오른쪽!!
		
		// 같다 기호는 = , ==  어떤 것?
		// -> ==  
		//   왜?  등호 1개(=)는 대입 연산자로 사용
		//       -> 구분을 위해서 두개(==)를 "같다"라는 의미로 사용
		
		
		int a = 10;
		int b = 20;
		
		System.out.println( a > b ); // false
		System.out.println( a < b ); // true
		System.out.println( a != b ); // true
		System.out.println( (a == b) == false ); // true
						// () 괄호안에있는것 먼저 연산
						// false == false --> true
		System.out.println("-------------------------");
		
		int c = 4;
		int d = 5;
		
		System.out.println(  c < d  ); // true
		System.out.println(  c + 1 <= d ); //  true
						//  4  + 1 <= 5  
						/* 산술연산이 비교연산보다 우선순위 높다! 
						 * ==> 더하기먼저*/
		System.out.println(  c >= d - 1); // true
		
		System.out.println(  (++c != d) == (--c != d)     );
						//   (++4 != 5) -> false
						// 				   (--5 != 5) -> true
						//    false     ==   true
						//    -> false
		
		System.out.println("-------------------------");
		
		int temp = 723;
		
		System.out.println("temp는 짝수인가? "     +  (temp % 2 == 0) );
		System.out.println("temp는 짝수인가? "     +  (temp % 2 != 1) );
		
		System.out.println("temp는 홀수인가? "     +  (temp % 2 == 1)  );
		System.out.println("temp는 홀수인가? "     +  (temp % 2 != 0)  );
		
		
		
		System.out.println("temp는 3의 배수인가? " +  (temp % 3 == 0) );
		System.out.println("temp는 4의 배수인가? " +  (temp % 4 == 0) );
		System.out.println("temp는 5의 배수인가? " +  (temp % 5 == 0) );
		
	}
	
	
	public void ex5() {
		
		// 논리 연산자 : &&(AND) , ||(OR)
		// => 쉽게말해서, 둘 다 맞아야 true, 둘 중 하나라도 아니면 false
		
		
		// &&(AND) 연산자 : 둘 다 true이면 true,  나머진 false
		// 와, 그리고(~이고), ~면서, ~이면서, ~부터 ~까지, ~사이
		
		// ex) 사과와 바나나, 사과 그리고 바나나, 사과 이면서 바나나
		
		int a = 101;
		
		// a는 100 이상 이면서 짝수인가? true
		System.out.println( a >= 100 ); // a는 100 이상?  true
		
		System.out.println( a % 2 == 0 ); // a는 짝수? true
		
		System.out.println( (a >= 100) && (a % 2 == 0) ); // true
		
		
		int b = 5;
		
		// b는 1부터 10까지 숫자 범위 포함되어 있는가?
		// (b는 1부터 10 사이의 숫자인가?)
		// (b는 1보다 크거나 같으면서 10보다 작거나 같은가?)
		
		System.out.println( b >= 1 ); // b는 1 이상인가? true
		
		System.out.println( b <= 10 ); // b는 10 이하인가? true
		
		System.out.println( (b >= 1) && (b <= 10) );
		
		
		
		System.out.println("-----------------------");
		
		// || (OR) 연산자 : 둘 다 false 이면 false,  나머지 true  (AND의 반대)
		// 또는, ~거나, ~이거나
		
		int c = 10;
		
		// c는 10을 초과 했거나 짝수인가?
		
		System.out.println(  (c > 10) || (c % 2 == 0)  );
	}
	
	
	public void ex6() {
		
		// 논리 부정 연산자 : !
		// -> 논리 값을 반대로 바꾸는 연산자
		
		boolean bool1 = true;
		boolean bool2 = !bool1; // false
		
		System.out.println("bool1 : " + bool1); // true 
		System.out.println("bool2 : " + bool2); // false
		
		
		System.out.println("-------------------------");
		
		Scanner sc = new Scanner(System.in);
		
		// 정수를 하나 입력 받았을 때
		// 1) 해당 정수가 1부터 100사이 값이 맞는지 확인 (1이상 100이하)
		// 2) (반대) 1부터 100사이 값이 아닌지 확인
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		// 1 <= input <= 100
		boolean result1 =  1<=input  &&  input<=100;
						// (input >= 1)  &&  (input <= 100)
		
		System.out.printf("%d은/는 1 이상, 100 이하의 정수인가? : %b\n", input, result1);
		
		
		// 1 이상 이면서 100 이하 <->  1 미만 또는 100 초과
		boolean result2 =  (input < 1)  || (input > 100);
		
		boolean result3 =  !( (input >= 1)  &&  (input <= 100) );
		
		System.out.printf("%d은/는 1 미만, 100 초과 정수인가? %b / %b\n", input, result2, result3);
		
		
	}


	public void ex7() {
		
		// 복합 대입 연산자 : += , -= , *= , /= , %=
		// -> 피연산자가 자신과 연산 후 결과를 다시 자신에게 대입
		
		int a = 10;
		
		// a를 1 증가
		a++; // a = a + 1,    a += 1
		System.out.println("a를 1 증가 : " + a); // 11
		
		// a를 4 증가
		a += 4;
		System.out.println("a를 4 증가 : " + a); // 15
		
		// a를 10 감소
		a -= 10;
		System.out.println("a를 10 감소 : " + a); // 5
		
		// a를 3배 증가
		a *= 3;
		System.out.println("a를 3배 증가 : " + a); // 15
		
		// a를 6으로 나눴을 때 몫
		a /= 6;
		System.out.println("a를 6으로 나눴을 때 몫 : " + a); // 2
		
		// a를 2로 나눴을 때 나머지
		a %= 2;
		System.out.println("a를 2로 나눴을 때 나머지 : " + a); // 0
		
	}
	
	
	public void ex8() {
		
		// 삼항 연산자  :   조건식 ? 식1 : 식2
		
		// - 조건식의 결과가 true이면 식1,
		//   false이면 식2를 수행하는 연산자
		
		// * 조건식 : 연산 결과가 true / false인 식
		//			  (비교, 논리, 논리 부정 연산이 포함)
		
		
		int num = 30;
		
		// num이 30보다 크면(초과) : "num은 30보다 큰 수 이다."
		// 아니면                  : "num은 30 이하의 수 이다."  출력
		
		String str1 = "num은 30보다 큰 수 이다.";
		String str2 = "num은 30 이하의 수 이다.";
		
		String result = num > 30  ? str1 : str2;
						// 조건식 ? 식1 : 식2;
						//			 t     f
		
		// num 값이 30을 초과하면 str1
		// num 값이 30을 초과하지 못하면 str2를
		// result 변수에 저장
		
		System.out.println(result);
		
		
		System.out.println("============================");
		
		// 입력 받은 정수가 음수인지 양수인지 구분
		// 단, 0은 양수로 처리
		
		// ex)
		// 정수 입력 : 4
		// 양수 입니다.
		
		// 정수 입력 : -5
		// 음수 입니다.
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		String str3 = "양수 입니다.";
		String str4 = "음수 입니다.";
		
		String result2 = input >= 0 ? str3 : str4;
		
		System.out.println(result2);
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
