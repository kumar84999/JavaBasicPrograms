package com.methods;

public class Methodcall {
	String name;
	int age;
	int fee;
	public Methodcall(int age,String name,int fee) {
		this.age=age;
		this.name=name;
		this.fee=fee;
		
	}
	public static void main(String []args){
		Methodcall math=new Methodcall(25,"kumar",25000);
		System.out.println(math.name);
		System.out.println(math.age);
		System.out.println(math.fee);
		
	}
	}