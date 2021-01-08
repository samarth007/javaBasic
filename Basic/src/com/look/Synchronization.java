package com.look;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Synchronization {

	public static void first_method_synchorization() {
		List<String> l=	Collections.synchronizedList(new ArrayList<String>());
			
			l.add("java");
			l.add("py");
			l.add("c#");
			
			synchronized (l) {
			
				Iterator<String> it =l.iterator();
				
				while(it.hasNext()) {
					System.out.println(it.next());
				}
			}
		}

	public static void Second_Method_Synchroization() {
		
		CopyOnWriteArrayList<String> cp = new CopyOnWriteArrayList<String>();
		cp.add("py");
		cp.add("aws");
		cp.add("az");
		
		Iterator<String> it = cp.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
	
	public static void main(String[] args) {
		
		Synchronization.first_method_synchorization();
		Synchronization.Second_Method_Synchroization();
		}
}
