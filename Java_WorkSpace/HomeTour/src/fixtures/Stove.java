package fixtures;

public class Stove extends Fixture implements Interactable{
	public Stove(String name, String shortDesc, String longDesc) {
		super(name, shortDesc, longDesc);
}
	public void Touch() {
		System.out.println("You made the stove spark and blew the breaker.");
		
	}
}
