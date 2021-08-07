package Common.pojo;

import java.util.ArrayList;

public class User {
	
	private int id;
	private String firstName;
	private String lastName;
	private ArrayList<Integer> acctNumbers = new ArrayList<Integer>();
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public ArrayList<Integer> getAcctNumbers() {
		return acctNumbers;
	}
	
	public void setAcctNumbers(ArrayList<Integer> acctNumbers) {
		this.acctNumbers = acctNumbers;
	}
	
	

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public User(int id, String firstName, String lastName, String email, String pass_hash) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	
}
