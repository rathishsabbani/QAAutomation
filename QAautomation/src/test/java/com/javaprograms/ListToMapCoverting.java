package com.javaprograms;

import java.util.*;
import java.util.stream.Collectors;


public class ListToMapCoverting {
	
	private Integer id;
	  
    // name will act as value
    private String name;
  
    // create curstuctor for reference
    public ListToMapCoverting(Integer id, String name)
    {
  
        // assign the value of id and name
        this.id = id;
        this.name = name;
    }
  
    // return private variable id
    public Integer getId()
    {
        return id;
    }
  
    // return private variable name
    public String getName()
    {
        return name;
    }

	public static void main(String[] args) {
		List<ListToMapCoverting> lt = new ArrayList<>();
		  
        // add the member of list
        lt.add(new ListToMapCoverting(1, "Geeks"));
        lt.add(new ListToMapCoverting(2, "For"));
        lt.add(new ListToMapCoverting(3, "Geeks"));
        lt.add(new ListToMapCoverting(4, "In"));
        lt.add(new ListToMapCoverting(5, "Program"));
  
        // create map with the help of
        // Collectors.toMap() method
        LinkedHashMap<Integer, String>
            map = lt.stream().collect(Collectors.toMap(
                            		  ListToMapCoverting::getId, ListToMapCoverting::getName,(x, y)-> x + ", " + y,LinkedHashMap::new));
  
        // print map
        map.forEach(
            (x, y) -> System.out.println(y));

	}

}
