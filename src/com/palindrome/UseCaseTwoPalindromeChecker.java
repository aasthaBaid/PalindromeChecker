package com.palindrome;

/* Hardcoded Palindrome checker app
 * @author developer
 * @version 2.0
 * */
public class UseCaseTwoPalindromeChecker {

	public static void main(String[] args) {
		String word = "maam";
		System.out.println("Input text: " + word);
		int len = word.length();
		// checking if the word is an palindrome using for loop.
		for(int i = 0; i < len/ 2; i++) {
			if(word.charAt(i) != word.charAt(len -i -1)) {
				System.out.println("Its Not an Palindrome");
				return;
			}
		}
		System.out.println("Its a Palindrome!");

	}

}
