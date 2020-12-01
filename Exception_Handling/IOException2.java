package Exception_Handling;

import java.io.IOException;

class Ioe
{
	void m()throws IOException
	{
		throw new IOException();
	}
}
public class IOException2 {
	public static void main(String[] args) throws IOException {
		Ioe i=new Ioe();
		try {
		i.m();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
