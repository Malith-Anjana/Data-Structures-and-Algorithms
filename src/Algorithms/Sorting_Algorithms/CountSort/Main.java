package Algorithms.Sorting_Algorithms.CountSort;


import java.util.Arrays;

public class Main {
    public static void main(String[] args){
            int [] numbers = {2, 4, 3, 7, 9, 3, 5};
            var sorter = new CountSort();
            sorter.sort(numbers,9);

            System.out.println(Arrays.toString(numbers));
        }
    }

