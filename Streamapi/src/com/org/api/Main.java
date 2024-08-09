package com.org.api;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee> emp=new ArrayList<>();

		emp.add(new Employee(101, 2, "vamshi", "m", 1, 2500));
		emp.add(new Employee(102, 1, "krishna", "m", 5, 4500));
		emp.add(new Employee(103, 3, "varsha", "f", 2, 5500));
		emp.add(new Employee(104, 4, "kiran", "m", 9, 2500));
		emp.add(new Employee(105, 5, "nivi", "f", 7, 7500));

	Map<String, Long> a2= emp.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
    
    a2.forEach((gender, count) -> System.out.println("count  =  "+gender + ":"+count));
	}
	Optional<Employee> op1=Optional.ofNullable(emp);
	op1.ifpresent()

	
	

}
