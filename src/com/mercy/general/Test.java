package com.mercy.general;

public class Test {
	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.empId = 1;
		Employee e2= new Employee();
		e2.empId = 2;
		e1.empId = 10;
		e2 = e1;
	}
}
