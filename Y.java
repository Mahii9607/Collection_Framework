package com.Array;

import java.util.ArrayList;
import java.util.Collections;

public class Y {

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		al.add(25);
		al.add(22);
		al.add(12);
		al.add(65);
		al.add(32);
	    al.add("Mahesh");
		
		System.out.println(al.get(2));
		
		
		System.out.println("*****************");
		
		
		/*for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
			
		}*/
		
		
		
		
		for(Object object :al ) {
			System.out.println(object);
		}
		
	}

	}

