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

        //remove duplicate
        var string = RemoveDuplicates.removeDuplicate("Trees are everywhere");
        System.out.println(string);

        //most repeated char
        var ch = MostRepeatedChar.getMaxOccuringChar("Trees are gifts of nature");
        var ch2 = MostRepeatedChar.getMaxOccuringChar2("Trees are gifts of nature");
        System.out.println(ch2);

        //Capitalize sentence
        var sentence = SentenceCapitalize.capitalize("Trees ARE gifts of nature");
        System.out.println(sentence);

        //are Anagrams
        var areAnagram = Anagrams.areAnagrams("ABCD", "CDAB");
    }
}
