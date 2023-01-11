package com.prowing.filehandling;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PathClassDemo {
	public static void main(String[] args) {
		Path p=Paths.get("C:\\Users\\vvyav\\git\\FileHandlingDemo\\FileHandlingDemo\\src\\com\\prowing\\filehandling\\abc.txt");
		try {
			List<String>lines=Files.readAllLines(p);//in files class present in the readallline() method  this method 
			System.out.println(lines);
			System.out.println("total number of lines: "+lines.size());
			
			List<String> words=new ArrayList<>();
			int charCount=0;
			for (String line : lines) {
				line=line.trim();
				words.addAll(Arrays.asList(line.split(" ")));
				
			}
			
			System.out.println("total number of words: "+words.size());
			for (String word : words) {
				charCount=charCount+word.length();
			}
			System.out.println("total number of char count: "+charCount);
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
