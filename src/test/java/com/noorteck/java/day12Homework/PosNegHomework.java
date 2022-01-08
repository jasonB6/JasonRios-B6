package com.noorteck.java.day12Homework;

public class PosNegHomework {
	public static void main(String[] args) {
		boolean one = posNeg(1, -1, false);
		System.out.println(one);
		boolean two = posNeg(-1, 1, false);
		System.out.println(two);
		boolean three = posNeg(-4, -5, true);
		System.out.println(three);
	}

	public static boolean posNeg(int a, int b, boolean isIt) {
		boolean result = false;

		if (a < 0 && b > 0 && isIt == false) {
			result = true;
		} else if (b < 0 && a > 0 && isIt == false) {
			result = true;
		} else if (a < 0 && b < 0 && isIt == false) {
			/*
			 * "Except if the boolean parameter is true, then return true only if both are
			 * negative."
			 * so..."Give 'true' if both are negative, except if boolean parameter is true"
			 * this plus the 'posNeg' examples given through me off so hard at first lol
			 */
			result = true;
		} else {
			result = false;

		}
		return result;
	}
}
