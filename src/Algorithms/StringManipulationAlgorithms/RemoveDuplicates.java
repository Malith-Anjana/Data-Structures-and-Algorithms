package Algorithms.StringManipulationAlgorithms;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {
    public static String removeDuplicate(String str){
        if (str == null)
            return "";

        Set<Character> items = new HashSet<>();
        StringBuilder output = new StringBuilder();
        for (char ch : str.toCharArray())
            if (!items.contains(ch)){
                items.add(ch);
                output.append(ch);
            }
        return output.toString();
    }
}
