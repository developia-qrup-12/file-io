package main;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;

public class Main {

	public static void main(String[] args) {

		File file = new File("D:\\luget.txt");

		if (!file.exists()) {
			try {
				file.createNewFile();
				System.out.println("file created");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		try {
			FileOutputStream f = new FileOutputStream(file);
			BufferedOutputStream bOS = new BufferedOutputStream(f);
			bOS.write("Hello".getBytes());
			bOS.write("\nWorld".getBytes());
			bOS.write("\nJava".getBytes());
			bOS.write("\nDeveloper".getBytes());
			bOS.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		try {
			FileInputStream f = new FileInputStream(file);
			BufferedInputStream bIS = new BufferedInputStream(f);
			for (int i = 0; i < 26; i++) {
				char ch = (char) bIS.read();
				System.out.print(ch);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
//		System.out.println();
//		System.out.println();
//
//		ByteArrayOutputStream bOutputStream = new ByteArrayOutputStream();
//
//		String str = "Hello";
//		while (bOutputStream.size() != str.length()) {
//			try {
//				bOutputStream.write(str.getBytes());
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		}
//
//		byte b[] = bOutputStream.toByteArray();
//		for (int x = 0; x < b.length; x++) {
//			System.out.print((char) b[x]);
//		}
//		
//		System.out.println();
//		System.out.println();
//		try {
//			InputStream in = new FileInputStream(file);
//			for (int i = 0; i < 26; i++) {
//				char ch=(char)in.read();
//				System.out.print(ch);
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		
//		System.out.println();
//		System.out.println();
//
//		try {
//			FileWriter fw = new FileWriter("D:\\file.txt");
//
//			for (int i = 0; i < str.length(); i++)
//				fw.write(str.charAt(i));
//			
//			for (int i = 0; i < str.length(); i++)
//				fw.write(str.charAt(i));
//			System.out.println("Successfully written");
//
//			fw.close();
//
//		} catch (Exception e) {
//			e.getStackTrace();
//		}
//
//		try {
//			FileReader input = new FileReader("D:\\file.txt");
//			for(int i=0;i<str.length()+str.length();i++) {
//	
//		        System.out.print((char) input.read());
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		}		

	}
}
