package com.apachekafka.apachekafka.Restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.apachekafka.apachekafka.cutom.MessageRepository;
import com.apachekafka.apachekafka.producer.MessageProducer;

@RestController
public class KafkaController {
@Autowired
private MessageProducer producer;
@Autowired
private MessageRepository messrepo;

@GetMapping("/send")
public String sendMsg(@RequestParam("msg")String message) {
    producer.sendMessage(message);
    return ""+"'+message+'"+"sent successfully!";
}

@GetMapping("/getAll")
public String getAllMessage() {
	return messrepo.getAllMessage();
}
}
