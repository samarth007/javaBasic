package com.look;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;



public class Deserialisation {

public static Object Desrialize(String file) throws IOException, ClassNotFoundException {
	
	FileInputStream fis = new FileInputStream(new File(file));	
	ObjectInputStream ois = new ObjectInputStream(fis);
	Object ob = ois.readObject();
	ois.close();
	fis.close();
	return ob;
}
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Serilisation sc = new Serilisation(20, 20);
	    Serilisation.serial(sc, "res");
	    
	    Serilisation ss = (Serilisation) Desrialize("res");
	    System.out.println(ss.area());
	}
	
	
	
	
}
