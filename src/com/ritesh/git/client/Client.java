package com.ritesh.git.client;

import java.util.ArrayList;
import java.util.Collections;

import com.ritesh.git.Employee;
import com.ritesh.git.comparaters.AgeComparater;
import com.ritesh.git.comparaters.NameComparator;

public class Client {

	public static void main(String[] args) {

		Employee e1 = new Employee(20,"Ritesh Singh");
		
		Employee e2 = new Employee(23,"Aitesh Singh");
		
		Employee e3 = new Employee(10,"Nitesh Singh");
		
		Employee e4 = new Employee(90,"Sitesh Singh");
		
		ArrayList<Employee> al = new ArrayList<>();
		
		al.add(e1);
		al.add(e2);
		al.add(e3);
		al.add(e4);
		
		// implemented comparable interface
		
		//Collections.sort(al);
		//Collections.sort(al,new AgeComparater());
		Collections.sort(al,new NameComparator());
		
		System.out.println(al.toString());
	}

}
