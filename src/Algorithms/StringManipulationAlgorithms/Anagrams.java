package Algorithms.StringManipulationAlgorithms;

import java.util.Arrays;

public class Anagrams {
    public static boolean areAnagrams(String first, String second) {
        //Same characters with different orders
        if (first == null || second == null)
            return false;

        var array1 = first.toLowerCase().toCharArray();
        Arrays.sort(array1);

        var array2 = second.toLowerCase().toCharArray();
        Arrays.sort(array2);

        return Arrays.equals(array1, array2);
    }

}
