package com.javaprograms;

import java.util.*;

public class AddTwolistsinOnelist {

public static void main(String[] args) {
		
		
LinkedList <String> List = new LinkedList<String>();
		
		List.add("Abc");
		List.add("Def");
		List.add("Ghi");
		List.add("jkl");
		
		LinkedList <String> List1 = new LinkedList<String>();
		
		List1.add("Raju");
		List1.add("Ramu");
		List1.add("Ramesh");
		List1.add("Rakesh");
		
		LinkedList <Integer> List2 = new LinkedList<Integer>();
		
        List2.add(1);
        List2.add(2);
        List2.add(3);
        List2.add(4);
        
        LinkedList <Object> List3 = new LinkedList<Object>();
        
        List3.addAll(List1);
        List3.addAll(List2);
        
        System.out.println(List3);
        
        TreeSet<Object> List4 = new TreeSet<Object>();
         List4.addAll(List);
        List4.addAll(List1);
        
        System.out.println(List4);
        
	}

}
