package Java;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Switch {
public static void main(String[] args) {
	int ch;
	System.out.println("enter your choice");
	Scanner s=new Scanner(System.in);
	 ch=s.nextInt();
	 
	 switch(ch)
	 {
	 case 1:
	 {
		 System.out.println("one");
		 break;
	 }
	 case 2:
	 {
		 System.out.println("two");
		 break;
		 
	 }
	 case 3:
	 {
		 System.out.println("three");
		 break;
	 }
	 default:
	 {
		 System.out.println("not a no");
	 }
	 }
	
	
}
}
