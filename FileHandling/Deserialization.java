package FileHandling;
import java.io.*;

class Students implements Serializable
{
	int id;
	String name;
	public Students(int id,String name)
	{
		this.id=id;
		this.name=name;
		
	}
	public Students(ObjectInputStream o) {
		// TODO Auto-generated constructor stub
	}
}
public class Deserialization {
	public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException {
		
		
		FileInputStream f=new FileInputStream("C:\\Users\\lenovo\\OneDrive\\Desktop\\Onkar\\shubham");

		try {
			ObjectInputStream o=new ObjectInputStream(f);
			Students s=new Students(o);  
			  //printing the data of the serialized object  
			  System.out.println(s.id+" "+s.name);  
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
