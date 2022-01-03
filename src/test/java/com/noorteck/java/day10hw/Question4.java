package com.noorteck.java.day10hw;

public class Question4 {
	public static void main(String[] args) {

		getDoWhileLoopResult(20, 45);
	}

	public static void getDoWhileLoopResult(int minNum, int maxNum) {

		do {
			System.out.println(minNum);
			minNum++;

		} while (minNum <= maxNum);

	}

}