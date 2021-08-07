package dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Common.pojo.Account;

import java.sql.DriverManager;

public class Accountdao {
	
	String url = "jdbc:postgresql://localhost:5432/postgres";
	String user = "postgres";
	String pw = "mko0NJI9vg$";
	private static Connection conn;

	public void connect() {
		try{
			conn = DriverManager.getConnection(url,user,pw);
		}catch(SQLException e){
			e.printStackTrace();
		}
	}
	
	public Account createAcct(Account acct, int user_id) {
		connect();
		String query = "INSERT INTO account_table (acct_type, balance) " +
				"VALUES (?, ?) RETURNING id";
		String query2 = "INSERT INTO users_accounts (users_id, accounts_id) VALUES (?,?)";
		
		try {
			PreparedStatement smt = conn.prepareStatement(query);
			smt.setString(1, acct.getType());
			smt.setDouble(2, acct.getBalance());
			ResultSet resultSet = smt.executeQuery();	
			
			if (resultSet.next()) {
				acct.setAcctID(resultSet.getInt("id"));
			}
			smt.close();
		
			PreparedStatement smt2 = conn.prepareStatement(query2);
			smt2.setInt(1, user_id);
			smt2.setInt(2, acct.getAcctID());
			smt2.executeUpdate();
			smt2.close();
			
		}catch(SQLException e) {
			e.printStackTrace();
		}

		return acct;
	}
	
}
