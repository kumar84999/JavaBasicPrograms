package com.kumar;

import java.util.Scanner;

public class BioKumar {
	public static void main(String[] args) {
		
	
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Bio Data Of a Person");
		System.out.println();
		System.out.println("Enter id");
		int id = scanner.nextInt();
		System.out.println("Enter firstname");
		String firstName = scanner.next();
		System.out.println("Enter lastname");
		String lastName = scanner.next();
		System.out.println("Enter email id");
		String email = scanner.next();
		System.out.println("Enter mobileno");
		String mobileno=scanner.next();
		System.out.println("=============== Person Details ====================");
		System.out.println("person id: " + id);
		System.out.println("Person firstName: " + firstName);
		System.out.println("person lastname: " + lastName);
		System.out.println("Person email id: " + email);
		System.out.println("person mobileno:" +mobileno);
	

}
}