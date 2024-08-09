package Aggregration;
class Employee{
	String name;
	int id;
	Department department;
	public Employee(String name, int id, Department department) {
		super();
		this.name = name;
		this.id = id;
		this.department = department;
	}
}
class Department{
String dname;
Employee employee;
public Department(String dname, Employee employee) {
	super();
	this.dname = dname;
	this.employee = employee;
}
}
class Organization{
	String oname;
	String deptname;
	public Organization(String oname, String deptname) {
		super();
		this.oname = oname;
		this.deptname= deptname;
	}
}
public class Aggregationtest {
public static void main(String[] args) {

}
}
