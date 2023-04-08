package inheritanceEmpl;

public class Emplyee {
	
	String name;
	int id;
	String location;
	double salary;
	public Emplyee(String name, int id, String location, double salary) {
		super();
		this.name = name;
		this.id = id;
		this.location = location;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	

}
