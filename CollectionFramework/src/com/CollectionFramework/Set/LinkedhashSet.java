package com.CollectionFramework.Set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedhashSet {
	public static void main(String[] args) {
		LinkedHashSet<String> a1=new LinkedHashSet<String>();
		a1.add("Jack");
		a1.add("Amith");
		a1.add(null);
		a1.add("Pavan");
		a1.add(null);
		a1.add("Pavan");//it will not take duplicate values
		
		a1.forEach(z -> System.out.println(z));
		
		a1.remove("Pavan");//remove
		System.out.println("---------");
		Iterator<String> it1=a1.iterator();
		while(it1.hasNext()) {
			System.out.println(it1.next());
		}
		
	}

}
