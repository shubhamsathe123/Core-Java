package Java;

class Studentss
{
	int id;
	float marks;
	String name;
	
	void show(int id,float marks,String name)
	{
		this.id=id;
		this.marks=marks;
		this.name=name;
		
	}
	void display()
	{
		System.out.println("id:"+id+"marks:"+marks+"name:"+name);
	}
	
}
public class This 
{
	public static void main(String[] args) {
		Studentss s=new Studentss();
		s.show(1, 4.5f, "shubham");
		
		s.display();
		
	}

}
