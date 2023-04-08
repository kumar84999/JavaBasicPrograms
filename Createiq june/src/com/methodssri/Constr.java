package com.methodssri;

public class Constr {
	String name;
	int id;

	public Constr(String name,int id)
	{
		
		this.name=name;
		this.id=id;
	}
	void display()
	{
		System.out.println(name);
		System.out.println(id);
	}
	public static void main(String[] args)
	{
	Constr ns1=new Constr("kumar",1);
	Constr ns2=new Constr("sriman",2);
	ns1.display();
	ns2.display();
		
	}
	
}
