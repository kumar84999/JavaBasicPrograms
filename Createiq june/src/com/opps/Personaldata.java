package com.opps;

public class Personaldata {
	String name;
	String hight;
	String waight;
	String study;
	public void printpersonaldata()
	{
		System.out.println("name:"+name);
		System.out.println("hight:"+hight);
		System.out.println("waight:"+waight);
		System.out.println("study:"+study);
		System.out.println("-----------------");
	}
	public static void main(String args[]) 
	{
		Personaldata p=new Personaldata();
		
		p.name="kumar";
		p.hight="5.9ft";
		p.waight="60";
		p.study="btech";
		p.printpersonaldata();
		
	}
	

}
