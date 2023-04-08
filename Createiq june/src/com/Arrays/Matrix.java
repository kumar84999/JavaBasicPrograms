 package com.Arrays;

import java.util.Scanner;

public class Matrix {
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of rows");
		int row=sc.nextInt();
		System.out.println("Enter number of coloums");
		int col=sc.nextInt();
		int matA[][]=new int[row][col];
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				matA[i][j]=sc.nextInt();
				
				
			}
		}
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print(matA[i][j]+" ");
			}
			System.out.println(" ");
		}
		
		
	}

}
