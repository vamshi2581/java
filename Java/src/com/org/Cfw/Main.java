package com.org.Cfw;
import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		Player p[]=new Player[4];
		for(int i=0;i<p.length;i++) {
			String pname=sc.nextLine();
			int pid=sc.nextInt();
			sc.nextLine();
			String pskill=sc.nextLine();
			String country=sc.next();
			p[i] = new Player(pname, pid, pskill, country);
			
		}
		
	}
}
class Player {
	String pname;
	int pid;
	String pskill;
	String country;
	public Player(String pname, int pid, String pskill, String country) {
		this.pname = pname;
		this.pid = pid;
		this.pskill = pskill;
		this.country = country;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPskill() {
		return pskill;
	}
	public void setPskill(String pskill) {
		this.pskill = pskill;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	@Override
	public String toString() {
		return "Player [pname=" + pname + ", pid=" + pid + ", pskill=" + pskill + ", country=" + country + "]";
	}
}

