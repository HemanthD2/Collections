package com.CollectionFramework.List;

import java.util.ArrayList;
import java.util.Iterator;
class Array
{
	public static void arrayList()
	{
		System.out.println("ArrayList without specifying dataType");
		ArrayList a1=new ArrayList();
		a1.add(10);
		a1.add(null);
		a1.add('c');
		a1.add("String");
		a1.add(null);
		
		Iterator<Integer> it1=a1.iterator();
		while(it1.hasNext()) {
			System.out.println("Value is "+it1.next());
		}	
	}
	public static void Integer()
	{
		System.out.println("-----ArrayList<Integer>-----");
		ArrayList<Integer> a1=new ArrayList<Integer>();
		a1.add(10);
		a1.add(null);
		a1.add(9);
		a1.add(11);
		a1.add(null);
		
		for (Object object : a1) {
			System.out.println(object);
		}
		
		System.out.println("-------------");
		
		Iterator<Integer> it1=a1.iterator();
		while(it1.hasNext()) {
			System.out.println("Value is "+it1.next());
		}
	}
	public static void String()
	{
		System.out.println("-----ArrayList<String>-----");
		ArrayList<String> a1=new ArrayList<String>();
		a1.add("Hi");
		a1.add(null);
		a1.add("This");
		a1.add("is");
		a1.add("ArrayList");
		a1.add(null);
	System.out.println(a1.size());	
	
	
		Iterator<String> it1=a1.iterator();
		while(it1.hasNext()) {
			System.out.println("Value is "+it1.next());
		}
		
		System.out.println("---------------------------------");
		
		a1.remove(0);
		a1.add(3,"that..");
		
		Iterator<String> it2=a1.iterator();
		while(it2.hasNext()) {
			System.out.println("Value is "+it2.next());
		}
		
		boolean b1=a1.contains("is"); 
		System.out.println("Contains 'is': "+b1);
//		a1.clear();
//		System.out.println(a1.get(0));
	}
}
public class ArrayList1 {

	public static void main(String[] args) {
		//Array.arrayList();
		//Array.Integer();
		Array.String();
	}

}
