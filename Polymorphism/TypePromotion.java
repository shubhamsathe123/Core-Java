package Polymorphism;

class Addition {
	int add(int a,int b)
	{
		return (a+b);
	}
}
public class TypePromotion {
public static void main(String[] args) {
	Addition a=new Addition();

	System.out.println(a.add(20, -124));
}
}
