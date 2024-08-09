package com.org.spbdemonew.spbdemonew.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.org.spbdemonew.spbdemonew.model.PostRequest;
import com.org.spbdemonew.spbdemonew.model.PostResponse;
import com.org.spbdemonew.spbdemonew.model.SampleResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/sample")
public class Webcontroller {
	
	
@GetMapping("/data")	
public SampleResponse sample( @RequestParam( value = "name" , defaultValue = "Krishna")String name) {
	SampleResponse res = new SampleResponse();
		res.setId(1);
		res.setMessage("vamshi");
	return res;
}



@PostMapping
public PostResponse Test(@RequestBody PostRequest inputpayload) {
	PostResponse response =new PostResponse();
	response.setId(inputpayload.getId()*100);
	response.setMessage("Hello " + inputpayload.getName());
	response.setExtra("some text");
	return response;
}


}
