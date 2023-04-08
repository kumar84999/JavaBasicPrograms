package com.Basics;
import java.lang.Math;
public class CompoundIntrest {
	public static void main(String [] args) {
		int P=1200;
		double T=2;
		double R=5.4;
		double CI=P*(Math.pow((1+R/100), T));
		System.out.println(CI);
	}

}
