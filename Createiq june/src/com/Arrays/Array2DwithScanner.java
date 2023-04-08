package com.Arrays;

import java.util.Scanner;

public class Array2DwithScanner {
	
	
	public static void main(String[]args) {
		Scanner sc =new Scanner(System.in);
		int rows =0;
		int coloum =0;
		System.out.println("enter 2D arrey length");
		rows = sc.nextInt();
		coloum = sc.nextInt();
		int[][]array2D=new int[rows][coloum];
		System.out.println("\nread input from array,");
		for(int i=0;i<rows;i++);{
			for(int j=0;j<coloum;j++);
		int j = 0;
		int i = 0;
		System.out.println("Element["+i+"]"+"["+j+"]:");
         array2D[i][j]=sc.nextInt();			
		}
	}

}
