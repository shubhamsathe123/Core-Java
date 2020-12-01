package Exception_Handling;

import java.io.IOException;

class Ioex
{
	void m()throws IOException
	{
		throw new IOException();
	}
}
public class IoException3 {
	public static void main(String[] args) throws IOException {
		Ioex i=new Ioex();
		i.m();
	}

}
