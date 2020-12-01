package Java;

import java.util.Scanner;

public class Leap_year {
	public static void main(String[] args) {
		int  year;
		System.out.println("enter the year");
		Scanner s=new Scanner(System.in);
		year=s.nextInt();
		
		if(year%4==0)
		{
			if(year%100==0)
			{
				if(year%400==0)
				{
					System.out.println("year is leap");
				}
				else
				{
					System.out.println("year is not leap");
				}
			}
			else
			{
				System.out.println("year is leap");
			}
		}
		else
		{
			System.out.println("year is not leap");
		}
		
	}

}
