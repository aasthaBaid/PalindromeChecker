package com.palindrome;
import java.util.*;
/* Comparing the execution time between different approches 
 * @author developer
 * @version 13.0
 * */
public class UseCaseThirteenPalindromeChecker {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter input string: ");
		String input = scanner.nextLine();
		
	// finding execution time of deque operation
		long Dstart = System.nanoTime();
		boolean isPalindromeQueue = Deque(input);
		long Dend = System.nanoTime();
		long Dduration = Dend - Dstart;
		System.out.println("Duration of Deque operation :" + Dduration);
		// finding execution time of stack operation
		long Sstart = System.nanoTime();
		boolean isPalindromeStack = Stack(input);
		long Send = System.nanoTime();
		long Sduration = Send - Sstart;
		System.out.println("Duration of Stack operation :" + Sduration);
		
		if(isPalindromeQueue) {
			System.out.println("Is a Palindrome");
		}
		else System.out.println("Not a Palindrome");
		
		if(Dduration > Sduration) {
			System.out.println("Deque takes longer time");
		}
		else System.out.println("Stack takes longer time");
	}

	public static boolean Deque(String input) {
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
	
	public static boolean Stack(String input){
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
