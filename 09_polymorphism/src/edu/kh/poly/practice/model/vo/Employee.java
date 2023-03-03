package edu.kh.poly.practice.model.vo;

public class Employee extends Person {
	
	private String company;

	public Employee() {
		super();
	}

	public Employee(String name, int age, String company) {
		super(name, age);
		this.company = company;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String toString() {
		return super.toString() + ", 회사명 : " + company;
	}

}
