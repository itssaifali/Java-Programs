import java.util.Scanner;

public class Rev {

	public static void main(String[] args) {
	
		char w;String x="";
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a String:");
		String a=in.nextLine();
		for(int i=a.length()-1;i>=0;i--)
		{
			 w=a.charAt(i);
			 x=x+w;
			 
		}
		System.out.println("Reverse of String:");
		System.out.println(x);
	}

}
