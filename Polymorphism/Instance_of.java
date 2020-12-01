package Polymorphism;

class Emp
{
	int id;
	void display()
	{
		System.out.println("display");
	}
}
public class Instance_of {
	public static void main(String[] args) {
		Emp e=new Emp();
		System.out.println(e instanceof Emp);
	}

}
