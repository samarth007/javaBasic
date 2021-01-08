package com.look;

public class Pra {

	public static void main(String [] args) {
	
		int k=1;
		for(int i =0; i<=3; i++) {
			
			
			for(int j =0; j<=3-i; j++) {
				System.out.print(k+"  ");
				k++;
			}
			System.out.println();
		}
		System.out.println();
       
		int t=10;
			for(int p =0; p<=3; p++) {
			
			
			for(int m =0; m<=3-p; m++) {
				System.out.print(t+"  ");
				t--;
			}
			System.out.println();
		}
		
		
	}
}
