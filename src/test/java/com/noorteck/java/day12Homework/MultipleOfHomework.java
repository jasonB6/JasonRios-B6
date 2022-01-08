package com.noorteck.java.day12Homework;

public class MultipleOfHomework {
	public static void main(String[] args) {
		boolean one = multipleOf(3);
		System.out.println(one);
		boolean two = multipleOf(10); // why isnt it returning true?
		System.out.println(two);
		boolean three = multipleOf(8);
		System.out.println(three);
	}

	public static boolean multipleOf(int a) {
		boolean result = false;

		if (a > 0 && ((a %= 3) == 0 || (a %= 5) == 0)) { // i tried recoding logic but idk why its not returning true for value of 10.

			result = true;

		} else {
			result = false;
		}

		return result;
	}
}

/*
 * 
 * 
 * 
 * 
 * 
 * 
 */
