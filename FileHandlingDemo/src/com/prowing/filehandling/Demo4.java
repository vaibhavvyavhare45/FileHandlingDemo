package com.prowing.filehandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Demo4 {
	public static void main(String[] args)throws IOException {
		BufferedReader reader=null;
		try {
			reader=new BufferedReader(new FileReader(new File("D:\\\\Vaibhtz45\\\\FileHandlingDemo\\\\src\\\\com\\\\prowing\\\\filehandling\\\\abc.txt")));
			String line=reader.readLine();
			List<String> words=new ArrayList<>();
			while(line!=null) {
				line=line.trim();
				words.addAll(Arrays.asList(line.split(" ")));
				line=reader.readLine();
			}
			System.out.println(words);
			Set<String> uniqueWords=new HashSet<>(words);
			for(String w:uniqueWords ) {
				System.out.println(w+" "+Collections.frequency(words,w));
			}
		}
		
		catch (IOException e) {
			e.printStackTrace();
	
	}
	}
}
