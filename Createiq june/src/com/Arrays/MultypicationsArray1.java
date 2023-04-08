package com.Arrays;

public class MultypicationsArray1 {

	public static void main(String[] args) {
		int A[][]= {{6,2,4},{5,2,3},{2,3,4}};
		int B[][]= {{2,3,4},{4,2,6},{2,1,5}};
		int c[][]=new int[3][3];
		for (int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				c[i][j]=0;
				for(int k=0;k<3;k++) {
					c[i][j]+=A[i][k]*B[j][k];
					
				}
				System.out.println(c[i][j]+"");
				
			}
			System.out.println();
		}
	
		
	}

}
