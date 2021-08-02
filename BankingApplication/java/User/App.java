package User;

import java.util.Scanner;

import Service.AccountService;
import common.pojo.Account;
public class App {

	public void Start() {
		
		//show account
		//show Menu
		//1. check balance
		//2. deposit
		//3. withdraw
		//4. exit
		
		menu();
		menu2();
		System.out.println("Please Choose: ");
		Scanner options = new Scanner(System.in);
		
		switch(options) {
		
		case 1:
			checkView();
			break;
			
		case 2:
			deposit();
			break;
			
		case 3:
			withdraw();
			break;
			
		case 4:
			System.out.println("Thank you!");
			break;
			
		default:
			System.out.println("Invalid option.");

			
		}
		
		options.close();
		

	}
	
private void menu() {
		
		System.out.println("Account Number");
		System.out.println("Password");
	
	}
	
	
	private void menu2() {
		
		System.out.println("1. Check Balance");
		System.out.println("2. Deposit");
		System.out.println("3. Withdraw");
		System.out.println("4. Exit");
	}

	private void checkView() {
		
		AccountService service = new AccountService();
		double balance = service.checkView();
		
		System.out.println(balance);}
	
private void deposit() {
		
		AccountService service = new AccountService();
		double balance = service.checkView();
		
		System.out.println(balance);}

private void withdraw() {
	
	AccountService service = new AccountService();
	double balance = service.checkView();
	
	System.out.println(balance);}

}
