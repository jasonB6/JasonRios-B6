package com.noorteck.java.day22HW;

public class QuestionTwo {
	public static void main(String[] args) {
		QuestionTwo obj = new QuestionTwo();

		boolean sum = obj.isEndWith("java training", "ing");
		boolean sum2 = obj.isEndWith("java training", "ng");
		boolean sum3 = obj.isEndWith("java training", "java");
		boolean sum4 = obj.isEndWith("java training", "train");
		boolean sum5 = obj.isEndWith(null, "java");
		boolean sum6 = obj.isEndWith(null, null);
		boolean sum7 = obj.isEndWith("aaabc", "abc");
		boolean sum8 = obj.isEndWith("abc", null);

		System.out.println(sum);
		System.out.println(sum2);
		System.out.println(sum3);
		System.out.println(sum4);
		System.out.println(sum5);
		System.out.println(sum6);
		System.out.println(sum7);
		System.out.println(sum8);
	}

	boolean isEndWith(String strOne, String strTwo) {
		boolean result = false;

		if (strOne != null && strTwo != null) { //
			if (strOne.endsWith(strTwo)) {// this asks: Does first parameter string end with contents of second parameter
				result = true;
			} else {
				result = false;
			}
		}
		return result;
	}
}
/**
2. Write a method to check whether a given string ends
with the contents(Characters) of another string
Access Modifier: default
Non-Access Modifier: non-static
Return Type: boolean
Method Name: isEndWith
Parameter1: String strOne
Parameter2: String strTwo
Test Data:
isEndWith (“java training”, “ing”) ----- TRUE
isEndWith (“java training”, “ng”) ----- TRUE
isEndWith (“java training”, “java”) ----- False
isEndWith (“java training”, “train”) ----- False
isEndWith (null , “java”) ----- False
isEndWith (null , null) ----- False
isEndWith (“aaabc”, “abc”) ----- TRUE
isEndWith (“abc”, null) ----- False
*/