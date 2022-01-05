package com.noorteck.java.day10hw;

public class Question2 {
	public static void main(String[] args) {
		getGender('@');
	}

	public static void getGender(char gender) {
		switch (gender) {
		case 'm':
		case 'M':
			System.out.println("Male");
			break;
		case 'f':
		case 'F':
			System.out.println("Female");
			break;
			default:
				System.out.println("Invalid gender character");
		}
	}
}