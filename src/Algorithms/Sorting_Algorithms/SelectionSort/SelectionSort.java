package Algorithms.Sorting_Algorithms.SelectionSort;

public class SelectionSort {
    public void sort(int[] array){
        for (int i = 0; i < array.length; i++){
            int minIndex = i;
            for (int j = i; j < array.length; j++){
                if (array[j] < array[minIndex])
                    minIndex = j;
            }
            var temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;

        }
    }
}
