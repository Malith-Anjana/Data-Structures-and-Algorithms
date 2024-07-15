package Algorithms.Sorting_Algorithms.BubbleSort;

public class BubbleSort {
    public void sort(int [] array){
        for (var i = 0; i < array.length; i++){
            for (var j = 1; j < array.length; j++)
                if (array[j] < array[j-1]){
                    var temp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = temp;
                }
        }
    }
}
