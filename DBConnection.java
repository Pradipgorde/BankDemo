package com.sbi.in;

import java.sql.Connection;
import java.sql.DriverManager;

//import static com.sbi.in.DBInfo.*;
public class DBConnection
{
	
	private DBConnection() {
		// TODO Auto-generated constructor stub
	}
	
	
		
		public static Connection getConnection()
		{
			
			Connection con=null;
			
			try {
				 Class.forName("oracle.jdbc.driver.OracleDriver");
					
				 con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","C##PRADIP","Tiger");
				
				 
			}catch(Exception e) {e.getMessage();}
			
			
			return con;
		}
		
	
	
	
	
	
	

}
