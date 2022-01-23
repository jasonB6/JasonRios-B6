package com.noorteck.java.day20HW;

public class QuestionSixteen {
	public static void main(String[] args) {
		QuestionSixteen obj = new QuestionSixteen();
		String sum = obj.concatString("Java", "awesome");
		String sum2 = obj.concatString("food", "door");
		String sum3 = obj.concatString("java", "training");
		String sum4 = obj.concatString("Pro", "ogress");

		System.out.println(sum);
		System.out.println(sum2);
		System.out.println(sum3);
		System.out.println(sum4);
	}

	String concatString(String strOne, String strTwo) {
		String result = "";
		StringBuilder s2 = new StringBuilder(strTwo);

		String sameChar = strTwo.substring(0, 1);// needed a container variable that represents first char of strTwo....

		result = strOne.concat(strTwo); //first concatenate parameters...
		if (strOne.endsWith(sameChar)) { //"If last char of strOne String is same as first char of strTwo (double characters)..."

			result = strOne + s2.delete(0, 1);// "then remove one of the double characters

		}

		return result;
	}
}
/**
16. Write a method to concatenate two given strings such that, if the concatenation creates
a double characters then removes one of the characters.
a. For example strOne = “food”; strTwo =”door”. After concatenating two
strings it will give us “fooddoor”(dd is double character, remove one of the
d) then the string after concatenation are: “foodoor”

Access Modifier: default
Non-Access Modifier: non-static
Return Type: String
Method Name: concatString
Parameter1: String strOne
Parameter2: String strTwo
Test Data:
concatString (“Java”, “awesome”) ----- javawesome
concatString (“food”, “door”) ----- foodoor
concatString (“java”, “training”) ----- javatraining
concatString (“Pro”, “ogress”) ----- Progress
*/