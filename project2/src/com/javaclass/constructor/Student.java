package com.javaclass.constructor;

public class Student extends Person {
	private int studentId;
	public Student() {
		super(); // calling the "person" constructor................
		System.out.println("This is no parameter constructor");
	}
	public Student(String name, int age, int studentId) {
		super(name, age); // calling the "person" constructor................
		this.studentId = studentId;
		System.out.println("the constructor with name, age and student Id");
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
}
