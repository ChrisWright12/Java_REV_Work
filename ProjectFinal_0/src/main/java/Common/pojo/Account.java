package Common.pojo;

public class Account {
	
	private int accID;
	private double balance;
	private String type;
	
	public int getAcctID() {
		return accID;
	}
	public void setAcctID(int acctID) {
		this.accID = acctID;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	@Override
	public String toString() {
		return "Account [acctID=" + accID + ", balance=" + balance + ", type=" + type + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Account other = (Account) obj;
		if (accID != other.accID)
			return false;
		if (Double.doubleToLongBits(balance) != Double.doubleToLongBits(other.balance))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}
	
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Account(int acctID, double balance, int accessCode, String type) {
		super();
		this.accID = acctID;
		this.balance = balance;
		this.type = type;
	}
	
	

}
