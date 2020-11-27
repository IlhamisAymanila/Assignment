package Database;

import java.sql.Connection;
import java.sql.DriverManager;

public class databaseCon {

	Connection c = null;
	try {			
		c=DriverManager.getConnection("jdbc:mysql://localhost:3306/tcalculation","root","");
	} 
	catch (Exception e) {
		System.out.print(e);
	}
	return c;
}
}
