package edu.kh.inheritance.model.vo;

public /*final*/ class Parent {
	
	// ** final 클래스**
	// -> 마지막 클래스 라는 의미로
	// 더이상 상속 불가!를 의미함.
	
	public /*final*/ void method() {
		
		// ** final 메서드 **
		// -> 마지막 메서드라는 의미로
		// 더이상 오버라이딩(재정의) 불가! 를 의미함.
		
		System.out.println("테스트!");		
	}

}
