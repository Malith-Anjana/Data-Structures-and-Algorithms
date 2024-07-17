package Algorithms.Searching_Algorithms.BinarySearch;

public class Main {
    public static void main(String[] args){
        int [] numbers = {2, 6, 9, 10, 13, 17, 25, 33};
        var sorter = new BinarySearch();
        var index1 = sorter.binarySearchRecursive(numbers, 13);
        var index2 = sorter.binarySearchIterative(numbers, 13);

        System.out.println(index2);
    }
}
