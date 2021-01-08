package com.look;

public class ArraySmall {

public static int m(int[]a, int l) {
	
	int temp=0;
	
	for(int i=0; i<l; i++) {
		
		for(int j=i+1; j<l; j++) {
			
			if(a[i]>a[j]) {
			
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
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
		
		m(a,l);
		
	}

}
