package Java;

import java.util.Scanner;

public class MatrixRotation {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int rows=sc.nextInt();
		int col=sc.nextInt();
		int input[][]=new int[rows][col];
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<col;j++)
			{
				input[i][j]=sc.nextInt();
			}
		}
		
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<col;j++)
			{
				if(i<j)
				{
					int t=input[i][j];
					input[i][j]=input[j][i];
					input[j][i]=t;
				}
			}
		}
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<(col/2);j++)
			{
				
					int t=input[i][j];
					input[i][j]=input[i][col-1-j];
					input[i][col-1-j]=t;
				
			}
		}
		
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.print(input[i][j]+" ");
			}
		}
		
		
		
		
	}

}
