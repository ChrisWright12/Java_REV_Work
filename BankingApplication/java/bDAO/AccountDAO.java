package bDAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class AccountDAO {
	
	double balance;

	public void deposit(double amount){
		
		try {
			Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","mko0NJI9bg$");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
			if(amount != 0) {
				
				balance = balance + amount;}}
		
	public void withdraw(float amount){
				
			if(amount != 0) {
					
				balance = balance - amount;}}

}
