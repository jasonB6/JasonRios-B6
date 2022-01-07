package com.noorteck.java.day11hw;

public class Subtraction {
	public static void main(String[] args) {

		int diffTotal = difference21(22);
		System.out.println(diffTotal);
	}

	public static int difference21(int number) {
		int result = 0;
		if (number > 21) {
			result = 2 * (number - 21);
		} else {
			result = number - 21;
		}

		return result;
	}
}
