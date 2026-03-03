package com.palindrome;

import java.util.Scanner;

/* Checking if palindrome by revrsing the string
 * @author developer
 * @version 3.0
 * */
public class UseCaseThreePalindromeChecker {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("original String: ");
		String word = sc.nextLine();
		// reversing the string using StringBuilder
		String reversed = new StringBuilder(word).reverse().toString();
		System.out.println("Reversed String: "+ reversed);
		// checking if both word and reversed is equal - then its a palindrome
		if(word.equals(reversed)) {
			System.out.println("Its a Palindrome!");
		}
		else {
			System.out.println("Its Not a Palindrome!");
		}
	}

}
