package com.look;

import java.util.Scanner;

public class Reverse {
  

	public static void main(String[] args) {
        Scanner s = new Scanner(System.in); 
       
        System.out.println("enter the value :");
        String sr = s.nextLine();
        System.out.println("enetered value :"+sr);
       
        String [] a =sr.split(" ");
        
        System.out.print("Reversed value :");
		for(int i =a.length-1; i>=0; i--) {
			System.out.print(a[i]+" ");
		}
		s.close();
	}

}
