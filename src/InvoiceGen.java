import java.util.Scanner;

public class InvoiceGen 
{

	public static void main(String[] args)
	{
	
	 String prod[]= {"Pepsi","Coke","Sweets","Burger","Dosa","Samosa"};
	 float price[]= {45,50,120,100,150,30};
		int qty[]=new int[prod.length];
		int n;float t=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("-----------------Menu---------------");
		
		for(int i=0;i<prod.length;i++)
		{
			System.out.printf("| %d | %-10s | %8.2f |\n",i+1,prod[i],price[i]);
		}
		System.out.printf("| %d | Exit",prod.length+1);
		
		do {
				System.out.print("\nEnter a Choice");
				 n=sc.nextInt();
				 
				if(n>=1 && n<=prod.length)
				{
					System.out.println("You ordered "+ prod[n-1]);
					System.out.print("Enter Quantity");
					qty[n-1]=sc.nextInt();
					float cost=qty[n-1]*price[n-1];
					t=t+cost;
					System.out.println("Your Bill is "+" "+cost );
				}
				else if(n==prod.length+1)
				{
					System.out.println("Thanks for your order");
					System.out.println("Visit Again");
				}
				else
				{
					System.out.println("Invalid Choice");
					
				}
		}while(n!=prod.length+1);
		
		//displaying Invoice
		System.out.println("--------------Invoice----------------");
		for(int i=0;i<prod.length;i++)
		{
			if(qty[i]>0)
			System.out.printf("| %d | %-10s | %8.2f | %d | %8.2f |\n",i+1,prod[i],price[i],qty[i],price[i]*qty[i]);
		}
		System.out.println("--------------------------------------");
        System.out.println("Your Total Is"+ " "+t);
	}

  }

