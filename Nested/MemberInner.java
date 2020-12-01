package Nested;

class Outer
{
	int i=1;
	static int j=3;
	static void show()
	{
		System.out.println("ststic outer class");
	}
	void sho()
	{
		MemberInner j=new MemberInner();
		System.out.println(j.a);
		System.out.println(j.b);
	}
	
	class MemberInner
	{
		int a=12;
		float b=2.3f;
		void display()
		{
			show();
			System.out.println("Member Inner class");
			System.out.println(j);
		}
	}
     
}
public class MemberInner {
	public static void main(String[] args) {
		Outer o=new Outer();
	 Outer.MemberInner i=o.new MemberInner();
	 i.display();
	 o.sho();
	}

}
