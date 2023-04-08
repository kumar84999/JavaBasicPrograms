package com.Basics;

public class ConvertDaysToYearsWeeksAndDays {
	public static void main(String[] args) {
		//days=d,week=w,year=y;
		int d=373;
		int y=d/365;
		int w=(d-(y*365))/7;
		int d1=d-((y*365)+(w*7));
		System.out.println(y);
		System.out.println(w);
		System.out.println(d1);
		
		
	}

}
