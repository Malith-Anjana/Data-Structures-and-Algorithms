package Data_Structures1.Stack;

import java.util.Arrays;

//Create custom Stack to get Idea of Stack works -> Exercise

public class Stack {
    private int[] items = new int[5];
    private int count;

    public void push(int item){
        if(count == items.length)
            throw new StackOverflowError();

        items[count++] = item;
    }

    public int pop(){
        if (count == 0)
            throw new IllegalStateException();

        count--;
        return items[count];
    }

    public int peek(){
        if(count == 0)
            throw new IllegalStateException();
        return items[count - 1];
    }

    public boolean isEmpty(){
        return count == 0;
    }
    @Override
    public String toString(){
        var array = Arrays.copyOfRange(items, 0, count);
        return Arrays.toString(array);
    }
}
