import java.util.*;
class DeletionInArray
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int arr[]=new int[10];
        System.out.println("Enter 10 Integers");
        for(int i=0;i<10;i++)
        {
            arr[i]=in.nextInt();
        }
        System.out.println("Enter the element which has to be deleted from the array");
        int s=in.nextInt();
        int p=0;
        for(int i=0;i<10;i++)
        {
            if(arr[i]==s)
            {
                for(int j=i;j<9;j++)
                {
                    arr[j]=arr[j+1];
                }
                p=1;
                break;
            }
        }
        if(p==1)
        {
            System.out.println("Array after deletion");
            for(int i=0;i<9;i++)
            {
                System.out.print(arr[i]+" ");
            }
        }
        else
        {
            System.out.println("deletion is not possible as value is not present");
        }
    }
}
            