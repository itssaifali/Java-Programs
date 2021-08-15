import java.util.Scanner;

class Automorphic {

	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int n=in.nextInt();
		int sqr=n*n;
		String num = Integer.toString(n);
		String sq = Integer.toString(sqr);
		if(sq.endsWith(num))
		{
			System.out.println("Automorphic");
		}
		else
		{
			System.out.println("Not Automorphic");
		}

	}

}
