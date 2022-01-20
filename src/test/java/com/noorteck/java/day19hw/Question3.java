package com.noorteck.java.day19hw;

public class Question3 {
	public static void main(String[] args) {
		isEqualLength("Pro", "Ali");
		isEqualLength("java", "LearNinG");
		isEqualLength("java training", "java");

	}

	public static void isEqualLength(String strOne, String strTwo) {

		if (strOne.length() == strTwo.length()) {
			System.out.println(strOne.concat(strTwo) + " " + (strOne.length() + strTwo.length()));
		} else if (strOne.length() > strTwo.length()) {
			System.out.println(strOne.toUpperCase() + " " + strOne.length());
		} else if (strOne.length() < strTwo.length()) {
			System.out.println(strTwo.toLowerCase() + " " + strTwo.length());
		}
	}
}
/**
 * 3. Write a method that takes two String parameter and checks if the length of
 * parameter one equal to the length of parameter two. a. If they are equal,
 * then concatenate parameter 1 with parameter two and print the new string
 * value with its length b. If parameter 1 length is greater than parameter 2
 * then print parameter 1 all in uppercase with its length c. If parameter 1
 * length is less than parameter 2 then print parameter2 all in lowercase with
 * its length
 * 
 * Access Modifier: public Non-Access Modifier: static Return Type: void Method
 * Name: isEqualLength Parameter1: String strOne Parameter2: String strTwo Test
 * Data: isEqualLength (“Pro”, “Ali”) ----- ProAli 6 isEqualLength (“java”,
 * “LearNinG”) ----- learning 8 isEqualLength (“java training”, “java”) -----
 * JAVA TRAINING 13
 * */
