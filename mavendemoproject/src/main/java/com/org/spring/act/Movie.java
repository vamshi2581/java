package com.org.spring.act;

import org.springframework.stereotype.Repository;

@Repository
public class Movie {
public Movie add(String mname) {
	if(mname == null) {
		 throw new RuntimeException();
	 }
	 else {
		 System.out.println("Movie name is added");
	 }
	 return new Movie();
}
public boolean delete(String mname) {
	 if(mname == null) {
		 throw new RuntimeException();
	 }
	 else {
		 return true;
	 }
}
}
