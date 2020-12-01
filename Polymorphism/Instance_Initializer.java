package Polymorphism;

class Stu
{
	int i;
	Stu()
	{
		System.out.println("default constructor");
	}
	{
		System.out.println("Instance Initializer block invoked");
	}
}

class Shubham extends Stu
{
	Shubham()
	{
		super();
		System.out.println("child class constructoir");
	}
	{
		System.out.println("Instance Initializer block 2 invoked");
	}
}
public class Instance_Initializer {
public static void main(String[] args) {
	Shubham s=new Shubham();
}
}
