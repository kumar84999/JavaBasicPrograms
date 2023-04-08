package com.methods;

public class Car {
	String carname;
	int carwheels;
	int carseats;
	String carcolour;
	int carprice;
	String carvarient;
	String cartransmission;
	String carmilage;
	String carnumber;
	
	public void carDetails() {
	System.out.println("carname:"+carname);
	System.out.println("carwheels:"+carwheels);
	System.out.println("carseats:"+carseats);
	System.out.println("carcolour:"+carcolour);
	System.out.println("carprice:"+carprice);
	System.out.println("carvarient:"+carvarient);
	System.out.println("cartransmission:"+cartransmission);
	System.out.println("carmilage:"+ carmilage);
	System.out.println("carnu,mber:"+carnumber);
	System.out.println("----------------------");
	}
		public static void main(String [] args) {
			Car maruthi = new Car();
			maruthi.carname="dzire";
			maruthi.carwheels=4;
			maruthi.carseats=5;
			maruthi.carcolour="red";
			maruthi.carprice=850000;
			maruthi.carvarient="vxi(petrol)";
			maruthi.cartransmission="manual";
			maruthi.carmilage="20kmpl";
			maruthi.carnumber="TS19F4439";
			maruthi.carDetails();
			
		Car hyundai=new Car();
		hyundai.carname="creata"; 
		hyundai.carwheels=4;
		hyundai.carseats=5;
		hyundai.carcolour="white";
		hyundai.carprice=1500000;
		hyundai.carvarient="desil";
		hyundai.cartransmission="Automatic";
		hyundai.carmilage="15kmpl";
		hyundai.carnumber="TS19F4438";
		hyundai.carDetails();
		
	}
	
	
	
	

}
