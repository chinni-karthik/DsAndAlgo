package com.ck.general;

public class EmployeeTest {
	public static Employee changeName(Employee emp, String name) {
		// Base condition 1
		if (emp == null) {
			return null;
		}
		// Base condition 2
		if (name == null) {
			return emp;
		}
		// Base condition 3
		if (name.isEmpty()) {
			emp.setEmpName("Empty");
			return emp;
		}
		// Actual logic.
		emp.setEmpName(name);
		return emp;
	}

	public static void main(String[] args) {
		Employee e1 = new Employee(1, "");
		Employee changedEmployee = changeName(e1, "");
		System.out.println(changedEmployee);
	}

}
