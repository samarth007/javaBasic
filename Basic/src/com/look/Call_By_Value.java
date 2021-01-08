package com.look;

public class Call_By_Value {

	int d = 50;
	
	int d(int d){
		 d=d+50;// change will be in the instance variable
		 return d;
		 }
	
	public static void main(String [] args) {
	  Call_By_Value c = new Call_By_Value();
	  System.out.println(c.d);
	System.out.println(c.d(50));
	  System.out.println(c.d);
	}
	
	
}
