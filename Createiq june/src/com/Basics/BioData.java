package com.Basics;

import java.util.Scanner;

public class BioData {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Bio Data Of a Person");
		System.out.println();
		System.out.println("enter id");
		int id = scanner.nextInt();
		System.out.println("enter firstname");
		String firstName = scanner.next();
		System.out.println("enter lastname");
		String lastName = scanner.next();
		System.out.println("enter email id");
		String email = scanner.next();
		System.out.println("=============== Person Details ====================");
		System.out.println("person id: " + id);
		System.out.println("Person firstName: " + firstName);
		System.out.println("person lastname: " + lastName);
		System.out.println("Person email id: " + email);
	}

}

