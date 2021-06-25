package com.CollectionFramework.List;

import java.util.Iterator;

public class ObjectArray {

	public static void main(String[] args) {
		Object[] obj=new Object[5];
		obj[0]=123;
		obj[1]='c';
		obj[2]="Hello";
		obj[3]=12345687654l;

		for (Object object : obj) {
			System.out.println(object);
		}
	}

}
