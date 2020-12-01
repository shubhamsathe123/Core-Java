package Exception_Handling;
class Throwing
{
	void m()throws ArithmeticException
	{
		int a=40/0;
	}
	void n()throws NullPointerException
	{
		String s=null;
		s.length();
	}
}
public class Throws {
public static void main(String[] args) {
	Throwing t=new Throwing();
	try {
		t.m();
	}
	catch(ArithmeticException e)
	{
		System.out.println(e);
	}
	
	try
	{
		t.n();
	}
	catch(NullPointerException e)
	{
		System.out.println(e);
	}
}
}
