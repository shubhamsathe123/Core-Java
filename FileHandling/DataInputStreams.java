package FileHandling;
import java.io.*;

public class DataInputStreams {
	public static void main(String[] args) throws FileNotFoundException {
		
		FileInputStream f=new FileInputStream("C:\\Users\\lenovo\\OneDrive\\Desktop\\Onkar\\shubham");
	
		DataInputStream d=new DataInputStream(f);
		int i;
		try {
			do {
			 i=d.read();
			if(i!=-1)
			{
				System.out.print((char)i);
			}
			}while(i!=-1);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}

}
