package com.palindrome;
/* Using queue and stack to check palindrome 
 * @author developer
 * @version 6.0
 * */
import java.util.*;

public class UseCaseSixPalindromChecker {

	public static void main(String[] args) {
		Stack<Character> stack = new Stack<>();
		Queue<Character> queue = new LinkedList<>();
		System.out.print("Enter Input string: ");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		// push all characters in stack
		for(char c: input.toCharArray()) {
			stack.push(c);
			queue.add(c);
		}
		int n = input.length();
		boolean isPalindrome = true;
		// pop each element and check if it matches the character in the queue.
		// stack gives values from last (LIFO) , and queue will give from start. (FIFO)
		for(int i = 0; i < n; i++) {
			if(stack.pop() != queue.poll()) {
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
