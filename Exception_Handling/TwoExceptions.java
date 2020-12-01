package Exception_Handling;

public class TwoExceptions {
	public static void main(String[] args) {
		try {
			int a=10/0;
			int arr[]=new int[10];
			System.out.println(arr[11]);
		}
		
		catch(ArrayIndexOutOfBoundsException e)
		{
			e.printStackTrace();
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
	}

}
