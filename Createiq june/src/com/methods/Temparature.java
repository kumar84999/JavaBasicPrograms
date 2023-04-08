package com.methods;

public class Temparature {
//	Celsius =(forenheat-32)*5/9;formula
	
	public static double convertToCelsius(double temp) {
		double Celsius =(temp-32)*5/9;
		return Celsius;
	}
	
		public static void min (String []args, Object math) {
			double morning =85.00;
			double afternoon =120.0;
			double evening =56.00;
			Temparature Tempature =new Temparature();
			double round= Temparature.convertToCelsius(morning);
			double af=Temparature.convertToCelsius(afternoon);
			double ev=Temparature.convertToCelsius(evening);
			System.out.println("morning temparature is:" + Math.round(round) +"celsius");
			System.out.println("afternoon temparature is:" + Math.round(round)+"celsius");
			
			System.out.println("evening temparature is :" + Math.round(ev)+"celsius");
		}
	}
	
	


