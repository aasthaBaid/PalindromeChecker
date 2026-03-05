package com.palindrome;
import java.util.*;
public class UseCaseElevenPalindromeChecker {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter input string: ");
		String input = scanner.nextLine();
		PalindromeService check = new PalindromeService();
		if(check.checkPalindrome(input)) {
			System.out.println("Is a Palindrome!");
		}
		else System.out.println("Not a Palindrome!");
	}

}

class PalindromeService{
	public boolean checkPalindrome(String str) {
		int start = 0;
		int end = str.length()-1;
		while(start < end) {
			if(str.charAt(start)!=str.charAt(end)) {
				return false;
			}
			start++;
			end--;
			
		}
		return true;
	}
}