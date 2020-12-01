package Enum;

public enum Students {
	SHUBHAM,ONKAR,NIKHIL,RITESH;
	Students()
	{
		System.out.println("derfault constructor");
	}
	void display()
	{
		System.out.println("hi friends");
	}

	public static void main(String[] args) {
		Students s=Students.NIKHIL;
		
		
	}
}
