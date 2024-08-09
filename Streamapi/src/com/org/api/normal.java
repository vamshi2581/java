package com.org.api;

import java.util.List;
import java.util.stream.Collectors;

public class normal {

	

	public static Integer solve(int a,int b) {
		try {
			return a/b;
		} catch(Exception e){
			e.printStackTrace();
		}
		return -1;
	}
	public static List<Integer>divide(List<Integer>l1,Integer b){
		return l1.stream().map(a -> solve(a, b)).collect(Collectors.toList());
	}
	}

