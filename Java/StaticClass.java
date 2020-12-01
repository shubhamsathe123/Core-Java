package Java;

class Students
{
	int id;
	float roll;
	static String clg="aissms";
	
	void show(int id,float roll)
	{
		this.id=id;
		this.roll=roll;
	}
	
	void disply()
	{
		System.out.println(id+roll+clg);
	}
}
public class StaticClass {
	public static void main(String[] args) {
		Students s=new Students();
		s.show(1,4.5f);
		s.disply();
		}

}
