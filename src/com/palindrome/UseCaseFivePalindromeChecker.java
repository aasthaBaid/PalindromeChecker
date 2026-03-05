package com.palindrome;
/* Stack Based Palindrome Checker
 * @author developer
 * @version 5.0
 * */

import java.util.*;
import java.lang.Iterable;
public class UseCaseFivePalindromeChecker {

	public static void main(String[] args) {
		Stack<Character> stack = new Stack<>();
		System.out.print("Enter Input string: ");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		// push all characters in stack
		for(char c: input.toCharArray()) {
			stack.push(c);
		}
		int n = input.length();
		boolean isPalindrome = true;
		// pop each element and check if it matches the character in the string.
		// stack gives values from last, and string will give from start.
		for(int i = 0; i < n; i++) {
			if(stack.pop() != input.charAt(i)) {
				isPalindrome = false;
				System.out.println("Not a palindrome");
				break;
			}
		}
		if(isPalindrome) {
			System.out.println("Is a palindrome");
		}
		else {
			
		}
		
		
	}

}
