package com.ritesh.git.client;

import java.util.ArrayList;
import java.util.Collections;

import com.ritesh.git.Employee;

public class Client {

	public static void main(String[] args) {

		Employee e1 = new Employee(20,"Ritesh Singh");
		
		Employee e2 = new Employee(23,"Ritesh Singh");
		
		Employee e3 = new Employee(10,"Ritesh Singh");
		
		Employee e4 = new Employee(90,"Ritesh Singh");
		
		ArrayList<Employee> al = new ArrayList<>();
		
		al.add(e1);
		al.add(e2);
		al.add(e3);
		al.add(e4);
		Collections.sort(al);
		System.out.println(al.toString());
	}

}
