package com.apachekafka.apachekafka.cutom;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class MessageRepository {
private List<String> list=new ArrayList<String>();

public void addMessage(String message) {
	list.add(message);
}
public String getAllMessage() {
	return list.toString();
	
}
}
