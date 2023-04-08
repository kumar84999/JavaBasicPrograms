package com.ParametarisedConstractor;

public class BuyHyundaiCar {
	static String CAR_BRAND="hyundai";
	String model;
	String colour;
	int milage;
	int seats;
	double price;
	public  BuyHyundaiCar(String model,String colour,int milage,int seats,double price){
		this.model=model;
		this.colour=colour;
		this.milage=milage;
		this.seats=seats;
		this.price=price;
		}
	void printDetails() {
		System.out.println("car brand :"+CAR_BRAND);
		System.out.println("model     :"+model);
		System.out.println("colour    :"+colour);
		System.out.println("milage    :"+milage);
		System.out.println("seats     :"+seats);
		System.out.println("price     :"+price);
		System.out.println("-------------------");
		
		}
	public static void main (String []args) {
		
		BuyHyundaiCar creta=new BuyHyundaiCar("creta","red",20,5,1044000);
		creta.printDetails();
		 
		BuyHyundaiCar kona=new BuyHyundaiCar("kona","white",15,4,2354000); 
		kona.printDetails();
		
		BuyHyundaiCar i20=new BuyHyundaiCar("i20","blue",18,5,750000);
		i20.printDetails();
		
		BuyHyundaiCar venue=new BuyHyundaiCar("venue","brown",20,5,753000);
		venue.printDetails();
		BuyHyundaiCar santro=new BuyHyundaiCar("santro","gray",22,5,489000);
		santro.printDetails();
		BuyHyundaiCar i10=new BuyHyundaiCar("i10","block",23,5,539000);
		i10.printDetails();
		
	}
	
	
	
	
	

}
