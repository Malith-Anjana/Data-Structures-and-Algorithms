package Algorithms.StringManipulationAlgorithms;

import part1.Arrays.Array;

import java.util.Arrays;
import java.util.Collections;

public class ReverseWords {
    public static String reverse(String str){
        if (str == null)
            return "";

        String[] words = str.split(" ");
        StringBuilder reverse = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--)
            reverse.append(words[i] + " ");

        return reverse.toString();
    }

    //another method using build in class
    public static String reverse2(String str){
        if (str == null)
            return "";

        String[] words = str.split(" ");
        Collections.reverse(Arrays.asList(words));

        return String.join(" ", words);
    }
}
