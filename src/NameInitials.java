import java.util.*;
class NameInitials
{
 public static void main(String args[])
 {
     Scanner in=new Scanner(System.in);
     System.out.println("Enter The Name");
     String name=in.nextLine();
     name=" "+name;
     int last=name.lastIndexOf(' ');
     for(int i=0;i<last;i++)
     {
         char ch=name.charAt(i);
         if(ch==' '||i==0)
         {
             System.out.print(""+name.charAt(i+1)+".");
            }
        }
        for(int i=last+1;i<name.length();i++)
        {
            System.out.print(name.charAt(i));
        }
    }
}
       