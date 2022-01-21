package com.noorteck.java.day19hw;

public class QuestionSix {
	public static void main(String[] args) {

		String sum = combineStr("day", "ONE", "work", "HOURS");
		String sum2 = combineStr("week", "weekend", "monday", "Tuesday");
		String sum3 = combineStr("restoN", "vA", "baltiMORE", "MD");
		String sum4 = combineStr("java", "is", "fun", "LEARNING");

		System.out.println(sum);
		System.out.println(sum2);
		System.out.println(sum3);
		System.out.println(sum4);

	}

	protected static String combineStr(String strOne, String strTwo, String strThree, String strFour) {
		String result = "";

		result = strOne.toUpperCase().concat(strTwo.toLowerCase())+ strThree.toUpperCase().concat(strFour.toLowerCase());
		return result;
	}
}
/**
6. Write a method that takes four String parameters, the method
a. converts parameter 1 and parameter 3 to uppercase,
b. converts parameter 2 and parameter 4 to lower case
c. Then the method concatenates all four parameters and return the new String
value.

Access Modifier: protected
Non-Access Modifier: static
Return Type: String
Method Name: combineStr
Parameter1: String strOne
Parameter2: String strTwo
Parameter3: String strThree
Parameter3: String strFour
Test Data:
combineStr (“day”, “ONE”, “work”,”HOURS”) ----- DAYoneWORKhours
combineStr (“week”, “weekend”, “monday”,”Tuesday”) - WEEKweekendMONDAYtuesday
combineStr (“restoN”, “vA”, “baltiMORE”, “MD”) ----- RESTONvaBALTIMOREmd
combineStr (“java”, “is”, “fun”,”LEARNING”) --- JAVAisFUNlearning
*/