package com.noorteck.java.day8homework;

public class TwentyThruThirtyQuestion3 {

	public static void main(String[] args) {

		// For Loop

		int all = 0;
		for (int n = 20; n <= 30; n++) {
			all += n;
		}
		System.out.println("-----For-Loop-----");
		System.out.println("The sum of 20-30 is: " + all);
		System.out.println("The average of the sum of 20-30 is: " + all / 11);

		// While Loop

		int q = 20;
		int all2 = 0;
		while (q <= 30) {
			all2 += q;
			q++;
		}
		System.out.println("-----While-Loop-----");
		System.out.println("The sum of 20-30 is: " + all2);
		System.out.println("The average of the sum of 20-30 is: " + all2 / 11);

		int x = 20;
		int all3 = 0;
		do {
			all3 += x;
			x++;
		} while (x <= 30);
		System.out.println("-----Do-While-Loop----");
		System.out.println("The sum of 20-30 is: " + all3);
		System.out.println("The average of the sum of 20-30 is: " + all3 / 11);
	}
}
