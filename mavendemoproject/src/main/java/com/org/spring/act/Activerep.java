package com.org.spring.act;

import org.springframework.stereotype.Repository;

@Repository
public class Activerep {
 public Activerep add (String ActorName) {
	 
	 if(ActorName == null) {
		 throw new RuntimeException();
	 }
	 else {
		 System.out.println("actor added");
	 }
	 return new Activerep();
 }
 public boolean delete(String ActorName) {
	 if(ActorName == null) {
		 throw new RuntimeException();
	 }
	 else {
		 return true;
	 }
 }
}
