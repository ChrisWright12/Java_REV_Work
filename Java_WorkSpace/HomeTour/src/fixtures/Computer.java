package fixtures;

public class Computer extends Fixture implements Interactable{
	public Computer(String name, String shortDesc, String longDesc) {
		super(name, shortDesc, longDesc);
}
	public void Touch() {
		System.out.println("You turned on the computer.");
		
	}
	}
