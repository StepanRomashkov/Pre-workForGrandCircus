package myStuff;

import java.util.Scanner;

public class ReversedNumber {

// Checking if it's a correct number
	private static boolean isNumber(String inputString) {
		/* Check if entered string matches a regular expression(is it a number or not?)
		 * By the way, if user will enter an empty string it will also counts as an error 
		 */
		return inputString.matches("[0-9]+");
	}
// Method which reverses an input string
	private static String reverseString(String inputString) {
	// Declaring an empty string which will serve as a return value
		String returnString = "";
	// Declaring a String builder chosen for having a reverse method ;o)
		StringBuilder bufferString = new StringBuilder();
	// Appending a string to the builder and reversing it
		bufferString.append(inputString);
		bufferString = bufferString.reverse();
	// Filling an output string
		for (int i = 0; i < inputString.length(); i++) {
			returnString += bufferString.charAt(i);
		}
	// Returning a reversed string. Extra variable was added because of loop
		return returnString;
	}

	public static void main(String[] args) {
	// Creating a reading from standart input
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a decimal number:");
		String inputNumber = input.nextLine();
	// Checking if user entered a correct number 
		if (isNumber(inputNumber)) {
		// If everything is OK printing an entered value and reversed value using reverse method above
			System.out.println("Well done! Your number is: " + inputNumber);
			System.out.println("Your reversed number is: " + reverseString(inputNumber));
		} else {
		// Oops! In case if the user missed right keys
			System.err.println("Hey! Your \"number\" (" + inputNumber + ") is not a correct number!");
		}
		
	}

}