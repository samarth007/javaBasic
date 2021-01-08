package com.look;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists {

	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(2);
		al.add(5);
		al.add(90);
		al.add(9);
		al.add(2, 8);
        al.add(1);
        System.out.println(al);
        
        List<Integer> l = al.subList(1, 4);
        System.out.println(l);  
        l.set(1, 23);
        System.out.println(l);
        System.out.println(al);
	}

}
