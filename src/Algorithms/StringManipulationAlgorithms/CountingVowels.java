package Algorithms.StringManipulationAlgorithms;

import java.util.Arrays;

public class CountingVowels {
    public static int countVowels(String str){
        if (str == null)
            return 0;
        int count = 0;
        String vowels = "aeiou";

        for (char ch : str.toLowerCase().toCharArray())
            if (vowels.indexOf(ch) != -1)
                count++;
        return count;
    }
}
