package Java;
class Profound
{
	int id;
	void show(int id )
	{
		this.id=id;
	}
}

public class CallByValue {
	public static void main(String[] args) {
		Profound p=new Profound();
		p.show(23);
	}

}
