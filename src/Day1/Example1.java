package Day1;

import java.util.Scanner;

interface CallInterface
{
	public void calculate(int wd);
}
public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int bal=5000;
	/*	
		CallInterface c = (balance) -> {
			Scanner sc = new Scanner(System.in);
			System.out.println("Balance : " + balance);
			System.out.println("Enter Withdraw Amount : ");
			int withdraw = sc.nextInt();
			int total = balance-withdraw;
			if(withdraw>balance)
				 System.out.println("Withdraw amount is greater than balance");
			else
			{
				System.out.println("Withdraw successfull");
				System.out.println("Available Balance : " + total);
		    }
	  };
  c.calculate(bal);
}   
*/
		//Total Balance
		 CallInterface c1 = (balance)->{
			 System.out.println("Balance : "+bal);};
		//Withdraw
		 CallInterface c2 = (wd)->{
			 Scanner sc = new Scanner(System.in);
			 System.out.println("Enter Withdraw Amount : ");
			 int withdraw = sc.nextInt();
				int total = bal-withdraw;
				if(withdraw>bal)
					 System.out.println("Withdraw amount is greater than balance");
				else
				{
					System.out.println("Withdraw successfull");
					System.out.println("Available Balance : " + total);
			    }
		 };
		 //Adding money
		 CallInterface c3 = (a)-> {
			 Scanner sc = new Scanner(System.in);
			 System.out.println("Enter adding amount : ");
			 int add = sc.nextInt();
		 };
      //   if(add>bal)
   //     	 System.out.println("Added Successfully" + add);
   //      else
         //
		 }
		 
}