package edu.kh.poly.practice.model.service;

import java.util.Scanner;

import edu.kh.poly.practice.model.vo.Employee;
import edu.kh.poly.practice.model.vo.Person;
import edu.kh.poly.practice.model.vo.Student;

public class Service implements QuestionInterface {
	
	Scanner sc = new Scanner(System.in);
	
	Person[] pArr = new Person[20];

	@Override
	public void displayMenu() {
		int menuNum = 0;
		do {
			System.out.println("1. 학생 또는 직원 등록");
			System.out.println("2. 모든 요소 출력");
			System.out.println("3. 학생 정보만 출력");
			System.out.println("4. 직원 정보만 출력");
			System.out.println("5. 정보 찾기(이름)");
			System.out.println("6. 모든 사람의 나이 (합/최고/최저) 출력");
			System.out.println("7. 입력 인덱스 삭제");			
			System.out.println("0. 프로그램 종료");			
			System.out.print("메뉴 입력 >> ");
			menuNum = sc.nextInt();
			sc.nextLine();
			
			switch(menuNum) {
			case 1: insertPerson(); break;
			case 2: selectAll(); break;
			case 3: selectStudent(); break;
			case 4: selectEmployee(); break;
			case 5: searchName(); break;
			case 6: printAge(); break;
			case 7: deletePerson(); break;
			case 0: System.out.println("\n프로그램을 종료합니다..."); break;
			default: System.out.println("\n잘못 입력하셨습니다.");
			}
			
		}while(menuNum != 0);
	}

	@Override
	public void insertPerson() {
		int menuNum = 0;
		do {
			System.out.println("1. 학생등록 (이름, 나이, 학년, 반 입력)");
			System.out.println("2. 직원등록 (이름, 나이, 회사명 입력)");
			System.out.println("3. 뒤로가기");
			menuNum = sc.nextInt();
			sc.nextLine();
			
			switch(menuNum) {
			case 1: 
				System.out.print("이름: ");
				String studentName = sc.next();
				System.out.print("나이: ");
				int studentAge = sc.nextInt();
				System.out.print("학년: ");
				int grade = sc.nextInt();
				System.out.print("반: ");
				int classroom = sc.nextInt();
				
				for(int i = 0; i < pArr.length; i++) {
					if(pArr[i] == null) {
						pArr[i] = new Student(studentName, studentAge, grade, classroom);
						break;
					}
				}
				
				break;
				
			case 2: 
				System.out.print("이름: ");
				String employeeName = sc.next();
				System.out.print("나이: ");
				int employeeAge = sc.nextInt();
				System.out.print("회사명: ");
				String company = sc.next();
				
				for(int i = 0; i < pArr.length; i++) {
					if(pArr[i] == null) {
						pArr[i] = new Employee(employeeName, employeeAge, company);
						break;
					}
				}
				break;
			case 3: System.out.println("\n뒤로가기"); break;
			default: System.out.println("\n잘못 입력하셨습니다.");
			}
		}while(menuNum != 3);
	}

	@Override
	public void selectAll() {
		
		if(pArr[0] == null) {
			System.out.println("배열요소에 저장된 정보가 없습니다.");
		}
		for(int i = 0; i < pArr.length; i++) {
			if(pArr[i] != null) {
				System.out.println(pArr[i]);
			}
		}
	}

	@Override
	public void selectStudent() {
		
		for(int i = 0; i < pArr.length; i++) {
			if(((Student)pArr[i]).getGrade() != 0) {
				System.out.println(pArr[i]);
			}
		}
	}

	@Override
	public void selectEmployee() {
		for(int i = 0; i < pArr.length; i++) {
			if(((Employee)pArr[i]).getCompany() != null) {
				System.out.println(pArr[i]);
			}
		}
	}

	@Override
	public Person searchName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String printName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void printAge() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Person deletePerson() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addPerson() {
		// TODO Auto-generated method stub
		
	}

}
