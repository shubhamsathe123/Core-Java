package Array;

import java.util.Scanner;

public class Multidemensional {
	public static void main(String[] args) {
		int[][] arr=new int[3][3];
		System.out.println("enter the array elements");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				Scanner s=new Scanner(System.in);
				arr[i][j]=s.nextInt();
			}
		}
		
		System.out.println("arrray elements are");
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				System.out.println(arr[i][j]+" " );
			}
			System.out.println("\n");
		}
		
	}

}
