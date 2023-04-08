package com.methodsoverloading;

public class Caliculators {
	public void  sum(byte a,byte b) {
		System.out.println(a+b);
		}
	public void sub(short a,short b) {
		System.out.println(a-b);
		}
	public void multi(int a,int b) {
		System.out.println(a*b);
			}
	public void divi(float a,float b) {
		System.out.println(a/b);
	}
	public void madual(long a,long b) {
		System.out.println(a%b);
		}
	public void sum(double a,double b) {
		System.out.println(a+b);		
	}
	public static void main (String []args) {
		Caliculator caliculator=new Caliculator();
		caliculator.sum(12,15);
//		caliculator.sub(127,35);
//		caliculator.multi(120,7);
//		caliculator.divi(12.00f, 23.00f);
		caliculator.sum(12365, 45621);
		caliculator.sum(22.22, 32.456);
	}



	
}