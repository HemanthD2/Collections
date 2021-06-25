package com.CollectionFramework.List;

import java.util.Iterator;
import java.util.LinkedList;


public class LinkedLIST {

	public static void main(String[] args) {
        
		LinkedList<Integer> a1 = new LinkedList<Integer>();
		   
        a1.add(10); //a1[0] = 10;
        a1.add(20);
        a1.add(null);
        a1.add(10);
        a1.add(30);
        a1.add(null);
        
      Iterator<Integer> it1=a1.iterator();
      while(it1.hasNext()) {
    	  System.out.println(it1.next());
      }
        
        System.out.println("");
        
        a1.add(3, 50);//update
        System.out.println(a1.get(3));
        
        System.out.println("---DELETE index 1---");
        a1.remove(1);//delete
        System.out.println(a1.get(1));
        
        boolean b1 = a1.contains(60);
        System.out.println(b1);
        
	}

}
