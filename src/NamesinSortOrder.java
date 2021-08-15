import java.util.Scanner;
public class NamesinSortOrder
{
    public static void main(String[] args) 
    {
        int n;
        String temp;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of names you want to enter:");
        n = s.nextInt();
        String names[] = new String[n];
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter all the names:");
        for(int i = 0; i < n; i++)
        {
            names[i] = s1.nextLine();
        }
        for (int i = 0; i < n-1; i++) 
        {    String min=names[i];
            int pos=i;
            for (int j = i + 1; j < n; j++) 
            {
                if (min.compareTo(names[j])>0) 
                {   min=names[j];
                    pos=j;
                }
            }
                    temp = names[i];
                    names[i] = min;
                    names[pos] = temp;
            
        }
        System.out.print("Names in Sorted Order:");
        for (int i =0; i<n; i++) 
        {
        	if(i== n-1)
        	{
            System.out.print(names[i] + ".");
        	}
        	else
        	{
        		System.out.print(names[i] + ",");
        	}
        		
        }
        
    }
}