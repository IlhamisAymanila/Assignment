package loan;
import java.util.Scanner;


public class mainclass {
	

	public static void main(String[] args) {
		
		Scanner AsInput = new Scanner(System.in);	
		loanbasic All = new loanbasic();	
		 
	    System.out.println("{_________!!! This project is not validating String and Integer,So use sutable String and Integer !!!________}");
	    System.out.println("");
	    System.out.println("Type your Name(ex:-S.M.Ilham) ");
	    All.Name = AsInput.nextLine();		
					
		System.out.println("Enter your Account Number(ex:-4242) ");
		All.AccountNo = AsInput.nextInt();
		
		System.out.println("Enter your Loan Ammount(ex:-100000)");
		All.LoanAmm = AsInput.nextDouble();
		
		
		System.out.println("How many years for the loan(ex:- 4 or 5)");
		All.year=AsInput.nextInt();
		All.Period=All.year*12;
		 
		 
		 System.out.println("Enter your Rate(ex:-12%)");
		 All.MRate = AsInput.nextDouble();
		 
		 //......get date....//
		 System.out.println("...Enter your loan state date... ");
		 System.out.println("Enter year(ex:- 2020) ");
		 All.fstyear=AsInput.nextInt();
		 System.out.println("Enter Month(ex:- 4) ");
		 All.Month=AsInput.nextInt();
		 System.out.println("Enter Day:(ex:- 2)");
		 All.day=AsInput.nextInt();
		  All.endYear=All.fstyear+All.year; 
		 
		
		 
		 
		 String head = "|%-8s|%-20s|%-12s|%-20s|%-15s|%-20s|%-12s|%-20s|%n";
		 System.out.format("+--------+--------------------+------------+--------------------+---------------+--------------------+------------+--------------------+%n");
		 System.out.format(head,"Name ",All.Name, " Account No ",All.AccountNo,"State Date :",All.Sdate(All.fstyear, All.Month, All.day),"End Date :",All.Edate(All.endYear, All.Month,All.day));
		 System.out.format("+--------+--------------------+------------+--------------------+---------------+--------------------+------------+--------------------+%n");	
		System.out.format(head, "Rental",All.RentalVa(All.LoanAmm,All.MRate, All.Period),"Loan Ammount",All.LoanAmm,"Totale Interest",All.TtlRen(All.Period,All.RentalVa)-All.LoanAmm,"Totle Rental",All.TtlRen(All.Period,All.RentalVa));
		 System.out.format("+--------+--------------------+------------+--------------------+---------------+--------------------+------------+--------------------+%n");
		 System.out.println(""); System.out.println("");
		 System.out.println("//.....................................Loan payment table.....................................//");
		 System.out.println("");
		 
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
			 All.LoanAmm = All.CapitalBal;
			 
		 }
		 
		 
		 System.out.format("+--------+--------------------+---------------------+---------------------+----------------------+%n");
		 
		
		
		 AsInput.close();
	
		
		
		

		}
		}
