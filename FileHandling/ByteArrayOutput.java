package FileHandling;
import java.io.*;

public class ByteArrayOutput {
	public static void main(String[] args) throws FileNotFoundException {
		
		FileOutputStream f1=new FileOutputStream("C:\\Users\\lenovo\\OneDrive\\Desktop\\Onkar\\sathe");
		FileOutputStream f2=new FileOutputStream("C:\\Users\\lenovo\\OneDrive\\Desktop\\Onkar\\shubham");
		
		ByteArrayOutputStream b=new ByteArrayOutputStream();
		int i;
		String s="shubham sathe";
		char ch[]=s.toCharArray();
		
		for(i=0;i<s.length();i++)
		{
			b.write(ch[i]);
		}
		
		try {
			b.writeTo(f1);
			b.writeTo(f2);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
