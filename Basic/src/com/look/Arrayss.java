package com.look;

public class Arrayss {
	public static int m(int []a1, int a) {

     int temp=0;
      
		for(int i =0; i<a1.length; i++) {
	
            for(int j=i+1; j<a1.length; j++) {
            	
            	if(a1[i]>a1[j]) {
            		
            		temp=a1[i];
            		a1[i]=a1[j];
            		a1[j]=temp;
            	}
            	
            }
            System.out.print(a1[i]+" ");
           
		}
		System.out.println( );
		
            return a1[a-2];
          
	}

	public static void main(String[] args) {
   
		int [] a1= new int[] {1,4,7,78,4,105,9,9,99};		
		
		int a= a1.length;
		System.out.println(m(a1,a));
}
}