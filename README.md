## UC12 Strategy Pattern for Palindrome Algorithms (Advanced)
1. create an interface, that initialises a method,to check palindrome
2. use 2 different classes that implement the interface, and write logic to check palindrome using deque and stack
3. in the main method, take user input (String), and let the user choose, which stratergy is to be used.
```
public interface PalindromeStratergy {
	public boolean check(String input);
}
```
