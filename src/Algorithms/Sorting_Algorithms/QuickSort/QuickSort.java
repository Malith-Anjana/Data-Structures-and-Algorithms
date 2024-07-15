package Algorithms.Sorting_Algorithms.QuickSort;

public class QuickSort {
    public void sort(int[] array){
        sort(array, 0, array.length - 1);
    }

    private void sort(int[] array, int start, int end){
        if (start >= end)
            return;

        var boundary =  partition(array, start, end);

        //sort left
        sort(array, start, boundary - 1);
        //sort right
        sort(array, boundary + 1, end);
    }

    private int partition(int[] array, int start, int end){
        var pivot = array[end]; // Last element
        var boundary = start - 1; //initially no boundary selected

        for (var i = start; i <= end; i++){
            if (array[i] <= pivot){
                boundary++;
                //Swap method
                var temp = array[i];
                array[i] = array[boundary];
                array[boundary] = temp;
            }
        }
        return boundary;
    }
}
