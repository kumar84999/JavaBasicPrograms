package com.RuntimepolywithMultylevelInheritance;

public class Swimming {
public static void main(String[] args) {
	Grandfather f1;
	Father f2;
	Son f3;
	f1 =new Grandfather(); 
	f2 =new Father();
	f3 =new Son();
	f1.Swimm();
	f2.swimm();
	f3.swimm();
	
}

}