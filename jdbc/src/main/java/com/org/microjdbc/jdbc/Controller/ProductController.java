package com.org.microjdbc.jdbc.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.org.microjdbc.jdbc.model.Product;
import com.org.microjdbc.jdbc.model.Response;
import com.org.microjdbc.jdbc.repository.ProductRepository;

@RestController

@RequestMapping(path="/products")
public class ProductController {
	@Autowired
	ProductRepository prorepo;
	
	 @PostMapping(path="/add")
	 public ResponseEntity<Response> addProduct(@RequestParam String name,@RequestParam String brandname, @RequestParam Integer price) {
		
		 Product product = new Product(null,name,brandname,price);
		 System.out.println("product: "+product);
		 
		 try {
			 prorepo.save(product);
			 
			 Response response=new Response(101,"Product"+name+"saved successfully");
			 return new ResponseEntity<Response>(response,HttpStatus.OK);
		 }catch(Exception exception) {
			 Response response=new Response(701,"Product"+name+"notsaved successfully");
			 return new ResponseEntity<Response>(response,HttpStatus.OK);
		 }
		 
	 }

}
