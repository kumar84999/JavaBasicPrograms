package com.ParametarisedConstractor;

public class Suzukicarwithoverloding {
	String colour;
	String model;
	String enginecapacity;
	int milage;
	public Suzukicarwithoverloding(String colour, String model, String enginecapacity, int milage) {
		super();
		this.colour = colour;
		this.model = model;
		this.enginecapacity = enginecapacity;
		this.milage = milage;
	}
	
	@Override
	public String toString() {
		return "Suzukicarwithoverloding [colour=" + colour + ", model=" + model + ", enginecapacity=" + enginecapacity
				+ ", milage=" + milage + "]";
	}

	public Suzukicarwithoverloding(String colour, String model, String enginecapacity) {
		super();
		this.colour = colour;
		this.model = model;
		this.enginecapacity = enginecapacity;
	}
	
	public Suzukicarwithoverloding(String colour, String model, int milage) {
		super();
		this.colour = colour;
		this.model = model;
		this.milage = milage;
	}
	public static void main(String[] args) {
		Suzukicarwithoverloding s1=new Suzukicarwithoverloding("white", "vxi", "2300cc", 20);
		Suzukicarwithoverloding s2=new Suzukicarwithoverloding("red", "zxi", "2200cc");
		Suzukicarwithoverloding s3=new Suzukicarwithoverloding("blue", "lxi", 23);
	System.out.println(s1);
	System.out.println(s2);
	System.out.println(s3);
	}

}
