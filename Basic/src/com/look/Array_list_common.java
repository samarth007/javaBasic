package com.look;

import java.util.ArrayList;
import java.util.Arrays;

public class Array_list_common {

	public static void main(String[] args) {
		
		ArrayList<String> li = new ArrayList<String>(Arrays.asList("java","c#","js","py","aws"));
		ArrayList<String> ll = new ArrayList<String>(Arrays.asList("c#","java","py","js","az"));
		
		li.retainAll(ll);
		System.out.println(li);
	}
}
