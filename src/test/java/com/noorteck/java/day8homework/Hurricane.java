package com.noorteck.java.day8homework;

public class Hurricane {

	public static void main(String[] args) {

		for (int hurr = 20; hurr <= 200; hurr++) {

			if (hurr >= 74 && hurr <= 95) {
				System.out.println("Cat. 1 Hurricane" + " @ Wind Speed: " + hurr);
			} else if (hurr >= 105 && hurr <= 110) {
				System.out.println("Cat. 2 Hurricane" + " @ Wind Speed: " + hurr);
			} else if (hurr >= 120 && hurr <= 130) {
				System.out.println("Cat. 3 Hurricane" + " @ Wind Speed: " + hurr);
			} else if (hurr >= 140 && hurr <= 155) {
				System.out.println("Cat. 4 Hurricane" + " @ Wind Speed: " + hurr);
			} else if (hurr >= 165 && hurr <= 194) {
				System.out.println("Cat. 5 Hurricane" + " @ Wind Speed: " + hurr);
			}
		}
	}
}
