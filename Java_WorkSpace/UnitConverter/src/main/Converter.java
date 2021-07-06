package main;


import java.util.Scanner;

public class Converter {
	 public static void main(String[] args) {
		 int menuSelection = 0;
		 Scanner scanner = new Scanner(System.in);
		 while (menuSelection !=4) {
		 System.out.println("Please select an option:");
	     System.out.println("1. Cups to Teaspoons");
	     System.out.println("2. Miles to Kilometers");
	     System.out.println("3. US Gallons to Imperial Gallons");
	     System.out.println("4. Quit");
	     menuSelection = scanner.nextInt();
	     
	     switch(menuSelection) {
	     
	     	case 1:
	     		System.out.println("Please enter the number of cups to convert");
	     		int cupsq = scanner.nextInt();
	     		int x = (cupsq*48);
	     		System.out.println(cupsq + " cups = " + x + " teaspoons.");
	     		break;
	     	
	     	case 2:
	     		System.out.println("Please enter the number of miles to convert");
	     		int milesq = scanner.nextInt();
	     		double y = (milesq*1.609);
	     		System.out.println(milesq + " miles = " + y + " Kilometers.");
	     		break;
	     		
	    	case 3:
	     		System.out.println("Please enter the number of U.S Gallons to convert");
	     		int aGallonsq = scanner.nextInt();
	     		double z = (aGallonsq/1.201);
	     		System.out.println(aGallonsq + " U.S. Gallons = " + z + " Imperial Gallons.");
	     		break;
	     		
	    	case 4:
	    		System.out.println("Goodbye.");
	     		break;
	     	
	    	default:
	           System.out.println("Invalid choice");
	     		
	    	 
	     
	}
		
   }
		 
  }
	 
}



