package com.methods;

public class Laptops {
String Laptopname;
String Model;
String RAM;
String Memory;
int Price;
String Processer;
String Os;
String Colour;

public void Laptopdetails() {
System.out.println("laptopname:"+Laptopname);
System.out.println("model:"+Model);
System.out.println("RAM:"+RAM);
System.out.println("memory:"+Memory);
System.out.println("pricr:"+Price);
System.out.println("processer:"+Processer);
System.out.println("os:"+Os);
System.out.println("colour:"+Colour);
System.out.println("-----------------");
 }
public static void main (String []args) {
	
	Laptops lp1=new Laptops();
	lp1.Laptopname="dell";
	lp1.Model="insprion";
	lp1.RAM="8GB";
	lp1.Memory="512SSD";
	lp1.Price=35000;
	lp1.Processer="i3";
	lp1.Os="windows10";
	lp1.Colour="block";
	lp1.Laptopdetails();
	
	Laptops lp2=new Laptops();
	lp1.Laptopname="HP";
	lp1.Model="insprion";
	lp1.RAM="8GB";
	lp1.Memory="512SSD";
	lp1.Price=57000;
	lp1.Processer="i5";
	lp1.Os="windows11";
	lp1.Colour="silver";
	lp1.Laptopdetails();
	
	
	
	
	
	
	


}

}
