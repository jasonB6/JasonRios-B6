package com.noorteck.java.day19hw;

public class QuestionFive {
	public static void main(String[] args) {
		QuestionFive obj = new QuestionFive();
		String sum = obj.toLower("espn");
		String sum2 = obj.toLower("SOCCOR");
		String sum3 = obj.toLower("STRING CLASS");
		System.out.println(sum);
		System.out.println(sum2);
		System.out.println(sum3);
	}

	protected String toLower(String strOne) {
		String result = "";

		result = strOne.toLowerCase();

		return result;
	}
}
/**
5. Write a method that takes one String parameter and the method converts the
parameter to lowercase and return the new String value

Access Modifier: protected
Non-Access Modifier: non-static
Return Type: String
Method Name: toLower
Parameter1: String strOne
Test Data:
toLower (“espn”) ----- espn
toLower (“SOCCER”) ----- soccer
toLower (“STRING CLASS”) ----- string class
*/