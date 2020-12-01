package Exception_Handling;

public class Nested {
	public static void main(String[] args) {
		try
		{
			int a=10/0;
			try 
			{
				int arr[]=new int[10];
				System.out.println(arr[11]);
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println(e);
			}
			try
			{
				String s=null;
				s.length();
			}
			catch(NullPointerException e)
			{
				System.out.println(e);
			}
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		System.out.println("rest of the code");
	}

}
