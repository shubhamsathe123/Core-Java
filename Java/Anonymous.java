package Java;

class Addition
{
	int c;
	public
	void add(int a,int b)
	{
		int c=a+b;
	
	}
	
	void display()
	{
		System.out.println(c);
	}
}
public class Anonymous {
	public static void main(String[] args) {
		new Addition().add(5,7);
		new Addition().display();
	}

}
