package service;

import java.util.Scanner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import common.pojo.Account;
import common.pojo.CheckingAccount;
import common.pojo.SavingsAccount;
import dao.AccountDAO;

public class AccountService {
	
//	 public void start() {
//
//	        Scanner keyboard = new Scanner(System.in);
//	        
//	        Account accounts [] = new Account[10];
//	        int numAccounts = 0; 
//
//	        int choice;
//
//	        do {
//	            choice = menu(keyboard);
//	            System.out.println();
//	            
//	            if(choice == 1) {
//	               
//	            } else if(choice == 2) {
//	                doDeposit(accounts, numAccounts, keyboard);
//	            } else if(choice == 3) {
//	                doWithdraw(accounts, numAccounts, keyboard);
//	            } else {
//	                System.out.println("GoodBye!");
//	            }
//	            System.out.println();
//	        } while(choice != 4);
//	    }
//
//
//	    public static int accountMenu(Scanner keyboard) {
//	        System.out.println("Select Account Type");
//	        System.out.println("1. Checking Account");
//	        System.out.println("2. Savings Account");
//
//	        int choice;
//	        do {
//	            System.out.print("Enter choice: ");
//	            choice = keyboard.nextInt();
//	        }while(choice < 1 || choice > 2);
//	        
//	        return choice;
//	    } 
//
//	    public static int searchAccount(Account accounts [], int count, int accountNumber) {
//
//	        for(int i=0; i<count; i++) {
//	            if(accounts[i].getAccountNumber() == accountNumber) {
//	                return i;
//	            }
//	        }
//
//	        return -1; 
//	    }
//
//
//	    public static void doDeposit(Account accounts [], int count, Scanner keyboard) {
//	        System.out.print("\nPlease enter account number: ");
//	        int accountNumber = keyboard.nextInt();
//
//	        // search for account
//	        int index = searchAccount(accounts, count, accountNumber);
//
//	        if(index >= 0) {
//	            System.out.print("Please enter Deposit Amount: ");
//	            double amount = keyboard.nextDouble();
//
//	            accounts[index].deposit(amount);
//	        } else {
//	            System.out.println("No account exist with AccountNumber: " + accountNumber);
//	        }
//	    }
//
//	    public static void doWithdraw(Account accounts [], int count, Scanner keyboard) {
//	        System.out.print("\nPlease enter account number: ");
//	        int accountNumber = keyboard.nextInt();
//
//	        int index = searchAccount(accounts, count, accountNumber);
//
//	        if(index >= 0) {
//	            System.out.print("Please enter Withdraw Amount: ");
//	            double amount = keyboard.nextDouble();
//	            accounts[index].withdraw(amount);
//	        } else {
//	            System.out.println("No account exist with AccountNumber: " + accountNumber);
//	        }
//	    }
//
//	  
//	    public void createAccount(Scanner keyboard) {
//	    	AccountDAO service = new AccountDAO();
//			service.createAccount();
//	    }
//
//	    public static int menu(Scanner keyboard) {
//	        System.out.println("Bank Account Menu");
//	        System.out.println("1. Create New Account");
//	        System.out.println("2. Deposit Funds");
//	        System.out.println("3. Withdraw Funds");
//	        System.out.println("4. Quit");
//
//	        int choice;
//
//	        do {
//	            System.out.print("Enter choice: ");
//	            choice = keyboard.nextInt();
//	        } while(choice < 1 || choice > 5);
//
//	        return choice;
//	    }    

}
