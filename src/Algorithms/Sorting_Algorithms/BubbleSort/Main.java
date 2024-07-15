package Algorithms.Sorting_Algorithms.BubbleSort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        int [] numbers = {2, 4, 3, 7, 9, 3, 5};
        var sorter = new BubbleSort();
        sorter.sort(numbers);
        System.out.println(Arrays.toString(numbers));


        //most optimized code
//        var sorterOpt = new BubbleSortOptimized();
//        sorterOpt.sort(numbers);
//        System.out.println(Arrays.toString(numbers));
    }
}
