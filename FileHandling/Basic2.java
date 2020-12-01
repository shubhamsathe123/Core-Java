package FileHandling;
import java.io.File;
import java.io.IOException;

public class Basic2 {
	public static void main(String[] args) throws IOException {
		File f1=new File("C:\\Users\\lenovo\\OneDrive\\Desktop\\Onkar\\shubham");
		f1.createNewFile();
		System.out.println("is exists"+f1.exists());
	}

}
