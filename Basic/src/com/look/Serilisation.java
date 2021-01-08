package com.look;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Serilisation implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private double h;
	private double w;
	
	public Serilisation(double h, double w) {
		this.h=h;
		this.w=w;
	}
	
	public double area() {
		return h*w;
	}
	
	public double perimeter() {
		return 2*(h+w);
	}
	
	
	public static void serial(Object oo, String file) throws IOException {
		
		FileOutputStream fos= new FileOutputStream(file);
	
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(oo);
		
		oos.close();
		
		fos.close();
	
	}
	
	public static void main(String[] args) throws IOException {
		
		Serilisation o = new Serilisation(10, 20);
	      serial(o, "res");
	}
}
	