package Data_Structures1.Stack;

import java.util.Stack;
//Reversing the string - Interview Question

public class StringReverser {
    public String reverse(String input){
        if (input == null) throw new IllegalArgumentException();
        Stack<Character> stack = new Stack<>();

        for (char ch: input.toCharArray())
            stack.push(ch);

        StringBuffer reversed = new StringBuffer();

        while(!stack.empty())
            reversed.append(stack.pop());

        return reversed.toString();
    }
}
