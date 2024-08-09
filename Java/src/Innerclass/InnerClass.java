package Innerclass;


class Cpu{
	double price;
	protected class ram{
		double memory;
		String manufacture;
		
		
		double getClockspeed() {
			return 5.2;
		}
	}
	class Processor{
		double cores;
		String manufacture;
		double getcache() {
			return 1;
		}

	}
}
public class InnerClass {
public static void main (String[] args) {
	Cpu c=new Cpu();
	Cpu.Processor p=c.new Processor();
	System.out.println(p.getcache());
}
}
