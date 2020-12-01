package Exception_Handling;
class Shubham
{
	int show()
	{
		try
		{
			return 21;
			
		}
		catch(Exception e)
		{
			return 20;
		}
		finally
		{
			return 2;
		}
	}
}
public class Return {
	public static void main(String[] args) {
		Shubham s=new Shubham();
		s.show();
		
	}

}
