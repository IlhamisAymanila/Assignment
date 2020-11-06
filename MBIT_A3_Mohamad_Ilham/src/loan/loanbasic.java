package loan;

import java.time.format.DateTimeFormatter;
import java.util.Date;
 

public class loanbasic {

	String Name = "[a-zA-Z]" ;   
	int AccountNo,Period;  
		
	
	Date date = new Date();
	DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy");
	
	double LoanAmm,RentalVa,InterestAmm,CapitalAmm,CapitalBal;
	double Rate;
	double MRate=Rate/1200;
	
	
	
	
    double RentalVa(double LoanAmm,double MRate,int Period){
	   
	   return RentalVa=LoanAmm * (MRate/1200)/(1 - 1/Math.pow(1 + (MRate/1200),  Period));
	   
		
	}
    
       
    
	
	
	
}
