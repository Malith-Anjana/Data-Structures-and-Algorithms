package Algorithms.Searching_Algorithms.BinarySearch;

public class BinarySearch {
    //(1) Recursive method
    public int binarySearchRecursive(int [] array, int target){
        return binarySearchRecursive(array, target, 0, array.length - 1);
    }

    private int binarySearchRecursive(int [] array, int target, int left, int right){
       if (right < left)
           return -1;

        int middle = (left + right) / 2;

        if (array[middle] == target)
            return middle;

        if(target < array[middle])
            return  binarySearchRecursive(array, target, left, middle - 1);

        return binarySearchRecursive(array, target, middle + 1, right);
    }

    //(2) Using iterative method
    public int binarySearchIterative(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int middle = (left + right) / 2;

            if (array[middle] == target)
                return middle;
            if (target < array[middle])
                right = middle - 1;
            else
                left = middle + 1;
        }

        return -1;
    }

}
