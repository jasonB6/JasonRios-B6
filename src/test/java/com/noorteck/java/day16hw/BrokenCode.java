package com.noorteck.java.day16hw;

public class BrokenCode {

	public static void main(String[] args) {

		double addResult = addTwoNumbers(2, 4); // addTwoNumbers method parameters calls only 2 int variables

		System.out.println(addResult); // correct sysout command: replace underscore with period

		for (int i = 0; i >= 10; i++) { // remove extra "=", remove comma and add semicolon after boolean expression,
										// remove 2 semicolons and extra parenthesis at update value
			System.out.println("Count" + i); // correct "=" to "+"
		}

		whoseFavNumber(23);// this method only has 1 int parameter
		whoseFavNumber(3); // same as line directly above
		whoseFavNumber(1); // remove comma

		String greeting = myName("John Cena");

	} // moved curly bracket from line 29 to here

	public static String myName(String name) { // changed void to String since a String variable is being called
		String result = ""; // add String default value
		System.out.println("My name is " + name);
		return result; // add return statement
	}

// removed curly bracket and placed on line 23
	public static int addTwoNumbers(int numOne, int numTwo) { // looks like should be int return method, remove
																// semicolons, add comma after numOne
		int result = 0; // add int default value
		result = numOne + numTwo; // result has already been initialized, remove 'int'
		System.out.println(numOne + " + " + numTwo + " = " + result);
		return result;
	}

	public static String whoseFavNumber(int i) { // in parameter, only datatype and variable identifier is declared here. no value
		String result = ""; // based on if statement, String value is expected to be return here, replace
							// with default String value

		if (i == 1) { // remove semicolon, add extra equal sign
			result = "Brook"; // add double quotes and semicolon
		} else if (i == 2 || i == 4) { // remove extra "&& i =4"
			result = "Dannia"; // "result" should be all lower case. replace single quotes with double quotes
		} else if (i == 3); { // add "{", remove "is", add double equals sign, correct spelling "else if"
			result = "Helen";
		} { // remove parenthesis add "{". Im not sure why im getting error here if I leave the else keyword. It tells me to delete the keyword
			result = "my favorite number;";// double quotes, add semicolon at the end
		}
		return result;

	}

}
