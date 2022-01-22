package com.noorteck.java.day20HW;

public class QuestionFifteen {
	public static void main(String[] args) {

		removeSpace("Java training			");
		removeSpace("I	like	to	practice	");

	}

	public static String removeSpace(String strOne) {
		String result = "";

		result = strOne.trim();

		System.out.println(result);

		return result;
	}
}
/**
15. Write a method to trim any leading or trailing whitespace from a given string

Access Modifier: public
Non-Access Modifier: static
Return Type: String
Method Name: removeSpace
Parameter1: String strOne
Test Data:
removeSpace (“ Java Training 		”) ----- java Training
removeSpace (“ 		I like to practice		 ”) ----- I like to practice
*/