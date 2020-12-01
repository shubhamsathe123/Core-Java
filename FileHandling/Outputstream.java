package FileHandling;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Outputstream {
	public static void main(String[] args) throws IOException {
		try {
			FileOutputStream  o=new FileOutputStream("C:\\Users\\lenovo\\OneDrive\\Desktop\\Onkar\\shubham");
		    o.write(65);
		    
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
