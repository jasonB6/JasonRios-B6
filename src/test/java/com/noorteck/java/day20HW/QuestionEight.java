package com.noorteck.java.day20HW;

public class QuestionEight {
	public static void main(String[] args) {

		char sum = getCharacter("java training", 2); // ----v
		char sum2 = getCharacter("java training", 5); // ----t
		char sum3 = getCharacter("java training", 8); // ----i
		char sum4 = getCharacter("java training", 22); // ----?

		System.out.println(sum);
		System.out.println(sum2);
		System.out.println(sum3);
		System.out.println(sum4);

	}

	public static char getCharacter(String strOne, int indexNum) {
		char result = ' ';

		if (indexNum >= strOne.length()) { // IN OTHER WORDS:If the indexNum more than the length of String then return ‘?’ mark
			result = '?';
		} else {
			result = (strOne.charAt(indexNum)); // OTHERWISE: for String strOne, return character at the index requested.
		}
		return result;
	}
}
/**
 8. Write a method that takes two parameters, one String parameter and one integer
parameter. The method should return the character at the given index within the String.
If the indexNum more than the length of String then return ‘?’ mark

Access Modifier: public
Non-Access Modifier: static
Return Type: char
Method Name: getCharacter
Parameter1: String strOne
Parameter2: Int indexNum
Test Data:

getCharacter (“java training”, 2) ----- v
getCharacter (“java training”, 5) ----- t
getCharacter (“java training”, 8) ----- i
getCharacter (“java training”, 22) ----- ?
*/