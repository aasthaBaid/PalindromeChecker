## UC5 Stack-Based Palindrome Checker
1. Take string input from user
2. create a stack, and push all characters to stack.
3. while popping back the elements, the characters are compared with the string
- Stack<Character> stack = new Stack<>();
- if(stack.pop() != input.charAt(i)) {...}
