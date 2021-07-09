package fixtures;

public class Couch extends Fixture implements Interactable{
	public Couch(String name, String shortDesc, String longDesc) {
		super(name, shortDesc, longDesc);
}
	public void Touch() {
		System.out.println("You sat on the couch.");
		
	}
	}
