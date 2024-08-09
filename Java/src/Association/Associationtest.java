package Association;
class Bank{
	private String bname;
	private Employee[] emp;
	
	public String getbname() {
		return bname;
	}
	public void setbname(String bname) {
		this.bname=bname;
	}
	public Employee[] getemp() {
		return emp;
	}
	public  void setemp(Employee[] emp) {
		this.emp=emp;
	}
}
class Employee{
	private String name;
	public String getname() {
		return name;
	}
	public void setname(String name) {
		this.name=name;
	}
}
public class Associationtest {
public static void main(String[] args) {
//	Employee em=new Employee();
//	em.setname("Nivedita");
//	
//	Employee e1=new Employee();
//	e1.setname("Vamshi");
//	
//	Bank b1=new Bank();
//	b1.setbname("SBI");
//	
//	Bank b2=new Bank();
//	b2.setbname("AXIS");
//	
//	System.out.println(em.getname() + " is working in " +b1.getbname());
//	System.out.println(e1.getname() + " is working in " +b2.getbname());
	Bank b=new Bank();
	b.setbname("Axis");
	
	
	Employee[] emp=new Employee[2];
	emp[0]=new Employee();
	emp[0].setname("Vamshi");
	emp[1]=new Employee();
	emp[1].setname("Krishna");
	b.setemp(emp);
	
	System.out.println(b.getemp()[0].getname()+" is working in "+b.getbname());
	System.out.println(b.getemp()[1].getname()+" is working in "+b.getbname());	}

}
