package Inheritance;

class Employee
{
	protected
	int id=1;
	float sal=5.6f;
	void display()
	{
		System.out.println(sal);
	}
}
class Developer extends Employee
{
	void dis()
	{
		System.out.println(sal);
	}
}

class Tester extends Employee
{
	void disp()
	{
		System.out.println(id);
	}
}
public class Hierarchical {
public static void main(String[] args) {
	Tester t=new Tester();
	t.display();
	t.disp();
	
}
}
