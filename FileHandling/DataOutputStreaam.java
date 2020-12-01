package FileHandling;
import java.io.*;


public class DataOutputStreaam {
	public static void main(String[] args) throws FileNotFoundException {
		
		FileOutputStream f=new FileOutputStream("C:\\Users\\lenovo\\OneDrive\\Desktop\\Onkar\\shubham");
		DataOutputStream b=new DataOutputStream(f);
		
		try {
			b.writeChars("shubham");
			b.writeBytes("shubhama");
			b.writeFloat(4.5f);
			b.write(5);
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
