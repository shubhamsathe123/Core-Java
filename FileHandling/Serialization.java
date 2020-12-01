package FileHandling;
import java.io.*;

class Student implements Serializable
{
	int id;
	String name;
	public Student(int id,String name)
	{
		this.id=id;
		this.name=name;
		
	}
}
public class Serialization {
	public static void main(String[] args) throws FileNotFoundException {
		Student s=new Student(1,"shubham");
		
		FileOutputStream f=new FileOutputStream("C:\\Users\\lenovo\\OneDrive\\Desktop\\Onkar\\shubham");
		try {
			ObjectOutputStream o=new ObjectOutputStream(f);
			o.writeObject(s);
			System.out.println("success");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
