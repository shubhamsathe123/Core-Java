package Java;

class Emp
{
	int id;
	Emp()
	{
		System.out.println("this is default constructor");
	}
	Emp(int id)
	{
		this();
		this.id=id;
		System.out.println(id);
	}
}
public class This1 {
	public static void main(String[] args) {
		Emp e=new Emp(5);

	}

}
