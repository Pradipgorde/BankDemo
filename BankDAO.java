package com.sbi.in;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class BankDAO
{
	
		
	
	
	public Boolean getLogin(CustomerBean cust) 
	{
		
		 Connection con = DBConnection.getConnection();
		 
		 try(con)
		 {

				PreparedStatement ps = con.prepareStatement("select * from Customer where name=? AND password=?");
				
				
				ps.setString(1, cust.getUsername());
				ps.setString(2, cust.getPassword());
				
				ResultSet rs = ps.executeQuery();
				
				if(rs.next()) {
					String name = rs.getString(1);
					String pass = rs.getString(3);
					
					if(name.equals(cust.getUsername()) && pass.equals(cust.getPassword()))
					{
						return true;
					}
				}
				
				
				
			
		 }catch(Exception e) { System.out.println(e.getMessage());}
		 
		 return false;
	}
	
	
	
	public CustomerBean getLog(CustomerBean cust) 
	{
		
			Connection con = DBConnection.getConnection();
			 try(con){

			PreparedStatement ps = con.prepareStatement("select * from Customer where name=? AND password=?");
			
			
			ps.setString(1, cust.getUsername());
			ps.setString(2, cust.getPassword());
			
			ResultSet rs = ps.executeQuery();
			
			if(rs.next())
			{
			cust.setUsername(rs.getString(1)); cust.setGendre(rs.getString(2)); cust.setPassword(rs.getString(3));
			cust.setAcoountNo(rs.getInt(4)); cust.setBalance(rs.getInt(5));}
			con.close();
		}catch(Exception e) { System.out.println(e.getMessage());}
		
		return cust;
	}
	
	
	
	public int depositeAmmount(CustomerBean cust)
	{
		int k=0;
		
		Connection con = DBConnection.getConnection();
		try(con)
		{
			
			
			PreparedStatement ps = con.prepareStatement("update customer set balanace=balanace+? where accountNo=?");
			
			ps.setInt(1, cust.getBalance()); ps.setInt(2, cust.getAcoountNo());
			
			
			 k = ps.executeUpdate();
			
		}catch(Exception e) {System.out.println(e.getMessage()); }
		
		return k;
	}
	
	
	
	public int withdrawAmmount(CustomerBean cust)
	{
		int k=0;
		
		Connection con = DBConnection.getConnection();
		try(con)
		{
			
			
			PreparedStatement ps = con.prepareStatement("update customer set balanace=balanace-? where accountNo=?");
			
			ps.setInt(1, cust.getBalance()); ps.setInt(2, cust.getAcoountNo());
			
			 k = ps.executeUpdate();
			
		}catch(Exception e) {e.printStackTrace(); }
		
		return k;
	}
	
		
		public int getRegister(CustomerBean cust)
		{
			int k=0;
			
			Connection con = DBConnection.getConnection();
			try(con)
			{
				
				
				
				PreparedStatement ps = con.prepareStatement("Insert into customer values(?,?,?,?,?)");
				
				ps.setString(1, cust.getUsername()); ps.setString(2, cust.getGendre()); ps.setString(3, cust.getPassword());
				ps.setInt(4, cust.getAcoountNo()); ps.setInt(5, cust.getBalance());
				
				k = ps.executeUpdate();
				
			}catch(Exception e) {e.getMessage(); }
			
			
			
			
			return k;
		}
		
	
	
	
		
		

}
