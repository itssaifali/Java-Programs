import java.util.*;
class AlphabetOrderofString
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a string");
        String str=in.nextLine();
        int len=str.length();
        for(char ch='A';ch<='Z';ch++)
        {
            for(int i=0;i<len;i++)
            {
                char ch1=str.charAt(i);
                if(ch==ch1||ch1==(ch+32))
                {
                    System.out.print(ch);
                }
            }
        }
    }
}