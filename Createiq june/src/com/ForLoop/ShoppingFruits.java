package com.ForLoop;

import java.util.Scanner;

public class ShoppingFruits {
	public static void main(String[] args) {
		String[] fruits = { "mango", "apple", "banana" };
		double[] price = { 100.00, 250.00, 40.00 };
		double[] tax=new double[price.length];

		// list of fruits and prices
		for ( int i = 0; i < fruits.length; i++) {
			tax[i]=price[i]*1.10;
			System.out.println(fruits[i] + " INR" +Math.round( tax[i]) + " KG");
		}

		// fruint and price
		for (int  i = 0; i < fruits.length; i++) {
			if (fruits[i].equals("mango")) {
				System.out.println(fruits[i] + " INR" + price[i] + " KG");
			}
		}
		// using scanner
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter fruit name");
		String input = scanner.next();

		// fruint and price
		for (int i = 0; i < fruits.length; i++) {
			if (fruits[i].equals(input)) {
				System.out.println(fruits[i] + " INR" + price[i] + " KG");
			}

		}
		if (input.equals(fruits)) {
			System.out.println("that fruits stock is not present in list!...");
		}

	}

}
