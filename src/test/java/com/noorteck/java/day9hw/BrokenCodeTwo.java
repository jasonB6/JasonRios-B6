package com.noorteck.java.day9hw;

public class BrokenCodeTwo {

	public static void main(String[] args) { // flip 'static' with 'void', S should be capital in 'string'
		double tempOne = 84.7; // integer variables can only be WHOLE numbers, changed datatype to double
		int tempTwo = 66;

		boolean result; // based on if statement below, datatype here should be boolean
		if (tempOne <= 0 && tempTwo >= 100) { /*
												 * join '<' & '=' together, only 2 '&' for && operator, join '=' & '>' &
												 * flip, remove double quotes because integer variable being used here
												 */
			result = true;
		} else if (tempOne >= 100 && tempTwo <= 0) { // flip words to 'else if', flip '=' & '<', remove semicolon
			result = true;
		} else {
			result = false;
		}
		System.out.println(result); // correct spelling to result

		String season = "Monday";

		switch (season) { // controlling expression should only contain the variable identifier being tested, remove: =="fall"
		case "fall": // datatype used here is String, remove single quotes and add double quotes, switch semicolon to colon
			System.out.println("Recovering from hot weather");
			break;
		case "winter":
			System.out.println("Toooo cold");

		case "s": /*
					 * case labels must match datatype declared in controlling expression, remove
					 * single quotes and add double quotes, replace semicolon with colon
					 */
			System.out.println("Recovering from cold weather");
			break;
		case "summer": // replace semicolon with colon
			System.out.println("Toooo hot");

		default: // replace semicolon with colon
			System.out.println("Season does not exist!");
		}
		for (int i = 0; i < 10; i++) { /*
										 * f should be lower case for 'For', int i needs to be intialized so lets add '=0'
										 * int datatype should be all lowercase in initialization, replace comma
										 * with semicolon, and remove the semicolon right before the curly bracket
										 **/
			if (i == 5) { // join both equal symbols, remove semicolon, replace parenthesis with curly brackets
				System.out.println("I equals to 5"); // add semicolon at end of this code
			} else { // remove parentheses to correct syntax
				System.out.println("i not equals"); // replace single quotes with double quotes to
			}
		}
	}
}
