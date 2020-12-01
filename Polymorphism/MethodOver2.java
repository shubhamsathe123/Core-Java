package Polymorphism;

class Employeee
{
	int id;
	String Sub;
	Float Marks;
	
	void show(int i)
	{
		System.out.println("default");
	}
	void show()
	{
		System.out.println("shubham");
		
	}
	
}
public class MethodOver2 {
	public static void main(String[] args) {
		
	
	Employeee e=new Employeee();
e.show();
	}

}
