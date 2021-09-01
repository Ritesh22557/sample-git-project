package com.ritesh.git;

public class Employee {

	private int age;

	private String name;

	public Employee() {
	
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [age=" + age + ", name=" + name + "]";
	}
	
	
}
