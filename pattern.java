

import java.util.Scanner;

public class pattern {
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int x=n;
		for(int i=0;i<=n;i++)
		{   
			x--;
			for(int j=0;j<2;j++)
			{
				for(int k=x;k>=0;k--)
				{
					System.out.print("*");
				}
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}
