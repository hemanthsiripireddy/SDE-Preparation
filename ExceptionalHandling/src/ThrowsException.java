import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOError;
import java.io.IOException;
import java.io.Reader;

public class ThrowsException {
	public static void readFile() throws NullPointerException {
		FileReader file=null;
		BufferedReader fileInput=null;
		try {
			
			int k=5/3;
			System.out.println(k);
		}
		
		finally {
			
		}
//		FileReader file=null;
//		BufferedReader fileInput=null;
//		try {
//			file =new FileReader("C:\\Users\\sirip\\Documents\\source1.txt");
//			fileInput=new BufferedReader(file);
//			for(int i=0;i<3;i++) {
//				System.out.println(fileInput.readLine());
//			}
//		}
//		catch(FileNotFoundException e) {
//			System.out.println("FileNotFoundException: "+e.getMessage());
//		}
//		finally {
//			if(file!=null) {
//				file.close();
//				System.out.println("File Reader closed successfully");
//			}else {
//				System.out.println("fille is null");
//			}
//			if(fileInput!=null) {
//				fileInput.close();
//				System.out.println("BufferedReader closed sucessfully");
//			}
//			else {
//				System.out.println("Buffer is null");
//			}
//		}
	}

}
