package Algorithms.Sorting_Algorithms.BucketSort;


import java.util.Arrays;

public class Main {
    public static void main(String[] args){
    int [] numbers = {2, 4, 1, 7, 9, 3, 5};
    var sorter = new BucketSort();
            sorter.sort(numbers,4);
            System.out.println(Arrays.toString(numbers));
}
}
