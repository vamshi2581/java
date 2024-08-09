package com.org.Cfw;
import java.util.LinkedList;
import java.util.ArrayList;
public class Demo {
	public static void main(String[] args) {
		LinkedList<String> a = new LinkedList<String>();
		a.add("vamshi");
        a.add("nivedita");
        a.add("amit");
        a.add("Datta");
        a.add("jithendra");
        System.out.println(a);
        
        ArrayList<String> b = new ArrayList<String>();
		b.add("vamshi");
        b.add("nivedita");
        b.add("amit");
        b.add("Datta");
        b.add("jithendra");
        b.add(1,"krishna");
        System.out.println(b);
        System.out.println(b.contains("vamshi"));
	}
}
