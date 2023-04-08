package com.Oppsget;

public class Employee {
	int id ;
	String name;
	String role;
	double salary;
	static String COMPANY="---------TCS--------";
	public Employee(int id,String name,String role,double salary) {
		this.id =id;
		this.name=name;
		this.role=role;
		this.salary=salary;
		}
	
	public int getId() {
		return id;//get id is used to call the value
		
	
		}
	public void setId(int Id) {
		this.id=Id;//SetId is used to update the value
		
	}
	//display method 
	public void printemployee() {
		System.out.println("id  :"+id);
		System.out.println("name :"+name);
		System.out.println("role :"+role);
		System.out.println("salary  :"+salary);
		System.out.println(COMPANY);
	}
	public String getName() {
return name;


}
	
	public static void main(String[] args) {
		
		Employee e=new Employee(100, "kumar", "developer", 60000);
		e.setId(500);
		
		System.out.println(e.getId());
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}