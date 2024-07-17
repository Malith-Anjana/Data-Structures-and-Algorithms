package Algorithms.Searching_Algorithms.LinearSearch;

public class Main {
    public static void main(String[] args){
        int [] numbers = {2, 4, 1, 7, 9, 3, 5};
        var searcher = new LinearSearch();
        var index = searcher.search(numbers,0);
        System.out.println(index);
    }
}
