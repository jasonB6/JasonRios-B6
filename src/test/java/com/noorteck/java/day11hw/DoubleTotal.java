package com.noorteck.java.day11hw;

public class DoubleTotal {
	public static void main(String[] args) {

		int myTotal = sumDouble(3, 3);
		System.out.println(myTotal);

	}

	public static int sumDouble(int valueOne, int valueTwo) {
		int result = 0;
		if (valueOne != valueTwo) {
			result = valueOne + valueTwo;
		} else if (valueOne == valueTwo)
			result = 2 * (valueOne + valueTwo);
		return result;
	}
}
