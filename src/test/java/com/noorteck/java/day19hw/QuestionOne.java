package com.noorteck.java.day19hw;

public class QuestionOne {
	public static void main(String[] args) {

		boolean sum = isEqual("sdet", "SDET");// here we're calling each instance ...
		boolean sum2 = isEqual("testing", "testing");
		boolean sum3 = isEqual("java", "java");
		boolean sum4 = isEqual("java", "java Programming");

		System.out.println(sum);// and printing result of each
		System.out.println(sum2);
		System.out.println(sum3);
		System.out.println(sum4);

	}

	static boolean isEqual(String strOne, String strTwo) {// default method with boolean return type

		boolean result = false;
		if (strOne.equals(strTwo)) {// as per Test Data, we are checking if contents of the string values are equals or not
			result = true;
		} else {
			result = false;
		}
		return result;

	}
}