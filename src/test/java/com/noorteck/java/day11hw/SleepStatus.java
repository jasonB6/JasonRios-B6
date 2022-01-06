package com.noorteck.java.day11hw;

public class SleepStatus {
	public static void main(String[] args) {

		boolean amISleeping = sleepIn(false, true);

		if (amISleeping == false) {
			System.out.println(amISleeping + ": Not sleeping in tomorrow :(");
		} else if (amISleeping == true) {
			System.out.println(amISleeping + ": Sleeping in! :D");
		}
	}

	public static boolean sleepIn(boolean isWeekday, boolean isVacation) {
		boolean result = false;

		if (isWeekday == true) {
			result = false;
		} else if (isWeekday == false || isVacation == true) {
			result = true;
		}
		return result;
	}
}