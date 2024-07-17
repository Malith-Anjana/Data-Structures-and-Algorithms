package Data_Structures1.Queue;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class Main {
    public static void main(String[] args){
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(10);
        queue.add(30);
        queue.add(40);
        queue.add(50);

        System.out.println(queue.peek());
        var front = queue.remove();
        System.out.println(front);
        System.out.println(queue);

        //Reversing the Queue - Exercise
        reverse((queue));
        System.out.println(queue);

        //This class demonstrates for create custom ArrayQueue and How it works.
        ArrayQueue queues = new ArrayQueue(5);
        queues.enqueue(15);
        queues.enqueue(25);
        queues.enqueue(35);
        queues.dequeue();
        queues.enqueue(45);
        queues.enqueue(55);
        queues.enqueue(65);
        System.out.println(queues.dequeue());
        System.out.println(queues.toString());
        System.out.println(queues.dequeue());


        //Implement Queue using Stacks - Interview Question
        QueueWithTwoStacks queuewt = new QueueWithTwoStacks();
        queuewt.enqueue(10);
        queuewt.enqueue(20);
        queuewt.enqueue(30);
        queuewt.dequeue();
        queuewt.enqueue(40);
        var first = queuewt.dequeue();
        System.out.println("Custom Queue: "+ first);



        //Implement PriorityQueue using Stacks - Exercise
        PriorityQueue pq = new PriorityQueue();
        pq.add(5);
        pq.add(3);
        pq.add(7);
        pq.add(2);
        pq.add(1);
        System.out.println("Priority Queue is: " + pq.toString());

        while (!pq.isEmpty())
            System.out.println(pq.remove());
    }



    //Reversing the Queue - Exercise
    public static void reverse(Queue<Integer> queue){
        Stack<Integer> stack = new Stack<>();
        while(!queue.isEmpty())
            stack.push(queue.remove());
        while(!stack.empty())
            queue.add(stack.pop());

    }

}
