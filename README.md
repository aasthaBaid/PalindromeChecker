## UC6 Queue + Stack Based Palindrome Check
1. Take string input from user
2. create a stack & a queue, and push all characters to stack, queue.
3. stack will have the last elements on the top, and queue will store sequential
4. then popped element from the stack will be checked with the polled element of queue
- Stack<Character> stack = new Stack<>();
- Queue<Character> queue = new LinkedList<>();
- if(stack.pop() != queue.poll()) {...}
