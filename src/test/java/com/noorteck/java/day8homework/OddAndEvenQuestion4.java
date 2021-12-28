package com.noorteck.java.day8homework;

public class OddAndEvenQuestion4 {

	public static void main(String[] args) {
		
		System.out.println("---For Loop---");
		int even = 0; 					// container for sum of even numbers
		int odd = 0;  					// container for sum of odd numbers
		
		for (int x = 1; x <= 20; x++) { 
			
			if (x % 2 == 0) { 			// if x is even...
				even += x; 				// store x here

			} else if (x % 2 == 1) {	// if x is odd...
				odd += x;				// store x here
			}
		}
		System.out.println("The sum of Even numbers for 1-20 is: " + even);
		System.out.println("The sum of Odd numbers for 1-20 is: " + odd);
		
		System.out.println("---While Loop---");
		int even1=0;
		int odd1=0;
		int y=1;						// y currently a value of 1
		
		while (y<=20) {					//while y <=20...
										
			if (y % 2 == 0) { 			//check if each iteration is even or odd
				even1 += y; 			

			} else if (y % 2 == 1) {	
				odd1 += y;				
		}
			y++;						//increment by 1/ repeat loop body until 'while' condition is met
	}
		System.out.println("The sum of Even numbers for 1-20 is: " + even1); // once loop is done
		System.out.println("The sum of Odd numbers for 1-20 is: " + odd1);
		
		System.out.println("---Do While---");
		
		int even2=0;
		int odd2=0;
		int z=1;
		do {
			if (z % 2 == 0) { 			
				even2 += z; 			

			} else if (z % 2 == 1) {	
				odd2 += z;				
		}
			z++;
		
		}while (z<=20);
		System.out.println("The sum of Even numbers for 1-20 is: " + even2); 
		System.out.println("The sum of Odd numbers for 1-20 is: " + odd2);
}
}
	
	
