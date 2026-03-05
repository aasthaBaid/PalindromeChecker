package com.palindrome;

/* Using dequeue to check palindrome
 * @author developer
 * @version 7.0
 * */

import java.util.*;
public class UseCaseSevenPalindromeChecker {

	public static void main(String[] args) {
		Deque<Character> deque = new  ArrayDeque<Character>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter input string");
		String input = sc.nextLine();
		for(char c : input.toCharArray()) {
			deque.add(c);
		}
		// using deque to remove first and last element and check if they are equal.
		while(deque.size() > 1) {
			if(deque.removeFirst() != deque.removeLast()) {
				System.out.println("Not a palindrome!");
				return;
			}
		}
		System.out.println("Is a Palindrome!");
		sc.close();
	}

}
