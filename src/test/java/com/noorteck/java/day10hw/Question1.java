package com.noorteck.java.day10hw;

public class Question1 {

	public static void main(String[] args) {

		calculate(3.0, 2.5, '%');
	}

	public static void calculate(double numOne, double numTwo, char mathOperationSign) {

		switch (mathOperationSign) {
		case '+':
			System.out.println(((numOne) + " + " + (numTwo)) + " = " + (numOne + numTwo));
			break;
		case '-':
			System.out.println(((numOne) + " - " + (numTwo)) + " = " + (numOne - numTwo));
			break;
		case '*':
			System.out.println(((numOne) + " * " + (numTwo)) + " = " + (numOne * numTwo));
			break;
		case '/':
			System.out.println(((numOne) + " / " + (numTwo)) + " = " + (numOne / numTwo));
			break;
		case '%':
			System.out.println(((numOne) + " % " + (numTwo)) + " = " + (numOne % numTwo));
			break;
		default:
			System.out.println(" Invalid math operation sign.");
		}
	}
}