package com.Basics;

public class Casting {
	public static void main (String[]args) {
		//convert onemtype to another ;
		byte b =127;//-->127
		int i = b;
		//implicitity;
		System.out.println(i);
		double d=i;
		System.out.println(d);
		//explicity;
		int Number =123456;
		byte ConvertNumber =(byte)Number;
		System.out.println(ConvertNumber);
		double Amount=3000.12343;
		System.out.println(Amount);
		
		
		
	}

}
