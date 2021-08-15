import java.util.Scanner;
class BubbleSort
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int arr[]=new int[10];
        System.out.println("Enter 10 elements");
        for(int i=0;i<10;i++)
        {
           arr[i]=in.nextInt();
        }
        for(int i=0;i<9;i++)
        {
            for(int j=0;j<9-i;j++)
            {
                if(arr[j]>arr[j+1])
                {
                 int t=arr[j];
                 arr[j]=arr[j+1];
                 arr[j+1]=t;
               }
            }
         }
         System.out.println("Array in ascending order is as follows");
         for(int i=0;i<10;i++)
         {
             System.out.println(arr[i]+" ");
            }
        }
    }
    
   
