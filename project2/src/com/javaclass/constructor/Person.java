package com.javaclass.constructor;

public class Person {
	private int age;
	private String name;
	Person(String name, int age){
		this.name = name;
		this.age = age;
		System.out.println("This is a constructor with name and age");
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
	Person(int age){
		this.age = age;
		System.out.println("This is a constructor with age");
	}
	Person(String name){
		this.name = name;
		System.out.println("This is a constructor with the name");
	}
	Person(){
		System.out.println("This is a default constructor");
	}

}
