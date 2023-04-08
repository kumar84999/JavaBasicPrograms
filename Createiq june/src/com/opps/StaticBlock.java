package com.opps;

public class StaticBlock {
	static {
		System.out.println("kumar");
		
	}
	public void in() {
		System.out.println("sriman");
	}
	public static void main (String []args) {
		StaticBlock s=new StaticBlock();
		s.in();
	}

}
