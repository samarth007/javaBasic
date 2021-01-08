package com.look;

class A {

	int i = 777;
void m() {
	System.out.println("A");
}
}

class B extends A{
	int i =888;
	void m() {
			System.out.println("B");
		}
	}
class C extends B{
	int i = 999;
		void m() {
			System.out.println("C");
		}
		void n() {
			System.out.println("AC");
		}
	}

public class Coool{
	public static void main (String [] args) {
          	
	//	A a =new C();//upcasting--creating the object of c class by using the reference of A class.
		
		//C c = new C();
		
	//	A a = (A)c;//object casting
	}
}