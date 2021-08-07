package Services;

import Common.pojo.Account;
import dao.Accountdao;

public class AccServ {
	
	
	public static Account acct = new Account();
	private static Accountdao acctDao = new Accountdao();
	private static UserServ userService = new UserServ();

	public static Account getAccount() {
		return acct;
	}

	public static void setAccount(Account acct) {
		AccServ.acct = acct;
	}
	
	public int getAcctId() {
		return acct.getAcctID();
	}
	
	public void setAcctId(int id) {
		id = acct.getAcctID();
	}
	
	public double getBalance() {
		return acct.getBalance();
	}
	
	public void setBalance(double balance) {
		balance = acct.getBalance();
	}
	
	
	public String getType() {
		return acct.getType();
	}
	
	public void setType(String acctType) {
		acctType = acct.getType();
	}
	
	public void openChecking() {
		acct.setBalance(0.00);
		acct.setType("Checking");

		acct = acctDao.createAcct(acct, userService.getUserId());
		UserServ.newUser = false;
	}
	
	public void openSavings() {
		acct.setBalance(0.00);
		acct.setType("Savings");

		acct = acctDao.createAcct(acct, userService.getUserId());
		UserServ.newUser = false;
	}
	
	
	

}
