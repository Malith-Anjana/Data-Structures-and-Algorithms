package Data_Structures1.Stack;

import java.util.Stack;

public class Main {
    public static void main (String [] args){
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);

        stack.pop();
        System.out.println(stack);
        System.out.println(stack.peek());


        //Reversing the string - Interview Question
        StringReverser stringReverser = new StringReverser();
        System.out.println(stringReverser.reverse("HelloWorld"));

        //Expression Balancing - Interview Question
        Expression ex = new Expression();
        System.out.println(ex.isBalanced("{(([)1+3(]))}"));


        //Create custom Stack to get Idea of Stack works -> Exercise
        Data_Structures1.Stack.Stack stacks = new Data_Structures1.Stack.Stack();
        stacks.push(10);
        stacks.push(20);
        stacks.push(30);
        stacks.push(40);
        stacks.push(50);
        System.out.println(stacks.peek());
        System.out.println(stacks.pop());
        System.out.println(stacks.toString());

    }
}
