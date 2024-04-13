import java.util.Stack;

public class Solution {

    public boolean isValid(String s) {
        try {
            int x = s.length();
            if (x % 2 == 1) {
                return false;
            }
            Stack<Character> stack = new Stack<>();
            char c;
            for (int i = 0; i < x; i++) {
                c = s.charAt(i);
                switch (c) {
                    case '(', '{', '[' -> stack.push(c);
                    case ')' -> {
                        if (stack.peek() == '(') {
                            stack.pop();
                        } else {
                            return false;
                        }
                    }
                    case ']' -> {
                        if (stack.peek() == '[') {
                            stack.pop();
                        } else {
                            return false;
                        }
                    }
                    case '}' -> {
                        if (stack.peek() == '{') {
                            stack.pop();
                        } else {
                            return false;
                        }
                    }
                }
            }
            return (stack.isEmpty());
        } catch (Exception e) {
            return false;
        }
    }
}
