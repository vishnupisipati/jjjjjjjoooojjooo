package com.javaclass.accessmodifier;

public class Driver {

	public static void main(String[] args) {
		Person p = new Student();
		p.display();
		int a =10;
		int b =4;
		int c =0;
		try {
			 c =a/b;	
		} catch(ArithmeticException arth) {
			System.out.print("exception ha occured :" + arth.getMessage());
		} finally {
			System.out.println("this will always be executed");
		}
	
		System.out.print(c);
	}

}
