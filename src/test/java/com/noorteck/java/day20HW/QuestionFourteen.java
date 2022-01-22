package com.noorteck.java.day20HW;

public class QuestionFourteen {
	public static void main(String[] args) {

		getSubStr("java training", 2, 6); // we can call static method directly from another static method
		getSubStr("Software Development Engineer in TEST", 11, 23);
		getSubStr("Software Development Engineer in TEST", 21, 29);

	}

	public static String getSubStr(String str, int startingIndex, int endingIndex) {
		String result = "";

		result = str.substring(startingIndex, endingIndex);

		System.out.println(result);// print result for each Test data
		return result;

	}

}
/**
Write a method to get a substring of a given string between two specified positions.

Access Modifier: public
Non-Access Modifier: static
Return Type: String
Method Name: getSubStr
Parameter1: String str
Parameter2: Int startingIndex
Parameter2: Int endingIndex
Test Data:
getSubStr (“java training”, 2 ,6) ----- v at
getSubStr (“Software Development Engineer in TEST”, 11, 23) ----- velopment En
getSubStr (“Software Development Engineer in TEST”, 21, 29) ----- Engineer
*/