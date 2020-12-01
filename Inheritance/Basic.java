package Inheritance;
class Student
{
	int id=1;
	float marks=4.5f;
	void display()
	{
		System.out.println(id+" marks:"+marks);
	}
	public void displa() {
		// TODO Auto-generated method stub
		
	}
}

class Shubham extends Student
{
 public void displa()
 {
	 System.out.println(id);
 }
}

public class Basic {
	public static void main(String[] args) {
		Student s=new Student();
		s.display();
		s.displa();
	}

}
