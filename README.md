## UC11  Object-Oriented Palindrome Service 
1. Take string input from user
2. Create another class that has a method that will perform checkPalindrome()
3. proivde a login to check if its a palindrome in that function and call it in the main function.
4. this provides encapsulation and single responsibility principle.
```
class PalindromeService{
	public boolean checkPalindrome(String str) {...)
```
```
PalindromeService check = new PalindromeService();
if(check.checkPalindrome(input)) {...}
else {...}
```
