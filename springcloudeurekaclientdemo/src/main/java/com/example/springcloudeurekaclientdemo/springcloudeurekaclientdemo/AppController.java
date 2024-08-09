package com.example.springcloudeurekaclientdemo.springcloudeurekaclientdemo;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/app")
public class AppController {
	
	@GetMapping(path="/products")
 public Response getProducts() {
	 Product p1=new Product("Apple",500000);
	 Product p2=new Product("nike",700000);
	 Product p3=new Product("jorden",800000);
	 Product p4=new Product("timex",600000);
	 Product p5=new Product("bata",30000);
	 
	 
	 
	 ArrayList<Product> products = new ArrayList<Product>();
	 products.add(p1);
	 products.add(p2);
	 products.add(p3);
	 products.add(p4);
	 products.add(p5);
	 Response response = new Response(101,"Product Fetched Successfully ",products);
	 
	return response;
	 
	
 }
}
