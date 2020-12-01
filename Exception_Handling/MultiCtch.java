package Exception_Handling;

public class MultiCtch {
	public static void main(String[] args) {
		String s=null;
		try {
			int a=s.length();
			
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		
		catch(NullPointerException e)
		{
			System.out.println(e);
		}
		catch(Exception e)
		{
			System.out.println(e);
			
		}
	}

}
