package edu.kh.poly.practice.model.vo;

public class Student extends Person {
	
	private int grade;
	private int classroom;
	public Student() {
		super();
	}
	public Student(String name, int age, int grade, int classroom) {
		super(name, age);
		this.grade = grade;
		this.classroom = classroom;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public int getClassroom() {
		return classroom;
	}
	public void setClassroom(int classroom) {
		this.classroom = classroom;
	}
	
	public String toString() {
		return super.toString() + ", 학년: " + grade + ", 반: " + classroom;
		
	}
	
	
	

	
}
