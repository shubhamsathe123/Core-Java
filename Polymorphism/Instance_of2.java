package Polymorphism;
class Car
{
	int no;
	float price;
	void display()
	{
		System.out.println(no);
	}
}

class Bmw extends Car
{
	int id;
	void display()
	{
		System.out.println(id);
	}
}
public class Instance_of2 {
	public static void main(String[] args) {
		Bmw b=new Bmw();
	    System.out.println(b instanceof Car);
	    System.out.println(b instanceof Bmw);
	    
	}

}
