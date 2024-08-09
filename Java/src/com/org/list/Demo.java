package com.org.list;
import java.util.LinkedHashSet;
import java.util.ArrayList;
import java.util.Iterator;

class Student{
	String name;
	int id;
	String city;
	public Student(String name, int id, String city) {
		this.name = name;
		this.id = id;
		this.city = city;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", city=" + city + "]";
	}
	
	
}
public class Demo {
	public static void main(String[] args) {
		
		ArrayList<String> s= new ArrayList<>();
//		s.add(new Student("vamshi",101,"pune"));
//		s.add(new Student("krishna",102,"hyd"));
//		s.add(new Student("krishna",102,"hyd"));
		s.add(new String("hfhj"));
		s.add(new String("hfhj"));
		s.add(new String("hfhjuitygtiu"));
		LinkedHashSet<String> arr= new LinkedHashSet<>(s);
		Iterator<String> a=arr.iterator();
		while(a.hasNext()) {
			System.out.println(a.next());
		}
	}
}
