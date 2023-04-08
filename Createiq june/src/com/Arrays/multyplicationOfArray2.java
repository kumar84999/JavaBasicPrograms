package com.Arrays;

import java.util.Scanner;

public class multyplicationOfArray2 {
	public static void main (String []args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter First matrix row1");
		int row1=sc.nextInt();
		System.out.println("Enter first matrix col1");
		int col1=sc.nextInt();
		System.out.println("Enter second matrix row2");
		int row2=sc.nextInt();
		System.out.println("Enter second matrix col2");
		int col2=sc.nextInt();
		int A[][]=new int[row1][col1];
		int B[][]=new int[row2][col2];
		int C[][]=new int[row1][col2];
		//inserting first matix;
		System.out.println("Enter first matrix value");
		for (int i=0;i<row1;i++) {
			for(int j=0;j<col1;j++) {
				A[i][j]=sc.nextInt();
			}
		}
		//inserting second marix;
		System.out.println("Enter second matrix value");
		for (int i=0;i<row2;i++) {
			for (int j=0;j<col2;j++) {
				B[i][j]=sc.nextInt();
				
				
			}
		}
		int sum=0;
		//martix multiplication;
		for(int i=0;i<row1;i++) {
			for(int j=0;j<col2;j++) {
				for(int k=0;k<col1;k++) {
					sum=sum+A[i][k]*B[k][j];
				}
				C[i][j]=sum;
				sum=0;
			}
		}
		for (int i=0;i<row1;i++) {
		for (int j=0;j<col2;j++) {
			System.out.print(C[i][j]+" ");
		}
		System.out.println(" ");
	}

}
}
