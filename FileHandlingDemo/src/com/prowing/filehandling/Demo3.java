package com.prowing.filehandling;

import java.io.File;
import java.io.IOException;

public class Demo3 {
	public static void main(String[] args) {
		File f=new File("v.txt");
		System.out.println(f.exists());
		try {
			f.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(f.exists());
		
	}

}
