package Algorithms.StringManipulationAlgorithms;

public class Palindrome {
    public static boolean isPalindrome(String word){
        //MADAM -> MADAM , DEED -> DEED
        StringBuilder input = new StringBuilder(word);
        input.reverse();
        return input.toString().equals(word);
    }

    public static boolean isPalindrome2(String word) {
        if (word == null)
            return false;

        int left = 0;
        int right = word.length() - 1;

        while (left < right)
            if (word.charAt(left++) != word.charAt(right--))
                return false;

        return true;
    }

}
