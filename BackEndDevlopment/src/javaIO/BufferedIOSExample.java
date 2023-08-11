package javaIO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedIOSExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileReader f=new FileReader("src/resources/input.txt");
			BufferedReader bufferReader=new BufferedReader(f);
			FileWriter w=new FileWriter("src/resources/output.txt");
			BufferedWriter bufferWriter=new BufferedWriter(w);
			
			String line;
			while((line=bufferReader.readLine())!=null) {
				String upperCase=line.toUpperCase();
				System.out.println(upperCase);
				bufferWriter.write(upperCase);
				bufferWriter.newLine();
				
			}
			bufferReader.close();
			bufferWriter.close();
			
		}catch(IOException ex) {
			ex.printStackTrace();
		}

	}

}
