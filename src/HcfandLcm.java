import java.util.Scanner;
class HcfandLcm
{
    int a,b,h,l;
    HcfandLcm(int x,int y)
    {
        a=x;
        b=y;
    }
    void display()
    {
        System.out.println("First number="+a+" "+"Second no.="+b);
        System.out.println("Hcf="+h+" "+"Lcm="+l);
    }
    void calculate(HcfandLcm A)
    {
        int n1=A.a,n2=A.b;
        int p=n1*n2,rem=0;
        while(n1%n2!=0)
        {
            rem=n1%n2;
            n1=n2;
            n2=rem;
        }
        A.h=n2;
        A.l=p/n2;
    }
    public static void main(String args[])
    {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter two numbers");
        int num1=Sc.nextInt();
        int num2=Sc.nextInt();
        HcfandLcm obj=new HcfandLcm(num1,num2);
        HcfandLcm tmp=new HcfandLcm(0,0);
        tmp.calculate(obj);
        obj.display();
    }
}