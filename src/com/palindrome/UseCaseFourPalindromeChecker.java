package com.palindrome;

import java.util.Objects;
import java.util.Scanner;

/* Array based palindrome checker
 * @author developer
 * @verison 4.0
 * */
public class UseCaseFourPalindromeChecker {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Original String: ");
		String original = sc.nextLine();
		// creating a char array
		char[] arr = original.toCharArray();
		int len = arr.length;
		int start = 0;
		int end =len -1;
		boolean isPalindrome = true;
		// checking if its a palindrome using while loop, and object.equals(), two pointer method
		while(start < end) {
			if(!Objects.equals(arr[start], arr[end])) {
				System.out.println("Its Not a Palindrome!");
				isPalindrome = false;
				break;
			}
			start++;
			end--;
		}
		// print if its a palindrome
		if(isPalindrome) {
			System.out.println("Its a Palindrome");
		}
	}

}
