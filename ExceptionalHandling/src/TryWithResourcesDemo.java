import java.io.FileOutputStream;
import java.io.IOException;

public class TryWithResourcesDemo {
	public static void tryWithResourcesDemo() {
		String filePath="C:\\Users\\sirip\\Documents1\\demo.txt";
		try(FileOutputStream fileOutputStream=new FileOutputStream(filePath)){
			String content="Welcome to try-with-resources demo!";
			fileOutputStream.write(content.getBytes());
			System.out.println("content written to file successfully");
			
			
		}
		catch(IOException e){
			System.out.println("error occred: "+e.getMessage());
			
		}
		
	}

}
