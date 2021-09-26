package com.ck.interview.questions;

import com.ck.interview.questions.immutable.EmployeeImmutable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeSortingQuestion {
	public static void main(String[] args) {
		Employee emp1 = new Employee(1, "ghi");
		Employee emp2 = new Employee(2, "def");
		Employee emp3 = new Employee(3, "abc");
		Employee emp4 = new Employee(4, "xyz");
		List<Employee> empList = new ArrayList<>();
		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3);
		empList.add(emp4);
		System.out.println("Before Sorting");
		System.out.println(empList);
		System.out.println("After EmpNameSorter");
		Collections.sort(empList, new EmpNameSorter());
		System.out.println(empList);
		System.out.println("After Java8 EmployeeSorting");
		empList.sort(Comparator.comparing(e -> e.getEmpName()));
		System.out.println(empList);
		System.out.println("After Java8 EmployeeSorting reversed");
		Comparator<Employee> empReverseComparator = Comparator.comparing(e -> e.getEmpName());
		empList.sort(empReverseComparator.reversed());
		System.out.println(empList);
	}
}

class EmpNameSorter implements Comparator<Employee> {
	@Override
	public int compare(Employee obj1, Employee obj2) {
		return obj1.getEmpName().compareTo(obj2.getEmpName());
	}
}

class Employee {
	int empId;
	String empName;

	public Employee(int empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + empId;
		result = prime * result + ((empName == null) ? 0 : empName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (empId != other.empId)
			return false;
		if (empName == null) {
			if (other.empName != null)
				return false;
		} else if (!empName.equals(other.empName))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "[empId=" + empId + "empName=" + empName +"]";
	}

}