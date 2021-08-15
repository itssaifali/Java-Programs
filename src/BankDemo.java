import java.util.Scanner;
class Account
 {
	 private int accno;
	 private String cname;
	 private int bal;
	 //open
	 Account(int accno,String cname,int bal)
	 {
		 this.accno=accno;
		 this.cname=cname;
		 this.bal=bal;
		 System.out.println("Account Created");
		 
     }
	 //deposit
	 void deposit(int accno,int dp)
	 {
		 if(val(accno))
		 {
		 bal+=dp;
		 System.out.println("Amount has been Deposited");
		 }
		 else
		 {
			  System.out.println("Invalid Account Number");
		 }
	 }
	 //withdraw
	 void withdraw(int accno,int wd)
	 {
		 if(val(accno))
		 {
		 if(bal>wd)
		 {
			 bal-=wd;
			 System.out.println("Withdraw Successful");
			 System.out.println("Your Availabe Balance Is "+bal);
		 }
		 else {
			 System.out.println("Insufficient Balance");
		 }
		 }
		 else
		 {
			  System.out.println("Invalid Account Number");
		 }
	 }
	 //balenq
	  void balenq(int accno)
	 {
		  if(val(accno))
		  {
			 System.out.println("Account No. "+accno);
			 System.out.println("Customer Name "+cname);
			 System.out.println("Your Availabe Balance Is "+bal);
		  }
		  else
		  {
			  System.out.println("Invalid Account Number");
		  }
	 }
	  private boolean val(int accno)
	  {
		  if(accno==this.accno)
		 return true;
		  else
			  return false;
	  }
 }
class BankDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;int amt;int accno;
		//Open
		Account a=new Account(90907,"Saif Ali",10000000);
		
		//MENU
		System.out.println("-----------Menu------------");	    
	    System.out.println("1.Deposit");
	    System.out.println("2.Withdraw");
	    System.out.println("3.Balance Enquiry");
	    System.out.println("4.Exit");
	    System.out.println("----------------------------");
	    do
	    {
		    System.out.println("\n Enter Your Choice Here");
		     n=sc.nextInt();
		    
		    switch(n)
		    {  //Deposit
		    case 1:
		    {
		    	System.out.println("--------Deposit--------");
				System.out.println("Enter Account Number");
				accno=sc.nextInt();
		    	System.out.println("Enter Amount To Deposit");
		    	amt=sc.nextInt();
		    	a.deposit(accno,amt);
		    	break;
		    }  //Withdraw
		    case 2:
		    {
		    	System.out.println("--------Withdraw--------");
				System.out.println("Enter Account Number");
				accno=sc.nextInt();
		    	System.out.println("Enter Amount To Withdraw");
		    	amt=sc.nextInt();
		    	a.withdraw(accno,amt);
		    	break;
		    }
		    case 3:
		    {  //bal Enq
		    	System.out.println("--------Balance Enquiry--------");
				System.out.println("Enter Account Number");
				accno=sc.nextInt();
		    	a.balenq(accno);
		    	break;
		    }
		    case 4:
		    {  //Exit
		    	System.out.println("--------Exit--------");
		    	System.out.println("Keep Banking With Us");
		    	break;
		    }
		    default:
		    {
		    	System.out.println("Invalid Choice");
		    	break;
		    }
		    	
		    }
	    }while(n!=4);	
	}

}
