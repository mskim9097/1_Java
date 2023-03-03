package com.hw3.run;

import com.hw3.model.vo.Product;

public class Run {

	public static void main(String[] args) {
		
		String str = "최수진,김민수,이현경,김수현";
		String[] arr= str.split(",");
		System.out.println(arr[1]);
		
		
		// 초기값을 부여한 두 개의 객체 생성 (사용 데이터 참고)
		Product a = new Product("Samsung", "Galaxy S9", "Blue", 960000);
		Product b = new Product("LG", "G6", "Red", 820000);
		
		// 1. 두 객체의 정보 출력 처리 : toString() 사용
		System.out.println("생성한 첫 번째 객체의 값 : " + a.toString());
		System.out.println("생성한 두 번째 객체의 값 : " + b.toString());
		System.out.println("===================================");
		
		// 2. 두 객체의 값이 일치하는지 결과 출력 처리 : equals() 사용
		System.out.println("생성한 두 객체의 값이 같은가 : " + a.equals(b));
		System.out.println("===================================");
		
		// 3. 두 객체의 해쉬코드값 출력 : hashCode() 사용
		System.out.println("첫 번째 객체의 해쉬코드 값 : " + a.hashCode());
		System.out.println("두 번째 객체의 해쉬코드 값 : " + b.hashCode());
		System.out.println("===================================");
		
		// 4. 첫 번째 객체를 복제한 copy 객체 생성 후 출력 : clone(), toString() 사용
		Product copy = a.clone();		
		System.out.println("복제한 객체의 값 : " + copy.toString());
		System.out.println("===================================");
		
		// 5. 첫 번째 객체와 복제 객체가 같은지 출력 : equals()사용 / hashCode() 사용
		System.out.println("첫 번째 객체와 복제 객체의 주소 값이 일치하는가 : " + (a.hashCode() == copy.hashCode()));
		System.out.println("첫 번째 객체와 복제 객체가 필드 값이 일치하는가 : " + a.equals(copy));
		
		

	}

}
