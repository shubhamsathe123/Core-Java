package FileHandling;
import java.io.*;
public class BufferedOutputStream {
	public BufferedOutputStream(FileOutputStream fout) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws FileNotFoundException {
		FileOutputStream fout=new FileOutputStream("C:\\Users\\lenovo\\OneDrive\\Desktop\\Onkar\\shubham");
		BufferedOutputStream b=new BufferedOutputStream(fout);
		try {
			fout.write(5);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
