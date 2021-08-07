package Services;

import java.util.ArrayList;

import Common.pojo.User;
import Utility.utilities;
import dao.Userdao;

public class UserServ {
	
	public static User user = new User();
	private static Userdao userDao = new Userdao();
	public static boolean newUser = false;
	
	public static User getUser() {
		return user;
	}

	public static void setUser(User user) {
		UserServ.user = user;
	}

	public int getUserId() {
		return user.getId();
	}
	
	public void setUserId(int id) {
		id = user.getId();
	}
	
	public String getUserFirstName() {
		return user.getFirstName();
	}
	
	public void setUserFirstName(String firstName) {
		firstName = user.getFirstName();
	}
	
	public String getUserLastName() {
		return user.getLastName();
	}
	
	public void setUserLastName(String lastName) {
		lastName = user.getLastName();
	}
	
	public ArrayList<Integer> getAcctNumbers() {
		return user.getAcctNumbers();
	}
	
	public void setAcctNumbers(ArrayList<Integer> acctNumbers) {
		acctNumbers = user.getAcctNumbers();
	}
	
	public void createUser() {
		System.out.print("Please enter your first name: ");
		user.setFirstName(utilities.getStringInput(30));
		
		System.out.print("Please enter your last name: ");
		user.setLastName(utilities.getStringInput(30));
		
		user = userDao.insertUser(user);
		newUser = true;
	}
	
	
	public boolean displayAccts() {  
		boolean hasAccts = false;
		hasAccts = userDao.getUserAccounts(user, hasAccts); 
		return hasAccts;
	}

}
