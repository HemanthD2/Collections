package com.CollectionFramework.Set;

import java.util.HashSet;

public class HashSET {
	public static void main(String[] args) {
		HashSet<Integer> a1 = new HashSet<Integer>();
		   
        a1.add(10); //a1[0] = 10;
        a1.add(9);
        a1.add(8);
        a1.add(11);
        a1.add(null);
        a1.add(null);
        
        a1.forEach(obj -> System.out.println(obj));
     
        boolean b1 = a1.contains(11);
        System.out.println(b1);
   
	}
}
