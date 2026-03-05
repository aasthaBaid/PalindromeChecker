package com.palindrome;
/* Using recursion to check for palindrome
 * @author developer
 * @version 9.0
 * */
import java.util.*;

public class UseCaseNinePalindromeChecker {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter input string:");
		String input = scanner.nextLine();
		int start = 0;
		int end = input.length()-1;
		// calling function to check palindrome by giving string , start and end.
		boolean isPalindrome = CheckPalindrome(input, start, end);
		if(isPalindrome) {
			System.out.println("Is a palindrome");
		}
		else System.out.println("Not a Palindrome");
	}
	// recursively checking for palindrome
	public static boolean CheckPalindrome(String str, int start, int end) {
		
		if(start >= end ) return true;
		if(str.charAt(start) != str.charAt(end)) {
			return false;
		}
		return CheckPalindrome(str, start+1, end-1);
	
	}
}
