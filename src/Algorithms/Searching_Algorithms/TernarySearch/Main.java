package Algorithms.Searching_Algorithms.TernarySearch;


public class Main {
    public static void main(String[] args) {
        int[] numbers = {2, 6, 9, 10, 13, 17, 25, 33};
        var searcher = new TernarySearch();
        var index = searcher.ternarySearch(numbers, 6);

        System.out.println(index);
    }
}