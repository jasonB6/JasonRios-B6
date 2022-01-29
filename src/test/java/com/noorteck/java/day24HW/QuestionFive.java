package com.noorteck.java.day24HW;

public class QuestionFive {
	public static void main(String[] args) {
		QuestionFive obj = new QuestionFive(); // getDouble method is non-static, so we must create instance to call
												// from main method.

		int n1[] = { 6, 1, 2, 3 };
		int n2[] = { 13, 3 };
		int n3[] = { 0, 1, 4 };
		int n4[] = { 6 };

		int sum[] = obj.getDouble(n1);
		int sum2[] = obj.getDouble(n2);
		int sum3[] = obj.getDouble(n3);
		int sum4[] = obj.getDouble(n4);

		for (int i = 0; i < sum.length; i++) {
			System.out.println(sum[i]);
		}

		System.out.println("------------------------------");

		for (int i = 0; i < sum2.length; i++) {
			System.out.println(sum2[i]);
		}

		System.out.println("------------------------------");

		for (int i = 0; i < sum3.length; i++) {
			System.out.println(sum3[i]);
		}

		System.out.println("------------------------------");

		for (int i = 0; i < sum4.length; i++) {
			System.out.println(sum4[i]);
		}

	}

	private int[] getDouble(int[] number) {

		int[] result = new int[number.length * 2]; // this can be considered our default array...
		// we are meeting one of the condition here: return a new array with double the
		// size/length

		for (int i = 0; i < result.length; i++) { // we need a for loop here to be able to manipulate each element for
													// the next condition...

			result[i] = 0;// which is " all elements except for LAST ONE are equal to 0

			result[result.length - 1] = number[number.length - 1]; // last condition is: the last element in the new
																	// array is same as the ORIGINAL array's LAST
																	// element
		}
		return result;// return results of new array
	}
}
/**
 * Write a method that takes an array of int parameter and return a new array
 * with double the size/length, where its last element value is the same as the
 * original array last element, and all the other element values are 0.
 * 
 * Access Modifier: private Non-Access Modifier: non-static Return Type: int []
 * Method Name: getDouble Parameter1: int [] number Test Data: getDouble ([6, 1,
 * 2, 3]) ----- [0,0,0,0,0,0,0,3] getDouble ([13, 3]) ----- [0,0,0, 3] getDouble
 * ([0, 1, 4]) ----- [0,0,0,0,0,4] getDouble ([ 6]) ----- [0,6]
 */