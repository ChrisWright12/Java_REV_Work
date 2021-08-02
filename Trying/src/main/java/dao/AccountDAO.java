package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import service.AccountService;


public class AccountDAO {
	
	 public void start() {

		 boolean quit = false;
		 Scanner input = new Scanner(System.in);
			
			do {
				System.out.println("What would you like to do today? ");
				menu();
				String choice = input.next();
				
				switch(choice) {
				
					case "1": 
						//create Account
						createAccount();
						break;
					case "2":
						doDeposit();
						break;
					case "3":
						//withdraw
						break;
					case "4":
						//quit
						quit = true;
						System.out.println("Thank you!");
						break;
					default:
						System.out.println("Invalid option.");
						break;
				
				}
				
				
			}while(!quit);
			
		}
		 
	 
	
	 public static void menu() {
	        System.out.println("Bank Account Menu");
	        System.out.println("1. Create New Account");
	        System.out.println("2. Deposit Funds");
	        System.out.println("3. Withdraw Funds");
	        System.out.println("4. Quit");
	 }
	 
	 public void createAccount() {
		 Scanner scanner = new Scanner(System.in);
		 try(Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "mko0NJI9vg$")){		
			 
			 Statement stmt = conn.createStatement();
			 
			 System.out.println("Enter first name:");
			 String fname=scanner.next();
			 System.out.println("Enter last name:");
			 String lname=scanner.next();
			 System.out.println("Enter password:");
			 String password=scanner.next();
			 
			 stmt.executeUpdate("INSERT INTO public.acclogin (fname,lname,password, balance) VALUES ('"+fname+"','"+lname+"','"+password+"', 0.0)");
			 System.out.println("Account Created!");
			 
			 scanner.close();
		 }catch (SQLException e) {
			// TODO: handle exception
		}
		 
		 

	 }
	 
	 
	 public static void doDeposit() {
		 
		 Scanner scanner = new Scanner(System.in);
		 try(Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "mko0NJI9vg$")){		
			 
			 Statement stmt = conn.createStatement();
			 
			 System.out.println("Enter first name:");
			 String fname=scanner.next();
			 System.out.println("Enter last name:");
			 String lname=scanner.next();
			 System.out.println("Enter password:");
			 String password=scanner.next();
			 System.out.println("Enter amount:");
			 String deposit=scanner.next();
			 
			 stmt.executeUpdate("SELECT * FROM public.acclogin WHERE fname = '"+fname+"', lname= '"+lname+"',password ='"+password+"'");
			 stmt.executeUpdate("UPDATE acclogin SET balance =  '"+deposit+"'+ balance WHERE fname = '"+fname+"', lname= '"+lname+"',password ='"+password+"'" );
			 scanner.close();
		 }catch (SQLException e) {
			// 
		}
	 
		 
	 
	 
	 }
}
