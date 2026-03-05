package com.palindrome;
/* Using recursion to check for palindrome
 * @author developer
 * @version 11.0
 * */
import java.util.*;

public class UseCaseTwelvePalindromeChecker {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter input string: ");
		String input = scanner.nextLine();
		System.out.println("Choose startergy:");
		System.out.println("1. Deque");
		System.out.println("2. Stack");
		int option = scanner.nextInt();
		boolean isPalindrome;
		if(option == 1) {
			DequeStratergy ds = new DequeStratergy();
			isPalindrome = ds.check(input);
		}
		else {
			StackStratergy ss = new StackStratergy();
			isPalindrome = ss.check(input);
		}
		if(isPalindrome) {
			System.out.println("Is a Palindrome");
		}
		else System.out.println("Not a Palindrome");
	}

}

class DequeStratergy implements PalindromeStratergy{

	@Override
	public boolean check(String input) {
		Deque<Character> deque = new  ArrayDeque<Character>();

		for(char c : input.toCharArray()) {
			deque.add(c);
		}
		// using deque to remove first and last element and check if they are equal.
		while(deque.size() > 1) {
			if(deque.removeFirst() != deque.removeLast()) {
				return false;
			}
		}
		return true;
	}	
}

class StackStratergy implements PalindromeStratergy{

	@Override
	public boolean check(String input) {
		Stack<Character> stack = new Stack<>();
		for(char c: input.toCharArray()) {
			stack.push(c);
		}
		int n = input.length();
		boolean isPalindrome = true;
		// pop each element and check if it matches the character in the string.
		// stack gives values from last, and string will give from start.
		for(int i = 0; i < n; i++) {
			if(stack.pop() != input.charAt(i)) {
				return false;
			}
		}
		return true;
	}
	
}