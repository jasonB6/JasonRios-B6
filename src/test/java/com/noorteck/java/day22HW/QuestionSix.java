package com.noorteck.java.day22HW;

public class QuestionSix {
	public static void main(String[] args) {
		QuestionSix obj = new QuestionSix();
		boolean sum = obj.endsWithNG(null);
		boolean sum2 = obj.endsWithNG("I like to practice");
		boolean sum3 = obj.endsWithNG("Everyone is practicing");
		boolean sum4 = obj.endsWithNG("I am studying");

		System.out.println(sum);
		System.out.println(sum2);
		System.out.println(sum3);
		System.out.println(sum4);
	}

	public boolean endsWithNG(String strOne) {
		boolean result = false;
		
		if (strOne != null) {
			result = strOne.endsWith("ng");
		}
		return result;
	}
}
