## UC8  Linked List-Based Palindrome Checker
1.  Take string input from user
2.  create a linkedlist and push all element to deque
3.  using while loop, until the size of linkedlist is greater than 1, removeFirst() and removeLast() functions, helps to check for palindrome.
- LinkedList<Character> linkedList = new LinkedList<Character>();
- if(linkedList.removeFirst() != linkedList.removeLast()) {...}
