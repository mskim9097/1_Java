package edu.kh.abs.model.vo;

public class Cat extends TypeMammalia {

	@Override
	public void eat() {
		System.out.println("냐미냐미~ ");
	}

	@Override
	public void cry() {
		System.out.println("미유~~");
	}

	@Override
	public void move() {
		System.out.println("살금살금");
	}

	@Override
	public void breastfeed() {
		System.out.println("고양이가 수유를 한다");
	}
	
}
