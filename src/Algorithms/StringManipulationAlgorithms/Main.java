package Algorithms.StringManipulationAlgorithms;

public class Main {
    public static void main(String[] args){
        String word = "Hello World";

        //Counting vowels
        var count = CountingVowels.countVowels(word);
        System.out.println(count);

        //Reverse a string
        var reverse = ReverseString.reverse(word);
        System.out.println(reverse);
    }
}
