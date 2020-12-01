package FileHandling;
 import  java.io.*;
 
public class SequenseStream {
public static void main(String[] args) throws FileNotFoundException {
	
	FileInputStream f1=new FileInputStream("C:\\Users\\lenovo\\OneDrive\\Desktop\\Onkar\\shubham");
	FileInputStream f2=new FileInputStream("C:\\Users\\lenovo\\OneDrive\\Desktop\\Onkar\\sathe");
	
	SequenceInputStream s1=new SequenceInputStream(f1,f2);
	
	try {
		int i;
		do
		{
			i=s1.read();
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
