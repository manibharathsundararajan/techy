import java.util.Scanner;

public class nrepeat {
	public static void main(String args[])
	{
		 Scanner s=new Scanner(System.in);
		    int n=s.nextInt();
		    int flag=0;
		    int[] a=new int[n];
		    for(int i=0;i<n;i++)
		    {
		        a[i]=s.nextInt();
		    }
		    for(int i=0;i<n;i++)
		    {
		    if(a[i]==i)
		    {
		    	System.out.print("the number " +a[i]+ " equal to its index "+i);
		    }System.out.println(" ");
		    }
		   
	}

}
