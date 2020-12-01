package Java;

class Encaps
{
	private int id;
	private float marks;
	private String name;
	
	public void  setId(int id)
	{
		this.id=id;
	}
	public int getId()
	{
		return id;
	}
	
	public void setMarks(float marks)
	{
		this.marks=marks;
		
	}
	
	public float getMarks()
	{
		return marks;
		
	}
	
	
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
}
public class Encapsulation {
	public static void main(String[] args) {
		Encaps e=new Encaps();
		e.setId(1);
		System.out.println(e.getId());
		e.setMarks(4.5f);
		System.out.println(e.getMarks());
		e.setName("shubham");
		System.out.println(e.getName());
	}
	

}
