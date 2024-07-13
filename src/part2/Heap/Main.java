package part2.Heap;

import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        //run this in debugger mode
        var heap = new Heap();
//        heap.insert(10);
//        heap.insert(5);
//        heap.insert(17);
//        heap.insert(4);
//        heap.insert(22);
//        heap.remove();
        System.out.println("Done");

        //Adding integer array to Heap - Exercise
        int[] numbers = { 3, 2, 5, 4, 1, 10};

        for (int number : numbers)
            heap.insert(number);

        for (int i = numbers.length -1; i >= 0; i--)
            numbers[i] = heap.remove();

        System.out.println(Arrays.toString(numbers));


        //Implement the Heapify Algorithm - Interview Question
        int [] nums = { 5, 3, 8, 4, 1, 2};

        MaxHeap.heapify(nums);
        System.out.println(Arrays.toString(nums));

        var value = MaxHeap.getKthLargest(nums, 3);
        System.out.println(value);


    }
}
