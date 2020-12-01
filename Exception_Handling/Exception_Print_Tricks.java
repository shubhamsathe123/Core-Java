package Exception_Handling;

public class Exception_Print_Tricks {
	public static void main(String[] args) {
		try {
			int b=10/0;
		}
		catch(ArithmeticException e)
		{
			//e.getMessage();
			e.printStackTrace();
			//System.out.println(e);
		}
		System.out.println("hello");
	}

}
