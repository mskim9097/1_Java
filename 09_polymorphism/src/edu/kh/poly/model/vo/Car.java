package edu.kh.poly.model.vo;

public class Car /* extends Object*/{
	/* 자동차라면 가지고 있는 것? */
	
	private String engine; // 엔진
	private String fuel; // 연료
	private int wheel; // 바퀴개수
	
	public Car() { // 기본생성자
		super(); // 부모생성자(Object)
		// 안적으면 컴파일러가 자동으로 만들어준다!
	}
	
	// 매개변수 생성자
	// 자동완성방법 : alt + shift + s -> o -> enter
	public Car(String engine, String fuel, int wheel) {
		super();
		this.engine = engine;
		this.fuel = fuel;
		this.wheel = wheel;
	}
	
	// getter/setter 자동완성
	// 자동완성방법 : alt + shift + s -> r -> (tab -> space -> shift+tab -> enter)	
	public String getEngine() {
		return engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}

	public String getFuel() {
		return fuel;
	}

	public void setFuel(String fuel) {
		this.fuel = fuel;
	}

	public int getWheel() {
		return wheel;
	}

	public void setWheel(int wheel) {
		this.wheel = wheel;
	}
	
	// Object.toString() 오버라이딩
	@Override // 오버라이드 했다는걸 알려주는 Override 어노테이션 작성
	public String toString() {
		return engine + " / " + fuel + " / " + wheel;
		// 엔진 / 연료 / 바퀴개수
	}
	
	

}
