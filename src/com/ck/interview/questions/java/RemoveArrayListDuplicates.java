package com.ck.interview.questions.java;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class RemoveArrayListDuplicates {
	public static void main(String[] args) {
		List<Employee> employeeList = new ArrayList<>();
		Employee emp1 = new Employee(1, "abc");
		Employee emp2 = new Employee(2, "def");
		Employee emp3 = new Employee(1, "abc");
		employeeList.add(emp1);
		employeeList.add(emp2);
		employeeList.add(emp3);
		System.out.println(employeeList);
		List<Employee> listWithoutDuplicates = new ArrayList<>(new HashSet<>(employeeList));
		System.out.println(listWithoutDuplicates);
	}
}
