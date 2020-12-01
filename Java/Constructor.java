package Java;

import java.util.Scanner;

class Employee
{
	int id=1;
	float sal;
	String name;
	
	Employee(int i,float f,String n)
	{
		id=i;
		sal=f;
		name=n;
	}
	
	void display()
	{
		System.out.println("id:"+id+" name:"+name+" sal:"+sal);
	}
}
public class Constructor {
	public static void main(String[] args) {
		System.out.println("enter the values");
		Scanner s=new Scanner(System.in);
		int i=s.nextInt();
		float f=s.nextFloat();
		String n=s.next();
		
		Employee e=new Employee(i,f,n);
		e.display();
	}

}
