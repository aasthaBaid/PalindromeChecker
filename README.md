## UC9  Recursive Palindrome Checker 
1.  Take string input from user
2.  create a seperate static method, that checks if the string is palindrome
3.   use recursive method to loop through the method until the condition satisfies
```
  public static boolean CheckPalindrome(String str, int start, int end) {
		if(start >= end ) return true;
		if(str.charAt(start) != str.charAt(end)) {
			return false;
		}
		return CheckPalindrome(str, start+1, end-1);	
}
```
