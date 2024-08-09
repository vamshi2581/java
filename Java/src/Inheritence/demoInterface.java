package Inheritence;

public interface demoInterface {

	void disp();
	
	default void print() {
		System.out.println("Default1");
	}
	
	static void call() {
		System.out.println("static1");
	}
}
