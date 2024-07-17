package Data_Structures1.Stack;

import java.util.*;
import java.util.Stack;
//Expression Balancing - Interview Question

public class Expression {
    private final List<Character> leftBrackets = List.of('(', '[', '{', '<');
    private final List<Character> rightBrackets = List.of(')', ']', '}', '>');

    public boolean isBalanced(String input){
        if(input == null) throw new NoSuchElementException();

        Stack<Character> stack = new Stack<>();

        for(char ch : input.toCharArray()) {
            if (isLeftBracket(ch))
                stack.push(ch);

            if (isRightBracket(ch)){
                if(stack.empty()) return false;
                var top = stack.pop();

                if (!bracketMatch(top,ch)) return false;

            }
        }
        return stack.empty();

    }

    private boolean isLeftBracket(char bracket){
        return leftBrackets.contains(bracket);
    }

    private boolean isRightBracket(char bracket){
        return rightBrackets.contains(bracket);
    }

    private boolean bracketMatch( char left, char right){
        return  leftBrackets.indexOf(left) == rightBrackets.indexOf(right);
    }
}
