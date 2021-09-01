package com.ritesh.git.comparaters;

import java.util.Comparator;

import com.ritesh.git.Employee;

public class AgeComparater implements Comparator<Employee> {

	@Override
	public int compare(Employee e1, Employee e2) {

		return (e1.getAge() < e2.getAge()) ? 1 : (e1.getAge() > e2.getAge()) ? -1 : 0;
	}

}
