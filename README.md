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
