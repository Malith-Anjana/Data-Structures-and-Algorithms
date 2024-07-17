package Algorithms.Searching_Algorithms.JumpSearch;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {2, 6, 9, 10, 13, 17, 25, 33};
        var search = new JumpSearch();
        var index = search.jumpSearch(numbers, 33);

        System.out.println(index);
    }
}
