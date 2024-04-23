package com.sbi.in;

import java.sql.SQLException;
import java.util.Scanner;

public class BankDemo {

	public static void main(String[] args) throws SQLException
	{
		
		
		
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("********Welcome To SBI **********\n");
		
		
		
		while(true)
		{
		
		int flag1=0;
		System.out.println("\n Choose Below Option.... \t \n1.Customer Login \t \n2.New Login \t \n3.Exit \t \n Enter Your Choice:-" );
		
		
	
		
		switch(Integer.parseInt(s.nextLine()))
		{
		
		case 1: {
			
			         System.out.print(" Enter Your name"); String name = s.nextLine();
			         System.out.println(" Enter your Password"); String pass = s.nextLine();
			         CustomerBean cust = new CustomerBean();
			         cust.setUsername(name); cust.setPassword(pass);
			         
			         Boolean login = new BankDAO().getLogin(cust);
			         
			         if(login)
			         {
			        	 System.out.println(" Login Sucess...");
			        	 
			        	 CustomerBean log = new BankDAO().getLog(cust);
			        	 
			        	 
			        	 while(true)
			        	 {
			        	 System.out.println(" \n Enter Your Choice....\n \t 1.Ammount Deposite \n \t 2.Withraw Ammount \n \t 3.Check Balance \n \t 4.Exit \n \t Enter Choice:-");
			        	 
			        	 
			        	 int flag=0;
			        	 
			        	  
			        	 switch(Integer.parseInt(s.nextLine()))
			        	 {
			        	 
			        	 case 1:// deposite amt
			        	 {
			        		  
			        		 System.out.print(" Enter Amount you want to Deposite"); Integer amt = Integer.parseInt(s.nextLine());
			        		 
			        		 
			        		 if(amt>1)
			        		 {
			        		 
			        		 
			        		 cust.setBalance(amt);
			        		 
			        		 int k = new BankDAO().depositeAmmount(log);
			        		 
			        		 if(k>0) System.out.println(" Amount Sucessfully deposisted ");
			        		 else System.err.println(" Amount not deposited");
			        		 
			        		 }else System.err.println(" Enter Positive ammount");
			        		 
			        	 } break; // inner case 1
			        	 
			        	 
			        	 case 2: // withdraw amounnt
			        	 {
			        		 
			        		 System.out.print(" Enter Withdrawn Ammount ");  Integer amt = Integer.parseInt(s.nextLine());
			        		 
			        		 if(amt>0)
			        		 {
			        			 
			        			 if(amt<log.getBalance())
			        			 {
			        				 
			        				 log.setBalance(amt);
			        				 
			        				 int k = new BankDAO().withdrawAmmount(log);
			        				 
			        				 if(k>0)
			        					 System.out.println(" Withdraw Sucessfully ");
			        				 else System.out.println(" withdraw fail");
			        				 
			        				 
			        			 }else System.out.println(" Insuficient Fund...");
			        			 
			        			 
			        			 
			        		 }else System.err.println(" Enter Positive amount");

			        		 
			        		 
			        		 
			        	 }break; //  end of inner case 2
			        	 
			     case 3: 	// Check balance
			     {
			    	 
			    	 CustomerBean cust2 = new BankDAO().getLog(log);
			    	 
			    	 System.out.println(" Your Acoount Balance is :"+cust2.getBalance());
			    	 
			    	 
			    	 
			    break; }// end of inner case 3
			     
			        	 
			     case 4:
			     {
			    	 
			    	 System.out.println( " you are Sucessfully exeited from Application "); System.exit(0);
			    	 
			    	 flag=1;
			     } break;
			     default : System.err.println(" incorrct choice...");
			        	 
			        	 }// close inner switch
			        	
			        	 if(flag>0) break;
			        	 
			        	 }// close inner while
			        	 
			         }   //end of login  
			         else System.err.println(" Login Invalid...");
			         
			         
			
		} break; // case 1 break;
		
		
		
case 2:
{
	System.out.println("**********welcome to Registraion**********");
	
	
	System.out.print(" Enter username:"); String name= s.nextLine();
	System.out.println(" Enter Gendre:"); String gendre = s.nextLine();
	System.out.println("Create Password:"); String pass = s.nextLine();
	System.out.println("Create Account No In Integer Only minimum 5 Digit:");  // by using sequence procedure  we will create sequenceWise Ac no and its unique just Temproray I create it.
	 Integer acNo= Integer.parseInt(s.nextLine());
	 
	
	 CustomerBean cust = new CustomerBean();
	 cust.setUsername(name); cust.setGendre(gendre);cust.setPassword(pass); cust.setAcoountNo(acNo);
	 Integer balance =0; cust.setBalance(balance);
	 
	 int k = new BankDAO().getRegister(cust);
	
	if(k>0) System.out.println(" Register Sucessfully....");
	else System.err.println(" Not Register fill form carefully....");
	
} break; // close outer case2




case 3:  { System.out.println(" your are Exited Sucessfully... "); System.exit(0);
		
          flag1=1; } break;
          
          
          default : System.err.println(" Enter valid choice ");
          
		}// outer switch close
		
		if(flag1>0) break;
		
		}// outer while close
		
		
		
		
		
		s.close();


	}

}
