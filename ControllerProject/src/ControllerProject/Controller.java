package ControllerProject;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Controller {

	public static void main(String[] args) throws IOException 
	{
		// Object Initialization for reader
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		// Various Variable Declarations
		String option;
		
		while (true) {
			// Menu Options for user
			System.out.println("Greetings! Please choose an option from"
					+ " below by entering its option number to get started");
			System.out.print("(0)  Exit Program\n"
							 + "(1)  Some function\n"
						     + "(2)  Some function\n"
						     + "(3)  Some function\n"
						     + "(4)  Some function\n"
						     + "(5)  Some function\n"
						     + "(6)  Some function\n"
						     + "(7)  Some function\n"
						     + "(8)  Some function\n"
						     + "(9)  Some function\n"
						     + "(10) Some function\n"
						     + "Enter option here: ");
			option = reader.readLine();
		
			switch (option) {
			case "0":
				// method call for option 1
				// testing switch with print calls
				System.out.println("Thank you for using our program!\n");
				return;
			case "1":
				// method call for option 1
				// testing switch with print calls
				System.out.println("Method call for option 1");
				break;
			case "2":
				// method call for option 1
				// testing switch with print calls
				System.out.println("Method call for option 2");
				break;
			case "3":
				// method call for option 1
				// testing switch with print calls
				System.out.println("Method call for option 3");
				break;
			case "4":
				// method call for option 1
				// testing switch with print calls
				System.out.println("Method call for option 4");
				break;
			case "5":
				// method call for option 1
				// testing switch with print calls
				System.out.println("Method call for option 5");
				break;
			case "6":
				// method call for option 1
				// testing switch with print calls
				System.out.println("Method call for option 6");
				break;
			case "7":
				// method call for option 1
				// testing switch with print calls
				System.out.println("Method call for option 7");
				break;
			case "8":
				// method call for option 1
				// testing switch with print calls
				System.out.println("Method call for option 8");
				break;
			case "9":
				// method call for option 1
				// testing switch with print calls
				System.out.println("Method call for option 9");
				break;
			case "10":
				// method call for option 1
				// testing switch with print calls
				System.out.println("Method call for option 10");
				break;
			default: 
				System.out.println("Invalid option number");
			}
			System.out.print("Would you like to exit the program? Yes or No? ");
			option = reader.readLine();
			
			if (option.toLowerCase().equals("yes")) {
				System.out.println("Thank you for using our program!");
				return;
			}
			else if (!option.toLowerCase().equals("no")) {
				System.out.println("Invalid entry, continuing to menu");
			}
		}
	}

}
