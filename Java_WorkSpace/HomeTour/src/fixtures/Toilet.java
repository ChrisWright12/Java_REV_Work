package fixtures;

public class Toilet extends Fixture implements Interactable{
	public Toilet(String name, String shortDesc, String longDesc) {
		super(name, shortDesc, longDesc);
}
	public void Touch() {
		System.out.println("You tried to use the toilet now the house is flooding.");
		
	}
}
