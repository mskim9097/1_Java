package edu.kh.collection.model.service;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import edu.kh.collection.model.vo.Member;

public class SetService {
	
	// Set(집합)
	// - 순서를 유지하지 않음(== 인덱스 없음)
	// - 중복을 허용하지 않는다. ( + null도 중복X, 1개만 저장 가능)
	
	
	// **** Set이 중복을 확인하는 방법 ****
	// 컬렉션은 객체만 저장할 수 있음 (Set은 컬렉션이기 때문에 객체만 저장)
	// -> 객체가 가지고있는 필드값이 모두 같으면 중복으로 판단
	// --> 이 때 필드값이 모두 같은지 비교하기 위해서
	//		객체에 "equals()" 가 반드시!!! 오버라이딩 되어야 한다.
	
	public void ex1() {
		
		Set<String> set = new HashSet<String>();
		
		// HashSet : Set의 대표적인 자식 클래스
		// 사용 조건 1: 저장되는 객체 equals() 오버라이딩 필수
		// 사용 조건 2: 저장되는 객체 hashCode() 오버라이딩 필수
		// String 은 굉장히 완성도 높은 클래스로,
		// 이미 equals, hashCode가 오버라이딩 되어있음
		// 다른클래스 만들때는 equals, hashCode를 오버라이딩 해야함.
		
		//Set.add(String e) : 추가
		set.add("네이버");
		set.add("카카오");
		set.add("쿠팡");		
		set.add("배민");
		set.add("배민");
		set.add("배민");
		set.add("배민");
		set.add(null);
		set.add(null);
		set.add(null);
		
		System.out.println(set);
		// 확인한 것 : 1. 순서유지 X / 2. 중복 X / 3. null 중복 X
		
		// size() : 저장된 데이터의 개수 반환
		System.out.println("저장된 데이터의 수 : " + set.size());
		
		// remove(String e) : Set에 저장된 객체 중 매개변수 e와
		//						필드값이 같은 객체를 제거
		//				+ Hash라는 단어가 포함된 Set이면 hashCode()도 같아야함.
		
		System.out.println(set.remove("배민")); // 삭제하면 true 
		System.out.println(set.remove("당근")); // 못지웠음 false
		
		System.out.println(set); // 제거 확인 용도
		
		// List는 index가 있어서 get()로 요소 하나 얻어올 수 있었지만,
		// Set은 순서가 없어서 저장된 객체 하나를 얻어올 수 있는 방법이 없다!
		// -> 대신에 Set 전체의 데이터를 하나씩 반복적으로 얻어올 순 있다.
		
		
		// 1. Iterator (반복자)
		// - 컬렉션에서 제공하는 컬렉션 객체 반복 접근자
		// (컬렉션에 저장된 데이터를 임의로 하나씩 반복적으로 꺼내는 역할)
		
		Iterator<String> it = set.iterator();
		// set.iterator() : Set을 Iterator 하나씩 꺼내갈 수 있는 모양으로 변환
		
		while(it.hasNext()) { // -> 다음 값이 있는지?
			
			// it.hasNext() : 다음 값이 있으면 true 반환
			// it.next() : 다음 값(객체)를 얻어옴.
			
			String temp = it.next();
			System.out.println(temp);			
		}
		
		System.out.println("====================================");
		
		// 향상된 for문 사용
		
		// for(하나씩 꺼내서 저장할 변수 : 컬렉션)
		for(String temp : set) {
			System.out.println(temp);
		}
		
	}
	
	public void ex2() {
		
		// Hash함수 : 입력된 단어를 지정된 길이의 문자열로 변환하는 함수(중복X)
		// ex) 입력: 111 -> "asdfg" (5글자)
		// ex) 입력: 123456789 -> "qwert" (5글자)
		// == 암호화에 사용
		// 일정한 길이의 랜덤값 생성, 중복되지 않음
		
		// hashCode() : 필드 값이 다르면 중복되지 않는 숫자를 만드는 메서드
		// -> 왜만들까? 빠른 데이터 검색을 위해서 (객체가 어디에 있는지 빨리 찾음)
		
		// HashSet() : 중복 없이 데이터 저장(Set)하고 데이터 검색이 빠름(Hash)
		
		Member mem1 = new Member("user01", "pass01", 30);
		Member mem2 = new Member("user01", "pass01", 30);
		Member mem3 = new Member("user02", "pass02", 20);
		
		System.out.println(mem1 == mem2); // 참조형이기때문에 주소 비교
		// 얕은 복사 경우가 아니라면 다 false
		
		if(mem1.getId().equals(mem2.getId())) {
			if(mem1.getPw().equals(mem2.getPw())) {
				if(mem1.getAge() == mem2.getAge()) {
					System.out.println("같은 객체입니다 (true)");
				}
			}
		}
		
		// ==> 매번 이렇게 비교하기 힘듬...
		// == equals() 메서드 오버라이딩
		
		System.out.println("==================================");
		
		System.out.println(mem1.equals(mem2)); // mem1, mem2의 필드는 같은가?
		// => true
		System.out.println(mem1.equals(mem3)); // mem1, mem3의 필드가 같은가?
		// => false
		
	}
	
	public void ex3() {
		
		// 오버라이딩 된 equals()를 이용하여 Member를 Set에 저장
		
		// [Key Point!] : 중복이 제거 되는가?
		
		Set<Member> memberSet = new HashSet<Member>();
		
		
		memberSet.add(new Member("user01", "pass01", 30));
		memberSet.add(new Member("user02", "pass02", 40));
		memberSet.add(new Member("user03", "pass03", 20));
		memberSet.add(new Member("user04", "pass04", 25));
		memberSet.add(new Member("user04", "pass04", 25));
		
		for( Member mem : memberSet) {
			System.out.println(mem);
		}
		
		Member mem1 = new Member("user01", "pass01", 30);
		Member mem2 = new Member("user01", "pass01", 30);
		Member mem3 = new Member("user02", "pass02", 20);
		
		System.out.println(mem1.hashCode());
		System.out.println(mem2.hashCode());
		System.out.println(mem3.hashCode());
				
	}
	
	public void ex4() {
		// Wrapper 클래스 : 기본자료형 -> 객체로 포장하는 클래스
		
		// - 컬렉션에 기본 자료형 값을 저장하고 싶을때 사용
		// - 기본 자료형에 없던 추가 기능, 값을 이용하고 싶을 때 사용
		
		
		// <Wrapper 클래스 종류>
		// int -> Integer
		// double -> Double
		// Boolean, Byte, Short, Short, Long, float, Character
		
		int iNum = 10;
		double dNum = 3.14;
		
		// 기본 자료형 -> 포장
		Integer w1 = new Integer(iNum); // 삭제선
		Double w2 = new Double(dNum);
		
		// Wrapper 클래스 활용
		System.out.println("int 최대값 : " + w1.MAX_VALUE); // static
		System.out.println("int 최소값 : " + w1.MIN_VALUE); // static
		
		System.out.println("double 최대값 : " + w2.MAX_VALUE); // static
		System.out.println("double 최소값 : " + w2.MIN_VALUE); // static
		
		System.out.println("=======static 방식으로 Wrapper클래스 사용========");
		System.out.println("int 최대값 : " + Integer.MAX_VALUE);
		System.out.println("int 최소값 : " + Integer.MIN_VALUE); // static
		
		System.out.println("double 최대값 : " + Double.MAX_VALUE);
		System.out.println("double 최소값 : " + Double.MIN_VALUE); // static
		
		//***************************************************************
		
		// pasring : 데이터의 형식을 변환
		
		// String 데이터를 기본 자료형으로 변환
		
		int num1 = Integer.parseInt("100");
		double num2 =Double.parseDouble("1.23456");
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num1 + num2);
				
		//***************************************************************
		
	}
	
	public void ex5() {
		// Wrapper 클래스의 AutoBoxing / AutoUnboxing
		
		Integer w1 = new Integer(100);
		
		Integer w2 = 100;
		Integer w3 = 200;
	//(Integer)		(int -> Integer) 자동포장
				// AutoBoxing
		
		// w2와 100은 원래 연산이 안되어야 하지만
		// Integer는 int의 포장형식이라는걸 Java가 인식하고 있음
		// -> 위와 같은 경우 int 를 Integer로 자동 포장 해준다.
		
		System.out.println("w2 + w3 = " + (w2 + w3));
		
		// w2 + w3 == 객체 + 객체 ==> 원래 불가능
		
		// 하지만 Integer는 int의 포장형태라는 걸 Java가 인식하고 있음
		// -> 연산 시 포장을 자동으로 벗겨냄.
		
		// Integer + Integer -> int + int (자동포장해제)
							// AutoUnboxing
		
	}
	
	public void lotto() {
		
		// 로또 번호 생성기 Ver2
		
		// HashSet
		// LinkedHastSet // 순서유지 Set
		// TreeSet (오름차순)
		
		//Set<Integer> lotto = new HashSet<Integer>(); // 순서유지X, 중복제거만
		//Set<Integer> lotto = new LinkedHashSet<Integer>(); // 순서유지 Set
		Set<Integer> lotto = new TreeSet<Integer>(); // 자동 정렬 Set
		
		
		// Integer는 equals(), hashCode() 오버라이딩 완료 상태
		
		while(lotto.size() < 6) {
			// lotto에 저장된 값이 개수가 6개 미만이면 반복
			
			int random = (int)(Math.random() * 45 + 1); // 1 ~ 45 사이 난수
			
			System.out.println(random); // 발생 순서 확인
			
			lotto.add(random);
			// int값이 자동으로 Integer로 포장(AutoBoxing)되어 lotto추가
			
		}
		
		System.out.println("로또 번호: " + lotto);
		
		
	}
	
	
}
