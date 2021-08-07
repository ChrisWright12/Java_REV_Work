package App.control;

import Services.UserServ;
import Utility.*;
import App.control.*;
public class initial implements Menu {
	
	public int inputValue;
	private static UserServ uS = new UserServ();

	@Override
	public void showMenu() {
	
		System.out.println("1. New Account");
		System.out.println("2. Login");
		System.out.println("3. EXIT");
	}
	
	@Override
	public Menu process() {
		switch(inputValue) {
			case 1: 
				uS.createUser();
				return new appMain();
			case 2: 
				return null;
		}
		return null;
	}

	@Override
	public void getUserInput() {
		this.inputValue = utilities.getIntChoice(3);
	}

}
