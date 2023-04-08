package com.DeafaultConstractors;

public class DefaultConstra {
	String name;
	int id;
	double fee;
	String course;
	String institute;
       public static void main(String[]args) {
		DefaultConstra s1=new DefaultConstra();
		s1.name="kumar";
		s1.id=123;
		s1.fee=25000.00;
		s1.course="java";
		s1.institute="createiq";
		
		System.out.println(s1.name);
		System.out.println(s1.id);
		System.out.println(s1.fee);
		System.out.println(s1.course);
		System.out.println(s1.institute);
		System.out.println("----------------");
		DefaultConstra s2=new DefaultConstra();
		s2.name= "sweety";
		s2.id =231;
		s2.fee=32653;
		s2.course="java";
		s2.institute="createiq";
		System.out.println(s2.name);
		System.out.println(s2.id);
		System.out.println(s2.fee);
		System.out.println(s2.course);
		System.out.println(s2.institute);
		System.out.println("------------------");
		
	}

}
