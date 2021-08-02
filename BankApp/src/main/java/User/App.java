package User;

import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import Service.AccountService;
import common.pojo.Account;
import bDAO.AccountDAO;

public class App {
	
	private static final Logger logger = LogManager.getLogger(App.class);

	private AccountService service = new AccountService();
	

	public void Start() {
		
		boolean quit = false;
		
		Scanner input = new Scanner(System.in);
		
		do {
			
			menu2();
			
			System.out.println("Enter Action: ");
			String choice = input.next();
			
			switch(choice) {
						
						case "1":
							checkView();
							break;
							
						case "2":
							deposit(input);
							break;
							
						case "3":
							withdraw(input);
							break;
							
						case "4":
							quit = true;
							System.out.println("Thank you!");
							break;
							
						default:
							System.out.println("Invalid option.");
							break;
			}
	
			
						}while(!quit);
						input.close();
		
						System.out.println("Exited.");
		
	
	}
	
	private double getInput(String string, Scanner input) {
		// TODO Auto-generated method stub
		return 0;}
	
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
	
public void deposit(Scanner input) {
		double amount = getInput("Amount: ",input); 
		AccountService service = new AccountService();
		double balance = service.deposit();
		System.out.println(amount);}






private void withdraw(Scanner input) {
	double amount = getInput("Amount: ",input); 
	AccountService service = new AccountService();
	double balance = service.withdraw();
	
	System.out.println(balance);}

}
