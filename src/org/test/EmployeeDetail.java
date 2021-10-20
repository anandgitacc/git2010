package org.test;

//class
public class EmployeeDetail {

//           method 1
private void empName1() {

System.out.println("Employee name is : Anand");

}
//  method 2
private void empId1() {
System.out.println("employee id is : 4521");
}
//  method 3
private void empMob1() {

System.out.println("Employee mobile no is : 8667070832");
}

//  main method 
public static void main(String[] args) {

//  object
EmployeeDetail e = new EmployeeDetail();

// method call
e.empName1();
e.empId1();
e.empMob1();

}

}