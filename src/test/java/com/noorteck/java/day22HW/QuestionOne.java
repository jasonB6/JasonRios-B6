package com.noorteck.java.day22HW;

public class QuestionOne {
	public static void main(String[] args) {

		QuestionOne obj = new QuestionOne();

		String sum = obj.toUpper("Pro");
		String sum2 = obj.toUpper("java");
		String sum3 = obj.toUpper(null);

		System.out.println(sum);
		System.out.println(sum2);
		System.out.println(sum3);
	}

	String toUpper(String strOne) {
		String result = "";
		
		if (strOne != null) {// whenever working with null as an object reference, we must always let Java
								// know the object is not null...
			result = strOne.toUpperCase();// this statement converts parameter to uppercase
		}
		return result; // return the new String value
	}
}
/**
1. Write a method that takes one String parameter and the method converts the
parameter to uppercase and return the new String value

Access Modifier: default
Non-Access Modifier: non-static
Return Type: String
Method Name: toUpper
Parameter1: String strOne
Test Data:
toUpper (“Pro”) ----- PRO
toUpper (“java”) ----- LEARNING
toUpper (null) ----- null
*/