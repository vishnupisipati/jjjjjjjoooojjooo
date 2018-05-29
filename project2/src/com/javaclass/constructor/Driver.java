package com.javaclass.constructor;

public class Driver {

	public static void main(String[] args) {
		Person p1 = new Person();
		System.out.println("the name is : "+ p1.getName() + ", the age is : "+p1.getAge());
		Person p2 = new Person("java", 23);
		System.out.println("the name is : "+ p2.getName() + "the age is : "+p2.getAge());
		Student s1 = new Student("john bob", 45, 7 );
		System.out.println("the name is : "+ s1.getName() + ", the age is : "+s1.getAge() + " the student ID: " + s1.getStudentId());
		

	}

}
