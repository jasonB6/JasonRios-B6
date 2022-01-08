package com.noorteck.java.day12Homework;

public class SumOfHomework {
	public static void main(String[] args) {

		int a = sumOf(15);
		int b = sumOf(10);
		int c = sumOf(3);
		int d = sumOf(5);
		int e = sumOf(8);

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
	}

	public static int sumOf(int numValue) {

		int result = 0;
		for (int upTo = 0; upTo <= numValue; upTo += 3) { // aka for each multiple of 3 up to 'numValue' requirement...
			result += upTo; // add each iteration to result 'container'

		}
		for (int upTo2 = 0; upTo2 <= numValue; upTo2 += 5) { // logic for each multiple of 5...
			result += upTo2; // add each iteration to container(which already has 'upTo' values stored)

		}
		return result;
	}
}
/*
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * garbo/needs work int result = 0; // my main 'sumOf' container int upTo = 0;
 * //container/memory location for 'sum of 3' logic do { result = upTo + 3;
 * //here, the logic is: increment by 3(multiples of 3)... } while (upTo
 * <=numValue); // until sumOf condition is met do { result = upTo + 5;//
 * "increment by value of 5"
 * 
 * } while (upTo <= numValue);
 * 
 * return result;
 */
