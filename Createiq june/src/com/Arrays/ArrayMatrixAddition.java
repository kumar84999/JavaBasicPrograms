package com.Arrays;

import java.util.Scanner;

public class ArrayMatrixAddition {
	public static void main (String []args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter number of rows");
		int row =sc.nextInt();
		System.out.println("Enter number of colums");
		int col=sc.nextInt();
		
		int A[][] = new int[row][col];
		int B[][] =new int[row][col];
		int c[][] =new int[row][col];
		System.out.println("Enter value of A");
		for (int i=0;i<row;i++) {
		for (int j=0;j<col;j++) {
			A[i][j]=sc.nextInt();
		}
		}
		
		System.out.println("Enter value of B");
		for (int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
			B[i][j]=sc.nextInt();	
			}
		}
		System.out.println("C=A+B");
		for (int i=0;i<row;i++) {
			for (int j=0;j<col;j++) {
				c[i][j]=A[i][j]+B[i][j];
			}
		}
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				
				System.out.print(c[i][j]);
			}
			System.out.println(" ");
		}
		}
}
