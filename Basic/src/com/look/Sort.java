package com.look;

import java.util.ArrayList;
import java.util.List;


class Cool{
	int no;
	String name;
	int id;
	
	Cool(int no, String name, int id){
		this.no=no;
		this.name=name;
		this.id=id;
	}
}
public class Sort {

	public static void main(String[] args) {
	
		Cool c = new Cool(1,"demo",7);
		Cool c1 = new Cool(2,"dem",2);
		Cool c2 = new Cool(8,"fro",3);
		
		List<Cool> al = new ArrayList<Cool>();
		al.add(c);
		al.add(c1);
		al.add(c2);
		
	   for(Cool cc :al) {
		   System.out.println(cc.id+" "+cc.no+" "+cc.name);
	   }
		
	}

}
