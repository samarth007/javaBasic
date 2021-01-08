package com.look;

import java.util.HashMap;

public class Hash_Map {

	public static void main(String[] args) {
		
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1, "pp");
		hm.put(0, "qww");
		hm.put(2, "coo");
		
		HashMap<Integer, String> hm1 = new HashMap<Integer, String>();
		hm1.put(1, "demo");
		hm1.put(0, "ko");
		hm1.put(2, "dddas");
		
		System.out.println(hm.equals(hm1));
		
	}
}
