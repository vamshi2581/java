package Inheritence;

public class Teamleads {
	public int pid;
 	public String name;
 	public int empid;
	public Teamleads(int pid, String name, int empid) {
	super();
	this.pid = pid;
	this.name = name;
	this.empid = empid;
}
	
	@Override
	public String toString() {
		return "Teamlead [pid=" + pid + ", name=" + name + ", empid=" + empid + "]";
	}

	

}
