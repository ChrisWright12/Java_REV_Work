package manager;

import common.model.User;
import dao.dao;

public class UserManager {
	dao dao = new dao();
	User user = new User();
	
	public UserManager() {}
	
	public boolean login (int user_ID, String password) {
		if(dao.getUser(user_ID, password) != null) {
			return true;
		}
		return false;
	}
}
