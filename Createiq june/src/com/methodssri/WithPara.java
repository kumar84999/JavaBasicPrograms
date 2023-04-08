package com.methodssri;

public class WithPara {
	//with parameter with return
	int add(int a,int b)
	{
		int c=a+b;
		int h=a*b;
		return c;
	
	}
	//with pare meter without return type
	void sum(int d,int e)
	{
		int f=d+e;
		System.out.println(f);
		System.out.println(d*e);
	}
	public static void main(String[] args)
	{ 
		WithPara wp=new WithPara();
		System.out.println(wp.add(5,6));
		System.out.println(wp.add(10, 65));
		wp.sum(5, 6);
	}

}
