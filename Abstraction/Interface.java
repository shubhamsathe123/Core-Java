package Abstraction;
interface Employee
{
	int id=1; 
	float sal=2.5f;
	void display();
}
class Developer implements Employee
{
	public void display()
	{
		System.out.println(id+" sal:"+sal);
	}
}
public class Interface {
	public static void main(String[] args) {
		Employee e=new Developer();
		e.display();
	}

}
