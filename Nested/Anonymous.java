package Nested;

abstract class Student
{
	abstract void show();
}

interface Stud
{
	void sho();
}

public class Anonymous {
	public static void main(String[] args) {
		Student s=new Student()
				{
			     void show()
			      {
				   System.out.println("iugfj");
			      }
				};
				s.show();
		Stud i=new Stud()
		{
			public void sho()
			{
				System.out.println("yfu");
			}
		};
		i.sho();
	}

}
