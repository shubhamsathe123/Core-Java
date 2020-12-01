package FileHandling;
import java.io.*;
public class InputStream {
	public static void main(String[] args) throws IOException {
		try {
			FileInputStream fis=new FileInputStream("C:\\Users\\lenovo\\OneDrive\\Desktop\\Onkar\\shubham");
		int i;
		do
		{
			i=fis.read();
			if(i!=-1)
			{
				System.out.print((char)i);
			}
		}
		while(i!=-1);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	

}
