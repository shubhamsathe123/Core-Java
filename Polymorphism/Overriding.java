package Polymorphism;

class Stud
{
	void display()
	{
		System.out.println("mehod 1");
	}
}
class Shubh extends Stud
{
	void display()
	{
		System.out.println("method 2");
	}
}
public class Overriding {
	public static void main(String[] args) {
		Shubh s=new Shubh();
		s.display();
	}

}
