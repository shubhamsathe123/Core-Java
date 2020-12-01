package Nested;

class Outer1
{
	int i=1;
	static int j=2;
	static void msg()
	{
		System.out.println("outer class static method");
	}
	static class Inner1
	{
		static void display()
		{
			msg();
			System.out.println(j);
		}
	}
}
public class StaticNested {
	public static void main(String[] args) {
		//Outer1.Inner1.display();
		
		Outer1 o=new Outer1();
		Outer1.Inner1 i=new Outer1.Inner1();
		i.display();
		Outer1.msg();
	}

}
