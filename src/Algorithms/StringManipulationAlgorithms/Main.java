package Algorithms.StringManipulationAlgorithms;

import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        String word = "Hello World";

        //Counting vowels
        var count = CountingVowels.countVowels(word);
        System.out.println(count);

        //Reverse a string
        var reverse = ReverseAString.reverse(word);
        System.out.println(reverse);

        //Reverse words in sentence
        var reverseWords = ReverseWords.reverse(word);
        System.out.println(reverseWords);

    }
}
