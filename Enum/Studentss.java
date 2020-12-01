package Enum;

enum Stud
{
	SHUBHAM,SATHE;
	Stud()
	{
		System.out.println("hello");
	}
	void show()
	{
		System.out.println("shubham sathe");
	}
};
public class Studentss {
public static void main(String[] args) {
	Stud s=Stud.SHUBHAM;
	s.show();
	
}
}
