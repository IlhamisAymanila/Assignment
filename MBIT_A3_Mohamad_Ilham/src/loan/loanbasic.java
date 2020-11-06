package loan;


import java.text.SimpleDateFormat;

 

public class loanbasic {

	String Name  ;   
	public int AccountNo,year,Period,Month,day,fstyear;	
	int endYear=fstyear+year;
	String Sdate;
	String Edate;
	
	
	double LoanAmm,RentalVa,InterestAmm,CapitalAmm,CapitalBal;
	double Rate;
	double MRate=Rate/1200;
	
	String Sdate(int fstyear,int Month,int day) {
		return Sdate = day+"/"+Month+"/"+fstyear;
	}
	String Edate(int endYear,int Month,int day) {
		return Edate = day+"/"+Month+"/"+endYear;
	}
	
	
	
    double RentalVa(double LoanAmm,double MRate,int Period){
	   
	   return RentalVa=LoanAmm * (MRate/1200)/(1 - 1/Math.pow(1 + (MRate/1200),  Period));
	   
		
	}
    
       
    
	
	
	
}
