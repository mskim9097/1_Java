package edu.kh.objarray.practice.run;

import edu.kh.objarray.practice.model.service.EmployeeService;

public class EmployeeRun {

	public static void main(String[] args) {
		
		EmployeeService es = new EmployeeService();
		
		es.displayMenu();
	}

}
