package Abstraction;

abstract class Student 
{
	Student()
	{
		System.out.println("hii");
	}
	abstract void show();
}

class Shubh extends Student
{
	void show()
	{
		System.out.println("shubham sathe");
	}
}
public class Abstract_class {
public static void main(String[] args) {
	

	Student s=new Shubh();
	s.show();
}
}
