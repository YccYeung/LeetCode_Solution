class Solution {
    public boolean isValid(String s) {
        // return false when string length is odd number
        if (s.length() % 2 == 1) {return false;}
        // count var. for validiate every char is being processed
        int count = 0;
        // stack to keep track of char
        Stack<Character> stack = new Stack<>();
        // break string to char array
        char[] array = s.toCharArray();
        for (int i = 0; i < array.length; i++) {
            // push only open bracket
            if (array[i] == '('
             || array[i] == '{'
             || array[i] == '[') {
                stack.push(array[i]);
                count++;
            }
            // pop when top of the stack match with closing bracket
            if (!stack.isEmpty() && array[i] == ')' 
            && stack.peek() == '(') {
                stack.pop();
                count++;
            }
            if (!stack.isEmpty() && array[i] == '}'
            && stack.peek() == '{') {
                stack.pop();
                count++;

            }
            if (!stack.isEmpty() && array[i] == ']'
            && stack.peek() == '[') {
                stack.pop();
                count++;
            }
        }
        // return true only if stack is empty AND processed char has
        // the same number as string length
        return stack.size() == 0 && count == s.length();
    }
}
