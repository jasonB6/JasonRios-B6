package com.noorteck.java.day24HW;

public class QuestionSix {
	public static void main(String[] args) {

		int n1[] = { 6, 1, 2, 3 };
		int n2[] = { 13, 2, 3, 4, 6, 1, 2, 3 };
		int n3[] = { 3, 3, 0, 1, 4, 3, 6 };
		int n4[] = { 2, 6, 2 };

		boolean sum = checkNum(n1);
		boolean sum2 = checkNum(n2);
		boolean sum3 = checkNum(n3);
		boolean sum4 = checkNum(n4);
		System.out.println(sum);
		System.out.println(sum2);
		System.out.println(sum3);
		System.out.println(sum4);

	}

	protected static boolean checkNum(int[] number) {
		boolean result = false;

		for (int i = 0; i < number.length; i++) {
			if (number[i] == 2 || number[i] == 5) {
		
				result = true;
		}
		
				
	}
		return result;
	}
}
			
/**
 * 
				
				
				
				
				Write a method that takes an array of int parameter and return true if the array
contains value 2 twice, or value 5 twice.

Access Modifier: protected
Non-Access Modifier: static
Return Type: boolean
Method Name: checkNum
Parameter1: int [] number
Test Data:
checkNum ([6, 1, 2, 3]) ----- FALSE
checkNum ([13, 2, 3,4, 6, 1, 2, 3]) ----- TRUE
checkNum ([3, 3,0, 1, 4, 3 ,6]) ----- FALSE
checkNum [2, 6, 2]) ----- TRUE
 */
