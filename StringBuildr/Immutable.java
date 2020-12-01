package StringBuildr;

public final  class Immutable {
	final String Name;
	public Immutable(String Name)
	{
		this.Name=Name;
	}
	public String getName()
	{
		return Name;
	}
public static void main(String[] args) {
	Immutable i=new Immutable("shubham");
	System.out.println(i.getName());
	
}
}
