package Encapsulation;
class Student{
	private String sname;
	private String srollno;
	private String sid;
	
	public String getsname() {
		return sname;
	}
	public String getsrollno() {
		return srollno;
	}
	public String getsid() {
		return sid;
	}
	public void setname(String sname) {
		this.sname=sname;
	}
	public void setsrollno(String srollno) {
		this.srollno=srollno;
	}
	public void setsid(String sid) {
		this.sid=sid;
	}
	
}
public class Encapsulationtest {
	public static void main(String[] args) {
		Student obj=new Student();
		obj.setname("Vamshi");
		obj.setsrollno("101");
		obj.setsid("2483266");
		
		System.out.println(obj.getsname());
		System.out.println(obj.getsrollno());
		System.out.println(obj.getsid());
	}
}
