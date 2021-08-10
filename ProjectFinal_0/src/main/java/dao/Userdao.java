package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.DriverManager;
import Common.pojo.User;

public class Userdao {
	
	
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
	
	public User insertUser(User user) {
			connect();
		
			String query = "INSERT INTO user_table (first_name, last_name) " +
					"VALUES (?, ?) RETURNING id";
			
			try {
				PreparedStatement smt = conn.prepareStatement(query);
		
				smt.setString(1, user.getFirstName());
				smt.setString(2, user.getLastName());
				ResultSet resultSet = smt.executeQuery();

				if (resultSet.next()) {
					user.setId(resultSet.getInt("id"));
				}
			}catch(SQLException e) {
				e.printStackTrace();
			}
			
			return user;
	}
	
	public boolean getUserAccounts(User user, boolean hasAccts) {
		connect();
		
		String query = "SELECT * FROM account_table WHERE id = ANY (SELECT accounts_id" 
						+ "	FROM users_accounts WHERE users_id = ?)";
		
		try {
			PreparedStatement smt = conn.prepareStatement(query);
		
			smt.setInt(1, user.getId());
			ResultSet resultSet = smt.executeQuery();
			
			while (resultSet.next()) {
				int id = resultSet.getInt("id");
				String type = resultSet.getString("acct_type");
				double bal = resultSet.getDouble("balance");
				System.out.println("              " + id + " : " + type + ":    " + bal + " ");
				
				user.getAcctNumbers().add(id);
				hasAccts = true;
			}
			
			resultSet.close();
			smt.close();
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
	
		user.setAcctNumbers(user.getAcctNumbers());
		return hasAccts;
	}
	
	
}



