package com.org.hash;

import java.util.Enumeration;

import java.util.Hashtable;
public class Hashtab {
	public static void main(String[] args) {
Hashtable<Integer,String> b= new Hashtable<>();
b.put(3,"vam");
b.put(6,"sam");
b.put(2,"kam");
b.put(1,"kri");
Enumeration<Integer>em=b.keys();
while(em.hasMoreElements()) {
	int key = em.nextElement();
	System.out.println(key);
}
System.out.println(b.putIfAbsent(5,"Var"));
System.out.println(b.getOrDefault(2,"invalid"));
	}
	
}
