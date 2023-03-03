package edu.kh.objarray.practice.model.vo;

public class Employee {
	
	private int empNo;
	private String name;
	private String dept;
	private String job;
	private int salary;
	
	public Employee() {}

	public Employee(int empNo, String name, String dept, String job, int salary) {
		this.empNo = empNo;
		this.name = name;
		this.dept = dept;
		this.job = job;
		this.salary = salary;
	}

	public int getEmpNo() {
		return empNo;
	}

	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "사번 : " + empNo + ", 이름 : " + name + ", 부서 : " + dept
				+ ", 직급 : " + job + ", 급여 : " + salary;
	}
	

}
