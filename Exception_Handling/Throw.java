package Exception_Handling;

import java.util.Scanner;

public class Throw {
	
	Scanner s=new Scanner(System.in);
	int a=s.nextInt();
	void check()
	{
		if(a<18)
		{
			throw new ArithmeticException("not valid");
		}
		else
		{
			System.out.println("eligible");
		}
	}
	public static void main(String[] args) {
		Throw t=new Throw();
		try {
			t.check();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		
		
	}
	

}
