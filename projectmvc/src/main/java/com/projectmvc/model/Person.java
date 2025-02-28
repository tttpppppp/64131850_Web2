package com.projectmvc.model;

public class Person {
	private String name;
	private String age;
	
	public Person(String name, String age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}
	
	public void init() {
		System.out.println("Khởi tạo bean");
	}
	public void addPerson() {
		System.out.println("Thêm person");
	}
	public void destroy() {
		System.out.println("Bean đã bị hủy");
	}
}
