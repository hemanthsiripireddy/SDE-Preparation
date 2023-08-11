package javaIO;
import java.io.*;

public class FileWriterExample {

	public static void main(String[] args) throws Exception {
//		// TODO Auto-generated method stub
//		FileWriter w=new FileWriter("src/resources/output.txt");
//		w.write("File Output");
//		w.close();
		FileReader fr=new FileReader("src/resources/output.txt");
		int character;
		while((character=fr.read())!=-1){
			System.out.print((char)character);
			
		}
		fr.close();

	}

}
