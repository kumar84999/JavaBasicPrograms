package com.ForLoop;

public class SumandAvarageOfArray {

	public static void main(String[] args) {
		int array[] = {10,20,22,25,30,50,80,90,35,45};
		int sum=0;
		for (int i=0;i<array.length;i++) {
			sum=sum+array[i];
		}
		System.out.println("sum of array is:"+sum);
		double avarage=(sum/array.length);
		System.out.println("avarage of array:"+avarage);
		}
	}


