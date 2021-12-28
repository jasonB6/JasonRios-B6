package com.noorteck.java.day8homework;

public class CozaLozaWoza {

	public static void main(String[] args) {

		System.out.println("----------------Using For Loop-----------------");

		for (int C = 1; C <= 36; C++) {
			if (C % 3 == 0 && !(C % 5 == 0)) {
				System.out.println("Coza");
			} else if (C % 5 == 0 && !(C % 3 == 0)) {
				System.out.println("Loza");
			} else if (C % 7 == 0) {
				System.out.println("Woza");
			} else if (C % 3 == 0 && C % 5 == 0) {
				System.out.println("CozaLoza");
			} else {
				System.out.println(C);
			}
		}

		System.out.println("----------------Using While Loop-----------------");
		int D = 1;
		while (D <= 36) {

			if (D % 3 == 0 && !(D % 5 == 0)) {
				System.out.println("Coza");
			} else if (D % 5 == 0 && !(D % 3 == 0)) {
				System.out.println("Loza");
			} else if (D % 7 == 0) {
				System.out.println("Woza");
			} else if (D % 3 == 0 && D % 5 == 0) {
				System.out.println("CozaLoza");
			} else {
				System.out.println(D);
			}
			D++;
		}

		System.out.println("-----------------Using Do-While-----------------");

		int E = 0;
		do {
			E++;
			if (E % 3 == 0 && !(E % 5 == 0)) {
				System.out.println("Coza");
			} else if (E % 5 == 0 && !(E % 3 == 0)) {
				System.out.println("Loza");
			} else if (E % 7 == 0) {
				System.out.println("Woza");
			} else if (E % 3 == 0 && E % 5 == 0) {
				System.out.println("CozaLoza");
			} else {
				System.out.println(E);
			}
			
		} while (E < 36);
	}
}
