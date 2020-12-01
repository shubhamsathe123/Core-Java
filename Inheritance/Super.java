package Inheritance;

class Employeee
{
	public
	int id=1;
	float sal;
	public
	
	Employeee(int i)
	{
		System.out.println("default");
	}
}
class Testerr extends Employee
{
	int j;
	public Testerr()
	{
		super();
	}
}
public class Super {
	public static void main(String[] args) {
		Testerr t=new Testerr();
		
	}

}
