package edu.kh.inheritance.model.vo;

public class Employee extends Person{
						// Person 상속받음
	
	// 필드
	private String company;
	
	// 기본생성자
	public Employee() {}

	// 매개변수생성자
	public Employee(String name, int age, String nationality, String company) {
		super(name, age, nationality);
		this.company = company;
	}
	
	// 메서드 getter/setter
	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}
	
	// Person 으로 부터 상속받은 메서드 중
	// move() 메서드를 Employee에 맞게 재정의(== 오버라이딩)
	
	// @Override 어노테이션 : 해당메서드가 오버라이딩 되었음을
	//						컴파일러에게 알려주는 역할
	
	// 어노테이션(Annotation) : 컴파일러에게 알려주기 위한 코드
	//						(컴파일러 인식용 주석)
	
	@Override // 오버라이딩 시 작성
	public void move() {
		// 기존 부모 코드를 삭제 후 자식이 새롭게 재정의
		System.out.println("오버라이딩 된 move() 메서드");
		System.out.println("효율적으로 일하고 야근 안해");
	}
	
	// *** 오버라이딩 성립 조건 ***
	// 1. 메서드 이름 동일
	// 2. 매개변수의 자료형, 개수, 순서 일치
	// 3. 리턴타입 동일
	// 4. 접근제한자는 부모클래스의 메서드와 동일하거나 더 넓은 범위
	// ex) (부모) protected => (자식) protected 또는 public
	// 5. 예외처리 범위는 같거나 더 좁게
	
	// + 부모의 private 메서드는 오버라이딩 불가
	
	@Override
	public String toString() {
		return super.toString() + " / " + company;
	}
	
	
}
