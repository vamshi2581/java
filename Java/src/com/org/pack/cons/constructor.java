package com.org.pack.cons;

public class constructor {
int age;
String Name;
int num;
private constructor(int age,String Name,int num){
	 this.age=age;
	 this.Name=Name;
	 this.num=num;
}
public void display()
{
	System.out.println(age);
	System.out.println(Name);
	System.out.println(num);
	}
public static void main(String[] args) {
	constructor c=new constructor(25,"vamshi",101);
	c.display();
}
}
