package com.CollectionFramework.Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Hashmap {

	public static void main(String[] args) {
		//HashMap<Integer, String> map=new HashMap<Integer, String>();
		//LinkedHashMap<Integer, String> map=new LinkedHashMap<Integer, String>();
		TreeMap<Integer, String> map=new TreeMap<Integer, String>();
		map.put(1, null);
		map.put(3, "Hemanth");
		map.put(4, "pavan");
		map.put(3, "Hemanth");
		map.put(5, "hii");
		map.put(2, "Hello");
		map.put(6, null);

		
		for(Map.Entry<Integer,String> m:map.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
		System.out.println("-------------");
		
		Set<Integer> keys=map.keySet();
		keys.forEach(key -> System.out.println(key+"-->"+map.get(key)));
	}
}
