package toolcode;

import java.util.*;

public class Test4 {
    public static void main(String[] args) {
//        Stack<Character> stack = new Stack<>();
//        stack.push('a');
//        stack.push('c');
//        stack.push('b');
//
//        while (!stack.isEmpty()){
//            char c = stack.peek();
//            System.out.println(stack.pop());
//        }

    }

    public boolean isValid(String s) {
        int n = s.length();
        if (n % 2 == 1) {
            return false;
        }

        Map<Character, Character> pairs = new HashMap<Character, Character>() {{
            put(')', '(');
            put(']', '[');
            put('}', '{');
        }};
        Deque<Character> stack = new LinkedList<Character>();
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (pairs.containsKey(ch)) {
                if (stack.isEmpty() || stack.peek() != pairs.get(ch)) {
                    return false;
                }
                stack.pop();
            } else {
                stack.push(ch);
            }
        }
        return stack.isEmpty();
    }
}
