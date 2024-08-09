package com.org.api;
import java.util.*;
public class Optionaldemo {
	public static void main(String[] args) {
Integer[] arr= new Integer[20];
//System.out.println(arr[10].intValue());
Optional<Integer> r=Optional.ofNullable(arr[10]);
if(r.isPresent()) {
	System.out.println(arr[10]);
}else {
	System.out.println("Value is not present");
}
Employee em = new Employee(1011, 100, "vamshi", "ug",20, 250000);
Optional<Employee> op = Optional.ofNullable(em);
System.out.println(op.isEmpty());

op.ifPresent(s -> System.out.println(s.getName()));
}
}
