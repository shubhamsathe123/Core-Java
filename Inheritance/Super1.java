package Inheritance;

class Stud
{
	int id=1;
	void dis()
	{
		System.out.println(id);
	}
}
class Sath extends Stud
{
	 void display()
	 {
	super.dis();
	System.out.println(super.id);
	 }
}
public class Super1 {
	public static void main(String[] args) {
		Sath s=new Sath();
		s.display();
	}

}
