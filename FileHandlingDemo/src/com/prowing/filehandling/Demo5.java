package com.prowing.filehandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.nio.file.spi.FileSystemProvider;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;



public class Demo5 {
	public static void main(String[] args) {
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
			//System.out.println(words);
			Map<String,Integer> wordCount=new HashMap<>();
			for(String w:words) {
				if(!wordCount.containsKey(w)) {
					wordCount.put(w, 1);
				}
				else {
					wordCount.put(w, wordCount.get(w)+1);
				}
				
			}
			
			System.out.println(wordCount);
			Iterator<Map.Entry<String,Integer>> itr=wordCount.entrySet().iterator();
			while(itr.hasNext()) {
				Entry<String,Integer> entry=itr.next();
				System.out.println(entry.getKey()+" = "+entry.getValue());
			}
		} 
		
		catch (Exception e) {
			// TODO: handle exception
		}
	}

}
