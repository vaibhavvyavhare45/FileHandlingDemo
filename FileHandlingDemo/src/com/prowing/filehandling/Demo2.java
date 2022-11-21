package com.prowing.filehandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Demo2 {
	public static void main(String[] args) {
		int count = 0;
		try {
			File f = new File("D:\\Vaibhtz45\\FileHandlingDemo\\src\\com\\prowing\\filehandling\\abc.txt");

			Scanner sc = new Scanner(f);
			while (sc.hasNextLine()) {
				sc.nextLine();
				count++;
			}
			System.out.println("count line: " + count);
			String[] word = null;

			int wc = 0;
			int cc = 0;
			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			String s;

			while ((s = br.readLine()) != null) {// reading content from the file
				word = s.split(" ");
				wc = wc + word.length;
				String s1 = word.toString().trim();
				char[] ch = s1.toCharArray();
				cc = cc + ch.length;
			}
			System.out.println("word count in the abc.txt file: " + wc);
			System.out.println("the  character count of the abc.txt file: " + cc);

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
