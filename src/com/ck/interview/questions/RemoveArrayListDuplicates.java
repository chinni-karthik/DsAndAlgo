package com.ck.interview.questions;

import com.ck.interview.questions.immutable.EmployeeImmutable;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class RemoveArrayListDuplicates {
	public static void main(String[] args) {
		List<EmployeeImmutable> employeeList = new ArrayList<>();
		EmployeeImmutable emp1 = new EmployeeImmutable(1, "abc");
		EmployeeImmutable emp2 = new EmployeeImmutable(2, "def");
		EmployeeImmutable emp3 = new EmployeeImmutable(1, "abc");
		employeeList.add(emp1);
		employeeList.add(emp2);
		employeeList.add(emp3);
		System.out.println(employeeList);
		List<EmployeeImmutable> listWithoutDuplicates = new ArrayList<>(new HashSet<>(employeeList));
		System.out.println(listWithoutDuplicates);
	}
}
