package com.look;


class Fact{
	
int m(int a) {
	if(a==1) {
		return 1;
	}
	else {
		return (a*m(a-1));
	}
}
	
}
public class Factorial {

	public static void main(String[] args) {
		Fact f = new Fact();
		System.out.println(f.m(5));

	}

}
