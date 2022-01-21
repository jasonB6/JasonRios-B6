package com.noorteck.java.day19hw;

public class QuestionFour {
	public static void main(String[] args) {
		QuestionFour obj = new QuestionFour();
		String sum = obj.toUpper("Pro");
		String sum2 = obj.toUpper("java");
		String sum3 = obj.toUpper("java training");
		System.out.println(sum);
		System.out.println(sum2);
		System.out.println(sum3);

	}

	String toUpper(String strOne) {
		String result = "";

		result = strOne.toUpperCase();

		return result;
	}

}
/**
 * 4. Write a method that takes one String parameter and the method converts the
 * parameter to uppercase and return the new String value
 * 
 * Access Modifier: default Non-Access Modifier: non-static Return Type: String
 * Method Name: toUpper Parameter1: String strOne Test Data: toUpper (“Pro”)
 * ----- PRO toUpper (“java”) ----- LEARNING toUpper (“java training”) -----
 * JAVA TRAINING
 */