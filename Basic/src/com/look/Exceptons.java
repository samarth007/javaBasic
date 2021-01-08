package com.look;

import java.io.IOException;

class Dem{
	
	void p() throws IOException{
     throw new IOException("sss");
	//System.out.println("pop");	
	}
}

public class Exceptons {
	
	public static void main(String[] args) throws IOException {
		Dem e = new Dem();
		try {
		e.p();
		}
		catch(Exception f) {
			System.out.println(f);
		}
		
		
        System.out.println("output");
	}
}
