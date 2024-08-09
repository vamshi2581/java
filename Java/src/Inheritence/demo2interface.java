package Inheritence;

public interface demo2interface {
	
	String callMeeting(String name);
	
	default void print() {
		System.out.println("Default2");
		System.out.println("Demo2INterface");
	}
	static void call() {
		System.out.println("static2");
	}
}
