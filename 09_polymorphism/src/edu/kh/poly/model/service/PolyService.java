package edu.kh.poly.model.service;

import edu.kh.poly.model.vo.Car;
import edu.kh.poly.model.vo.Spark;
import edu.kh.poly.model.vo.Tesla;

public class PolyService {
	
	// ********* 다형성(업캐스팅) ***********
	public void ex1() {
		// 다형성 확인 예제
		
		// Car 객체 생성
		Car car = new Car();
		// 부모타입 참조변수 = 부모 객체
		
		//Tesla 객체 생성
		Tesla tesla = new Tesla();
		// 자식타입 참조변수 = 자식 객체
		
		
		// ============업캐스팅 구간===========
		Car car2 = new Tesla();
		// Tesla 객체를 참조하는 변수타입이 Car(부모)이기 때문에
		// Tesla 객체가 Car(부모) 객체로 변화함.
		// 부모타입 참조변수 = 자식객체
		
		Car car3 = new Spark();
		// 부모타입 참조변수 = 자식객체
		
		
		// **** 다형성 업캐스팅 작성법 ****
		// 1) 자식 객체가 부모 객체로 변하였기 때문에
		//	  자식만의 고유한 필드, 메서드를 사용할 수 없다.
		
		// 1-1) car (부모 = 부모)
		car.setEngine("v6 6기통 엔진");
		car.setFuel("휘발유");
		car.setWheel(4);
		// Car 메서드(=> 부모) 모두 사용 가능
		
		// 1-2) tesla (자식 = 자식)
		tesla.setEngine("전기모터");
		tesla.setFuel("전기");
		tesla.setWheel(4);
		tesla.setBatteryCapacity(100000000);
		
		// 1-3) car2 ((Car)부모 = 자식(Tesla))
		car2.setEngine("전기모터");
		car2.setFuel("전기");
		car2.setWheel(4);
		//car2.setBatteryCapacity(100000000);
		//The method setBatteryCapacity(int) is undefined for the type Car
		// => Car 타입에는 setBatteryCapacity 메서드가 정의되어있지 않다!
		
		// 1-4) car ((Car)부모 = 자식 (Spark))
		car3.setEngine("경차 엔진");
		car3.setFuel("휘발유");
		car3.setWheel(4);
		//car3.setDiscountOffer(0.5);
		//The method setDiscountOffer(double) is undefined for the type Car
		// => Car 타입에는 setDiscountOffer 메서드가 정의되어있지 않다!
		
		
		// =================================================
		
		// 2) 다형성을 이용한 객체 배열
		// 객체 배열: 같은 (객체 참조) 자료형의 변수를 하나의 묶음으로 다루는 것
				// 같은 객체 => 부모타입으로 바꿈
				// 부모 타입 참조 자료형
		// + 다형성 적용 -> (부모 타입 참조) 자료형의 변수를 하나의 묶음으로 다루는 것
		
		Car[] arr = new Car[3]; // 부모타입 참조변수 배열 선언 및 할당
								// 각 배열요소 Car타입 참조 변수
		
		arr[0] = car; // Car주소 == Car 객체 (Car주소는 Car타입 객체)
		//arr[0] Car 참조 변수
		
		arr[1] = car2; // Tesla 주소 == Tesla 객체
		//arr[1] Car 참조 변수
		
		arr[2] = car3; // Spark 주소 == Spark 객체
		//arr[2] Car 참조 변수
		
		// 상속 + 다형성
		// 상속 특징: 일련의 클래스들에 대한 공통적인 규약 정의
		//		-> Car 상속 클래스는 모두 getEngine()을 가지고 있다를 정의.
		// 다형성(업캐스팅): 부모 타입 참조변수 arr[i]로 자식 객체를 참조할 수 있다.
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(i + "번째 인덱스의 엔진: " + arr[i].getEngine());
		}
	}
	
	public void ex2() {
		// 2) 다형성(업캐스팅)을 이용한 **매개변수** 사용법
		Tesla t = new Tesla("전기 모터", "전기", 4, 100000);
												// 배터리용량
		Spark s = new Spark("경차 엔진", "휘발유", 4, 0.5);
												// 할인율
		Car c= new Car("경유 엔진", "경유", 12);
		// 여기까진 다형성 미적용 상태!
		
		printCar(t);
		printCar(s);
		printCar(c);
		//printCar2(t);
		//printCar2(s);
		//printCar2(c);
		System.out.println("=============================");
		
		// 4) 다형성을 이용한 반환형 사용법
		
		Car[] arr = {createCar(1), createCar(2), createCar(3)};
		//				Car			// Car			// Car
		//							// (Tesla)		// (Spark)
		
		//Car[] arr = {new Car(), new Tesla(), new Spark()};
		// arr[1] = new Tesla();
		// arr[2] = new Spark();
		
		// arr[0]; // Car
		// arr[1]; // Tesla
		// arr[2]; // Spark
		
		
		// instanceof 연산자 : 객체의 자료형을 검사하는 연산자
		// -> 참조하는 객체가 특정 자료형이거나 부모쪽 상속 관계인지를 확인
		
		// arr[1]이 참조하는 객체가 Tesla면 true, 아니면 false
		System.out.println(arr[1] instanceof Tesla); // true
		// arr[1]이 참조하는 객체가 Spark면 true, 아니면 false
		System.out.println(arr[1] instanceof Spark); // false
		// arr[1]이 참조하는 객체가 Car면 true, 아니면 false
		System.out.println(arr[1] instanceof Car); // true
		
		System.out.println("=============================");
		
		// instanceof를 조건에서 사용할 때
		// 부모타입 검사는 제일 마지막에 진행 해야 함!
		// Car를 대상으로 처음부터 검사하면 모두 True여서 검사가 안된다..
		for(int i = 0; i < arr.length; i++) {
			
			if(arr[i] instanceof Tesla) {
				System.out.println("Tesla 객체 입니다.");
				
			}else if(arr[i] instanceof Spark) {
				System.out.println("Spark 객체 입니다.");
				
			} else { // 부모타입 Car
				System.out.println("Car 객체 입니다.");
			}
		}
	}
	
	// ******** 다형성(다운캐스팅) **********
	public void ex3() {
		// - 다운 캐스팅이란?
		// 부모타입 참조변수가 자식객체를 참조하는
		// ** 업캐스팅 상태** 에서만 진행 할 수 있는 기술로
		// 부모타입을 자식타입으로 "강제형변환" 해서
		// 자식객체의 본래 필드, 메서드를 사용가능하게 한다.
		
		Car c1 = new Tesla("전기모터", "전기", 4, 50000);
		
		// c1.getBatteryCapacity(); => c1이 부모타입
		System.out.println(((Tesla)c1).getBatteryCapacity());
		
		// 주의!
		// "." 연선자가 (Tesla) 형변환 연산자보다 우선순위가 높음.
		// 먼저 c1을 Tesla로 형변환 해주고, getBatteryCapacity 호출해야함
		
		
		// <효율적인 다운 캐스팅 방법>
		// - 얕은 복사(주소 복사)를 이용한다.
		Tesla t1 = (Tesla)c1;
				// (Tesla)를 빼면 c1 Car타입
		// 자식참조변수로 부모객체참조? (반대는 업캐스팅으로 가능)
		// c1이 참조하는게 Tesla라는걸 알기때문에 Tesla로 강제형변환 가능.
		// Tesla = Tesla 같은 자료형 연산 가능하니 같은 주소를 복사시켜버림.(얕은복사)
		
		System.out.println(t1.getBatteryCapacity());
	}
	
	// !!! 다운캐스팅 주의사항 !!!
	public void ex4() {
		// 다운캐스팅 중 오류사항이 있을 수 있음. 상황을 만들어보자
		
		Car c1 = new Tesla();
		//Car c1 = new Spark();
		
		//Spark s1 = (Spark)c1; // 다운캐스팅
		
		// 문제점 1.
		// ex) Spark가 Tesla를 참조함. 부모를 공유할 뿐 다른건 겹치지 않음.
		// -> java.lang.ClassCastException (형변환 예외)
		// -> c1이 참조하는 객체는 Tesla인데
		//	  Spark 참조변수로 Tesla를 참조하려고 하면 예외 발생!
		// -> 다운캐스팅 주의사항 : 강제형변환을 잘못하면 안됌.
		
		
		// instanceof와 같이 사용
		if(c1 instanceof Spark) {
			Spark s1 = (Spark)c1; // 맞을 때 다운 캐스팅
			System.out.println("성공");
		}else {
			System.out.println("실패(Spark 타입이 아님)");
		}
	}
	
	
	
	// 전달받은 Car 또는 자식객체의 엔진, 연료, 바퀴 갯수를 출력하는 메서드
	public void printCar(Car temp) {
		System.out.println("엔진: " + temp.getEngine());
		System.out.println("연료: " + temp.getFuel());
		System.out.println("바퀴 개수: " + temp.getWheel() + "개");
		System.out.println();
	}
	
	/*public void printCar2(Tesla temp) {}*/
	// Tesla 타입의 매개변수만 받을 수 있음.
	
	
	// createCar()
	// 전달받은 매개변수에 따라서 Car 또는 자식 객체를 생성하고
	// 생성된 객체의 주소를 반환
	public Car createCar(int num) {
		
		Car result = null;
		// null == 아무것도 참조하고 있지 않음.
		
		switch(num) {
		case 1: result = new Car(); break;
		case 2: result = new Tesla(); break;
		case 3: result = new Spark(); break;
		}
		
		return result;
		
		// 반환형이 Car이지만
		// case가 2, 3이면 Car의 자식 객체의 주소가 반환된다.
	}
	
	
		/* 상속 다형성의 궁극적 목적?
		중복되는 코드 제거해서 전체적인 코드 길이 감소
		
		public void method(Car c) {
		
		if(c instanceof Tesla) {
			// Tesla만의 기능 수행
		}else if(c instanceof Spark) {
			// Spark만의 기능 수행
		}
	}*/
	
	public void ex5() {
		// 바인딩(Binding)
		// - 실제 실행할 메서드 코드와 호출하는 코드를 연결 시키는 것
		
		Car c1 = new Car("경유 엔진", "경유", 8);
		
		System.out.println(c1.getEngine());
		// Car 객체에 있는 getEngine() 메서드를 호출 == 바인딩
		// String edu.kh.poly.model.vo.Car.getEngine()
		
		// 프로그램 "실행 전"
		// - 컴파일러는 getEnghine() 메서드가 Car에 있는 걸로 인식해서
		// c1.getEngine() 호출 코드와
		// String edu.kh.poly.model.vo.Car.getEngine() 메서드 코드를 연결
		// --> [정적 바인딩]
		
		System.out.println(c1.toString());
		// String edu.kh.poly.model.vo.Car.toString()
		// Car 참조변수 c1을 이용해서
		// Car 객체에 있는 오버라이딩 된 toString() 메서드를 호출
		
		
		// ** 다형성 적용 시 바인딩 **
		Car c2 = new Spark("경차 엔진", "휘발유", 4, 0.5);
		// 업캐스팅 적용 -> 부모 부분만 참조 가능한 상태
		
		System.out.println(c2.toString());
		// String edu.kh.poly.model.vo.Car.toString()
		// 참조변수 c2가 Car타입이므로
		// toString()도 Car의 toString()을 호출 - 정적바인딩
		
		// 실행해보면 자식(Spark)의 toString()이 호출되는것을 확인!
		// -> 컴파일시에는 부모(Car)와 바인딩 == [정적 바인딩]
		// -> 실행 시에는 자식(Spark)의 오버라이딩된 메서드와 바인딩 == [동적바인딩]
		
		// ** 동적 바인딩 활용 방법 **
		Car[] arr = {
						new Car("경유 엔진", "경유", 12),
						new Tesla("전기모터", "전기", 4, 50000),
						new Spark("경차엔진", "무연", 4, 0.3)
					};
		
		// arr 배열요소가 참조하는 모든 객체의 필드값을 출력
		for(int i = 0; i < arr.length; i++) {
			System.out.println(i + "번째 요소: " + arr[i].toString());
			// 실행 전 : String edu.kh.poly.model.vo.Car.toString() - 정적 바인딩
			// 실행 후 : 각 객체의 오버라이딩 된 toString()이 호출됨 - 동적 바인딩
		}
		
		// ** 동적 바인딩 장점 **
		// - 업캐스팅 상태의 참조변수를
		//	 별도의 다운 캐스팅 없이
		//	 자식의 오버라이딩된 메서드를 수행할 수 있다.
		
	}
}
