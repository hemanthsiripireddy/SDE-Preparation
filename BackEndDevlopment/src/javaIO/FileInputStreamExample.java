package javaIO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamExample {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FileInputStream fileInputStream=null;
		try {
			fileInputStream=new FileInputStream("src/resources/input.txt");
			int data;
			while((data=fileInputStream.read())!=-1) {
				System.out.print((char)data);
			}
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		finally {

			if(fileInputStream!=null) {
				try {
					fileInputStream.close();
				}
				catch(IOException ex) {
					ex.printStackTrace();
				}
			}

	}

}
}
