package com.numbers;

public class FinalReverseWithoutUsingStringMethod {
	public static void main(String[] args) {
		String str="kumar";
		StringBuilder str2=new StringBuilder();
		str2.append(str);
		str2.reverse(); // used string builder to reverse
		System.out.println(str2);
		
	}

}
