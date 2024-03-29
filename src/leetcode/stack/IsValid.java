package leetcode.stack;

import java.util.Stack;

public class IsValid {

    public static void main(String[] args) {
    }

    public static boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            }
            else if(stack.size() == 0) {
                return false;
            }

            else if(c == ')') {
                if(stack.pop() != '(') {
                    return  false;
                }
            }

            else if(c == '}') {
                if(stack.pop() != '{') {
                    return  false;
                }
            }

            else if(c == ']') {
                if(stack.pop() != '[') {
                    return false;
                }
            }

        }

        return stack.size() == 0;
    }
}
