package com.look;


public class Maths {
	void m(int a , int b) {
		System.out.println(a+b);
	}
	void m(float a, float b) {
		System.out.println(a+b);
		System.out.println("child");
	}
	public static void main(String [] args) {
     Maths m = new Maths();
     m.m(20, 3.3f);
     
	}
}
