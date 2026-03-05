package com.palindrome;
/* Case sensitive and space ignored palindrome checker
 * @author developer
 * @version 10.0
 * */
import java.util.*;
public class UseCaseTenPalindromeChecker {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter input string:");
		String input = scanner.nextLine();
		input = input.toLowerCase();
		Deque<Character> deque = new ArrayDeque<Character>();
		for(char c: input.toCharArray()) {
			if(c != ' ') {
				deque.add(c);
			}
		}
		while(deque.size() > 1) {
			if(deque.removeFirst()!= deque.removeLast()) {
				System.out.println("Not a Palindrome");
				return;
			}
		}
		System.out.println("Is a Palindrome");
		
	}

}
