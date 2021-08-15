import java.util.Scanner;

public class PerfectNo {

	public static void main(String[] args) {
	
		int sum=0;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int n=in.nextInt();
		for(int i=1;i<n;i++)
		{
			if(n%i==0)
			{
				sum=sum+i;
			}	
		}
		 if(sum==n)
		 {
			 System.out.println("Your Number is Perfect");
		 }
		 else
		 {
			 System.out.println("Your Number is not Perfect"); 
		 }

	}

}
