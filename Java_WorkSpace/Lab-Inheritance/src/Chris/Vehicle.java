package Chris;

public class Vehicle {
	
	private String name;
	private long serialNumber;
	
	//get set
	public String getName() {
		return this.name;}
	public void setName(String name) {
		this.name = name;}
	
	public long getserialNumber() {
	return this.serialNumber;}
	public void setserialNumber(long serialNumber) {
	this.serialNumber = serialNumber;}
	
	public void move() {
	System.out.println("Vehicle is moving...");}
	
	public void move(int spaces) {
	System.out.println("Vehicle moved "+ spaces + " spaces");}
	
	

}
