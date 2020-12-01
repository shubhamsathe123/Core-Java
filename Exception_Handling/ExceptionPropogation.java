package Exception_Handling;

class Propogation
{
	void m()
	{
		int a=10/0;
	}
	void n()
	{
		m();
	}
	void p()
	{
		try {
			n();
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
	}
}
public class ExceptionPropogation {
public static void main(String[] args) {
	Propogation p=new Propogation();
	p.p();
			
}
}
