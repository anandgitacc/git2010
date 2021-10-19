package org.test;

//          class
public class EmployeeDetail {
	
	//           method 1
	private void empName() {
		
		System.out.println("Employee name is : Anand");
		
	}
		//  method 2
	private void empId() {
		System.out.println("employee id is : 4521");
	}
		//  method 3
	private void empMob() {
		
		System.out.println("Employee mobile no is : 8667070832");
	}
	
  //  main method 
	public static void main(String[] args) {
		
		//  object
		EmployeeDetail e = new EmployeeDetail();
		
		// method call
		e.empName();
		e.empId();
		e.empMob();
		
	}

}
