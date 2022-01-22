package com.noorteck.java.day20HW;

public class QuestionEleven {
	public static void main(String[] args) {
		QuestionEleven obj = new QuestionEleven(); // We want to access non static method from a static method so we have to create a new instance of the method
		String sum = obj.threeEqual("Java Pro", 'P', 'B');
		String sum2 = obj.threeEqual("Lazy mode", 'm', 'C');
		String sum3 = obj.threeEqual("Training", 'T', ' ');

		System.out.println(sum);
		System.out.println(sum2);
		System.out.println(sum3);
	}

	protected String threeEqual(String str, char oldChar, char newChar) {
		String result = "";

		result = str.replace(oldChar, newChar);

		return result;
	}

}
/**
11. Write a method that takes three parameters. One String parameter, 2 character
parameters. The method replaces old character (parameter 2) from String parameter
with new character (parameter 3) and returns the new string

Access Modifier: protected
Non-Access Modifier: non-static
Return Type: String
Method Name: threeEqual
Parameter1: String str
Parameter2: char oldChar
Parameter3: char newChar
Test Data:
threeEqual (“Java Pro”, ’P’, ‘B‘) ----- Java Bro
threeEqual (“Lazy mode”, ‘m‘, ‘C‘) ----- Lazy Cod
threeEqual (“Training”, ‘T’, ‘ ‘) ----- raining
*/