package loan;
import java.util.Scanner;


public class mainclass {

	public static void main(String[] args) {
		
		Scanner AsInput = new Scanner(System.in);	
		loanbasic All = new loanbasic();	
	      
	
	    System.out.println("Type your Name: ");
	    All.Name = AsInput.nextLine();		
					
		System.out.println("Enter your Account Number: ");
		All.AccountNo = AsInput.nextInt();
		
		System.out.println("Enter your Loan Ammount");
		All.LoanAmm = AsInput.nextDouble();
		
		
		System.out.println("Enter your months");
		 All.Period = AsInput.nextInt();
		 
		 System.out.println("Enter your Rate");
		 All.MRate = AsInput.nextDouble();
		 
		 System.out.println(All.Name);
		 System.out.println(All.AccountNo);		
		 System.out.println("your rental value is: " +All.RentalVa(All.LoanAmm,All.MRate, All.Period));		
		
		 
		 
		 
		 // ...............Table format.............//
		 
		 String leftAlignFormat = "|%-8d|%-20s| %-20s|%-20s | %-20s |%n";
		 System.out.format("+--------+--------------------+---------------------+---------------------+----------------------+%n");
		 System.out.format("| Period |    Rental Value    |   Interest Amount   |   Capital Amount    |Capital Balance       |%n");
		 System.out.format("+--------+--------------------+---------------------+---------------------+----------------------+%n");
		 
		 for (int i=1; i<=All.Period;i++) {
			 All.InterestAmm  = All.LoanAmm*(All.MRate/1200) ;
	            All.CapitalAmm = All.RentalVa - All.InterestAmm;
	            All.CapitalBal    = All.LoanAmm-All.CapitalAmm;
			 System.out.format(leftAlignFormat,i,All.RentalVa,All.InterestAmm,All.CapitalAmm,All.CapitalBal);			 
			 All.LoanAmm=All.CapitalBal;
		 }
		 
		 System.out.format("+--------+--------------------+---------------------+---------------------+----------------------+%n");
		 
		 
		 AsInput.close();
	
		
		
		

		}
		}
