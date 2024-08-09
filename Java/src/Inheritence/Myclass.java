package Inheritence;

//class  Demo{
//	static void hello() {
//		System.out.println("Static 1 ");
//	}
//	static void hello(String a ) {
//		System.out.println(a);
//	}
//}


public class Myclass implements demoInterface , demo2interface{

	@Override
	public void disp() {
		// TODO Auto-generated method stub
   System.out.println("Abstract method ");
	}

	
	
	public static void main (String args[]) {
		Myclass m1 = new Myclass();
		m1.disp();
		m1.print();
		demoInterface.call();
		m1.print();
		demo2interface.call();
		//m1.hello();
	
	}

	@Override
	public String callMeeting(String Manger) {
		// TODO Auto-generated method stub
		return "Manager will call the meeting";
	}



	@Override
	public void print() {
		// TODO Auto-generated method stub
		demoInterface.super.print();
	}

	

}
