package Algorithms.StringManipulationAlgorithms;

public class ReverseString {
    public static String reverse(String str){
        if (str == null)
            return "";
        StringBuilder reverse = new StringBuilder(); //We cannot concat string in for loop, cause every iteration new string object is created as string is immutable
        for (int i = str.length() - 1; i >= 0; i--)
            reverse.append(str.charAt(i));

        return reverse.toString();
    }
}
