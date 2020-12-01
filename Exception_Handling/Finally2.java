package Exception_Handling;

public class Finally2 {
	public static void main(String[] args) {
		try {
			int a=10/0;
			
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("Shubham sathe");
		}
	}

}
