package com.noorteck.java.day20HW;

public class QuestionThirteen {
	public static void main(String[] args) {
		QuestionThirteen obj = new QuestionThirteen(); //accessing default method from a static method
		boolean sum = obj.isStartWith("java training", "ing");
		boolean sum2 = obj.isStartWith("java training", "ja");
		boolean sum3 = obj.isStartWith("java training", "java");
		boolean sum4 = obj.isStartWith("java training", "train");

		System.out.println(sum);
		System.out.println(sum2);
		System.out.println(sum3);
		System.out.println(sum4);
	}

	boolean isStartWith(String strOne, String strTwo) { // default boolean method
		boolean result = false;

		if (strOne.startsWith(strTwo)) { //checking whether our given string strOne starts with contents/value of strTwo
			result = true;
		} else {
			result = false;

		}
		return result;
	}
}
/**

Write a method to check whether a given string starts with the contents(Characters) of
another string

Access Modifier: default
Non-Access Modifier: non-static
Return Type: boolean
Method Name: isStartWith
Parameter1: String strOne
Parameter2: String strTwo
Test Data:
isStartWith (“java training”, “ing”) ----- False
isStartWith (“java training”, “ja”) ----- TRUE
isStartWith (“java training”, “java”) ----- TRUE
isStartWith (“java training”, “train”) ----- False
*/