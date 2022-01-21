package com.noorteck.java.day19hw;

public class QuestionNine {
	public static void main(String[] args) {

		QuestionNine obj = new QuestionNine();
		boolean sum = obj.isThere("java training", "ini");
		boolean sum2 = obj.isThere("java training", "ava");
		boolean sum3 = obj.isThere("java training", "AVA");
		boolean sum4 = obj.isThere("java training", "Java");

		System.out.println(sum);
		System.out.println(sum2);
		System.out.println(sum3);
		System.out.println(sum4);
	}

	private boolean isThere(String strOne, String value) {
		boolean result = false;

		if (strOne.contains(value)) {
			result = true;
		} else {
			result = false;

		}
		return result;
	}
}