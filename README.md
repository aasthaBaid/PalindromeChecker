## UC7 Deque-Based Optimized Palindrome Checker
1.  Take string input from user
2.  create a deque and push all element to deque
3.  using while loop, until the size of deque is greater than 1, removeFirst() and removeLast() functions, helps to check for palindrome.
- Deque<Character> deque = new  ArrayDeque<Character>();
- if(deque.removeFirst() != deque.removeLast()) {...}
