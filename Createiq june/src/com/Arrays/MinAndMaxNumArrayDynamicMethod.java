package com.Arrays;

public class MinAndMaxNumArrayDynamicMethod {
	public static void main (String []args) {
		int num[] =new int[] {8,7,9,5,4,6,1,3,2};
		int s =num[0];
		int l=num[0];
		for (int i=1;i<num.length;i++) {
			if(num[i]>l)i=num[1];
			else if (num[i]<s)s=num[i];
		}
		System.out.println("largest num is :"+l);
		System.out.println("smallest num is :"+s);
			
		}
		
		
	}


