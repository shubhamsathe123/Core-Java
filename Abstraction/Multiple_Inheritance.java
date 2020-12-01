package Abstraction;
interface Stud
{
	int id=1;
	void display();
	
}
interface Teacher
{
	float  sal=4.3f;
	void show();
	
}

class School implements Stud,Teacher
{
	public void display()
	{
		System.out.println("interface 1");
	}
	
	public void show()
	{
		System.out.println("interface 2");
	}
}

public class Multiple_Inheritance {
	public static void main(String[] args) {
		School s=new School();
		s.display();
		s.show();
	}

}
