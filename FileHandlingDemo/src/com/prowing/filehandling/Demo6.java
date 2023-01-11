package com.prowing.filehandling;

import java.io.File;
import java.io.FileWriter;

class Demo6
{
public static void main(String arg[])throws Exception
{
File f = new File("pongal.txt");
System.out.println(f.exists());
FileWriter fw = new FileWriter(f,true);
System.out.println(f.exists());
fw.write(97);
fw.write("run\nsoftware\n");
char [] ch1 = {'a','b','c'};
fw.write(ch1);
fw.flush();
fw.close();
}
}