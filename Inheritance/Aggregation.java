package Inheritance;
 class Address
{
	 String village;
	 String Taluka;
	 String District;
	public Address(String village,String Taluka,String District)
	{
		this.village=village;
		this.Taluka=Taluka;
		this.District=District;
		
	}
	void display()
	{
		System.out.println(Taluka);
	}
}


public class Aggregation {
	public static void main(String[] args) {
	int id;
	float roll;
	Address ad;
	
	Address ad1=new Address("narayandoho","nagar","ahmednagar");
	ad1.display();
	
	
	
	}
	

}
