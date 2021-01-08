package com.look;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Create_File {

	public static void main(String[] args) throws IOException {
		
		File f = new File("E://samarth");
		f.mkdir();
		File f2 = new File(f,"sam.txt");
		f.createNewFile();
		FileWriter f4 = new FileWriter(f2,true);
		f4.write("\n");
		f4.write(100);
		f4.write('\n');
		f4.write("samarthak");
		f4.write("rao");
		f4.flush();
		f4.close();

	}
}
