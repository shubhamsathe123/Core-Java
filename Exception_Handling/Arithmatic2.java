package Exception_Handling;

import java.util.Scanner;

public class Arithmatic2 {
public static void main(String[] args) {
	try {
		System.out.println("enter the values of a and b");
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		System.out.println(a/b);
		System.out.println("rest code");
	}
	catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println(e);
		System.out.println("shu bham");
	}
	
}
}
