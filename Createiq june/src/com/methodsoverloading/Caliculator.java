package com.methodsoverloading;

public class Caliculator {
public byte sum(byte a,byte b) {
	return(byte)(a+b);
	}
public short sum(short a,short b) {
	return(short)(a+b);
	}
public int sum(int a,int b) {
	return(int)(a+b);
		}
public float sum(float a,float b) {
	return(float)(a+b);
}
public long sum(long a,long b) {
	return(long)(a+b);
	}
public double sum(double a,double b) {
	return(double)(a+b);
	
}
public static void main (String []args) {
	Caliculator caliculator=new Caliculator();
	System.out.println("sum of two byte numbers:"+caliculator.sum(10,30));
	System.out.println("sum of two short number:"+caliculator.sum(265,365));
	System.out.println("sum of two int numbers:"+caliculator.sum(120,7));
	System.out.println("Sum of two float numbers:"+caliculator.sum(12.00, 23.00));
	System.out.println("sum of two long numbers:"+caliculator.sum(12365, 45621));
	System.out.println("sum of two double number:"+caliculator.sum(22.22, 32.456));
}



}
