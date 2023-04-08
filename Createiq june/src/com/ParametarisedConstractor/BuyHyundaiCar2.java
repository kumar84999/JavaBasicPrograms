package com.ParametarisedConstractor;

import java.util.Scanner;

public class BuyHyundaiCar2 {
		static String CAR_BRAND="hyundai";
		String model;
		String colour;
		int milage;
		int seats;
		double price;
		public  BuyHyundaiCar2(String model,String colour,int milage,int seats,double price){
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
			Scanner sc=new Scanner(System.in);
			System.out.println("Please enter car model code");
			int input=sc.nextInt();
			
			
			if (input==100) {
			BuyHyundaiCar creta1=new BuyHyundaiCar("creta","red",20,5,1044000);
			creta1.printDetails();
			}
			 if(input==101){		
				 BuyHyundaiCar kona=new BuyHyundaiCar("kona","white",15,4,2354000); 
			 kona.printDetails();
             }
			 else if(input==102){
			BuyHyundaiCar i20=new BuyHyundaiCar("i20","blue",18,5,750000);
			i20.printDetails();
			 }
			 else if(input==103) {
			BuyHyundaiCar venue=new BuyHyundaiCar("venue","brown",20,5,753000);
			venue.printDetails();
			 }
			 else if(input==104) {
			BuyHyundaiCar santro=new BuyHyundaiCar("santro","gray",22,5,489000);
			santro.printDetails();
			}
     		 else if(input==105){
			 BuyHyundaiCar i10=new BuyHyundaiCar("i10","block",23,5,539000);
			i10.printDetails();
			}else {
				System.out.println("Enter valid model....................");
			}
			
		}
	}
	