package com.noorteck.java.day24HW;

public class QuestionSeven {
	public static void main(String[] args) {

		int n1[] = { 88, 22, 6, 1, 2, 3, 88, 22, 44, 33 };
		int n2[] = { 1, 2, 3, 22, 44, 33 };
		int n3[] = { 88, 22, 6, 1, 8, 0 };
		int n4[] = { 2, 3, 88, 22, 44 };

		int sum = getIndexNumber(n1, 3);
		int sum2 = getIndexNumber(n2, 12);
		int sum3 = getIndexNumber(n3, 22);
		int sum4 = getIndexNumber(n4, 44);

		System.out.println(sum);
		System.out.println(sum2);
		System.out.println(sum3);
		System.out.println(sum4);

	}

	public static int getIndexNumber(int[] number, int elementValue) {
		int result = 0;

		for (int i = 0; i < number.length; i++) {
			if (number[i] == elementValue) { // if THIS array element is equal to THIS value of elementValue...

				result = i; // result given is the index of that element

				break;// break keyword is needed, otherwise logic will keep executing for rest of
						// array elements

			} else {
				result = -1;// return -1 if elementValue not found in array

			}
		}
		return result;
	}
}
/**
Write a method that takes 2 parameters. An array of int parameter and integer
parameter. Find the index number of an array element. Check if an array has the
element value passed as 2nd parameter. If it contains return the index number of that
element otherwise return -1.

Access Modifier: public
Non-Access Modifier: static
Return Type: int
Method Name: getIndexNumber
Parameter1: int [] number
Parameter1: int elementValue
Test Data:
getIndexNumber ([88,22,6, 1, 2, 3, 88,22,44,33], 3) ----- 5
getIndexNumber ([1, 2, 3,22,44,33], 12) ----- -1
getIndexNumber ([88,22,6, 1,8,0], 22) ----- 1
getIndexNumber ([2, 3, 88,22,44], 44) ----- 4
*/