import java.util.Scanner;

public class coprime {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n1,n2,s1=0,s2=0,s=0;
		n1=sc.nextInt();
		n2=sc.nextInt();
		s1=n1;
		s2=n2;
		while(n2!=0)
		{
		s=n1%n2;
		//System.out.print(s);
		n1=n2;
		//System.out.println(n1);
		n2=s;
		}
		if(n1==1)
		{
		System.out.println("given number are co-primes:");
		}
		else
		{
		System.out.println("given numbers are not co-prime");
		}
	}

}
