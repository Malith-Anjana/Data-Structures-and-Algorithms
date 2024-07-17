package Algorithms.Searching_Algorithms.ExponentialSearch;

public class Main {
        public static void main(String[] args) {
            int[] numbers = {2, 6, 9, 10, 13, 17, 25, 33};
            var search = new ExponentialSearch();
            var index = search.exponentialSearch(numbers, 33);

            System.out.println(index);
        }
}
