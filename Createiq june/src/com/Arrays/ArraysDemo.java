package com.Arrays;

public class ArraysDemo {
	public static void main(String[] args) {
		int a=0;
		System.out.println(a);
		// arrays size are fixed it is static initialization
		int [] arrays=new int[6];
		// finding a size
		System.out.println(arrays.length);
		System.out.println(arrays);
		arrays[0]=1;
		arrays[1]=2;
		arrays[2]=3;
//		arrays[3]=4;
//		arrays[4]=5;
//		arrays[5]=6;
		System.out.println(arrays);
		System.out.println(arrays[0]);
		
//		for(int i=1; i<5; i++) {
//		for(int i=0; i<=4; i++) {
		for(int i=1; i<arrays.length; i++) {
			System.out.println(arrays[i]);
		}
		
//		double celci
	}

}
