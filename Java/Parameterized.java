package Java;

class Student
{
	int roll;
	String name;
	Student(int roll,String name)
	{
		this.roll=roll;
		this.name=name;
		
	}
	Student(Student s)
	{
		roll=s.roll;
		name=s.name;
		
	}
	void display()
	{
		System.out.println("roll:"+roll+" name:"+name);
	}
}

public class Parameterized {
	public static void main(String[] args) {
		Student s=new Student(4,"shubham");
		Student s1=new Student(s);
		s.display();
		s1.display();
		
	}

	
}
