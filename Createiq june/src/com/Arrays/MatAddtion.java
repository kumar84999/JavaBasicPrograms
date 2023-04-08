package com.Arrays;

import java.util.Scanner;

public class MatAddtion {
	public static void main(String []args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number of rows");
	int row=sc.nextInt();
	System.out.println("Enter number of col");
			int col=sc.nextInt();
			
			int A[][]=new int[row][col];
			int B[][]=new int[row][col];
			int C[][]=new int[row][col];
			System.out.println("Enter values into A");
			for(int i=0;i<row;i++) {//foe A values
				for(int j=0;j<col;j++) {
					A[i][j]=sc.nextInt();
				}
				
			}
			//B values
			System.out.println("Enter values into B");
			for(int i=0;i<row;i++) {
				for(int j=0;j<col;j++) {
					B[i][j]=sc.nextInt();
					
				}
			}
		//addingA,B=c;
			for (int i=0;i<row;i++) {
				for (int j=0;j<col;j++) {
					C[i][j]=A[i][j]+B[i][j];
					}
				}
//printing c		
			System.out.println("matrix C=A+B");
			for(int i=0;i<row;i++) {
				for(int j=0;j<col;j++) {
			System.out.print(C[i][j]+" ");	
			
				}
				System.out.println(" ");
			}
			
			
	}

}
