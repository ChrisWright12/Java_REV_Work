package App.control;
import Services.*;
import Utility.utilities;

public class appMain  implements Menu {
	
	public int inputValue;
	private static UserServ uS = new UserServ();
	private static AccServ aS = new AccServ();
	
	@Override
	public void showMenu() {
		
		System.out.println("Welcome ");
		
		if(uS.displayAccts()){
			System.out.println("1. Checking Account");
			System.out.println("2. Savings Account");
			System.out.println("3. Logout");
		}else {
			System.out.println("1. Checking Account");
			System.out.println("2. Savings Account");
			System.out.println("3. Logout");
		}
	}

	@Override
	public Menu process() {
		switch(this.inputValue) {
			case 1: 
				aS.openChecking()
				;break;
			case 2: 
				aS.openSavings(); 
				break;
			case 3: 
				return null;
		}
		return this;
	}

	@Override
	public void getUserInput() {
		inputValue = utilities.getIntChoice(7);
	}

}
