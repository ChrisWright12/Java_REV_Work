package Main;

import App.control.Menu;
import App.control.appMain;
import App.control.initial;




public class App {
	
	public static void main(String[] args) {
		runInitial();
	}
	
	public static void runInitial() {
		Menu menu = new initial();
		do {
			menu.showMenu();
			menu.getUserInput();
			menu = menu.process();
		} while(menu!=null);
		
		System.out.println();
		System.out.println("Thank You.");
	}
	
	public static void toappMain() {
		Menu menu = new appMain();
		do {
			menu.showMenu();
			menu.getUserInput();
			menu = menu.process();
		} while(menu!=null);
	}
	
	

}
