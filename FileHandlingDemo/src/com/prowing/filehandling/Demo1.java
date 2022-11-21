package com.prowing.filehandling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Demo1 {
public static void main(String[] args) {
	File f=new File("D:\\Vaibhtz45\\FileHandlingDemo\\src\\com\\prowing\\filehandling\\a.txt");
	BufferedWriter bw=null;
	FileWriter fr=null;
	try {
		fr=new FileWriter(f);
		fr.write("java is a language");
		fr.append("hello");
		
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	finally {
		try {
			fr.close();
		}
		catch(IOException e) {
			System.out.println("error of file  printing ");
		}
		
	}
}
}
