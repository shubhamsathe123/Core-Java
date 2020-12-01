package Polymorphism;

class Employee
{
	int id;
	String Sub;
	Float Marks;
	
	void show(int id,float Marks)
	{
		this.id=id;
		this.Marks=Marks;
	}
	void show(int id,String Sub)
	{
		this.id=id;
		this.Sub=Sub;
	}
	void display()
	{
		System.out.println("id:"+id+" marks:"+Marks+" sub:"+Sub);
	}
}
public class MethodOver {
	public static void main(String[] args) {
		
	
	Employee e=new Employee();
	e.show(1,4.5f);
	e.show(2,"math");
	e.display();
	}

}
