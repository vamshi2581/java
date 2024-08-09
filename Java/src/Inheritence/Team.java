package Inheritence;

public class Team extends Teamleads {
	String teamname;
	String pname;
	int nofemp;
	
	public Team(int pid, String name, int empid, String teamname, String pname, int nofemp) {
		super(pid, name, empid);
		this.teamname = teamname;
		this.pname = pname;
		this.nofemp = nofemp;
	}

	@Override
	public String toString() {
		return "Team [teamname=" + teamname + ", pname=" + pname + ", nofemp=" + nofemp + ", pid=" + pid + ", name="
				+ name + ", empid=" + empid + "]";
	}

	public static void main(String[] args) {
		
		Team te =new Team(101,"vam",101,"kri","pokiri",10);
		System.out.println(te);

    }
}
