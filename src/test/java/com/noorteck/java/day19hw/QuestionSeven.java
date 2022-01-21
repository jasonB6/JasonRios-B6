package com.noorteck.java.day19hw;

public class QuestionSeven {
	public static void main(String[] args) {

		QuestionSeven obj = new QuestionSeven();
		String sum = obj.helloTo("Denis");
		String sum2 = obj.helloTo("Malek");
		String sum3 = obj.helloTo("Sara");
		System.out.println(sum);
		System.out.println(sum2);
		System.out.println(sum3);
	}

	String helloTo(String strOne) {
		String result = "";

		result = "Hello " + strOne;

		return result;
	}
}