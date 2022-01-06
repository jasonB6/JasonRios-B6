package com.noorteck.java.day11hw;

public class MonkeyStatus {

	public static void main(String[] args) {

		boolean areWeInTrouble = monkeyTrouble(false, true);
		System.out.println(areWeInTrouble);
	}

	public static boolean monkeyTrouble(boolean aSmile, boolean bSmile) {

		boolean result = false;
		if (aSmile == true && bSmile == true) {
			result = true;
		} else if (aSmile == false && bSmile == false) {
			result = true;
		} else {
			result = false;
		}
		return result;
	}
}
