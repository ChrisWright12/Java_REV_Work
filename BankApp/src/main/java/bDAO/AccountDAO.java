package bDAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import common.pojo.Account;
import common.util.Dutil;
import Service.AccountService;

public class AccountDAO {
	
	private static final Logger logger = LogManager.getLogger(AccountDAO.class);
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
				
		try {
			Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","mko0NJI9bg$");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
			if(amount != 0) {
				
				balance = balance - amount;}}
}
