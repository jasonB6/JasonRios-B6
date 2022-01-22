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

		result = strOne.concat(strTwo);

		String con = strTwo.substring(0, 1); // first letter of second string
		if (strOne.endsWith(con)) { // if first string ends with same letter as first letter of second string...
		// i got stuck here, not sure how to write logic to remove part of string
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