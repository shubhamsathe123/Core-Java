package Exception_Handling;

import java.io.IOException;

class Io
{
	void m()throws IOException
	{
		throw new IOException();
	}
	void n() throws IOException
	{
		m();
	}
	void p()throws IOException
	{
		try
		{
			n();
		}
		catch(Exception e)
		{
			System.out.println("exception handled");
		}
	}
}
public class IoExceptionThrows {
public static void main(String[] args) throws IOException {
	Io i=new Io();
	i.p();
}
}
