package com.look;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Hasmp_Array {

	public static void main(String[] args) {
		
		
		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("Cricket", "Sachin");
		hm.put("Hitman", "RohitSharma");
		hm.put("MI", "Champions");
		hm.put("NZ", "KW");
		
		//1. Map
		System.out.println(hm+"\n");
		
	    Iterator it =hm.entrySet().iterator();
	    
	    while(it.hasNext()) {
	    	
	    	Map.Entry p = (Map.Entry)it.next();
	    	System.out.println(p.getKey()+" "+p.getValue());
	    }
	    System.out.println();
	    
	  //2. Keys in Separate ArrayList
	    List<String> keyList = new ArrayList<String>(hm.keySet());
	    System.out.println(keyList);
	    for(String s : keyList) {
	    	System.out.print(s);
	    	System.out.print(" ");
	    }
	    System.out.println();
	    
	    //3. Values in Separate ArrayList
	    List<String> valueList = new ArrayList<String>(hm.values());
	    System.out.println(valueList);
	    
	    for(String a : valueList) {
	    	System.out.print(a);
	    	System.out.print(" ");
	    }
	}
}
