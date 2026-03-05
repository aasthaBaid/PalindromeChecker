package com.palindrome;
/* Using Linkedlist to check for palindrome
 * @author developer
 * @version 8.0
 * */
import java.util.*;
public class UseCaseEightPalindromeChecker {

	public static void main(String[] args) {
		LinkedList<Character> linkedList = new LinkedList<Character>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter input string");
		String input = sc.nextLine();
		for(char c : input.toCharArray()) {
			linkedList.add(c);
		}
		// using linked list to remove first and last element and check if they are equal.
		while(linkedList.size() > 1) {
			if(linkedList.removeFirst() != linkedList.removeLast()) {
				System.out.println("Not a palindrome!");
				return;
			}
		}
		System.out.println("Is a Palindrome!");
		sc.close();

	}

}
