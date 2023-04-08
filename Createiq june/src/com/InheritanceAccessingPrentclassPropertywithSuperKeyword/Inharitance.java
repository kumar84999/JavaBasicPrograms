package com.InheritanceAccessingPrentclassPropertywithSuperKeyword;

public class Inharitance extends Parent {
	String name;
	public void displaydetails() {
		super.name ="parent";
		name="child";
		System.out.println(super.name  +  "and" +  name);
	}
	public static void main (String []args) {
		Inharitance obj=new Inharitance();
		obj.displaydetails();
		
	}

}
