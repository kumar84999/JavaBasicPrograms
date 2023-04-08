package com.ControlStatements;

public class IfElseDemo {
	
		public static void main(String[] args) {
			int a = 100;
			int b = 20;
			int c = 300;
	    if(a>b) {
			System.out.println(" a is big "+a);
		}else {
			System.out.println("b is big "+b);
		}

			if ((a > b) && (a > c)) {
				System.out.println(" a is big " + a);
			} else if ((b > a) && (b > c)) {
				System.out.println(" b is big " + b);
			} else {
				System.out.println(" c is big " + c);
			}

		}
	}
