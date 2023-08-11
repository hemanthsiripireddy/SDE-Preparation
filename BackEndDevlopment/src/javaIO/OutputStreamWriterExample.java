package javaIO;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

public class OutputStreamWriterExample {
	public static void run() throws Exception{
		FileOutputStream fos=new FileOutputStream("src/resources/output.txt");
		OutputStreamWriter osw=new OutputStreamWriter(fos,"UTF-8");
		osw.write("this is output");
		osw.close();
	}

}
