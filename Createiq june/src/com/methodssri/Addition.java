package com.methodssri;
//without parameter with return type
public class Addition {
	int a=10;
	int b=20;
	int c;
	int d;
	int add()
	{ 
		c=a+b;
		return c;
	}
	void sum()//without parameter without return(void)type
	{
		d=a+b;
		System.out.println(d);
	}
	public static void main(String[] args)
	{
		Addition ad =new Addition();
		System.out.println(ad.add());
		ad.sum();
	}

}
