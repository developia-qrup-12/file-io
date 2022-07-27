package main;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

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
			FileOutputStream f=new FileOutputStream(file);
			BufferedOutputStream bOS = new BufferedOutputStream (f);
			bOS.write("Hello".getBytes());
			bOS.write("\nWorld".getBytes());
			bOS.write("\nJava".getBytes() );
			bOS.flush();
			bOS.write("\nDeveloper".getBytes());
		} catch (Exception e) {
			e.printStackTrace();
		}
		

	}	
}