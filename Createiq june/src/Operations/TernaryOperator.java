package Operations;

public class TernaryOperator {

	public static void main (String []args) {
		int weekday = 5;
		String result =(weekday==1)? "sunday"
		               :(weekday==2)? "monday"
		            		   :(weekday==3)? "tuesday"
		            				   :(weekday==4)?"wednesday"
		            						   :(weekday==5)?"thersday"
		            								   :(weekday==6)?"friday"
		            										   :(weekday==7)?"saturday":"please enter valid weekday";
		            												   System.out.println(result);
		
		
		            												   
	}

}
