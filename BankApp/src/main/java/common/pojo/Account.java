package common.pojo;

public class Account {
	
	private int id;
	private String fName;
	private String lName;
	private double balance;
	
	public Account() {
		super();
	}
	
	
	
	public Account(int id, String fName, String lName, double balance) {
		super();
		this.id = id;
		this.fName = fName;
		this.lName = lName;
		this.balance = balance;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}

}
