package javaIO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

public class InputStreamReaderExample {
	public static void run() throws Exception {
		FileInputStream fileInputStream=new FileInputStream("src/resources/input.txt");
		System.out.println(fileInputStream);
		InputStreamReader inputStreamReader=new InputStreamReader(fileInputStream,"UTF-8");
		System.out.println(inputStreamReader);
		int ch;
		while(( ch=inputStreamReader.read())!=-1) {
			char ch1=(char)ch;
			System.out.print(ch1);
			
		}
		inputStreamReader.close();
	}

}
