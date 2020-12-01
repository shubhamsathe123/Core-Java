package Collection;
import java.util.*;

class Student 
{
	int id;
	String name;
	float sal;
	public Student(int id,String name,float sal)
	{
		this.id=id;
		this.name=name;
		this.sal=sal;
		
	}
}
public class ArrayList2 {
	public static void main(String[] args) {
		Student s=new Student(1,"shubham",4.5f);
		Student s1=new Student(2,"sathe",4.6f);
		
		ArrayList <Student>l=new <Student>ArrayList();
		l.add(s);
		l.add(s1);
		
		Iterator itr=l.iterator();
		while(itr.hasNext())
		{
			Student st=(Student)itr.next();  
	    System.out.println(st.id+" "+st.name+" "+st.sal);  
		}
		
	}

}
