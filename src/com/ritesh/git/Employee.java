package com.ritesh.git;

public class Employee implements Comparable<Employee> {

	private int age;

	private String name;

	public Employee() {

	}

	public Employee(int age, String name) {
		this.age = age;
		this.name = name;
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

	@Override
	public int compareTo(Employee emp) {

		return (this.age < emp.age) ? -1 : (this.age > emp.age) ? 1 : 0;
	}

}
