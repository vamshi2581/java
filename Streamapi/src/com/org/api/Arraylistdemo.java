package com.org.api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class Arraylistdemo {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);

//        ArrayList<String> b = new ArrayList<>();
//       
//        
//       b.add("vamshi");
//       b.add("krishna");
//       b.add("kiran");
//       //creating stream
//       Stream<String> s= b.stream();
//       Stream<String> s1= b.stream();
//       
//       int x[]= {1,2,3,4,5};
//       //creating stream of object
//       IntStream f= Arrays.stream(x);
       
       List<String> myList= Arrays.asList("vamshi","krishna","kiran");
       Stream<String> sequentailStream= myList.stream();
       Stream<String> parallelStream= myList.parallelStream();
       //stream.of() method create a stream from individuals values.
     Stream<String> stream=Stream.of("vamshi","krishna","kiran");
   
     sequentailStream = Stream.of("vamshi","krishna");
     //stream.forEach(System.out::println);
    
     
     
     //filter(): Filter elements based on a predicate
     
     List<String>filteredList = myList.stream()
    		 .filter(s -> s.startsWith("a"))
    		 .collect(Collectors.toList());
     
      //map(): Transforms elements using a function.
     List<Integer>lengths = myList.stream()
    		 .map(String::length)
    		 .collect(Collectors.toList());

       //sorted(): sorts elements
     
     List<String>sorted = myList.stream()
    		 .sorted()  //we can use comparator here as a arg
    		 .collect(Collectors.toList());
     
     Stream<Integer> st = Stream.of(1,23,1,2,3,4,5,6);
     st.sorted((a,b) -> a-b).forEach(System.out::println);
     
     
     //distinct(): Remove duplicate element
     List<String>distinct = myList.stream()
    		 .distinct()
    		 .collect(Collectors.toList());
       
        
        
        

        
    }

}
