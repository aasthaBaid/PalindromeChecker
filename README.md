# PalindromeChecker

## UC1  Application Entry & Welcome Message
1. Welcome message to be printed, along with the version
2. simple System.out.println(); function

## UC2  Print a Hardcoded Palindrome Result
1. Hardcode the string needed to be operated on
2. Use for loop to check for palindrome.
- for(int i = 0; i < len/2; i++){...}

## UC3 Palindrome Check Using String Reverse 
1. Take string input from user
2. reverse the string in another variable
3. check if both the strings are equal.
- String reversed = new StringBuilder(word).reverse().toString();

## UC4 Character Array-Based Palindrome Check
1. Take string input from user
2. Convert string to character array
3. loop through array from both ends and check if its a palindrome (using two pointer apprach.)
- char[] arr = original.toCharArray();

## UC5 Stack-Based Palindrome Checker
1. Take string input from user
2. create a stack, and push all characters to stack.
3. while popping back the elements, the characters are compared with the string
- Stack<Character> stack = new Stack<>();
- if(stack.pop() != input.charAt(i)) {...}

## UC6 Queue + Stack Based Palindrome Check
1. Take string input from user
2. create a stack & a queue, and push all characters to stack, queue.
3. stack will have the last elements on the top, and queue will store sequential
4. then popped element from the stack will be checked with the polled element of queue
- Stack<Character> stack = new Stack<>();
- Queue<Character> queue = new LinkedList<>();
- if(stack.pop() != queue.poll()) {...}

## UC7 Deque-Based Optimized Palindrome Checker
1.  Take string input from user
2.  create a deque and push all element to deque
3.  using while loop, until the size of deque is greater than 1, removeFirst() and removeLast() functions, helps to check for palindrome.
- Deque<Character> deque = new  ArrayDeque<Character>();
- if(deque.removeFirst() != deque.removeLast()) {...}

## UC8  Linked List-Based Palindrome Checker
1.  Take string input from user
2.  create a linkedlist and push all element to deque
3.  using while loop, until the size of linkedlist is greater than 1, removeFirst() and removeLast() functions, helps to check for palindrome.
- LinkedList<Character> linkedList = new LinkedList<Character>();
- if(linkedList.removeFirst() != linkedList.removeLast()) {...}

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
## UC10 Case-Insensitive & Space-Ignored Palindrome
1. Take string input from user
2. create a different data structure (for eg. deque)
3. store all characters from the string in deque, all in a uniform case and expemting spaces.
4. now, using deque's removeFirst() and removeLast() functions, check if its a palindrome.
```
Deque<Character> deque = new ArrayDeque<Character>();
  for(char c: input.toCharArray()) {
    if(c != ' ') {
      deque.add(c);
  }
}
```
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
## UC12 Strategy Pattern for Palindrome Algorithms (Advanced)
1. create an interface, that initialises a method,to check palindrome
2. use 2 different classes that implement the interface, and write logic to check palindrome using deque and stack
3. in the main method, take user input (String), and let the user choose, which stratergy is to be used.
```
public interface PalindromeStratergy {
	public boolean check(String input);
}
```

## UC13 Performance Comparison
1. create seperate methods, that check if the string is palindrome.
2. check for their execution time, and compare which is better
3. invoke the method, and evaluate
```
long Dstart = System.nanoTime();
		boolean isPalindromeQueue = Deque(input);
		long Dend = System.nanoTime();
		long Dduration = Dend - Dstart;
		System.out.println("Duration of Deque operation :" + Dduration);
```
