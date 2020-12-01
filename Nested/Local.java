package Nested;

class Outr
{
	int i=1;
	void show()
	{
		int j=2;
		final int k=3;
		class LocalInner
		{
			void display()
			{
				System.out.println(j);
				System.out.println(k);
			}
			
		}
		LocalInner l=new LocalInner();
		l.display();
	}
}
public class Local {
	public static void main(String[] args) {
		Outr o=new Outr();
		o.show();
		
	}

}
