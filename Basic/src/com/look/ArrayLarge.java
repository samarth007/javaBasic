package com.look;

public class ArrayLarge {

public static int m(int[]a, int l) {
	
	int temp=0;
	
	for(int i=0; i<a.length; i++) {
		
		for(int j=i+1; j<a.length; j++) {
			
			if(a[i]<a[j]) {
			
				temp=a[j];
				a[j]=a[i];
				a[i]=temp;
			}
		}
		System.out.print(a[i]+" ");
	}
	System.out.println();
	return a[1];
}
	public static void main(String[] args) {

		int [] a = new int[] {67,3,2,90,0,7,1,77};
		
		int l = a.length;
		
		System.out.println(m(a,l));
		
	}

}
