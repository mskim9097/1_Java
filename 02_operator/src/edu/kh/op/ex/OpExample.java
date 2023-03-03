package edu.kh.op.ex;

// 예제 코드 작성용 클래스

public class OpExample {
	
	// 기능 메서드 method : 객체 지향 프로그래밍에서
	// 객체와 관련된 서브루틴 or 함수
	public void ex1() {
		// void : return 값이 없는 메서드에 작성
		System.out.println("OpExample 클래스에 ex1() 기능 수행");
		
	}
	
	// tip! : 하나의 메서드안에는 하나의 기능만 정의해야함
	public void ex2() {
		int iNum1 = 10;
		int iNum2 = 10;
		
		iNum1++;
		iNum2--;
		
		System.out.println("iNum1:" + iNum1); // 10
		System.out.println("iNum2:" + iNum2); // 10
	}
	
	public void ex3() {
		// 전위연산 : ++3, --2 연산자가 앞쪽에 배치
		// -> 다른 연산보다 먼저 증감/감소
		int temp1 = 5;
		System.out.println(++temp1 + 5);
					// => 6 + 5 == 11
		
		// 후위연산 : 10++, 6-- 연산자가 뒤쪽에 배치
		// -> 다른 연산자보다 나중에 증가/감소
		
		int temp2 = 3;
		System.out.println(temp2-- + 2); // 5
					// 3 + 2 = 5
					// temp2 <= 2 (1감소)
		
		System.out.println(temp2);
	}
	
	public void ex4() {
		// 비교연산자 : >, <, >=, <=, ==, !=
		// - 비교 연산자의 결과는 항상 논리값(true/false)
		// - 등호(=)가 포함된 연산자에서 등호는 항상 오른쪽!
		
		// 같다 기호는?? ==
		
		int a = 10;
		int b = 20;
		
		System.out.println(a > b); // false
		System.out.println(a < b); // true
		System.out.println(a != b); // true
		System.out.println((a == b) == false); // true
				// () 괄호안에 있는거 먼저 연산
				//	false == false --> true
		
		int c = 4;
		int d = 5;
		System.out.println(c + 1 <= d); // true
					// 산술연산이 비교연산보다 우선순위 높다!!!
		
		int temp = 723;
		
		System.out.println("temp는 짝수?" + (temp % 2 == 0)); // false
	}	
		
		
	public void ex5() {
		// 논리연산자 : &&(AND), ||(or)
		// && : 둘다 true이면 true
		
		int a = 101;
		// a는 100 이상이면서 짝수인가?
		System.out.println(a >= 100); //true
		System.out.println(a % 2 == 0); //false
		System.out.println((a >= 100) && (a % 2 == 0)); //false
		
		
		// || : 둘다 false 면 false (AND의 반대) 나머지 true
		int c = 10;
		// c는 10을 초과했거나 짝수인가?
		System.out.println(c > 10); //false
		System.out.println(c % 2 == 0); // true
		System.out.println((c > 10) || (c % 2 == 0)); // true
		
	}
	
	public void ex6() {
		// 논리 부정 연산자 : !
		// 논리값을 반대로 바꾸는 연산자
		
		boolean bool1 = true;
		System.out.println(!bool1); // false
	}
	
	public void ex7() {
		// 복합 대입 연산자 : +=, -=, *=, /=, %=
		// -> 피연산자가 자신과 연산 후 결과를 다시 자신에게 대입
		
		int a = 10;
		
		a++; // 11
		System.out.println("a++ : " + a);
		
		a += 4; // 15
		// a = a + 4;
		System.out.println("a += 4 : " + a);
		
		a -= 10;
		System.out.println("a -= 10 : " + a);
		
		a *= 3;
		System.out.println("a *= 3 : " + a);
		
		a /= 6; //2
		System.out.println("a /= 6 : " + a);
		
		a %= 2; //0
		System.out.println("a %= 2 : " + a);
	}
	
	public void ex8() {
		// 삼항 연산자
		// 조건식 ? 식1 : 식2
		// 조건식 결과가 true 식1, false 식2
		int num = 30; 
		String str1 = "num은 30보다 크다";
		String str2 = "num은 30 이하다";
		
		String result = num > 30 ? str1 : str2;
		System.out.println(result);
	}

}
