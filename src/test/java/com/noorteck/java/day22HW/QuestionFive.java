package com.noorteck.java.day22HW;

public class QuestionFive {
	public static void main(String[] args) {

		String sum = removeSpace(null);
		String sum2 = removeSpace("	Java Training	");
		String sum3 = removeSpace("	I like to practice	");

		System.out.println(sum);
		System.out.println(sum2);
		System.out.println(sum3);
	}

	public static String removeSpace(String strOne) {
		String result = "";

		if (strOne != null) {
			result = strOne.trim();
		}
		return result;
	}
}
/**
5. Write a method to trim any leading or trailing whitespace from a given string

Access Modifier: public
Non-Access Modifier: static
Return Type: String
Method Name: removeSpace
Parameter1: String strOne
Test Data:
removeSpace (null”) ----- null
removeSpace (“ Java Training ”) ----- java Training
removeSpace (“ I like to practice ”) ----- I like to practice
*/