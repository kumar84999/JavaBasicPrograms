package com.Oppsget;

public class Employee1 {
	public void getbyid(int id) {
		Employee id1=new Employee(1,"kumar","developer",55000);
		Employee id2=new Employee(2,"sriman","developer",56000);
	    Employee id3=new Employee(3,"shan","developer",57000);
		Employee id4=new Employee(4,"mahesh","developer",58000);
	    Employee id5=new Employee(5,"pooja","developer",59000);
	    Employee id6=new Employee(6,"ramya","developer",50000);
	    Employee sd[]= {id1,id2,id3,id4,id5,id6};
	    int result=0;
	    for(Employee d:sd) {
	    	if (d.getId()==id){ //if condition is used to any one of id calls
	    		
	    		d.printemployee();
	    		result=1;
	    		
	    		}
	    }if(result==0) {
	    	System.out.println("invalid id");
	    }
	}
	    public void getbyName(String name) {
	    	Employee id1=new Employee(1,"kumar","developer",55000);
	    	Employee id2=new Employee(2,"sriman","developer",56000);
	    	Employee id3=new Employee(3,"shan","developer",57000);
	    	Employee id4=new Employee(4,"mahesh","developer",58000);
	    	Employee id5=new Employee(5,"pooja","developer",59000);
	    	Employee id6=new Employee(6,"ramya","developer",50000);
	    	Employee sd[]= {id1,id2,id3,id4,id5,id6};
	    	int result=0;
	    	for (Employee d:sd) {
	    		if(d.getName()==name) {
	    			d.printemployee();
	    			result=1;
	    		}
	    	}
	    	
	    if(result==0) {
	    	System.out.println("invalid details");
	    }
	    }
	    public static void main (String []args) {
	    	Employee1 emp1 =new Employee1();
	    	emp1.getbyid(2);
	    }

}
