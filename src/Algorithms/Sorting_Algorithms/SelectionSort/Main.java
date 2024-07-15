package Algorithms.Sorting_Algorithms.SelectionSort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        int [] numbers = {2, 4, 3, 7, 9, 3, 5};
        var sorter = new SelectionSort();
        sorter.sort(numbers);
        System.out.println(Arrays.toString(numbers));


        //Optimized code
//        var sorter = new SelectionSortOptimized();
//        sorter.sort(numbers);
//        System.out.println(Arrays.toString(numbers));
    }
}
