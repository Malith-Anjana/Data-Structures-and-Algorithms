package Algorithms.StringManipulationAlgorithms;


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

        //is Rotation - ABCD -> DABC -> CDAB -> BCDA -> ABCD Check one of this rotation of other one
        var isRotation = Rotation.isRotation("ABCD", "BCDA");
        System.out.println(isRotation);
    }
}
