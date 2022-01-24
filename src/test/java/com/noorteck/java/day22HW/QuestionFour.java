package com.noorteck.java.day22HW;

public class QuestionFour {
	public static void main(String[] args) {
		String sum = getSubStr(null, 2, 6);
		String sum2 = getSubStr("java training", 2, 6);
		String sum3 = getSubStr("Software Development Engineer in TEST", 11, 23);
		String sum4 = getSubStr("Software Development Engineer in TEST", 21, 29);

		System.out.println(sum);
		System.out.println(sum2);
		System.out.println(sum3);
		System.out.println(sum4);

	}

	public static String getSubStr(String str, int startingIndex, int endingIndex) {
		String result = "";
		
		if (str != null) {
			result = str.substring(startingIndex, endingIndex);
		}
		return result;
	}
}
/**
4. Write a method to get a substring of a given string between two specified positions.

Access Modifier: public
Non-Access Modifier: static
Return Type: String
Method Name: getSubStr
Parameter1: String str
Parameter2: Int startingIndex
Parameter2: Int endingIndex
Test Data:
getSubStr (null, 2 ,6) ----- null
getSubStr (“java training”, 2 ,6) ----- v at
getSubStr (“Software Development Engineer in TEST”, 11, 23) ----- velopment En
getSubStr (“Software Development Engineer in TEST”, 21, 29) ----- Engineer
*/