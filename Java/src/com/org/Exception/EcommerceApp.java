package com.org.Exception;
import java.util.*;
import java.util.Scanner;
class Votings extends Exception{
	static String vote="You are not allowed for voting";
	static String vote1="You are not";
	static  String a=vote+vote1;

	public Votings() {
		super(a);
		
	}
	
}
class EcommerceApp {
	public static void main(String[] args) throws Votings{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your Age");
	int n=sc.nextInt();
	if(n>18) {
		System.out.println("You are Eligible for Voting");
	}
	else {
	throw new Votings();
	}
	}
}
